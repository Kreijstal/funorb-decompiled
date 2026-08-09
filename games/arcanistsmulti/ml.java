/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml extends tf {
    private int field_o;
    int field_R;
    ml field_s;
    int field_G;
    boolean field_D;
    static kc field_V;
    int field_db;
    int field_T;
    int field_kb;
    int field_p;
    private int field_N;
    private int field_y;
    int field_lb;
    boolean field_U;
    int field_jb;
    double field_F;
    private int field_r;
    int field_X;
    int field_W;
    private int field_O;
    private int field_n;
    boolean field_J;
    private qb field_B;
    mi field_gb;
    int field_E;
    int field_u;
    static ll[] field_v;
    private qb field_cb;
    private qb field_bb;
    int field_M;
    static byte[] field_m;
    private boolean field_hb;
    int field_q;
    int field_P;
    private int field_t;
    private int field_ab;
    private nf field_L;
    qb field_w;
    int field_eb;
    private int field_A;
    int field_ib;
    private qb field_Q;
    private qb field_fb;
    static kc field_S;
    private int field_Z;
    int field_x;
    qb field_I;
    boolean field_z;
    static String field_K;
    int field_Y;
    static pe field_H;

    final boolean c(int param0) {
        int stackIn_7_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            this.x(99);
            break L0;
          }
        }
        L1: {
          L2: {
            if ((this.field_ib ^ -1) >= -1) {
              break L2;
            } else {
              if (this.b((byte) -81)) {
                stackIn_7_0 = 0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackIn_7_0 = 1;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final int v(int param0) {
        boolean discarded$0 = false;
        if (param0 >= -110) {
            discarded$0 = this.e(true);
        }
        return this.field_q;
    }

    final static int a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ArcanistsMulti.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param0.length();
                        var3 = 0;
                        var4 = -72 / ((param1 - 4) / 62);
                        var5 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2_int <= var5) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_6_0 = fe.a((byte) 74, param0.charAt(var5)) + ((var3 << -118977147) + -var3);
                        stackIn_4_0 = stackIn_6_0;
                        if (var6 != 0) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var3 = stackIn_4_0;
                        var5++;
                        if (var6 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = var3;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_9_0 = (RuntimeException) (var2);
                    stackIn_8_0 = stackIn_9_0;
                    stackIn_9_1 = new StringBuilder().append("ml.C(");
                    stackIn_8_1 = stackIn_9_1;
                    if (param0 == null) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackIn_10_0 = (RuntimeException) ((Object) stackIn_8_0);
                    stackIn_10_1 = (StringBuilder) ((Object) stackIn_8_1);
                    stackIn_10_2 = "{...}";
                    statePc = 10;
                    continue stateLoop;
                }
                case 9: {
                    stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                    stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                    stackIn_10_2 = "null";
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int g(boolean param0) {
        if (param0) {
            this.field_eb = -102;
        }
        return this.field_u;
    }

    private final void g(int param0) {
        boolean stackIn_12_0 = false;
        int stackIn_18_0 = 0;
        boolean stackOut_11_0;
        int statePc = 0;
        int var2 = 0;
        int var3_int = 0;
        double var3 = 0.0;
        int var4_int = 0;
        mi var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        mi var7 = null;
        int var8 = 0;
        mi var9 = null;
        mi var10 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ArcanistsMulti.field_G ? 1 : 0;
                    if (param0 == -5445) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.t(22);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (2 != this.field_ab) {
                        statePc = 21;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (null == this.field_s) {
                        statePc = 5;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var2 = this.field_L.field_y * this.field_T / 6;
                    var3_int = -var2 + this.field_lb;
                    var4_int = this.field_db + (-(this.field_Y >> 120148673) - -480);
                    if (-1 <= (var4_int ^ -1)) {
                        statePc = 21;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var5 = Math.abs(var4_int);
                    if (Math.abs(var3_int) > Math.abs(var4_int)) {
                        statePc = 8;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var5 = Math.abs(var3_int);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var6 = 1;
                    var7_int = var5;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if ((var7_int ^ -1) >= -1) {
                        statePc = 17;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    jo.field_b = false;
                    stackOut_11_0 = this.field_L.a(-(this.field_Y >> 1783464865) + (this.field_db + -(var4_int * var7_int / var5)), -(var7_int * var3_int / var5) + this.field_lb, (byte) -83);
                    stackIn_18_0 = stackOut_11_0 ? 1 : 0;
                    stackIn_12_0 = stackOut_11_0;
                    if (var8 != 0) {
                        statePc = 18;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (!stackIn_12_0) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (jo.field_b) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var6 = 0;
                    if (var8 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var7_int--;
                    if (var8 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = var6;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (stackIn_18_0 != 0) {
                        statePc = 20;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var7 = aj.a((ml) (this), -480, false, 114, this.field_L, var2);
                    var7.field_F = var4_int;
                    var7.field_u = var3_int;
                    this.field_L.b(52, var7);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (-13 != (this.field_jb ^ -1)) {
                        statePc = 26;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (Math.random() * 75.0 >= (double)this.field_ib) {
                        statePc = 26;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var2 = (int)(Math.random() * (double)this.field_w.field_q);
                    var3_int = (int)(Math.random() * (double)this.field_w.field_y);
                    if ((this.field_w.field_A[var3_int * this.field_w.field_q + var2] ^ -1) != -1) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var4 = aj.a((ml) null, -256 + (var3_int + this.field_db) - -this.field_w.field_o, false, 109, this.field_L, -128 + this.field_w.field_x + (var2 + this.field_lb));
                    this.field_L.b(52, var4);
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (this.field_jb == 25) {
                        statePc = 28;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var9 = aj.a((ml) null, this.field_db - (this.field_Y >> 993997537), false, 100, this.field_L, this.field_lb);
                    var3 = Math.random() * 6.28;
                    var9.field_u = (int)((double)(12 * -this.field_E) + 16.0 * Math.sin(var3));
                    var9.field_F = (int)(Math.cos(var3) * 16.0);
                    this.field_L.b(52, var9);
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (this.field_jb == 19) {
                        statePc = 31;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var10 = aj.a((ml) null, this.field_db, false, 100, this.field_L, this.field_lb);
                    var3 = Math.random() * 6.28;
                    var10.field_F = (int)(8.0 + Math.sin(var3) * 12.0);
                    var10.field_u = (int)(16.0 * Math.cos(var3));
                    this.field_L.b(param0 + 5497, var10);
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int p(int param0) {
        if (param0 != -8323) {
            return -90;
        }
        return this.field_Y;
    }

    final void e(byte param0) {
        if (!(20 != this.field_jb)) {
            this.field_q = 25;
            this.field_Y = uj.field_i[0].field_w;
            this.field_w = new qb(this.field_Y, this.field_Y);
            this.field_w.a();
            uj.field_i[0].a(this.field_Y / 2 - uj.field_i[0].field_n / 2, 0, 16777215);
        }
        if (!(this.field_jb != 22)) {
            this.field_q = 75;
            this.field_Y = uj.field_i[1].field_w;
            this.field_w = new qb(this.field_Y, this.field_Y);
            this.field_w.a();
            uj.field_i[1].a(-(uj.field_i[1].field_n / 2) + this.field_Y / 2, 0, 16777215);
        }
        if (param0 != 6) {
            this.field_gb = (mi) null;
        }
        if ((this.field_jb ^ -1) == -39) {
            this.field_Y = uj.field_i[6].field_w;
            this.field_q = 75;
            this.field_w = new qb(this.field_Y, this.field_Y);
            this.field_w.a();
            uj.field_i[6].a(-(uj.field_i[6].field_n / 2) + this.field_Y / 2, 0, 16777215);
        }
        if (!(this.field_jb != 21)) {
            this.field_q = 100;
            this.field_Y = uj.field_i[2].field_w;
            this.field_w = new qb(this.field_Y, this.field_Y);
            this.field_w.a();
            uj.field_i[2].a(this.field_Y / 2 + -(uj.field_i[2].field_n / 2), 0, 16777215);
        }
        if (-24 == (this.field_jb ^ -1)) {
            this.field_Y = uj.field_i[3].field_w;
            this.field_q = 75;
            this.field_w = new qb(this.field_Y, this.field_Y);
            this.field_w.a();
            uj.field_i[3].a(-(uj.field_i[3].field_n / 2) + this.field_Y / 2, 0, 16777215);
        }
        if ((this.field_jb ^ -1) == -25) {
            this.field_Y = uj.field_i[4].field_w;
            this.field_q = 75;
            this.field_w = new qb(this.field_Y, this.field_Y);
            this.field_w.a();
            uj.field_i[4].a(-(uj.field_i[4].field_n / 2) + this.field_Y / 2, 0, 16777215);
        }
        if (!((this.field_jb ^ -1) != -36)) {
            this.field_Y = -16 + (80 + uj.field_i[5].field_w);
            this.field_q = 75;
            this.field_w = new qb(this.field_Y, this.field_Y);
            this.field_w.a();
            uj.field_i[5].a(this.field_Y / 2 + -(uj.field_i[5].field_n / 2), 64, 16777215);
            de.i(this.field_Y / 2, 80, 16, 16777215);
        }
    }

    final boolean g(byte param0) {
        int stackIn_12_0 = 0;
        L0: {
          if (param0 >= 88) {
            break L0;
          } else {
            this.field_N = 58;
            break L0;
          }
        }
        L1: {
          L2: {
            if ((this.field_jb ^ -1) == -21) {
              break L2;
            } else {
              if (22 == this.field_jb) {
                break L2;
              } else {
                if ((this.field_jb ^ -1) == -22) {
                  break L2;
                } else {
                  if ((this.field_jb ^ -1) == -24) {
                    break L2;
                  } else {
                    if (-25 == (this.field_jb ^ -1)) {
                      break L2;
                    } else {
                      if (this.field_jb == 35) {
                        break L2;
                      } else {
                        if ((this.field_jb ^ -1) != -39) {
                          stackIn_12_0 = 0;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          stackIn_12_0 = 1;
          break L1;
        }
        return stackIn_12_0 != 0;
    }

    final void a(boolean param0, boolean param1) {
        ml stackIn_3_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        Object stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        ml stackOut_2_0;
        int var3;
        int var4;
        int var5;
        int var6;
        ml var7;
        mi var7_ref;
        int var9;
        mi var10;
        mi var11;
        mi var12;
        mi var13;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        var6 = 16384;
        pi.field_b.a((byte) 95, this.field_L.field_i);
        var7 = (ml) ((Object) pi.field_b.b(-83));
        L0: while (true) {
          L1: {
            L2: {
              if (var7 == null) {
                break L2;
              } else {
                stackOut_2_0 = (ml) (var7);
                stackIn_10_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var9 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0.field_jb == 19) {
                      var4 = -var7.field_db + (-48 + this.field_db);
                      var3 = -var7.field_lb + this.field_lb;
                      var5 = var3 * var3 + var4 * var4;
                      if (var5 < var6) {
                        var7.field_z = true;
                        var7.field_jb = 0;
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var7 = (ml) ((Object) pi.field_b.d(-18502));
                  if (var9 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            pi.field_b.a((byte) 91, this.field_L.field_Kb);
            stackIn_10_0 = pi.field_b.b(-58);
            break L1;
          }
          L4: {
            var7_ref = (mi) ((Object) stackIn_10_0);
            if (param1) {
              break L4;
            } else {
              this.a(-6, -62);
              break L4;
            }
          }
          L5: while (true) {
            L6: {
              L7: {
                if (var7_ref == null) {
                  break L7;
                } else {
                  if (var9 != 0) {
                    break L6;
                  } else {
                    L8: {
                      L9: {
                        if ((var7_ref.field_I ^ -1) == -56) {
                          break L9;
                        } else {
                          if (157 == var7_ref.field_I) {
                            break L9;
                          } else {
                            if (-169 == (var7_ref.field_I ^ -1)) {
                              break L9;
                            } else {
                              if (111 == var7_ref.field_I) {
                                break L9;
                              } else {
                                if (var7_ref.field_I == 68) {
                                  break L9;
                                } else {
                                  if (-70 == (var7_ref.field_I ^ -1)) {
                                    break L9;
                                  } else {
                                    if ((var7_ref.field_I ^ -1) == -71) {
                                      break L9;
                                    } else {
                                      if (-57 == (var7_ref.field_I ^ -1)) {
                                        break L9;
                                      } else {
                                        if (-107 == (var7_ref.field_I ^ -1)) {
                                          break L9;
                                        } else {
                                          if (-108 == (var7_ref.field_I ^ -1)) {
                                            break L9;
                                          } else {
                                            if (var7_ref.field_I == 117) {
                                              break L9;
                                            } else {
                                              if ((var7_ref.field_I ^ -1) == -4) {
                                                break L9;
                                              } else {
                                                if (121 == var7_ref.field_I) {
                                                  break L9;
                                                } else {
                                                  if (-150 == (var7_ref.field_I ^ -1)) {
                                                    break L9;
                                                  } else {
                                                    break L8;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      var3 = -var7_ref.field_v + this.field_lb;
                      var4 = -var7_ref.field_G + this.field_db + -48;
                      var5 = var3 * var3 - -(var4 * var4);
                      if (var5 < var6) {
                        L10: {
                          if (this == var7_ref.field_t) {
                            break L10;
                          } else {
                            if (117 == var7_ref.field_I) {
                              break L10;
                            } else {
                              if ((var7_ref.field_I ^ -1) == -4) {
                                break L10;
                              } else {
                                if (149 != var7_ref.field_I) {
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                        }
                        L11: {
                          if (!param0) {
                            break L11;
                          } else {
                            var10 = aj.a((ml) (this), var7_ref.field_G, false, 154, this.field_L, var7_ref.field_v);
                            this.field_L.b(52, var10);
                            var11 = aj.a((ml) (this), -48 + this.field_db, false, 108, this.field_L, this.field_lb);
                            this.field_L.b(52, var11);
                            break L11;
                          }
                        }
                        L12: {
                          if (var7_ref.field_I == 157) {
                            break L12;
                          } else {
                            if (-169 == (var7_ref.field_I ^ -1)) {
                              break L12;
                            } else {
                              var7_ref.f(0);
                              if (var9 == 0) {
                                break L8;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        var7_ref.field_y = -1;
                        var7_ref.a(this.field_L.n((byte) -75), (byte) -83, this.field_L.field_t, this.field_L.field_mb);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L13: {
                      if (-150 != (var7_ref.field_I ^ -1)) {
                        break L13;
                      } else {
                        var3 = -var7_ref.field_u + (-var7_ref.field_v + this.field_lb);
                        var4 = -var7_ref.field_G + (-48 + (this.field_db + -var7_ref.field_F));
                        var5 = var3 * var3 - -(var4 * var4);
                        if ((var6 ^ -1) >= (var5 ^ -1)) {
                          break L13;
                        } else {
                          L14: {
                            if (param0) {
                              L15: {
                                stackIn_49_0 = this;

                                stackIn_49_1 = var7_ref.field_G;

                                if (param1) {
                                  stackIn_50_0 = this;
                                  stackIn_50_1 = stackIn_49_1;
                                  stackIn_50_2 = 0;
                                  break L15;
                                } else {
                                  stackIn_50_0 = this;
                                  stackIn_50_1 = stackIn_49_1;
                                  stackIn_50_2 = 1;
                                  break L15;
                                }
                              }
                              var12 = aj.a((ml) (this), stackIn_50_1, stackIn_50_2 != 0, 154, this.field_L, var7_ref.field_v);
                              this.field_L.b(52, var12);
                              var13 = aj.a((ml) (this), this.field_db + -48, false, 108, this.field_L, this.field_lb);
                              this.field_L.b(52, var13);
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          var7_ref.f(0);
                          break L13;
                        }
                      }
                    }
                    var7_ref = (mi) ((Object) pi.field_b.d(-18502));
                    if (var9 == 0) {
                      continue L5;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              break L6;
            }
            return;
          }
        }
    }

    final boolean s(int param0) {
        int stackIn_23_0 = 0;
        L0: {
          if ((this.field_X >> -1454644252 ^ -1) > (this.field_Y / 2 ^ -1)) {
            break L0;
          } else {
            if ((this.field_X >> 1735964836 ^ -1) < (-(this.field_Y / 2) + this.field_L.field_y ^ -1)) {
              break L0;
            } else {
              L1: {
                if (param0 == -1) {
                  break L1;
                } else {
                  this.field_t = 29;
                  break L1;
                }
              }
              L2: {
                if (null == this.field_gb) {
                  break L2;
                } else {
                  if ((this.field_gb.field_I ^ -1) == -122) {
                    return false;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                L4: {
                  if (this.f((byte) -107)) {
                    break L4;
                  } else {
                    if (8 == this.field_jb) {
                      break L4;
                    } else {
                      if ((this.field_jb ^ -1) == -7) {
                        break L4;
                      } else {
                        if (-26 == (this.field_jb ^ -1)) {
                          break L4;
                        } else {
                          if (10 == this.field_jb) {
                            break L4;
                          } else {
                            L5: {
                              if ((this.field_lb ^ -1) > -1) {
                                break L5;
                              } else {
                                if ((this.field_lb ^ -1) < (this.field_L.field_y ^ -1)) {
                                  break L5;
                                } else {
                                  if (-20 == (this.field_jb ^ -1)) {
                                    break L4;
                                  } else {
                                    if (18 != this.field_jb) {
                                      break L5;
                                    } else {
                                      if ((this.field_x ^ -1) < -1) {
                                        break L5;
                                      } else {
                                        break L4;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackIn_23_0 = 0;
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                stackIn_23_0 = 1;
                break L3;
              }
              return stackIn_23_0 != 0;
            }
          }
        }
        return false;
    }

    private final boolean f(byte param0) {
        int stackIn_7_0 = 0;
        if (param0 == -107) {
          L0: {
            L1: {
              if (this.j(param0 + 81)) {
                break L1;
              } else {
                if (this.field_jb != 17) {
                  stackIn_7_0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackIn_7_0 = 1;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    final boolean t(int param0) {
        if (param0 < 25) {
            return false;
        }
        return this.field_s == null ? true : false;
    }

    final void c(int param0, int param1, int param2) {
        ll[] stackIn_126_0 = null;
        ll[] stackIn_127_0 = null;
        ll[] stackIn_128_0 = null;
        int stackIn_128_1 = 0;
        ll[] stackIn_130_0 = null;
        ll[] stackIn_131_0 = null;
        ll[] stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        int stackIn_412_0 = 0;
        int stackIn_412_1 = 0;
        int stackIn_418_0 = 0;
        int stackIn_418_1 = 0;
        int statePc = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        qb var8_ref_qb = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        qb var12_ref_qb = null;
        int var12 = 0;
        int var13_int = 0;
        Object var13 = null;
        int var14 = 0;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21_int = 0;
        qb var21 = null;
        int var22_int = 0;
        int[] var22 = null;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int[] var28 = null;
        int var29 = 0;
        int var30 = 0;
        qb var31 = null;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int[] var35 = null;
        mi var36 = null;
        mi var37 = null;
        mi var38 = null;
        mi var39 = null;
        mi var40 = null;
        qb var41 = null;
        qb var42 = null;
        qb var43 = null;
        qb var44 = null;
        mi var45 = null;
        mi var46 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var34 = ArcanistsMulti.field_G ? 1 : 0;
                    if (!this.field_J) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.a(12, false);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    var35 = new int[]{param1 + this.field_lb, this.field_db + param0};
                    var4 = var35;
                    if (28 == this.field_jb) {
                        statePc = 8;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (-30 == (this.field_jb ^ -1)) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (this.field_jb == 30) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if ((this.field_jb ^ -1) != -33) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (-16 + this.field_L.field_H > this.field_db) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var35[1] = (int)((double)var35[1] - (8.0 * Math.sin(3.141592653589793 * (double)ge.field_r / 64.0) + 2.0));
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    var5 = nj.field_n[this.field_u];
                    if (-40 == (this.field_jb ^ -1)) {
                        statePc = 12;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (this.field_F <= 2.5) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var36 = aj.a((ml) null, this.field_db + (-(this.p(-8323) / 2) - -13), false, 166, this.field_L, -(42 * this.field_E) + this.field_lb);
                    var36.field_u = 20 * -this.field_E;
                    var36.field_F = (int)(-5.0 + 15.0 * Math.random());
                    this.field_L.b(52, var36);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    var6 = 0;
                    if (-39 != (this.field_jb ^ -1)) {
                        statePc = 25;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (this.field_F <= 0.0) {
                        statePc = 25;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (1.0 <= this.field_F) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var37 = aj.a((ml) null, 13 + this.field_db - this.p(param2 ^ -1703912164) / 2, false, 166, this.field_L, -(this.field_E * 22) + this.field_lb);
                    var37.field_u = -this.field_E * 10;
                    var37.field_F = (int)(-5.0 + 15.0 * Math.random());
                    this.field_L.b(52, var37);
                    if (var34 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (2.0 > this.field_F) {
                        statePc = 24;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (this.field_F >= 3.0) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var38 = aj.a((ml) null, -12 + (this.field_db + -(this.p(-8323) / 2)), false, 166, this.field_L, this.field_lb - this.field_E * 22);
                    var38.field_u = 10 * -this.field_E;
                    var38.field_F = (int)(15.0 * Math.random() - 10.0);
                    this.field_L.b(52, var38);
                    if (var34 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (4.0 > this.field_F) {
                        statePc = 23;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var39 = aj.a((ml) null, this.field_db + (-(this.p(param2 ^ -1703912164) / 2) - -13 + -5), false, 166, this.field_L, this.field_lb - -(this.field_E * 22));
                    var39.field_u = 30 * this.field_E;
                    var39.field_F = (int)(Math.random() * 15.0);
                    this.field_L.b(52, var39);
                    if (var34 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var40 = aj.a((ml) null, -30 + this.field_db - (this.p(-8323) / 2 + -13), false, 166, this.field_L, this.field_lb + this.field_E * 22);
                    var40.field_u = 30 * this.field_E;
                    var40.field_F = (int)(15.0 * Math.random() - 15.0);
                    this.field_L.b(52, var40);
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (12 != this.field_jb) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    de.h(param1, param0, this.field_L.field_y + param1, an.field_j);
                    go.field_j[29].a(-128 + var35[0], var35[1] + -256);
                    de.a();
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (-41 == (this.field_jb ^ -1)) {
                        statePc = 398;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (this.field_jb == 20) {
                        statePc = 395;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (this.field_jb == 22) {
                        statePc = 392;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (-39 != (this.field_jb ^ -1)) {
                        statePc = 34;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    uj.field_i[6].c(-(uj.field_i[6].field_n / 2) + var35[0], -this.field_Y + var35[1]);
                    if (null == this.field_I) {
                        statePc = 405;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    this.field_I.e(-16 + var35[0], var6 + -(this.field_Y >> -1815421503) + var35[1] + -32);
                    if (var34 == 0) {
                        statePc = 405;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if ((this.field_jb ^ -1) != -22) {
                        statePc = 38;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    uj.field_i[2].c(-(uj.field_i[2].field_n / 2) + var35[0], -this.field_Y + var35[1]);
                    if (null == this.field_I) {
                        statePc = 405;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    this.field_I.e(-16 + var35[0], var35[1] + -(this.field_Y >> 507989281) + (-32 - -var6));
                    if (var34 == 0) {
                        statePc = 405;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (-24 != (this.field_jb ^ -1)) {
                        statePc = 42;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    uj.field_i[3].c(-(uj.field_i[3].field_n / 2) + var35[0], var35[1] + -this.field_Y);
                    if (this.field_I != null) {
                        statePc = 41;
                    } else {
                        statePc = 405;
                    }
                    continue stateLoop;
                }
                case 41: {
                    this.field_I.e(var35[0] - 16, var6 + (-32 + var35[1] - (this.field_Y >> 1449610177)));
                    if (var34 == 0) {
                        statePc = 405;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (24 != this.field_jb) {
                        statePc = 46;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    uj.field_i[4].c(var35[0] - uj.field_i[4].field_n / 2, -this.field_Y + var35[1]);
                    if (this.field_I != null) {
                        statePc = 45;
                    } else {
                        statePc = 405;
                    }
                    continue stateLoop;
                }
                case 45: {
                    this.field_I.e(var35[0] + -16, var6 + var35[1] - (this.field_Y >> -1600813727) - 32);
                    if (var34 == 0) {
                        statePc = 405;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (this.field_jb == 35) {
                        statePc = 369;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if ((this.field_jb ^ -1) != -27) {
                        statePc = 69;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (ff.field_b == null) {
                        statePc = 69;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var7 = 0;
                    if (this.field_F <= 1.5) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var7 = 1;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if (this.field_F > 3.0) {
                        statePc = 53;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var7 = 2;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (4.5 >= this.field_F) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var7 = 3;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (0.0 > this.field_F) {
                        statePc = 58;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var7 = 4;
                    if (this.field_F > -2.0) {
                        statePc = 60;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var7 = 5;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    if (this.field_F > -1.0) {
                        statePc = 63;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var7 = 6;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    if ((this.field_E ^ -1) != 0) {
                        statePc = 67;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    ff.field_b[var7].d(var35[0] + -(this.field_Y >> -955111135), var35[1] - this.field_Y);
                    if (var34 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    ff.field_b[var7].a(var35[0] + -(this.field_Y >> 1703903841), var35[1] + -this.field_Y);
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (var34 == 0) {
                        statePc = 405;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (-40 != (this.field_jb ^ -1)) {
                        statePc = 89;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (ub.field_e == null) {
                        statePc = 89;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    var7 = 0;
                    if (this.field_F <= 1.5) {
                        statePc = 73;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var7 = 1;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    if (this.field_F <= 3.0) {
                        statePc = 75;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    var7 = 2;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    if (4.5 < this.field_F) {
                        statePc = 77;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 77: {
                    var7 = 3;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    if (0.0 <= this.field_F) {
                        statePc = 84;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var7 = 4;
                    if (-2.0 < this.field_F) {
                        statePc = 81;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var7 = 5;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    if (this.field_F <= -1.0) {
                        statePc = 84;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    var7 = 6;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if (-1 == this.field_E) {
                        statePc = 87;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    ub.field_e[var7].a(var35[0] - (this.field_Y >> 417241281), -this.field_Y + var35[1]);
                    if (var34 == 0) {
                        statePc = 88;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    ub.field_e[var7].d(-(this.field_Y >> 1106014241) + var35[0], var35[1] + -this.field_Y);
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    if (var34 == 0) {
                        statePc = 405;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if (13 != this.field_jb) {
                        statePc = 92;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if (rc.field_d != null) {
                        statePc = 350;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (15 != this.field_jb) {
                        statePc = 95;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    if (bk.field_L != null) {
                        statePc = 332;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if (14 != this.field_jb) {
                        statePc = 114;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (null == jk.field_m) {
                        statePc = 114;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    var7 = 0;
                    if (this.field_F > 1.5) {
                        statePc = 99;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 99: {
                    var7 = 1;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    if (this.field_F <= 3.0) {
                        statePc = 102;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    var7 = 2;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    if (this.field_F <= 4.5) {
                        statePc = 104;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    var7 = 3;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    if (0.0 <= this.field_F) {
                        statePc = 109;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    var7 = 4;
                    if (-2.0 >= this.field_F) {
                        statePc = 107;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    var7 = 5;
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    if (-1.0 >= this.field_F) {
                        statePc = 109;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    var7 = 6;
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    if (-1 == this.field_E) {
                        statePc = 112;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    jk.field_m[var7].a(var35[0] + -(this.field_Y >> -948359583), var35[1] - this.field_Y);
                    if (var34 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    jk.field_m[var7].d(-(this.field_Y >> -450855967) + var35[0], var35[1] - this.field_Y);
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    if (var34 == 0) {
                        statePc = 405;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    if (17 != this.field_jb) {
                        statePc = 134;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    if (null == ra.field_c) {
                        statePc = 134;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    var7 = 0;
                    if (this.field_F > 1.5) {
                        statePc = 118;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 118: {
                    var7 = 1;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    if (3.0 < this.field_F) {
                        statePc = 121;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 121: {
                    var7 = 2;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    if (4.5 >= this.field_F) {
                        statePc = 124;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var7 = 3;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    if (-1 == this.field_E) {
                        statePc = 129;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    stackIn_127_0 = ra.field_c;
                    stackIn_126_0 = stackIn_127_0;
                    if (!this.field_U) {
                        statePc = 127;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    stackIn_128_0 = (ll[]) ((Object) stackIn_126_0);
                    stackIn_128_1 = 4;
                    statePc = 128;
                    continue stateLoop;
                }
                case 127: {
                    stackIn_128_0 = (ll[]) ((Object) stackIn_127_0);
                    stackIn_128_1 = 0;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    ((ll) (Object) stackIn_128_0[stackIn_128_1 + var7]).a(var35[0] + -(this.field_Y >> -2026173023), var35[1] - this.field_Y);
                    if (var34 == 0) {
                        statePc = 133;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    stackIn_131_0 = ra.field_c;
                    stackIn_130_0 = stackIn_131_0;
                    if (!this.field_U) {
                        statePc = 131;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    stackIn_132_0 = (ll[]) ((Object) stackIn_130_0);
                    stackIn_132_1 = 4;
                    statePc = 132;
                    continue stateLoop;
                }
                case 131: {
                    stackIn_132_0 = (ll[]) ((Object) stackIn_131_0);
                    stackIn_132_1 = 0;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    ((ll) (Object) stackIn_132_0[stackIn_132_1 + var7]).d(-(this.field_Y >> -355970495) + var35[0], var35[1] - this.field_Y);
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    if (var34 == 0) {
                        statePc = 405;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    if (this.field_jb != 6) {
                        statePc = 159;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if (null == wl.field_U) {
                        statePc = 159;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    var7 = 0;
                    if (0.75 >= this.field_F) {
                        statePc = 138;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    var7 = 1;
                    statePc = 138;
                    continue stateLoop;
                }
                case 138: {
                    if (this.field_F > 1.5) {
                        statePc = 140;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 140: {
                    var7 = 2;
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    if (this.field_F <= 2.25) {
                        statePc = 143;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    var7 = 3;
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    if (3.0 >= this.field_F) {
                        statePc = 145;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    var7 = 4;
                    statePc = 145;
                    continue stateLoop;
                }
                case 145: {
                    if (this.field_F > 3.75) {
                        statePc = 147;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 147: {
                    var7 = 5;
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    if (4.5 < this.field_F) {
                        statePc = 150;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 150: {
                    var7 = 6;
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    if (5.25 < this.field_F) {
                        statePc = 153;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 153: {
                    var7 = 7;
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    if (-1 != this.field_E) {
                        statePc = 157;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    wl.field_U[var7].d(var35[0] - 24, -36 + var35[1]);
                    if (var34 == 0) {
                        statePc = 158;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    wl.field_U[var7].a(var35[0] - 24, -36 + var35[1]);
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    if (var34 == 0) {
                        statePc = 405;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    if (-8 == (this.field_jb ^ -1)) {
                        statePc = 167;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    if (-10 == (this.field_jb ^ -1)) {
                        statePc = 167;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    if ((this.field_jb ^ -1) == -3) {
                        statePc = 167;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    if (this.field_jb == 5) {
                        statePc = 167;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    if (28 == this.field_jb) {
                        statePc = 167;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    if (-30 == (this.field_jb ^ -1)) {
                        statePc = 167;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    if (-31 != (this.field_jb ^ -1)) {
                        statePc = 232;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    var7 = this.field_Y;
                    if ((this.field_jb ^ -1) == -8) {
                        statePc = 170;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    if ((this.field_jb ^ -1) == -10) {
                        statePc = 170;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 170: {
                    var7 = 64;
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    var41 = this.field_fb;
                    var8_ref_qb = var41;
                    var9 = -(var7 >> 1427873218) + var35[0] - this.field_n;
                    if (-1 != this.field_E) {
                        statePc = 173;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 173: {
                    var9 = -(var7 >> -1876659646) + (var35[0] + -(var7 >> -153590463) + this.field_n);
                    statePc = 174;
                    continue stateLoop;
                }
                case 174: {
                    var10 = var35[1] + -var7 + (this.field_O - -var6);
                    if ((this.field_E ^ -1) != 0) {
                        statePc = 176;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    var8_ref_qb = var41.b();
                    statePc = 176;
                    continue stateLoop;
                }
                case 176: {
                    var11 = 0;
                    if (this.field_gb == null) {
                        statePc = 197;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    if (121 == this.field_gb.field_I) {
                        statePc = 197;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    if (this.field_gb.field_I == 138) {
                        statePc = 196;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    if (2 != this.field_jb) {
                        statePc = 183;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    if (-13 < (this.field_gb.field_y ^ -1)) {
                        statePc = 182;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    var10 = var10 + (-this.field_gb.field_y + 25) * this.field_gb.field_F / 100;
                    var9 = var9 + this.field_gb.field_u * (-this.field_gb.field_y + 25) / 100;
                    if (var34 == 0) {
                        statePc = 197;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    var9 = var9 + this.field_gb.field_y * this.field_gb.field_u / 100;
                    var10 = var10 + this.field_gb.field_y * this.field_gb.field_F / 100;
                    if (var34 == 0) {
                        statePc = 197;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    if (30 == this.field_jb) {
                        statePc = 193;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    if (this.field_jb == 9) {
                        statePc = 192;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    if (this.field_jb == 5) {
                        statePc = 192;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    if ((this.field_jb ^ -1) == -29) {
                        statePc = 189;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    if (this.field_jb != 29) {
                        statePc = 190;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    var10 = var10 - this.field_gb.field_y * this.field_gb.field_F / 100;
                    var9 = var9 - this.field_gb.field_y * this.field_gb.field_u / 100;
                    var12_ref_qb = var8_ref_qb;
                    var42 = new qb(2 * this.field_Y, this.field_Y * 2);
                    var8_ref_qb = var42;
                    var9 = var9 - this.field_Y / 2;
                    var10 = var10 - this.field_Y / 2;
                    var42.a();
                    var12_ref_qb.b(this.field_Y / 2 << 1882738244, 3 * this.field_Y / 4 << 632778852, this.field_Y << 1126029156, this.field_Y << 595061316, this.field_E * 4000 * -this.field_gb.field_y, 4096);
                    ce.field_m.a(true);
                    if (var34 == 0) {
                        statePc = 197;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    if (-8 != (this.field_jb ^ -1)) {
                        statePc = 197;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    var9 = var9 + this.field_gb.field_u / 2;
                    var10 = var10 + this.field_gb.field_F / 2;
                    var12_ref_qb = var8_ref_qb;
                    var43 = new qb(128, 128);
                    var8_ref_qb = var43;
                    var10 -= 32;
                    var9 -= 32;
                    var43.a();
                    var12_ref_qb.b(512, 768, 1024, 1024, this.field_E * -this.field_gb.field_y * 8000, 4096);
                    ce.field_m.a(true);
                    if (var34 == 0) {
                        statePc = 197;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    var9 = var9 + this.field_gb.field_u * this.field_gb.field_y / 200;
                    var10 = var10 + this.field_gb.field_y * this.field_gb.field_F / 200;
                    var12_ref_qb = var8_ref_qb;
                    var9 -= 32;
                    var10 -= 32;
                    var44 = new qb(128, 128);
                    var8_ref_qb = var44;
                    var44.a();
                    var12_ref_qb.b(512, 768, 1024, 1024, this.field_E * 4000 * -this.field_gb.field_y, 4096);
                    ce.field_m.a(true);
                    if (var34 == 0) {
                        statePc = 197;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    if (-13 >= (this.field_gb.field_y ^ -1)) {
                        statePc = 195;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    var10 = var10 - 5 * this.field_gb.field_F * this.field_gb.field_y / 50;
                    var9 = var9 - this.field_gb.field_y * this.field_gb.field_u * 5 / 50;
                    if (var34 == 0) {
                        statePc = 197;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    var9 = var9 - (25 - this.field_gb.field_y) * 5 * this.field_gb.field_u / 50;
                    var10 = var10 - (25 + -this.field_gb.field_y) * 5 * this.field_gb.field_F / 50;
                    if (var34 == 0) {
                        statePc = 197;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    var11 = 1;
                    statePc = 197;
                    continue stateLoop;
                }
                case 197: {
                    if (-1 == this.field_E) {
                        statePc = 215;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    if (this.field_B == null) {
                        statePc = 200;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    this.field_B.c(-(var7 >> -791114718) + (var35[0] + this.field_r), var6 + (var35[1] - var7 + this.field_O));
                    statePc = 200;
                    continue stateLoop;
                }
                case 200: {
                    if (this.field_cb != null) {
                        statePc = 202;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 202: {
                    this.field_cb.c(-(var7 >> -2062000511) + var35[0] - -this.field_t, this.field_Z + (var35[1] - var7));
                    statePc = 203;
                    continue stateLoop;
                }
                case 203: {
                    if (this.field_bb != null) {
                        statePc = 205;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 205: {
                    this.field_bb.c(var35[0] + -(var7 >> -1669721471), var6 + -var7 + var35[1]);
                    statePc = 206;
                    continue stateLoop;
                }
                case 206: {
                    if (this.field_I == null) {
                        statePc = 210;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    if (var11 == 0) {
                        statePc = 209;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    var12 = -(int)(Math.sin((double)jb.field_v * 0.2) * (500.0 * Math.random() + 1000.0));
                    this.field_I.a(4096, -(3 * var7 / 4) + (var35[1] - -var6), param2 ^ 1703903772, var35[0], var12);
                    if (var34 == 0) {
                        statePc = 210;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    this.field_I.c(var35[0] - (var7 >> 1298036705), var6 + -(var7 * 3 / 2) + var35[1]);
                    statePc = 210;
                    continue stateLoop;
                }
                case 210: {
                    if (null == this.field_Q) {
                        statePc = 212;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    this.field_Q.c(-(var7 >> -2027413439) + var35[0] + this.field_y, this.field_o + (-var7 + var35[1]));
                    statePc = 212;
                    continue stateLoop;
                }
                case 212: {
                    if (this.field_fb != null) {
                        statePc = 214;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 214: {
                    var8_ref_qb.c(var9, var10);
                    if (var34 == 0) {
                        statePc = 231;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    if (this.field_B == null) {
                        statePc = 217;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    this.field_B.e(-this.field_r + var35[0] - (var7 >> -1223359359) + -(var7 >> 1212325410), this.field_O + (-var7 + (var35[1] - -var6)));
                    statePc = 217;
                    continue stateLoop;
                }
                case 217: {
                    if (this.field_cb != null) {
                        statePc = 219;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 219: {
                    this.field_cb.e(var35[0] + -(var7 >> -271457279) - this.field_t, -var7 + (var35[1] + this.field_Z));
                    statePc = 220;
                    continue stateLoop;
                }
                case 220: {
                    if (this.field_bb != null) {
                        statePc = 222;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 222: {
                    this.field_bb.e(var35[0] + -(var7 >> 785879457), -var7 + (var35[1] + var6));
                    statePc = 223;
                    continue stateLoop;
                }
                case 223: {
                    if (this.field_I == null) {
                        statePc = 227;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    if (var11 == 0) {
                        statePc = 226;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    var12 = (int)(Math.sin(0.2 * (double)jb.field_v) * (500.0 * Math.random() + 1000.0));
                    this.field_I.b().a(4096, var35[1] + (-(var7 * 3 / 4) - -var6), 19, var35[0], var12);
                    if (var34 == 0) {
                        statePc = 227;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 226: {
                    this.field_I.e(var35[0] + -(var7 >> 1262758529), var35[1] - var7 * 3 / 2 + var6);
                    statePc = 227;
                    continue stateLoop;
                }
                case 227: {
                    if (this.field_Q == null) {
                        statePc = 229;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    this.field_Q.e(-this.field_y + (var35[0] + -(var7 >> -990635199)), this.field_o + (var35[1] + -var7));
                    statePc = 229;
                    continue stateLoop;
                }
                case 229: {
                    if (this.field_fb == null) {
                        statePc = 231;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    var8_ref_qb.c(var9, var10);
                    statePc = 231;
                    continue stateLoop;
                }
                case 231: {
                    if (var34 == 0) {
                        statePc = 405;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    if ((this.field_ab ^ -1) == -4) {
                        statePc = 327;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    var7 = this.field_Y;
                    if ((this.field_E ^ -1) != 0) {
                        statePc = 279;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    if (null != this.field_B) {
                        statePc = 236;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 236: {
                    this.field_B.e(-(var7 >> -1083108222) + (-(var7 >> -2077559391) + var35[0]) - this.field_r, this.field_O + (-var7 + var35[1]) - -var6);
                    statePc = 237;
                    continue stateLoop;
                }
                case 237: {
                    if (this.field_cb == null) {
                        statePc = 239;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    this.field_cb.e(-(var7 >> -1060412223) + var35[0] - this.field_t, this.field_Z + (-var7 + var35[1]));
                    statePc = 239;
                    continue stateLoop;
                }
                case 239: {
                    if (this.field_bb != null) {
                        statePc = 241;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 241: {
                    this.field_bb.e(var35[0] - (var7 >> -1212619103), var6 + (-var7 + var35[1]));
                    statePc = 242;
                    continue stateLoop;
                }
                case 242: {
                    if (this.field_jb == 32) {
                        statePc = 250;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    if (37 == this.field_jb) {
                        statePc = 247;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    if (null != this.field_I) {
                        statePc = 246;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 246: {
                    this.field_I.e(-(var7 >> -41047807) + var35[0], var6 + -(3 * var7 / 2) + var35[1]);
                    if (var34 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    if (this.field_I != null) {
                        statePc = 249;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 249: {
                    this.field_I.e(var35[0] - (var7 >> -305420351), var35[1] + (-(var7 * 3 / 2) + (var6 - 10)));
                    if (var34 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 250: {
                    if (this.field_I == null) {
                        statePc = 252;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    this.field_I.e(-12 + -(var7 >> 13165761) + var35[0], var6 + (-(3 * var7 / 2) + var35[1]));
                    statePc = 252;
                    continue stateLoop;
                }
                case 252: {
                    if (null != this.field_Q) {
                        statePc = 254;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 254: {
                    this.field_Q.e(-this.field_y + -(var7 >> 2121690849) + var35[0], this.field_o + (-var7 + var35[1]));
                    statePc = 255;
                    continue stateLoop;
                }
                case 255: {
                    if ((this.field_ab ^ -1) != -2) {
                        statePc = 257;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    gn.a(12, (byte) 117, 128, var35[0] + ((var7 >> 756631234) + -this.field_n + 4), this.field_N + (8 + var35[1] + (-this.field_Y - -var6)));
                    var8 = -this.field_n + (var7 >> -1205680158) - (-4 - (int)(13.0 * Math.random() - 6.0));
                    var9 = this.field_N + -this.field_Y - -8 - (-var6 - (int)(Math.random() * 13.0 - 18.0) - (-6 - -Math.abs(-4 + (var8 + -(var7 >> 1992415010)) + this.field_n)));
                    var45 = aj.a((ml) null, this.field_db + var9, false, 109, this.field_L, this.field_lb + var8);
                    var45.field_y = 16;
                    this.field_L.b(52, var45);
                    statePc = 257;
                    continue stateLoop;
                }
                case 257: {
                    if ((this.field_ab ^ -1) == -1) {
                        statePc = 259;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 259: {
                    var8 = 0;
                    if (this.field_L.field_N == null) {
                        statePc = 261;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    var8 = this.field_L.field_N[this.field_T][5] | (this.field_L.field_N[this.field_T][3] << -1008437328 | this.field_L.field_N[this.field_T][4] << 1373199240);
                    statePc = 261;
                    continue stateLoop;
                }
                case 261: {
                    var9 = 4 + ((var7 >> 1112750562) + var35[0] + -this.field_n);
                    var10 = this.field_N + (-this.field_Y + var35[1]) - (-8 + -var6);
                    var11 = 255 & jb.field_v;
                    if (var11 < 128) {
                        statePc = 263;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 262: {
                    var11 = -var11 + 256;
                    statePc = 263;
                    continue stateLoop;
                }
                case 263: {
                    var11 += 64;
                    de.c(var9, var10, 12, var8, var11);
                    de.c(var9, var10, 10, var8, var11);
                    de.c(var9, var10, 8, var8, var11);
                    var12 = 0;
                    statePc = 264;
                    continue stateLoop;
                }
                case 264: {
                    if (-8 >= (var12 ^ -1)) {
                        statePc = 268;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 265: {
                    var13_int = var9 - -(int)(9.0 * Math.sin(3.14 * ((double)var12 + 0.1 * (double)jb.field_v) / 3.5));
                    var14 = (int)(9.0 * Math.cos(((double)jb.field_v * 0.1 + (double)var12) * 3.14 / 3.5)) + var10;
                    jg.field_c[var12].b(-2 + var13_int, var14 + -2);
                    de.c(var13_int, var14, 4, var8, 32);
                    var12++;
                    if (var34 != 0) {
                        statePc = 270;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 266: {
                    if (var34 == 0) {
                        statePc = 264;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    if (null == this.field_fb) {
                        statePc = 270;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    this.field_fb.e(-(var7 >> -318913566) + (var35[0] + -this.field_n), this.field_N + (var35[1] + -var7 + var6));
                    statePc = 270;
                    continue stateLoop;
                }
                case 270: {
                    if (-19 != (this.field_jb ^ -1)) {
                        statePc = 326;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    if (gi.field_m == null) {
                        statePc = 326;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 272: {
                    var8 = 0;
                    if (this.field_F <= 1.5) {
                        statePc = 274;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 273: {
                    var8 = 1;
                    statePc = 274;
                    continue stateLoop;
                }
                case 274: {
                    if (3.0 >= this.field_F) {
                        statePc = 276;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    var8 = 2;
                    statePc = 276;
                    continue stateLoop;
                }
                case 276: {
                    if (this.field_F <= 4.5) {
                        statePc = 278;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    var8 = 3;
                    statePc = 278;
                    continue stateLoop;
                }
                case 278: {
                    gi.field_m[var8].d(-32 + (var35[0] + 16), var35[1] - 48);
                    if (var34 == 0) {
                        statePc = 326;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 279: {
                    if (null != this.field_B) {
                        statePc = 281;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 281: {
                    this.field_B.c(this.field_r + var35[0] + -(var7 >> -1559999806), var35[1] + -var7 - (-this.field_O - var6));
                    statePc = 282;
                    continue stateLoop;
                }
                case 282: {
                    if (this.field_cb == null) {
                        statePc = 284;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    this.field_cb.c(-(var7 >> 1101086049) + (var35[0] - -this.field_t), this.field_Z + (-var7 + var35[1]));
                    statePc = 284;
                    continue stateLoop;
                }
                case 284: {
                    if (null == this.field_bb) {
                        statePc = 286;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    this.field_bb.c(-(var7 >> 825315041) + var35[0], var35[1] - var7 - -var6);
                    statePc = 286;
                    continue stateLoop;
                }
                case 286: {
                    if (this.field_jb != 32) {
                        statePc = 290;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 287: {
                    if (this.field_I != null) {
                        statePc = 289;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 289: {
                    this.field_I.c(var35[0] - (var7 >> -1448803231) + 12, var6 + (var35[1] - var7 * 3 / 2));
                    if (var34 == 0) {
                        statePc = 296;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 290: {
                    if ((this.field_jb ^ -1) != -38) {
                        statePc = 294;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 291: {
                    if (this.field_I == null) {
                        statePc = 296;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 292: {
                    this.field_I.c(var35[0] + -(var7 >> 1403885217), var35[1] + (-(var7 * 3 / 2) + (var6 - 10)));
                    if (var34 == 0) {
                        statePc = 296;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    if (null == this.field_I) {
                        statePc = 296;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 295: {
                    this.field_I.c(-(var7 >> -139200287) + var35[0], var6 + (-(3 * var7 / 2) + var35[1]));
                    statePc = 296;
                    continue stateLoop;
                }
                case 296: {
                    if (this.field_Q == null) {
                        statePc = 298;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 297: {
                    this.field_Q.c(var35[0] + -(var7 >> -1414137599) + this.field_y, this.field_o + var35[1] + -var7);
                    statePc = 298;
                    continue stateLoop;
                }
                case 298: {
                    if ((this.field_ab ^ -1) != -1) {
                        statePc = 310;
                    } else {
                        statePc = 299;
                    }
                    continue stateLoop;
                }
                case 299: {
                    var8 = 0;
                    if (this.field_L.field_N != null) {
                        statePc = 301;
                    } else {
                        statePc = 302;
                    }
                    continue stateLoop;
                }
                case 301: {
                    var8 = this.field_L.field_N[this.field_T][5] | (this.field_L.field_N[this.field_T][3] << 2016524144 | this.field_L.field_N[this.field_T][4] << -1824116920);
                    statePc = 302;
                    continue stateLoop;
                }
                case 302: {
                    var9 = -4 + (this.field_n + var35[0]) + -(var7 >> 1511088770);
                    var10 = this.field_N + (var35[1] - this.field_Y + (8 - -var6));
                    var11 = jb.field_v & 255;
                    if ((var11 ^ -1) <= -129) {
                        statePc = 304;
                    } else {
                        statePc = 305;
                    }
                    continue stateLoop;
                }
                case 304: {
                    var11 = 256 - var11;
                    statePc = 305;
                    continue stateLoop;
                }
                case 305: {
                    var11 += 64;
                    de.c(var9, var10, 12, var8, var11);
                    de.c(var9, var10, 10, var8, var11);
                    de.c(var9, var10, 8, var8, var11);
                    var12 = 0;
                    statePc = 306;
                    continue stateLoop;
                }
                case 306: {
                    if ((var12 ^ -1) <= -8) {
                        statePc = 310;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 307: {
                    var13_int = (int)(9.0 * Math.sin(3.14 * (0.1 * (double)jb.field_v + (double)var12) / 3.5)) + var9;
                    var14 = var10 + (int)(9.0 * Math.cos(3.14 * ((double)var12 + 0.1 * (double)jb.field_v) / 3.5));
                    jg.field_c[var12].b(-2 + var13_int, -2 + var14);
                    de.c(var13_int, var14, 4, var8, 32);
                    var12++;
                    if (var34 != 0) {
                        statePc = 313;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 308: {
                    if (var34 == 0) {
                        statePc = 306;
                    } else {
                        statePc = 310;
                    }
                    continue stateLoop;
                }
                case 310: {
                    if (-2 == (this.field_ab ^ -1)) {
                        statePc = 312;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 312: {
                    gn.a(12, (byte) 73, 128, -4 + (this.field_n + -(var7 >> 2102388450)) + var35[0], var6 + this.field_N + var35[1] + (-this.field_Y + 8));
                    var8 = -4 + -(var7 >> -93290590) + (this.field_n - -(int)(-6.0 + 13.0 * Math.random()));
                    var9 = -this.field_Y + 8 + this.field_N - (-var6 + -(int)(-18.0 + 13.0 * Math.random()) - (-6 + Math.abs(-this.field_n + var8 + (var7 >> -53822174) - -4)));
                    statePc = 313;
                    continue stateLoop;
                }
                case 313: {
                    var46 = aj.a((ml) null, this.field_db + var9, false, 109, this.field_L, this.field_lb + var8);
                    var46.field_y = 16;
                    this.field_L.b(52, var46);
                    statePc = 314;
                    continue stateLoop;
                }
                case 314: {
                    if (this.field_fb == null) {
                        statePc = 316;
                    } else {
                        statePc = 315;
                    }
                    continue stateLoop;
                }
                case 315: {
                    this.field_fb.c(this.field_n + -(var7 >> -493976734) + var35[0] - (var7 >> 2146500961), var6 + -var7 + (var35[1] - -this.field_N));
                    statePc = 316;
                    continue stateLoop;
                }
                case 316: {
                    if ((this.field_jb ^ -1) != -19) {
                        statePc = 326;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 317: {
                    if (null == gi.field_m) {
                        statePc = 326;
                    } else {
                        statePc = 318;
                    }
                    continue stateLoop;
                }
                case 318: {
                    var8 = 0;
                    if (this.field_F <= 1.5) {
                        statePc = 320;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 319: {
                    var8 = 1;
                    statePc = 320;
                    continue stateLoop;
                }
                case 320: {
                    if (3.0 < this.field_F) {
                        statePc = 322;
                    } else {
                        statePc = 323;
                    }
                    continue stateLoop;
                }
                case 322: {
                    var8 = 2;
                    statePc = 323;
                    continue stateLoop;
                }
                case 323: {
                    if (4.5 >= this.field_F) {
                        statePc = 325;
                    } else {
                        statePc = 324;
                    }
                    continue stateLoop;
                }
                case 324: {
                    var8 = 3;
                    statePc = 325;
                    continue stateLoop;
                }
                case 325: {
                    gi.field_m[var8].a(-48 + var35[0], -48 + var35[1]);
                    statePc = 326;
                    continue stateLoop;
                }
                case 326: {
                    if (var34 == 0) {
                        statePc = 405;
                    } else {
                        statePc = 327;
                    }
                    continue stateLoop;
                }
                case 327: {
                    if (0 != (this.field_E ^ -1)) {
                        statePc = 330;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 328: {
                    this.field_bb.b().a(var35[0], var35[1] + -(this.field_Y >> -196775359), (int)(this.field_F * 65536.0 / 6.28), 4096);
                    if (var34 == 0) {
                        statePc = 405;
                    } else {
                        statePc = 330;
                    }
                    continue stateLoop;
                }
                case 330: {
                    this.field_bb.a(var35[0], -(this.field_Y >> 1969405025) + var35[1], (int)(-this.field_F * 65536.0 / 6.28), 4096);
                    if (var34 == 0) {
                        statePc = 405;
                    } else {
                        statePc = 332;
                    }
                    continue stateLoop;
                }
                case 332: {
                    var7 = 0;
                    if (this.field_F <= 1.5) {
                        statePc = 334;
                    } else {
                        statePc = 333;
                    }
                    continue stateLoop;
                }
                case 333: {
                    var7 = 1;
                    statePc = 334;
                    continue stateLoop;
                }
                case 334: {
                    if (3.0 >= this.field_F) {
                        statePc = 336;
                    } else {
                        statePc = 335;
                    }
                    continue stateLoop;
                }
                case 335: {
                    var7 = 2;
                    statePc = 336;
                    continue stateLoop;
                }
                case 336: {
                    if (4.5 < this.field_F) {
                        statePc = 338;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 338: {
                    var7 = 3;
                    statePc = 339;
                    continue stateLoop;
                }
                case 339: {
                    if (this.field_F < 0.0) {
                        statePc = 341;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 341: {
                    var7 = 4;
                    if (-2.0 >= this.field_F) {
                        statePc = 343;
                    } else {
                        statePc = 342;
                    }
                    continue stateLoop;
                }
                case 342: {
                    var7 = 5;
                    statePc = 343;
                    continue stateLoop;
                }
                case 343: {
                    if (-1.0 >= this.field_F) {
                        statePc = 345;
                    } else {
                        statePc = 344;
                    }
                    continue stateLoop;
                }
                case 344: {
                    var7 = 6;
                    statePc = 345;
                    continue stateLoop;
                }
                case 345: {
                    if (0 != (this.field_E ^ -1)) {
                        statePc = 348;
                    } else {
                        statePc = 346;
                    }
                    continue stateLoop;
                }
                case 346: {
                    bk.field_L[var7].d(var35[0] - (this.field_Y >> -1826153247), var35[1] + -this.field_Y);
                    if (var34 == 0) {
                        statePc = 349;
                    } else {
                        statePc = 348;
                    }
                    continue stateLoop;
                }
                case 348: {
                    bk.field_L[var7].a(-(this.field_Y >> -745629247) + var35[0], var35[1] + -this.field_Y);
                    statePc = 349;
                    continue stateLoop;
                }
                case 349: {
                    if (var34 == 0) {
                        statePc = 405;
                    } else {
                        statePc = 350;
                    }
                    continue stateLoop;
                }
                case 350: {
                    var7 = 0;
                    if (1.5 >= this.field_F) {
                        statePc = 352;
                    } else {
                        statePc = 351;
                    }
                    continue stateLoop;
                }
                case 351: {
                    var7 = 1;
                    statePc = 352;
                    continue stateLoop;
                }
                case 352: {
                    if (this.field_F > 3.0) {
                        statePc = 354;
                    } else {
                        statePc = 355;
                    }
                    continue stateLoop;
                }
                case 354: {
                    var7 = 2;
                    statePc = 355;
                    continue stateLoop;
                }
                case 355: {
                    if (this.field_F > 4.5) {
                        statePc = 357;
                    } else {
                        statePc = 358;
                    }
                    continue stateLoop;
                }
                case 357: {
                    var7 = 3;
                    statePc = 358;
                    continue stateLoop;
                }
                case 358: {
                    if (0.0 > this.field_F) {
                        statePc = 360;
                    } else {
                        statePc = 364;
                    }
                    continue stateLoop;
                }
                case 360: {
                    var7 = 4;
                    if (-2.0 >= this.field_F) {
                        statePc = 362;
                    } else {
                        statePc = 361;
                    }
                    continue stateLoop;
                }
                case 361: {
                    var7 = 5;
                    statePc = 362;
                    continue stateLoop;
                }
                case 362: {
                    if (this.field_F <= -1.0) {
                        statePc = 364;
                    } else {
                        statePc = 363;
                    }
                    continue stateLoop;
                }
                case 363: {
                    var7 = 6;
                    statePc = 364;
                    continue stateLoop;
                }
                case 364: {
                    if (0 != (this.field_E ^ -1)) {
                        statePc = 367;
                    } else {
                        statePc = 365;
                    }
                    continue stateLoop;
                }
                case 365: {
                    rc.field_d[var7].d(-(this.field_Y >> 411238593) + var35[0], var35[1] - this.field_Y);
                    if (var34 == 0) {
                        statePc = 368;
                    } else {
                        statePc = 367;
                    }
                    continue stateLoop;
                }
                case 367: {
                    rc.field_d[var7].a(-(this.field_Y >> 668165633) + var35[0], -this.field_Y + var35[1]);
                    statePc = 368;
                    continue stateLoop;
                }
                case 368: {
                    if (var34 == 0) {
                        statePc = 405;
                    } else {
                        statePc = 369;
                    }
                    continue stateLoop;
                }
                case 369: {
                    uj.field_i[5].c(-(uj.field_i[5].field_n / 2) + var35[0], -this.field_Y + var35[1] + 64);
                    if (0 == (this.field_E ^ -1)) {
                        statePc = 381;
                    } else {
                        statePc = 370;
                    }
                    continue stateLoop;
                }
                case 370: {
                    if (this.field_B == null) {
                        statePc = 372;
                    } else {
                        statePc = 371;
                    }
                    continue stateLoop;
                }
                case 371: {
                    this.field_B.c(8 + (-16 + var35[0]), var35[1] + -(this.field_Y >> 6723713) - (16 + -var6));
                    statePc = 372;
                    continue stateLoop;
                }
                case 372: {
                    if (null != this.field_bb) {
                        statePc = 374;
                    } else {
                        statePc = 375;
                    }
                    continue stateLoop;
                }
                case 374: {
                    this.field_bb.c(var35[0] - 16, -16 + (var35[1] - ((this.field_Y >> -2084965599) - var6)));
                    statePc = 375;
                    continue stateLoop;
                }
                case 375: {
                    if (null != this.field_fb) {
                        statePc = 377;
                    } else {
                        statePc = 378;
                    }
                    continue stateLoop;
                }
                case 377: {
                    this.field_fb.c(var35[0] + -24, -(this.field_Y >> 1171247745) + var35[1] + -16 - -var6);
                    statePc = 378;
                    continue stateLoop;
                }
                case 378: {
                    if (null == this.field_I) {
                        statePc = 389;
                    } else {
                        statePc = 379;
                    }
                    continue stateLoop;
                }
                case 379: {
                    this.field_I.c(-16 + var35[0], var6 + (var35[1] - (this.field_Y >> 1694098401) - 32));
                    if (var34 == 0) {
                        statePc = 389;
                    } else {
                        statePc = 381;
                    }
                    continue stateLoop;
                }
                case 381: {
                    if (null == this.field_B) {
                        statePc = 383;
                    } else {
                        statePc = 382;
                    }
                    continue stateLoop;
                }
                case 382: {
                    this.field_B.e(-16 + (var35[0] - 8), -16 + (var35[1] - (this.field_Y >> 1296015649)) - -var6);
                    statePc = 383;
                    continue stateLoop;
                }
                case 383: {
                    if (this.field_bb == null) {
                        statePc = 385;
                    } else {
                        statePc = 384;
                    }
                    continue stateLoop;
                }
                case 384: {
                    this.field_bb.e(var35[0] + -16, -16 + var35[1] - (this.field_Y >> -2024840191) - -var6);
                    statePc = 385;
                    continue stateLoop;
                }
                case 385: {
                    if (null == this.field_fb) {
                        statePc = 387;
                    } else {
                        statePc = 386;
                    }
                    continue stateLoop;
                }
                case 386: {
                    this.field_fb.e(8 + (-16 + var35[0]), var35[1] + -(this.field_Y >> -1112801471) + (-16 + var6));
                    statePc = 387;
                    continue stateLoop;
                }
                case 387: {
                    if (null == this.field_I) {
                        statePc = 389;
                    } else {
                        statePc = 388;
                    }
                    continue stateLoop;
                }
                case 388: {
                    this.field_I.e(var35[0] + -16, var6 + (-32 + (var35[1] + -(this.field_Y >> 801269633))));
                    statePc = 389;
                    continue stateLoop;
                }
                case 389: {
                    var7 = 255 & jb.field_v;
                    if (128 >= var7) {
                        statePc = 391;
                    } else {
                        statePc = 390;
                    }
                    continue stateLoop;
                }
                case 390: {
                    var7 = 256 - var7;
                    statePc = 391;
                    continue stateLoop;
                }
                case 391: {
                    gn.a(128, (byte) 114, -320 - var7, var35[0], -48 + var35[1]);
                    if (var34 == 0) {
                        statePc = 405;
                    } else {
                        statePc = 392;
                    }
                    continue stateLoop;
                }
                case 392: {
                    uj.field_i[1].c(-(uj.field_i[1].field_n / 2) + var35[0], -this.field_Y + var35[1]);
                    if (this.field_I == null) {
                        statePc = 405;
                    } else {
                        statePc = 393;
                    }
                    continue stateLoop;
                }
                case 393: {
                    this.field_I.e(var35[0] - 16, var6 + (-32 + (var35[1] + -(this.field_Y >> -327960319))));
                    if (var34 == 0) {
                        statePc = 405;
                    } else {
                        statePc = 395;
                    }
                    continue stateLoop;
                }
                case 395: {
                    uj.field_i[0].c(-(uj.field_i[0].field_n / 2) + var35[0], var35[1] + -this.field_Y);
                    if (this.field_I == null) {
                        statePc = 405;
                    } else {
                        statePc = 396;
                    }
                    continue stateLoop;
                }
                case 396: {
                    this.field_I.e(var35[0] + -16, var6 + var35[1] + (-(this.field_Y >> -368948671) + -32));
                    if (var34 == 0) {
                        statePc = 405;
                    } else {
                        statePc = 398;
                    }
                    continue stateLoop;
                }
                case 398: {
                    var7 = (int)(4.0 * Math.sin(this.field_F * 2.0) + 18.0);
                    var8 = (int)(32.0 + 4.0 * Math.cos(2.0 * this.field_F));
                    var9 = (int)(Math.cos(this.field_F) * 4.0);
                    var10 = -8;
                    statePc = 399;
                    continue stateLoop;
                }
                case 399: {
                    if (8 <= var10) {
                        statePc = 403;
                    } else {
                        statePc = 400;
                    }
                    continue stateLoop;
                }
                case 400: {
                    de.b(var10 / 4 + var35[0], var35[1], var9 + (var35[0] - -var10), var35[1] - var8, 6303744);
                    var10++;
                    if (var34 != 0) {
                        statePc = 404;
                    } else {
                        statePc = 401;
                    }
                    continue stateLoop;
                }
                case 401: {
                    if (var34 == 0) {
                        statePc = 399;
                    } else {
                        statePc = 403;
                    }
                    continue stateLoop;
                }
                case 403: {
                    de.b(var35[0] + -2, var35[1], var9 + (var35[0] + -8), var35[1] + -var8, 0);
                    de.b(2 + var35[0], var35[1], 8 + var9 + var35[0], var35[1] - var8, 0);
                    de.b(var35[0] + 2, var35[1], var35[0] - 2, var35[1], 0);
                    de.i(var35[0] + var9, -var8 + var35[1], var7, 16777215);
                    de.c(var35[0] + var9, -var8 + var35[1], var7, 0);
                    de.i(var9 + var35[0], -var8 + var35[1], (int)((double)var7 * 0.66), 255);
                    statePc = 404;
                    continue stateLoop;
                }
                case 404: {
                    de.i(var35[0] + var9, var35[1] - var8, (int)(0.33 * (double)var7), 16711680);
                    statePc = 405;
                    continue stateLoop;
                }
                case 405: {
                    if (this.field_q > 0) {
                        statePc = 417;
                    } else {
                        statePc = 406;
                    }
                    continue stateLoop;
                }
                case 406: {
                    if (!this.field_D) {
                        statePc = 417;
                    } else {
                        statePc = 407;
                    }
                    continue stateLoop;
                }
                case 407: {
                    if (this.field_jb == 12) {
                        statePc = 417;
                    } else {
                        statePc = 408;
                    }
                    continue stateLoop;
                }
                case 408: {
                    if (-41 == (this.field_jb ^ -1)) {
                        statePc = 417;
                    } else {
                        statePc = 409;
                    }
                    continue stateLoop;
                }
                case 409: {
                    var7 = 0;
                    statePc = 410;
                    continue stateLoop;
                }
                case 410: {
                    if ((var7 ^ -1) <= -4) {
                        statePc = 417;
                    } else {
                        statePc = 411;
                    }
                    continue stateLoop;
                }
                case 411: {
                    var8 = var35[0] - -(int)(Math.sin(3.14 * (double)var7 / 1.5 + 0.125 * (double)jb.field_v) * 16.0);
                    var9 = -this.field_Y + (var35[1] - 10);
                    var10 = (int)(Math.cos(3.14 * (double)var7 / 1.5 + 0.125 * (double)jb.field_v) * 8.0);
                    stackIn_418_0 = -1;
                    stackIn_412_0 = stackIn_418_0;
                    stackIn_418_1 = var10 ^ -1;
                    stackIn_412_1 = stackIn_418_1;
                    if (var34 != 0) {
                        statePc = 418;
                    } else {
                        statePc = 412;
                    }
                    continue stateLoop;
                }
                case 412: {
                    if (stackIn_412_0 <= stackIn_412_1) {
                        statePc = 415;
                    } else {
                        statePc = 413;
                    }
                    continue stateLoop;
                }
                case 413: {
                    bb.field_g[(1 & jb.field_v / 7 + var7 * 3) + 86].c(var8 + -20, -20 + (var9 + var10));
                    if (var34 == 0) {
                        statePc = 416;
                    } else {
                        statePc = 415;
                    }
                    continue stateLoop;
                }
                case 415: {
                    bb.field_g[(3 * var7 + jb.field_v / 7 & 1) + 86].e(var8 + -20, var9 - (-var10 + 20));
                    statePc = 416;
                    continue stateLoop;
                }
                case 416: {
                    var7++;
                    if (var34 == 0) {
                        statePc = 410;
                    } else {
                        statePc = 417;
                    }
                    continue stateLoop;
                }
                case 417: {
                    stackIn_418_0 = this.field_u;
                    stackIn_418_1 = this.field_T;
                    statePc = 418;
                    continue stateLoop;
                }
                case 418: {
                    if (stackIn_418_0 == stackIn_418_1) {
                        statePc = 420;
                    } else {
                        statePc = 482;
                    }
                    continue stateLoop;
                }
                case 420: {
                    var7 = this.field_L.field_x[this.field_T];
                    if (-11 == (var7 ^ -1)) {
                        statePc = 482;
                    } else {
                        statePc = 421;
                    }
                    continue stateLoop;
                }
                case 421: {
                    if (-1 > (this.field_L.field_X[this.field_T] ^ -1)) {
                        statePc = 423;
                    } else {
                        statePc = 482;
                    }
                    continue stateLoop;
                }
                case 423: {
                    var8 = this.field_L.field_Ab[this.field_T];
                    var9 = this.field_L.field_o[this.field_T];
                    var10 = var8 - -param1;
                    var11 = var9 + param0;
                    var12 = 0;
                    var13 = null;
                    var14 = 10;
                    if (0 != var7) {
                        statePc = 425;
                    } else {
                        statePc = 424;
                    }
                    continue stateLoop;
                }
                case 424: {
                    var12 = 1;
                    var13 = lf.field_c;
                    statePc = 425;
                    continue stateLoop;
                }
                case 425: {
                    if ((var7 ^ -1) == -2) {
                        statePc = 427;
                    } else {
                        statePc = 428;
                    }
                    continue stateLoop;
                }
                case 427: {
                    var13 = tf.field_j;
                    statePc = 428;
                    continue stateLoop;
                }
                case 428: {
                    if ((var7 ^ -1) != -3) {
                        statePc = 430;
                    } else {
                        statePc = 429;
                    }
                    continue stateLoop;
                }
                case 429: {
                    var12 = 1;
                    var13 = ij.field_Pb;
                    statePc = 430;
                    continue stateLoop;
                }
                case 430: {
                    if (3 == var7) {
                        statePc = 432;
                    } else {
                        statePc = 433;
                    }
                    continue stateLoop;
                }
                case 432: {
                    var13 = fo.field_g;
                    statePc = 433;
                    continue stateLoop;
                }
                case 433: {
                    if ((var7 ^ -1) != -5) {
                        statePc = 435;
                    } else {
                        statePc = 434;
                    }
                    continue stateLoop;
                }
                case 434: {
                    var12 = 1;
                    var13 = fc.field_e;
                    statePc = 435;
                    continue stateLoop;
                }
                case 435: {
                    if ((var7 ^ -1) != -6) {
                        statePc = 437;
                    } else {
                        statePc = 436;
                    }
                    continue stateLoop;
                }
                case 436: {
                    var13 = ji.field_h;
                    var12 = 1;
                    statePc = 437;
                    continue stateLoop;
                }
                case 437: {
                    if ((var7 ^ -1) == -7) {
                        statePc = 439;
                    } else {
                        statePc = 440;
                    }
                    continue stateLoop;
                }
                case 439: {
                    var13 = rc.field_k;
                    var12 = 1;
                    statePc = 440;
                    continue stateLoop;
                }
                case 440: {
                    if (-8 == (var7 ^ -1)) {
                        statePc = 442;
                    } else {
                        statePc = 443;
                    }
                    continue stateLoop;
                }
                case 442: {
                    var13 = eo.field_a;
                    statePc = 443;
                    continue stateLoop;
                }
                case 443: {
                    if ((var7 ^ -1) != -9) {
                        statePc = 445;
                    } else {
                        statePc = 444;
                    }
                    continue stateLoop;
                }
                case 444: {
                    var14 = 3;
                    var12 = 1;
                    var13 = ae.field_a;
                    statePc = 445;
                    continue stateLoop;
                }
                case 445: {
                    var15 = new int[]{255, 0, 0};
                    var16 = new int[]{0, 255, 0};
                    var17 = new int[]{0, 0, 255};
                    var18 = new int[]{255, 255, 255};
                    var19 = this.field_u;
                    if (-1 == (var19 ^ -1)) {
                        statePc = 449;
                    } else {
                        statePc = 446;
                    }
                    continue stateLoop;
                }
                case 446: {
                    if (3 == var19) {
                        statePc = 449;
                    } else {
                        statePc = 447;
                    }
                    continue stateLoop;
                }
                case 447: {
                    if (-5 == (var19 ^ -1)) {
                        statePc = 449;
                    } else {
                        statePc = 450;
                    }
                    continue stateLoop;
                }
                case 449: {
                    var15[2] = 255;
                    var15[1] = 255;
                    statePc = 450;
                    continue stateLoop;
                }
                case 450: {
                    if (-2 == (var19 ^ -1)) {
                        statePc = 454;
                    } else {
                        statePc = 451;
                    }
                    continue stateLoop;
                }
                case 451: {
                    if ((var19 ^ -1) == -4) {
                        statePc = 454;
                    } else {
                        statePc = 452;
                    }
                    continue stateLoop;
                }
                case 452: {
                    if (var19 != 5) {
                        statePc = 455;
                    } else {
                        statePc = 454;
                    }
                    continue stateLoop;
                }
                case 454: {
                    var16[0] = 255;
                    var16[2] = 255;
                    statePc = 455;
                    continue stateLoop;
                }
                case 455: {
                    if ((var19 ^ -1) == -3) {
                        statePc = 459;
                    } else {
                        statePc = 456;
                    }
                    continue stateLoop;
                }
                case 456: {
                    if (var19 == 4) {
                        statePc = 459;
                    } else {
                        statePc = 457;
                    }
                    continue stateLoop;
                }
                case 457: {
                    if (var19 == 5) {
                        statePc = 459;
                    } else {
                        statePc = 460;
                    }
                    continue stateLoop;
                }
                case 459: {
                    var17[2] = 255;
                    var17[0] = 255;
                    statePc = 460;
                    continue stateLoop;
                }
                case 460: {
                    if (this.field_L.field_N == null) {
                        statePc = 462;
                    } else {
                        statePc = 461;
                    }
                    continue stateLoop;
                }
                case 461: {
                    var15[0] = this.field_L.field_N[var19][0];
                    var15[1] = this.field_L.field_N[var19][1];
                    var15[2] = this.field_L.field_N[var19][2];
                    var16[0] = this.field_L.field_N[var19][3];
                    var16[1] = this.field_L.field_N[var19][4];
                    var16[2] = this.field_L.field_N[var19][5];
                    var17[0] = this.field_L.field_N[var19][6];
                    var17[1] = this.field_L.field_N[var19][7];
                    var17[2] = this.field_L.field_N[var19][8];
                    var18[0] = this.field_L.field_N[var19][9];
                    var18[1] = this.field_L.field_N[var19][10];
                    var18[2] = this.field_L.field_N[var19][11];
                    statePc = 462;
                    continue stateLoop;
                }
                case 462: {
                    if (var12 != 0) {
                        statePc = 470;
                    } else {
                        statePc = 463;
                    }
                    continue stateLoop;
                }
                case 463: {
                    var11 -= 24;
                    var10 += 8;
                    var20 = this.field_n;
                    var21_int = this.field_r;
                    var22_int = this.field_N;
                    var23 = this.field_O;
                    var24 = this.field_t;
                    var25 = this.field_y;
                    var26 = this.field_Z;
                    var27 = this.field_o;
                    if (0 >= this.field_q) {
                        statePc = 465;
                    } else {
                        statePc = 464;
                    }
                    continue stateLoop;
                }
                case 464: {
                    var20 = (int)(4.0 * Math.sin((double)(jb.field_v >> 1862564323)) + 4.0);
                    var21_int = -var20;
                    var22_int = (int)(Math.sin((double)(jb.field_v >> -1248468574)) * 4.0);
                    var23 = -var22_int;
                    statePc = 465;
                    continue stateLoop;
                }
                case 465: {
                    var28 = de.field_l;
                    var29 = de.field_e;
                    var30 = de.field_j;
                    var31 = new qb(64, 64);
                    var31.a();
                    var32 = 20;
                    var33 = 32;
                    pc.a(kg.field_d[2], var33 + var22_int, kg.field_d[3], kg.field_d[0], (byte) -127, kg.field_d[1], (qb) (((Object[]) (var13))[5]), var32 - -var20);
                    pc.a(kg.field_d[2], var26 + var33, kg.field_d[3], kg.field_d[0], (byte) -95, kg.field_d[1], (qb) (((Object[]) (var13))[4]), var24 + var32);
                    pc.a(kg.field_d[2], var33, kg.field_d[3], kg.field_d[0], (byte) 64, kg.field_d[1], (qb) (((Object[]) (var13))[3]), var32);
                    var33 -= 3;
                    var33 -= 6;
                    pc.a(kg.field_d[2], var33, kg.field_d[3], kg.field_d[0], (byte) 58, kg.field_d[1], (qb) (((Object[]) (var13))[2]), var32);
                    var33 += 6;
                    var33 -= 6;
                    var33 += 3;
                    var33 += 6;
                    pc.a(kg.field_d[2], var33 + var27, kg.field_d[3], kg.field_d[0], (byte) -91, kg.field_d[1], (qb) (((Object[]) (var13))[1]), var25 + var32);
                    pc.a(kg.field_d[2], var33 + var23, kg.field_d[3], kg.field_d[0], (byte) 18, kg.field_d[1], (qb) (((Object[]) (var13))[0]), var32 - -var21_int);
                    de.field_l = var28;
                    de.field_j = var30;
                    de.field_e = var29;
                    de.a();
                    if (0 > this.field_E) {
                        statePc = 468;
                    } else {
                        statePc = 466;
                    }
                    continue stateLoop;
                }
                case 466: {
                    var31.c(var10 + -32, -32 + var11);
                    if (var34 == 0) {
                        statePc = 469;
                    } else {
                        statePc = 468;
                    }
                    continue stateLoop;
                }
                case 468: {
                    var31.e(var10 - 32, -32 + var11);
                    statePc = 469;
                    continue stateLoop;
                }
                case 469: {
                    if (var34 == 0) {
                        statePc = 482;
                    } else {
                        statePc = 470;
                    }
                    continue stateLoop;
                }
                case 470: {
                    var20 = jb.field_v / var14 % ((Object[]) (var13)).length;
                    var21 = new qb(((qb) (((Object[]) (var13))[0])).field_n, ((qb) (((Object[]) (var13))[0])).field_w);
                    var22 = de.field_l;
                    var23 = de.field_e;
                    var24 = de.field_j;
                    var21.a();
                    pc.a(var17, 0, var18, var15, (byte) 106, var16, (qb) (((Object[]) (var13))[var20]), 0);
                    de.field_e = var23;
                    de.field_j = var24;
                    de.field_l = var22;
                    de.a();
                    var25 = (int)(4.0 * Math.sin((double)(jb.field_v >> -10725468)));
                    if (-5 == (var7 ^ -1)) {
                        statePc = 473;
                    } else {
                        statePc = 471;
                    }
                    continue stateLoop;
                }
                case 471: {
                    if (-7 != (var7 ^ -1)) {
                        statePc = 474;
                    } else {
                        statePc = 473;
                    }
                    continue stateLoop;
                }
                case 473: {
                    var25 = -1;
                    statePc = 474;
                    continue stateLoop;
                }
                case 474: {
                    if (-1 >= (this.field_E ^ -1)) {
                        statePc = 478;
                    } else {
                        statePc = 475;
                    }
                    continue stateLoop;
                }
                case 475: {
                    if (var7 == 4) {
                        statePc = 478;
                    } else {
                        statePc = 476;
                    }
                    continue stateLoop;
                }
                case 476: {
                    var21.e(-(((qb) (((Object[]) (var13))[var20])).field_n / 2) + var10, -var25 + -((qb) (((Object[]) (var13))[var20])).field_w + var11);
                    if (var34 == 0) {
                        statePc = 482;
                    } else {
                        statePc = 478;
                    }
                    continue stateLoop;
                }
                case 478: {
                    if ((var7 ^ -1) != -5) {
                        statePc = 481;
                    } else {
                        statePc = 479;
                    }
                    continue stateLoop;
                }
                case 479: {
                    if (-1 <= ((-1 + this.field_L.field_X[this.field_u]) % 5 - (-1 - -((this.field_L.field_X[this.field_u] + -1) / 5)) ^ -1)) {
                        statePc = 482;
                    } else {
                        statePc = 481;
                    }
                    continue stateLoop;
                }
                case 481: {
                    var21.c(-(((qb) (((Object[]) (var13))[var20])).field_n / 2) + var10, -((qb) (((Object[]) (var13))[var20])).field_w + var11 + -var25);
                    statePc = 482;
                    continue stateLoop;
                }
                case 482: {
                    if (this.field_z) {
                        statePc = 496;
                    } else {
                        statePc = 483;
                    }
                    continue stateLoop;
                }
                case 483: {
                    if ((this.field_jb ^ -1) == -13) {
                        statePc = 496;
                    } else {
                        statePc = 484;
                    }
                    continue stateLoop;
                }
                case 484: {
                    if ((this.field_jb ^ -1) != -41) {
                        statePc = 486;
                    } else {
                        statePc = 496;
                    }
                    continue stateLoop;
                }
                case 486: {
                    var7 = this.field_ib;
                    if ((this.field_jb ^ -1) == -33) {
                        statePc = 489;
                    } else {
                        statePc = 487;
                    }
                    continue stateLoop;
                }
                case 487: {
                    if (27 == this.field_jb) {
                        statePc = 489;
                    } else {
                        statePc = 490;
                    }
                    continue stateLoop;
                }
                case 489: {
                    var7 = var7 * 2;
                    statePc = 490;
                    continue stateLoop;
                }
                case 490: {
                    if (0 >= this.field_q) {
                        statePc = 492;
                    } else {
                        statePc = 491;
                    }
                    continue stateLoop;
                }
                case 491: {
                    var7 = var7 + this.field_q;
                    statePc = 492;
                    continue stateLoop;
                }
                case 492: {
                    var8 = tj.field_t.field_C / 2;
                    mi.field_B.a(Integer.toString(var7), -var8 + param1 + this.field_lb, -(var8 * 2) + (param0 + this.field_db) + (-this.field_Y - 2), var8 * 2, var8 * 2, (var5 | 8421504) ^ 8421504, 0, 1, 1, tj.field_t.field_C);
                    mi.field_B.a(Integer.toString(var7), -1 + (-var8 + (param1 + this.field_lb)), -this.field_Y + param0 + (this.field_db + -(var8 * 2) + -1), 2 * var8, var8 * 2, 8421504 ^ (var5 | 8421504), 0, 1, 1, tj.field_t.field_C);
                    mi.field_B.a(Integer.toString(var7), param1 + this.field_lb + -var8, -(2 * var8) + (this.field_db - -param0) - (this.field_Y - -1), var8 * 2, var8 * 2, var5, -1, 1, 1, tj.field_t.field_C);
                    if (null != this.field_s) {
                        statePc = 496;
                    } else {
                        statePc = 493;
                    }
                    continue stateLoop;
                }
                case 493: {
                    if ((this.field_T ^ -1) <= (this.field_L.field_q ^ -1)) {
                        statePc = 496;
                    } else {
                        statePc = 494;
                    }
                    continue stateLoop;
                }
                case 494: {
                    if (this.field_L.field_S[this.field_T] <= 0) {
                        statePc = 496;
                    } else {
                        statePc = 495;
                    }
                    continue stateLoop;
                }
                case 495: {
                    rb.field_o[-1 + this.field_L.field_S[this.field_T]].d(param1 + (this.field_lb - 15), -(var8 * 2) + -this.field_Y + (param0 + this.field_db + -13), var5);
                    statePc = 496;
                    continue stateLoop;
                }
                case 496: {
                    if (param2 == 1703903841) {
                        statePc = 498;
                    } else {
                        statePc = 497;
                    }
                    continue stateLoop;
                }
                case 497: {
                    this.field_L = (nf) null;
                    statePc = 498;
                    continue stateLoop;
                }
                case 498: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean i(int param0) {
        int var2 = -108 / ((33 - param0) / 56);
        return (this.field_x ^ -1) < -1 ? true : false;
    }

    private final boolean e(boolean param0) {
        int dupTemp$1 = 0;
        ml var3;
        int[] stackIn_12_0 = null;
        nf stackIn_12_1 = null;
        int[] stackIn_13_0 = null;
        nf stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        L0: {
          if (-1 <= (this.field_x ^ -1)) {
            break L0;
          } else {
            L1: {
              if (19 == this.field_jb) {
                this.field_jb = 0;
                this.field_z = true;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                this.a((byte) 101, 2);
                if ((this.field_q ^ -1) < -1) {
                  break L3;
                } else {
                  this.field_ib = this.field_ib - this.field_x;
                  if (!ArcanistsMulti.field_G) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                var3 = this.field_L.a(this.field_L.d(false), true);
                if (var3 == null) {
                  break L4;
                } else {
                  if (var3.g((byte) 103)) {
                    L5: {
                      stackIn_12_0 = this.field_L.field_R;

                      stackIn_12_1 = this.field_L;

                      if (param0) {
                        stackIn_13_0 = (int[]) ((Object) stackIn_12_0);
                        stackIn_13_1 = (nf) ((Object) stackIn_12_1);
                        stackIn_13_2 = 0;
                        break L5;
                      } else {
                        stackIn_13_0 = (int[]) ((Object) stackIn_12_0);
                        stackIn_13_1 = (nf) ((Object) stackIn_12_1);
                        stackIn_13_2 = 1;
                        break L5;
                      }
                    }
                    dupTemp$1 = ((nf) (Object) stackIn_13_1).d(stackIn_13_2 != 0);
                    stackIn_13_0[dupTemp$1] = stackIn_13_0[dupTemp$1] + this.field_x;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              this.field_q = this.field_q - this.field_x;
              break L2;
            }
            if (this.field_ib > 0) {
              break L0;
            } else {
              this.field_M = 0;
              this.field_L.a((ml) (this), 0);
              this.d(this.field_L.d(false), 120);
              return true;
            }
          }
        }
        L6: {
          if (this.field_x >= 0) {
            break L6;
          } else {
            this.a(-this.field_x, -28922);
            break L6;
          }
        }
        this.field_x = 0;
        if (param0) {
          return false;
        } else {
          this.field_D = true;
          return false;
        }
    }

    final ml w(int param0) {
        if (param0 != 24501) {
            this.field_bb = (qb) null;
        }
        return this.field_s;
    }

    final boolean q(int param0) {
        if (param0 <= 12) {
            return false;
        }
        return this.field_U;
    }

    private final void z(int param0) {
        boolean discarded$0 = false;
        int stackIn_5_0 = 0;
        int var2;
        L0: {
          if (param0 == -11) {
            break L0;
          } else {
            discarded$0 = this.f((byte) 37);
            break L0;
          }
        }
        L1: {
          if (!this.s(-1)) {
            stackIn_5_0 = 0;
            break L1;
          } else {
            stackIn_5_0 = 1;
            break L1;
          }
        }
        L2: {
          var2 = stackIn_5_0;
          if (12 != this.field_jb) {
            break L2;
          } else {
            var2 = 1;
            break L2;
          }
        }
        L3: {
          L4: {
            if ((this.field_jb ^ -1) == -23) {
              break L4;
            } else {
              if (-5 == (this.field_jb ^ -1)) {
                break L4;
              } else {
                if (this.field_jb == 5) {
                  break L4;
                } else {
                  if ((this.field_L.field_x[this.field_u] ^ -1) != -4) {
                    break L3;
                  } else {
                    if (0 >= this.field_L.field_X[this.field_u]) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            }
          }
          if (this.field_lb < 0) {
            break L3;
          } else {
            if ((this.field_lb ^ -1) < (this.field_L.field_y ^ -1)) {
              break L3;
            } else {
              if (-32 + this.field_L.field_H >= this.field_db) {
                break L3;
              } else {
                L5: {
                  if (this.field_ib > 5) {
                    break L5;
                  } else {
                    if (0 < this.field_q) {
                      break L5;
                    } else {
                      break L3;
                    }
                  }
                }
                this.field_db = -32 + this.field_L.field_H;
                this.field_L.a(-115, this.field_lb - 24, gj.field_f[9], -gj.field_f[9].field_f + this.field_L.field_H + -32);
                this.field_L.a(param0 ^ 117, -8 + this.field_lb, gj.field_f[9], -gj.field_f[9].field_f + -32 + this.field_L.field_H);
                this.field_L.a(param0 + 92, 8 + this.field_lb, gj.field_f[9], this.field_L.field_H - 32 - gj.field_f[9].field_f);
                if (22 != this.field_jb) {
                  this.field_ib = this.field_ib - 5;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
          }
        }
        L6: {
          L7: {
            if (var2 != 0) {
              break L7;
            } else {
              this.n(-126);
              if (!ArcanistsMulti.field_G) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          this.d(true);
          break L6;
        }
    }

    final void k(int param0) {
        boolean stackIn_12_0 = false;
        boolean stackIn_18_0 = false;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_122_0 = 0;
        int stackIn_122_1 = 0;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        int stackIn_164_0 = 0;
        int stackIn_167_0 = 0;
        int stackIn_168_0 = 0;
        int stackIn_169_0 = 0;
        int stackIn_169_1 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        ml var5 = null;
        Object var6_ref = null;
        int var6 = 0;
        ml var6_ref_ml = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6_ref = null;
                    var11 = ArcanistsMulti.field_G ? 1 : 0;
                    if (this.field_T == this.field_u) {
                        statePc = 2;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var2 = this.field_L.field_x[this.field_T];
                    if (10 == var2) {
                        statePc = 43;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (-1 > (this.field_L.field_X[this.field_T] ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var3 = this.field_L.field_Ab[this.field_T];
                    var4 = this.field_L.field_o[this.field_T];
                    var5_int = this.field_lb + -(this.field_E * this.field_Y / 2);
                    var6 = this.field_db - this.field_Y / 2;
                    if (-2 == (var2 ^ -1)) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (-8 == (var2 ^ -1)) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (3 != var2) {
                        statePc = 25;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var6 = this.field_db;
                    var5_int = -(this.field_E * this.field_Y / 2) + this.field_lb;
                    var7 = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var7 >= 32) {
                        statePc = 17;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_18_0 = this.field_L.a(var6, var5_int, (byte) -83);
                    stackIn_12_0 = stackIn_18_0;
                    if (var11 != 0) {
                        statePc = 18;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (!stackIn_12_0) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var6 -= 2;
                    if (var11 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var6 += 2;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    var7 += 2;
                    if (var11 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = this.field_L.a(2 + var6, var5_int, (byte) -83);
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (stackIn_18_0) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var5_int = this.field_lb + -(this.field_E * this.field_Y / 4);
                    var6 = this.field_db;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if ((var6 ^ -1) < (var4 ^ -1)) {
                        statePc = 22;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var4++;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (var4 <= var6) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var4--;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if ((var2 ^ -1) != -7) {
                        statePc = 32;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (null != rc.field_k) {
                        statePc = 28;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (13 > jb.field_v / 10 % rc.field_k.length) {
                        statePc = 31;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (this.field_z) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var5_int = this.field_lb;
                    var3 = this.field_lb;
                    var6 = this.field_db;
                    var4 = this.field_db;
                    if (var11 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var5_int = var3;
                    var6 = var4;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (2 != var2) {
                        statePc = 39;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (null != rc.field_k) {
                        statePc = 35;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if ((jb.field_v / 10 % ij.field_Pb.length ^ -1) > (ij.field_Pb.length - 1 ^ -1)) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (this.field_z) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var5_int = this.field_lb;
                    var3 = this.field_lb;
                    var6 = -16 + -this.field_Y + this.field_db;
                    var4 = -16 + -this.field_Y + this.field_db;
                    if (var11 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var6 = var4;
                    var5_int = var3;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (-5 == (var2 ^ -1)) {
                        statePc = 41;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var5_int = var3;
                    var6 = var4;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    var3 = var3 * 15 - -var5_int >> 1975998020;
                    this.field_L.field_Ab[this.field_T] = var3 * 15 - -var5_int >> 1975998020;
                    var4 = 15 * var4 - -var6 >> 648805572;
                    this.field_L.field_o[this.field_T] = 15 * var4 - -var6 >> 648805572;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (0 >= this.field_x) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    this.field_D = true;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (this.field_D) {
                        statePc = 47;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 47: {
                    this.field_M = 0;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if (-18 == (this.field_jb ^ -1)) {
                        statePc = 63;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (this.x(32)) {
                        statePc = 51;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 51: {
                    this.field_s = this.field_L.a(this.field_u, true);
                    var2 = 65536;
                    pi.field_b.a((byte) 99, this.field_L.field_i);
                    var6_ref_ml = (ml) ((Object) pi.field_b.b(-47));
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (var6_ref_ml == null) {
                        statePc = 61;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    stackIn_90_0 = var6_ref_ml.field_u ^ -1;
                    stackIn_54_0 = stackIn_90_0;
                    stackIn_90_1 = this.field_u ^ -1;
                    stackIn_54_1 = stackIn_90_1;
                    if (var11 != 0) {
                        statePc = 90;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (stackIn_54_0 != stackIn_54_1) {
                        statePc = 60;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (null == var6_ref_ml.field_s) {
                        statePc = 58;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (var6_ref_ml.field_jb != 37) {
                        statePc = 60;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var5_int = this.field_db - (this.field_Y / 2 + var6_ref_ml.field_db);
                    var4 = this.field_lb - var6_ref_ml.field_lb;
                    var3 = var4 * var4 + var5_int * var5_int;
                    if ((var2 ^ -1) >= (var3 ^ -1)) {
                        statePc = 60;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    this.field_s = var6_ref_ml;
                    var2 = var3;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    var6_ref_ml = (ml) ((Object) pi.field_b.d(-18502));
                    if (var11 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (var11 == 0) {
                        statePc = 89;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 63: {
                    this.field_s = this.field_L.a(this.field_u, true);
                    var2 = 65536;
                    pi.field_b.a((byte) 114, this.field_L.field_i);
                    var6_ref_ml = (ml) ((Object) pi.field_b.b(-31));
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    if (var6_ref_ml == null) {
                        statePc = 89;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    stackIn_90_0 = var6_ref_ml.field_u ^ -1;
                    stackIn_66_0 = stackIn_90_0;
                    stackIn_90_1 = this.field_u ^ -1;
                    stackIn_66_1 = stackIn_90_1;
                    if (var11 != 0) {
                        statePc = 90;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (stackIn_66_0 != stackIn_66_1) {
                        statePc = 75;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if (var6_ref_ml.field_s == null) {
                        statePc = 72;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if ((var6_ref_ml.field_jb ^ -1) == -10) {
                        statePc = 72;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (var6_ref_ml.field_jb == 7) {
                        statePc = 72;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if ((var6_ref_ml.field_jb ^ -1) == -38) {
                        statePc = 72;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var5_int = -var6_ref_ml.field_db + this.field_db - this.field_Y / 2;
                    var4 = this.field_lb - var6_ref_ml.field_lb;
                    var3 = var5_int * var5_int + var4 * var4;
                    if ((var2 ^ -1) < (var3 ^ -1)) {
                        statePc = 74;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 74: {
                    var2 = var3;
                    this.field_s = var6_ref_ml;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    var6_ref_ml = (ml) ((Object) pi.field_b.d(-18502));
                    if (var11 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    this.field_s = this.field_L.a(this.field_u, true);
                    var2 = 65536;
                    pi.field_b.a((byte) 114, this.field_L.field_i);
                    var6_ref_ml = (ml) ((Object) pi.field_b.b(-31));
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    if (var6_ref_ml == null) {
                        statePc = 89;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    stackIn_90_0 = var6_ref_ml.field_u ^ -1;
                    stackIn_79_0 = stackIn_90_0;
                    stackIn_90_1 = this.field_u ^ -1;
                    stackIn_79_1 = stackIn_90_1;
                    if (var11 != 0) {
                        statePc = 90;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (stackIn_79_0 != stackIn_79_1) {
                        statePc = 88;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (var6_ref_ml.field_s == null) {
                        statePc = 85;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if ((var6_ref_ml.field_jb ^ -1) == -10) {
                        statePc = 85;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (var6_ref_ml.field_jb == 7) {
                        statePc = 85;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if ((var6_ref_ml.field_jb ^ -1) == -38) {
                        statePc = 85;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 85: {
                    var5_int = -var6_ref_ml.field_db + this.field_db - this.field_Y / 2;
                    var4 = this.field_lb - var6_ref_ml.field_lb;
                    var3 = var5_int * var5_int + var4 * var4;
                    if ((var2 ^ -1) < (var3 ^ -1)) {
                        statePc = 87;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 87: {
                    var2 = var3;
                    this.field_s = var6_ref_ml;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    var6_ref_ml = (ml) ((Object) pi.field_b.d(-18502));
                    if (var11 == 0) {
                        statePc = 77;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    stackIn_90_0 = 35;
                    stackIn_90_1 = this.field_jb;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    if (stackIn_90_0 != stackIn_90_1) {
                        statePc = 92;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    this.a(true, true);
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    this.g(param0 + -5390);
                    this.field_lb = this.field_X >> 2067865092;
                    if (250 >= this.field_ib) {
                        statePc = 94;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    this.field_ib = 250;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    this.field_db = this.field_R >> 833836484;
                    var2 = this.field_lb;
                    var3 = this.field_db;
                    var4 = 0;
                    if (this.field_z) {
                        statePc = 98;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if (this.field_hb) {
                        statePc = 98;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if ((this.field_M ^ -1) == -1) {
                        statePc = 99;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    var4 = 1;
                    this.field_L.a((ml) (this), 0);
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    if (null == this.field_s) {
                        statePc = 104;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    if (0 < this.field_s.field_ib) {
                        statePc = 104;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (null != this.field_s.field_s) {
                        statePc = 103;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 103: {
                    this.field_s = this.field_s.field_s;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    this.field_hb = false;
                    var5 = this.field_L.a(this.field_u, true);
                    if (this.field_s == null) {
                        statePc = 111;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    if (var5 == null) {
                        statePc = 108;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    if (0 < var5.field_ib) {
                        statePc = 111;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    this.field_ib = 0;
                    if (var4 != 0) {
                        statePc = 110;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    this.field_L.a((ml) (this), 0);
                    statePc = 110;
                    continue stateLoop;
                }
                case 110: {
                    this.d(this.field_L.d(false), 90);
                    return;
                }
                case 111: {
                    if (-1 <= (this.field_ib ^ -1)) {
                        statePc = 113;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 113: {
                    this.field_M = 0;
                    if (var4 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 115: {
                    this.field_L.a((ml) (this), param0 ^ -55);
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    this.d(this.field_L.d(false), 72);
                    return;
                }
                case 117: {
                    if (!this.t(33)) {
                        statePc = 128;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    if (this.field_L.field_x[this.field_u] == 4) {
                        statePc = 120;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if (this.field_L.a(this.field_L.field_o[this.field_u] + 2, this.field_L.field_Ab[this.field_u], (byte) -83)) {
                        statePc = 128;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    stackIn_129_0 = this.field_L.field_X[this.field_u] ^ -1;
                    stackIn_122_0 = stackIn_129_0;
                    stackIn_129_1 = -1;
                    stackIn_122_1 = stackIn_129_1;
                    if (var11 != 0) {
                        statePc = 129;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    if (stackIn_122_0 >= stackIn_122_1) {
                        statePc = 128;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    if (0 >= (this.field_L.field_X[this.field_u] - 1) % 5 - (-1 + (-1 + this.field_L.field_X[this.field_u]) / 5)) {
                        statePc = 128;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    this.field_L.field_o[this.field_u] = this.field_L.field_o[this.field_u] + 2;
                    if ((this.field_L.field_o[this.field_u] ^ -1) >= (this.field_L.field_H ^ -1)) {
                        statePc = 127;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    this.field_L.field_X[this.field_u] = this.field_L.field_X[this.field_u] + 5;
                    if ((this.field_L.d(false) ^ -1) == (this.field_u ^ -1)) {
                        statePc = 127;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    this.field_z = true;
                    if (var11 == 0) {
                        statePc = 120;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    stackIn_129_0 = this.field_db;
                    stackIn_129_1 = -this.field_L.field_H * 10;
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    if (stackIn_129_0 >= stackIn_129_1) {
                        statePc = 131;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    this.field_eb = 0;
                    this.field_kb = 0;
                    this.field_X = this.field_lb << 1358959780;
                    this.field_db = 10 * -this.field_L.field_H;
                    this.field_R = this.field_db << -95718108;
                    this.field_L.field_u[this.g(false)] = true;
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    if (this.field_jb == 22) {
                        statePc = 137;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    if (this.field_jb == 4) {
                        statePc = 137;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    if ((this.field_jb ^ -1) == -6) {
                        statePc = 137;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    if (-4 != (this.field_L.field_x[this.field_u] ^ -1)) {
                        statePc = 146;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if (-1 <= (this.field_L.field_X[this.field_u] ^ -1)) {
                        statePc = 146;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    if (-1 < (this.field_lb ^ -1)) {
                        statePc = 146;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    if ((this.field_L.field_y ^ -1) > (this.field_lb ^ -1)) {
                        statePc = 146;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (-1 < (this.field_eb ^ -1)) {
                        statePc = 146;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    if ((this.field_db ^ -1) >= (-33 + this.field_L.field_H ^ -1)) {
                        statePc = 146;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    if ((this.field_ib ^ -1) < -6) {
                        statePc = 144;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    if ((this.field_q ^ -1) < -1) {
                        statePc = 144;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 144: {
                    this.field_eb = 0;
                    this.field_db = -33 + this.field_L.field_H;
                    this.field_R = this.field_db << 437427396;
                    this.field_L.a(param0 ^ -57, -24 + this.field_lb, gj.field_f[9], -gj.field_f[9].field_f + (-33 + this.field_L.field_H));
                    this.field_L.a(-25, -8 + this.field_lb, gj.field_f[9], this.field_L.field_H - (33 + gj.field_f[9].field_f));
                    this.field_L.a(89, this.field_lb + 8, gj.field_f[9], -33 + (this.field_L.field_H - gj.field_f[9].field_f));
                    if (this.field_jb == 22) {
                        statePc = 146;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    this.field_ib = this.field_ib - 5;
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    if (this.field_db >= this.field_L.field_H + 128) {
                        statePc = 150;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    if ((-640 - (this.field_Y >> -2048412895) ^ -1) < (this.field_lb ^ -1)) {
                        statePc = 150;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    if (this.field_lb <= this.field_L.field_y + 640 + (this.field_Y >> 1528860769)) {
                        statePc = 151;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    this.l(param0 ^ -32759);
                    this.field_M = 0;
                    return;
                }
                case 151: {
                    var6 = 0;
                    if (-29 == (this.field_jb ^ -1)) {
                        statePc = 158;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    if ((this.field_jb ^ -1) == -30) {
                        statePc = 158;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    if ((this.field_jb ^ -1) == -31) {
                        statePc = 158;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    if ((this.field_jb ^ -1) == -33) {
                        statePc = 158;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    if (-8 != (this.field_L.field_x[this.field_u] ^ -1)) {
                        statePc = 161;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    if (this.field_L.field_X[this.field_u] <= 0) {
                        statePc = 161;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    if (0 > this.field_lb) {
                        statePc = 161;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    if ((this.field_L.field_y ^ -1) > (this.field_lb ^ -1)) {
                        statePc = 161;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    var6 = 1;
                    statePc = 161;
                    continue stateLoop;
                }
                case 161: {
                    if (this.field_db <= this.field_L.field_H - (32 + -(this.field_Y / 2))) {
                        statePc = 163;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    stackIn_164_0 = 1;
                    statePc = 164;
                    continue stateLoop;
                }
                case 163: {
                    stackIn_164_0 = 0;
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    var7 = stackIn_164_0;
                    if (this.s(-1)) {
                        statePc = 166;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 166: {
                    stackIn_168_0 = var7;
                    stackIn_167_0 = stackIn_168_0;
                    if (this.field_db < this.field_L.field_H) {
                        statePc = 168;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    stackIn_169_0 = stackIn_167_0;
                    stackIn_169_1 = 1;
                    statePc = 169;
                    continue stateLoop;
                }
                case 168: {
                    stackIn_169_0 = stackIn_168_0;
                    stackIn_169_1 = 0;
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    var7 = stackIn_169_0 | stackIn_169_1;
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    if (var7 == 0) {
                        statePc = 185;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    if (var6 == 0) {
                        statePc = 173;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 173: {
                    if (-13 == (this.field_jb ^ -1)) {
                        statePc = 175;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 175: {
                    if (var4 == 0) {
                        statePc = 177;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 177: {
                    this.field_L.a((ml) (this), param0 ^ -55);
                    statePc = 178;
                    continue stateLoop;
                }
                case 178: {
                    this.d(this.field_L.d(false), 89);
                    this.field_ib = 0;
                    return;
                }
                case 179: {
                    this.field_db = this.field_db + 1;
                    this.field_R = this.field_db << -961856892;
                    this.field_M = 0;
                    this.field_eb = this.field_eb + 1;
                    this.field_z = true;
                    var8 = -this.field_eb;
                    if (var8 > this.field_Y >> 355541985) {
                        statePc = 181;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 181: {
                    var8 = this.field_Y >> -1249435487;
                    statePc = 182;
                    continue stateLoop;
                }
                case 182: {
                    if (var8 >= -(this.field_Y >> 2056283009)) {
                        statePc = 184;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    var8 = -(this.field_Y >> 1282430497);
                    statePc = 184;
                    continue stateLoop;
                }
                case 184: {
                    this.field_o = var8 >> -1919569406;
                    this.field_N = -(var8 >> -543692478);
                    this.field_O = -(var8 >> -982051966);
                    this.field_Z = var8 >> -996882750;
                    return;
                }
                case 185: {
                    if (this.g((byte) 108)) {
                        statePc = 188;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    if (-13 == (this.field_jb ^ -1)) {
                        statePc = 188;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 188: {
                    if ((this.field_eb ^ -1) > -1) {
                        statePc = 190;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 190: {
                    this.field_eb = 0;
                    statePc = 191;
                    continue stateLoop;
                }
                case 191: {
                    this.field_kb = 0;
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    if (param0 == -55) {
                        statePc = 194;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    this.e((byte) 40);
                    statePc = 194;
                    continue stateLoop;
                }
                case 194: {
                    if (this.field_z) {
                        statePc = 197;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    this.z(param0 + 44);
                    if (var11 == 0) {
                        statePc = 198;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    this.h((byte) -120);
                    statePc = 198;
                    continue stateLoop;
                }
                case 198: {
                    if ((this.field_ib ^ -1) >= -1) {
                        statePc = 205;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    if (this.field_z) {
                        statePc = 205;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    if (this.field_hb) {
                        statePc = 205;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    if ((var2 ^ -1) != (this.field_lb ^ -1)) {
                        statePc = 205;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    if ((var3 ^ -1) != (this.field_db ^ -1)) {
                        statePc = 205;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    if (var4 == 0) {
                        statePc = 212;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    var9 = this.field_lb;
                    this.field_lb = var2;
                    var10 = this.field_db;
                    this.field_db = var3;
                    if (var4 != 0) {
                        statePc = 210;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    if ((this.field_jb ^ -1) != -13) {
                        statePc = 209;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    if (this.field_ib <= 0) {
                        statePc = 210;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    this.field_L.a((ml) (this), param0 ^ -55);
                    statePc = 210;
                    continue stateLoop;
                }
                case 210: {
                    this.field_lb = var9;
                    this.field_db = var10;
                    if (-1 <= (this.field_ib ^ -1)) {
                        statePc = 212;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    this.field_L.a(-63, (ml) (this));
                    statePc = 212;
                    continue stateLoop;
                }
                case 212: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, boolean param1) {
        int statePc = 0;
        int[] var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int[] var8 = null;
        qb[][] var9 = null;
        int var10 = 0;
        ll[] var11 = null;
        int var12 = 0;
        qb[][] var13_ref_qb____ = null;
        int var13 = 0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        qb var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        qb var25 = null;
        qb var26 = null;
        qb var27 = null;
        qb var28 = null;
        qb var29 = null;
        qb var30 = null;
        int[] var31 = null;
        qb var32 = null;
        qb var33 = null;
        qb var34 = null;
        qb var35 = null;
        qb var36 = null;
        qb var37 = null;
        qb var38 = null;
        qb var39 = null;
        qb var40 = null;
        qb var41 = null;
        qb var42 = null;
        qb var43 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = ArcanistsMulti.field_G ? 1 : 0;
                    if (!this.field_J) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    var16 = new int[]{255, 0, 0};
                    var3 = var16;
                    var17 = new int[]{0, 255, 0};
                    var4 = var17;
                    var18 = new int[]{0, 0, 255};
                    var5 = var18;
                    var31 = new int[]{255, 255, 255};
                    var6 = var31;
                    var7 = this.field_u;
                    if (-1 == (var7 ^ -1)) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (3 == var7) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var7 != 4) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var16[2] = 255;
                    var16[1] = 255;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (1 == var7) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (var7 == 3) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var7 != 5) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var17[2] = 255;
                    var17[0] = 255;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (-3 == (var7 ^ -1)) {
                        statePc = 16;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if ((var7 ^ -1) == -5) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var7 != 5) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var18[0] = 255;
                    var18[2] = 255;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (null != this.field_L.field_N) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var3[0] = this.field_L.field_N[var7][0];
                    var3[1] = this.field_L.field_N[var7][1];
                    var3[2] = this.field_L.field_N[var7][2];
                    var4[0] = this.field_L.field_N[var7][3];
                    var4[1] = this.field_L.field_N[var7][4];
                    var4[2] = this.field_L.field_N[var7][5];
                    var5[0] = this.field_L.field_N[var7][6];
                    var5[1] = this.field_L.field_N[var7][7];
                    var5[2] = this.field_L.field_N[var7][8];
                    var6[0] = this.field_L.field_N[var7][9];
                    var6[1] = this.field_L.field_N[var7][10];
                    var6[2] = this.field_L.field_N[var7][11];
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (param0 == 12) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    return;
                }
                case 22: {
                    var12 = this.field_jb;
                    if ((var12 ^ -1) == -41) {
                        statePc = 96;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (var12 == 12) {
                        statePc = 98;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (var12 == 39) {
                        statePc = 100;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if ((var12 ^ -1) == -14) {
                        statePc = 102;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (var12 != 15) {
                        statePc = 29;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (var15 == 0) {
                        statePc = 104;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if ((var12 ^ -1) != -15) {
                        statePc = 32;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (var15 == 0) {
                        statePc = 106;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (26 != var12) {
                        statePc = 35;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (var15 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if ((var12 ^ -1) != -18) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (var15 == 0) {
                        statePc = 110;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (27 == var12) {
                        statePc = 112;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (var12 == 22) {
                        statePc = 125;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (23 == var12) {
                        statePc = 125;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (-22 != (var12 ^ -1)) {
                        statePc = 44;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (var15 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (24 != var12) {
                        statePc = 47;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (var15 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (-36 == (var12 ^ -1)) {
                        statePc = 125;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if ((var12 ^ -1) == -21) {
                        statePc = 125;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if ((var12 ^ -1) != -1) {
                        statePc = 52;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if (var15 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if ((var12 ^ -1) != -17) {
                        statePc = 55;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (var15 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (var12 != 18) {
                        statePc = 58;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (var15 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if ((var12 ^ -1) == -39) {
                        statePc = 125;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (-7 != (var12 ^ -1)) {
                        statePc = 62;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (var15 == 0) {
                        statePc = 180;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if ((var12 ^ -1) == -26) {
                        statePc = 180;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if (11 == var12) {
                        statePc = 182;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (var12 == 4) {
                        statePc = 182;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (-6 != (var12 ^ -1)) {
                        statePc = 68;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (var15 == 0) {
                        statePc = 182;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if ((var12 ^ -1) == -2) {
                        statePc = 182;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (var12 == 2) {
                        statePc = 182;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if ((var12 ^ -1) == -4) {
                        statePc = 182;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (8 != var12) {
                        statePc = 74;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (var15 == 0) {
                        statePc = 182;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (var12 == 7) {
                        statePc = 182;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (-11 != (var12 ^ -1)) {
                        statePc = 78;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (var15 == 0) {
                        statePc = 182;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (9 == var12) {
                        statePc = 182;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (-29 == (var12 ^ -1)) {
                        statePc = 182;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (29 != var12) {
                        statePc = 83;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (var15 == 0) {
                        statePc = 182;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (-31 == (var12 ^ -1)) {
                        statePc = 182;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (-32 == (var12 ^ -1)) {
                        statePc = 182;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (32 == var12) {
                        statePc = 182;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (-34 == (var12 ^ -1)) {
                        statePc = 182;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if (var12 != 34) {
                        statePc = 90;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    if (var15 == 0) {
                        statePc = 182;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if (36 != var12) {
                        statePc = 93;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if (var15 == 0) {
                        statePc = 182;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    if (-38 != (var12 ^ -1)) {
                        statePc = 125;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if (var15 == 0) {
                        statePc = 182;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    this.field_Y = 64;
                    this.field_ib = 10;
                    this.field_J = true;
                    this.field_w = new qb(this.field_Y, this.field_Y);
                    this.field_w.a();
                    de.i(32, 32, 10, 16777215);
                    de.i(32, 63, 1, 16777215);
                    if (var15 == 0) {
                        statePc = 253;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    this.field_J = true;
                    this.field_ib = 75;
                    this.field_z = true;
                    this.field_Y = 256;
                    this.field_w = new qb(this.field_Y, this.field_Y);
                    this.field_w.a();
                    go.field_j[29].a(0, 0);
                    de.d(0, -2 + (go.field_j[29].field_f + go.field_j[29].field_c), this.field_Y, this.field_Y, 0);
                    if (var15 == 0) {
                        statePc = 253;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    this.field_J = true;
                    this.field_Y = 100;
                    this.field_ib = 100;
                    this.field_w = new qb(this.field_Y, this.field_Y);
                    this.field_w.a();
                    de.i(this.field_Y >> 1554575329, this.field_Y >> -1371289439, this.field_Y >> -1607789759, 16777215);
                    if (var15 == 0) {
                        statePc = 253;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    this.field_J = true;
                    this.field_ib = 200;
                    this.field_Y = 100;
                    this.field_w = new qb(this.field_Y, this.field_Y);
                    this.field_w.a();
                    de.i(this.field_Y >> -917470591, this.field_Y >> 1685513953, this.field_Y >> -100393279, 16777215);
                    if (var15 == 0) {
                        statePc = 253;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    this.field_J = true;
                    this.field_Y = 100;
                    this.field_ib = 150;
                    this.field_w = new qb(this.field_Y, this.field_Y);
                    this.field_w.a();
                    de.i(this.field_Y >> 1785854017, this.field_Y >> 632717025, this.field_Y >> -2070527903, 16777215);
                    if (var15 == 0) {
                        statePc = 253;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    this.field_ib = 150;
                    this.field_J = true;
                    this.field_Y = 100;
                    this.field_w = new qb(this.field_Y, this.field_Y);
                    this.field_w.a();
                    de.i(this.field_Y >> -2001765119, this.field_Y >> 614805185, this.field_Y >> 888971745, 16777215);
                    if (var15 == 0) {
                        statePc = 253;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    this.field_Y = 100;
                    this.field_ib = 150;
                    this.field_J = true;
                    this.field_w = new qb(this.field_Y, this.field_Y);
                    this.field_w.a();
                    de.i(this.field_Y >> -2112440895, this.field_Y >> 1238221953, this.field_Y >> 378147425, 16777215);
                    if (var15 == 0) {
                        statePc = 253;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    this.field_Y = 80;
                    this.field_J = true;
                    this.field_ib = 100;
                    this.field_w = new qb(this.field_Y, this.field_Y);
                    this.field_w.a();
                    de.i(this.field_Y >> 917242145, this.field_Y >> -1507659583, this.field_Y >> -1190423839, 16777215);
                    if (var15 == 0) {
                        statePc = 253;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    this.field_Y = 64;
                    if (param1) {
                        statePc = 114;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 114: {
                    this.field_ib = 250;
                    statePc = 115;
                    continue stateLoop;
                }
                case 115: {
                    this.field_ab = 2;
                    if (!param1) {
                        statePc = 117;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    this.field_w = new qb(this.field_Y, this.field_Y);
                    this.field_w.a();
                    de.i(this.field_Y >> 1889445345, this.field_Y >> -487186783, this.field_Y >> -671284735, 16777215);
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    var24 = new int[]{28, 0, 29, 33, 47, 50, var7, 0, 0};
                    var13_ref_qb____ = new qb[][]{kc.field_kb, jd.field_j, ea.field_u, qe.field_i, hn.field_d, tj.field_A, bo.field_a, h.field_I, fn.field_b};
                    if (kc.field_kb != null) {
                        statePc = 120;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    this.field_J = false;
                    if (var15 == 0) {
                        statePc = 253;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    var22 = new int[]{204, 170, 238};
                    var3 = var22;
                    var20 = new int[]{32, 32, 32};
                    var5 = var20;
                    var21 = new int[]{128, 64, 128};
                    var6 = var21;
                    var23 = new int[]{255, 192, 255};
                    var4 = var23;
                    var19 = new qb(64, 96);
                    var19.a();
                    pc.a(var20, 16, var21, var22, (byte) -8, var23, var13_ref_qb____[0][var24[1]], 0);
                    pc.a(var20, 32, var21, var22, (byte) -96, var23, var13_ref_qb____[4][var24[5]], 0);
                    if (53 == var24[5]) {
                        statePc = 123;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    if ((var24[5] ^ -1) == -56) {
                        statePc = 123;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    pc.a(var20, 32, var21, var22, (byte) 74, var23, var13_ref_qb____[6][var24[6]], 0);
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    pc.a(var20, 16, var21, var22, (byte) 25, var23, var13_ref_qb____[5][var24[4]], 0);
                    this.field_I = new qb(64, 96);
                    this.field_I.a();
                    var19.a(32, 48, 0, 4096);
                    this.field_I.e();
                    var25 = new qb(64, 64);
                    var25.a();
                    pc.a(var20, 0, var21, var22, (byte) 49, var23, var13_ref_qb____[1][var24[0]], 0);
                    this.field_bb = new qb(64, 64);
                    this.field_bb.a();
                    var25.a(32, 32, 0, 4096);
                    this.field_bb.e();
                    var26 = new qb(64, 64);
                    var26.a();
                    pc.a(var20, 0, var21, var22, (byte) -104, var23, var13_ref_qb____[7][0], 0);
                    this.field_Q = new qb(64, 64);
                    this.field_Q.a();
                    var26.a(32, 32, 0, 4096);
                    this.field_Q.e();
                    var27 = new qb(64, 64);
                    var27.a();
                    pc.a(var20, 0, var21, var22, (byte) -124, var23, var13_ref_qb____[8][0], 0);
                    this.field_cb = new qb(64, 64);
                    this.field_cb.a();
                    var27.a(32, 32, 0, 4096);
                    this.field_cb.e();
                    var28 = new qb(64, 64);
                    var28.a();
                    pc.a(var20, 0, var21, var22, (byte) -112, var23, var13_ref_qb____[2][var24[2]], 0);
                    this.field_fb = new qb(64, 64);
                    this.field_fb.a();
                    var28.a(32, 32, 0, 4096);
                    this.field_fb.e();
                    var29 = new qb(64, 64);
                    var29.a();
                    pc.a(var20, 0, var21, var22, (byte) -79, var23, var13_ref_qb____[3][var24[3]], 0);
                    this.field_B = new qb(64, 64);
                    this.field_B.a();
                    var29.a(32, 32, 0, 4096);
                    this.field_B.e();
                    this.field_J = true;
                    statePc = 253;
                    continue stateLoop;
                }
                case 125: {
                    if (param1) {
                        statePc = 127;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 127: {
                    this.field_ib = 250;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    this.field_Y = 32;
                    if (param1) {
                        statePc = 130;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 130: {
                    this.field_w = new qb(this.field_Y, this.field_Y);
                    this.field_w.a();
                    de.i(this.field_Y >> -2098818207, this.field_Y >> -2034858495, this.field_Y >> -672627263, 16777215);
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    var8 = new int[]{var7, var7, var7, var7, var7, var7, var7, 0, 0};
                    if (this.field_L.field_N != null) {
                        statePc = 133;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var12 = 0;
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    if (var12 >= 6) {
                        statePc = 138;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    var8[var12] = this.field_L.field_N[var7][var12 - -12];
                    var12++;
                    if (var15 != 0) {
                        statePc = 253;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    if (var15 == 0) {
                        statePc = 134;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var9 = new qb[][]{kc.field_kb, jd.field_j, ea.field_u, qe.field_i, hn.field_d, tj.field_A, bo.field_a, h.field_I, fn.field_b};
                    if (kc.field_kb == null) {
                        statePc = 179;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    var30 = new qb(64, 96);
                    var30.a();
                    if (this.field_jb != 16) {
                        statePc = 142;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    pc.a(var18, 16, var31, var16, (byte) 116, var17, tk.field_x[2], 0);
                    if (var15 == 0) {
                        statePc = 147;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    pc.a(var18, 16, var31, var16, (byte) 78, var17, var9[0][var8[1]], 0);
                    pc.a(var18, 32, var31, var16, (byte) -91, var17, var9[4][var8[5]], 0);
                    if (-54 == (var8[5] ^ -1)) {
                        statePc = 146;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    if ((var8[5] ^ -1) != -56) {
                        statePc = 145;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 145: {
                    pc.a(var18, 32, var31, var16, (byte) -90, var17, var9[6][var8[6]], 0);
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    pc.a(var18, 16, var31, var16, (byte) 13, var17, var9[5][var8[4]], 0);
                    statePc = 147;
                    continue stateLoop;
                }
                case 147: {
                    this.field_I = new qb(32, 48);
                    this.field_I.a();
                    var30.a(16, 24, 0, 2048);
                    this.field_I.e();
                    var32 = new qb(64, 64);
                    var32.a();
                    pc.a(var18, 0, var31, var16, (byte) 91, var17, var9[1][var8[0]], 0);
                    this.field_bb = new qb(32, 32);
                    this.field_bb.a();
                    var32.a(16, 16, 0, 2048);
                    this.field_bb.e();
                    var33 = new qb(64, 64);
                    var33.a();
                    pc.a(var18, 0, var31, var16, (byte) 123, var17, var9[7][0], 0);
                    this.field_Q = new qb(32, 32);
                    this.field_Q.a();
                    if (-47 == (var8[0] ^ -1)) {
                        statePc = 149;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    var33.a(16, 16, 0, 2048);
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    this.field_Q.e();
                    var34 = new qb(64, 64);
                    var34.a();
                    pc.a(var18, 0, var31, var16, (byte) -81, var17, var9[8][0], 0);
                    this.field_cb = new qb(32, 32);
                    this.field_cb.a();
                    if (-47 == (var8[0] ^ -1)) {
                        statePc = 151;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    var34.a(16, 16, 0, 2048);
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    this.field_cb.e();
                    var35 = new qb(64, 64);
                    var35.a();
                    pc.a(var18, 0, var31, var16, (byte) 126, var17, var9[2][var8[2]], 0);
                    this.field_fb = new qb(32, 32);
                    this.field_fb.a();
                    var35.a(16, 16, 0, 2048);
                    this.field_fb.e();
                    var36 = new qb(64, 64);
                    var36.a();
                    pc.a(var18, 0, var31, var16, (byte) 14, var17, var9[3][var8[3]], 0);
                    this.field_B = new qb(32, 32);
                    this.field_B.a();
                    var36.a(16, 16, 0, 2048);
                    this.field_B.e();
                    this.field_ab = -1;
                    if (var8[2] == 27) {
                        statePc = 153;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 153: {
                    this.field_ab = 0;
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    if (28 != var8[2]) {
                        statePc = 156;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    this.field_ab = 1;
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    if (-30 == (var8[2] ^ -1)) {
                        statePc = 158;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 158: {
                    this.field_ab = 2;
                    statePc = 159;
                    continue stateLoop;
                }
                case 159: {
                    if ((var8[2] ^ -1) == -55) {
                        statePc = 161;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 161: {
                    this.field_ab = 3;
                    var37 = new qb(64, 64);
                    var37.a();
                    var13 = 32;
                    if (this.field_B != null) {
                        statePc = 163;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 163: {
                    this.field_B.c(32 + (-(var13 >> 1938536642) - 4), 48 + -var13);
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    if (this.field_cb == null) {
                        statePc = 166;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    this.field_cb.c(-(var13 >> -896131295) + 32, -var13 + 48);
                    statePc = 166;
                    continue stateLoop;
                }
                case 166: {
                    if (this.field_bb != null) {
                        statePc = 168;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 168: {
                    this.field_bb.c(-(var13 >> 134101377) + 32, -var13 + 48);
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    if (null != this.field_I) {
                        statePc = 171;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 171: {
                    this.field_I.c(-(var13 >> 85799009) + 32, 48 - var13 * 3 / 2);
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    if (this.field_Q != null) {
                        statePc = 174;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 174: {
                    this.field_Q.c(32 - (var13 >> -795307679), 48 + -var13);
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    if (null == this.field_fb) {
                        statePc = 177;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    this.field_fb.c(-4 + -(var13 >> 1583231169) + 32, 48 - var13);
                    statePc = 177;
                    continue stateLoop;
                }
                case 177: {
                    this.field_cb = null;
                    this.field_B = null;
                    this.field_bb = var37;
                    this.field_Q = null;
                    this.field_fb = null;
                    statePc = 178;
                    continue stateLoop;
                }
                case 178: {
                    this.field_J = true;
                    statePc = 253;
                    continue stateLoop;
                }
                case 179: {
                    this.field_J = false;
                    if (var15 == 0) {
                        statePc = 253;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    this.field_J = true;
                    this.field_Y = 24;
                    this.field_ib = 25;
                    this.field_w = new qb(this.field_Y, this.field_Y);
                    this.field_w.a();
                    de.i(12, 12, 12, 16777215);
                    this.field_p = this.field_ib;
                    this.field_Y = this.field_w.field_n;
                    this.e((byte) 6);
                    if (var15 == 0) {
                        statePc = 253;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    var10 = this.field_ib;
                    var11 = fb.field_a;
                    this.field_ib = 10;
                    this.field_Y = 24;
                    if (11 != this.field_jb) {
                        statePc = 185;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    if (-28 != (this.field_L.a(this.field_u, true).field_jb ^ -1)) {
                        statePc = 185;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    this.field_ib = 100;
                    statePc = 185;
                    continue stateLoop;
                }
                case 185: {
                    if (4 != this.field_jb) {
                        statePc = 187;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    this.field_Y = 32;
                    this.field_ib = 50;
                    var11 = bj.field_ob;
                    statePc = 187;
                    continue stateLoop;
                }
                case 187: {
                    if (5 == this.field_jb) {
                        statePc = 189;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 189: {
                    this.field_Y = 64;
                    var11 = ea.field_v;
                    this.field_ib = 100;
                    statePc = 190;
                    continue stateLoop;
                }
                case 190: {
                    if (1 != this.field_jb) {
                        statePc = 192;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    this.field_Y = 32;
                    this.field_ib = 50;
                    var11 = dh.field_Jb;
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    if ((this.field_jb ^ -1) != -34) {
                        statePc = 194;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    var11 = jk.field_n;
                    this.field_Y = 32;
                    this.field_ib = 40;
                    statePc = 194;
                    continue stateLoop;
                }
                case 194: {
                    if (-37 == (this.field_jb ^ -1)) {
                        statePc = 196;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 196: {
                    this.field_ib = 25;
                    this.field_Y = 32;
                    var11 = e.field_I;
                    if (!lk.a(0, (byte) -127)) {
                        statePc = 198;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    this.field_U = true;
                    this.field_ib = 75;
                    statePc = 198;
                    continue stateLoop;
                }
                case 198: {
                    if (34 != this.field_jb) {
                        statePc = 200;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    var11 = field_v;
                    this.field_ib = 25;
                    this.field_Y = 32;
                    statePc = 200;
                    continue stateLoop;
                }
                case 200: {
                    if (-3 == (this.field_jb ^ -1)) {
                        statePc = 202;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 202: {
                    this.field_Y = 64;
                    this.field_ib = 100;
                    var11 = i.field_g;
                    statePc = 203;
                    continue stateLoop;
                }
                case 203: {
                    if (-4 == (this.field_jb ^ -1)) {
                        statePc = 205;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 205: {
                    this.field_Y = 64;
                    var11 = gb.field_c;
                    this.field_ib = 75;
                    statePc = 206;
                    continue stateLoop;
                }
                case 206: {
                    if (8 == this.field_jb) {
                        statePc = 208;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 208: {
                    this.field_Y = 48;
                    this.field_ib = 50;
                    var11 = pm.field_d;
                    this.field_U = true;
                    statePc = 209;
                    continue stateLoop;
                }
                case 209: {
                    if (-8 == (this.field_jb ^ -1)) {
                        statePc = 211;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 211: {
                    var11 = ra.field_j;
                    this.field_Y = 64;
                    this.field_ib = 100;
                    statePc = 212;
                    continue stateLoop;
                }
                case 212: {
                    if (-11 == (this.field_jb ^ -1)) {
                        statePc = 214;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 214: {
                    this.field_ib = 25;
                    var11 = oe.field_d;
                    this.field_Y = 16;
                    statePc = 215;
                    continue stateLoop;
                }
                case 215: {
                    if (9 != this.field_jb) {
                        statePc = 217;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    this.field_ib = 100;
                    var11 = qj.field_d;
                    this.field_Y = 64;
                    statePc = 217;
                    continue stateLoop;
                }
                case 217: {
                    if (-29 != (this.field_jb ^ -1)) {
                        statePc = 219;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    this.field_Y = 24;
                    var11 = g.field_f;
                    this.field_ib = 40;
                    statePc = 219;
                    continue stateLoop;
                }
                case 219: {
                    if ((this.field_jb ^ -1) != -30) {
                        statePc = 221;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 220: {
                    var11 = c.field_a;
                    this.field_Y = 48;
                    this.field_ib = 100;
                    statePc = 221;
                    continue stateLoop;
                }
                case 221: {
                    if (this.field_jb != 30) {
                        statePc = 223;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    var11 = vm.field_g;
                    this.field_ib = 200;
                    this.field_Y = 100;
                    statePc = 223;
                    continue stateLoop;
                }
                case 223: {
                    if (this.field_jb == 31) {
                        statePc = 225;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 225: {
                    this.field_Y = 64;
                    var11 = vk.field_w;
                    this.field_ib = 100;
                    statePc = 226;
                    continue stateLoop;
                }
                case 226: {
                    if (-33 != (this.field_jb ^ -1)) {
                        statePc = 228;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    this.field_ib = 250;
                    this.field_Y = 128;
                    var11 = nj.field_k;
                    statePc = 228;
                    continue stateLoop;
                }
                case 228: {
                    if (-38 == (this.field_jb ^ -1)) {
                        statePc = 230;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 230: {
                    this.field_ib = 50;
                    var11 = fe.field_h;
                    this.field_Y = 32;
                    statePc = 231;
                    continue stateLoop;
                }
                case 231: {
                    if (param1) {
                        statePc = 233;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 233: {
                    if ((this.field_jb ^ -1) == -8) {
                        statePc = 236;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    if (this.field_jb != 9) {
                        statePc = 238;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    this.field_w = new qb(48, 48);
                    this.field_w.a();
                    de.i(24, 24, 24, 16777215);
                    if (var15 == 0) {
                        statePc = 239;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    this.field_w = new qb(this.field_Y, this.field_Y);
                    this.field_w.a();
                    de.i(this.field_Y >> -736443263, this.field_Y >> 1158916129, this.field_Y >> 4413505, 16777215);
                    statePc = 239;
                    continue stateLoop;
                }
                case 239: {
                    if (var11 == null) {
                        statePc = 249;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    var38 = new qb(this.field_Y, 3 * this.field_Y / 2);
                    var38.a();
                    if (this.field_jb == 11) {
                        statePc = 247;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 241: {
                    if (this.field_jb == 8) {
                        statePc = 247;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    if (6 == this.field_jb) {
                        statePc = 247;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    if (this.field_jb == 25) {
                        statePc = 247;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    if (!this.field_U) {
                        statePc = 247;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 245: {
                    pc.a(var5, this.field_Y / 2, var6, var3, (byte) -111, var4, var11[6].b(), 0);
                    if (var15 == 0) {
                        statePc = 248;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    pc.a(var5, this.field_Y / 2, var6, var3, (byte) -85, var4, var11[2].b(), 0);
                    statePc = 248;
                    continue stateLoop;
                }
                case 248: {
                    this.field_I = var38.g();
                    var39 = new qb(this.field_Y, this.field_Y);
                    var39.a();
                    pc.a(var5, 0, var6, var3, (byte) 70, var4, var11[3].b(), 0);
                    this.field_bb = var39.g();
                    var40 = new qb(this.field_Y, this.field_Y);
                    var40.a();
                    pc.a(var5, 0, var6, var3, (byte) 33, var4, var11[1].b(), 0);
                    this.field_Q = var40.g();
                    var41 = new qb(this.field_Y, this.field_Y);
                    var41.a();
                    pc.a(var5, 0, var6, var3, (byte) -127, var4, var11[4].b(), 0);
                    this.field_cb = var41.g();
                    var42 = new qb(this.field_Y, this.field_Y);
                    var42.a();
                    pc.a(var5, 0, var6, var3, (byte) -4, var4, var11[0].b(), 0);
                    this.field_fb = var42.g();
                    var43 = new qb(this.field_Y, this.field_Y);
                    var43.a();
                    pc.a(var5, 0, var6, var3, (byte) -86, var4, var11[5].b(), 0);
                    this.field_B = var43.g();
                    this.field_J = true;
                    statePc = 250;
                    continue stateLoop;
                }
                case 249: {
                    this.field_J = false;
                    statePc = 250;
                    continue stateLoop;
                }
                case 250: {
                    if (!param1) {
                        statePc = 252;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 252: {
                    this.field_ib = var10;
                    statePc = 253;
                    continue stateLoop;
                }
                case 253: {
                    if (!param1) {
                        statePc = 255;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    this.field_p = this.field_ib;
                    this.field_Y = this.field_w.field_n;
                    this.e((byte) 6);
                    statePc = 255;
                    continue stateLoop;
                }
                case 255: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int m(int param0) {
        if (param0 != -20357) {
            this.field_u = 27;
        }
        if (!(this.field_jb != 27)) {
            return this.field_ib * 2;
        }
        return this.field_ib;
    }

    final void c(int param0, int param1) {
        this.field_M = param1;
        if (param0 != 0) {
            this.t(8);
        }
    }

    private final boolean u(int param0) {
        int stackIn_13_0 = 0;
        if (param0 >= 84) {
          L0: {
            L1: {
              if (-1 > (this.field_q ^ -1)) {
                break L1;
              } else {
                L2: {
                  if (0 == this.field_jb) {
                    break L2;
                  } else {
                    if ((this.field_jb ^ -1) == -19) {
                      break L2;
                    } else {
                      if (-20 == (this.field_jb ^ -1)) {
                        break L2;
                      } else {
                        if (9 == this.field_jb) {
                          break L2;
                        } else {
                          if (16 == this.field_jb) {
                            break L2;
                          } else {
                            if (this.field_jb == 7) {
                              break L2;
                            } else {
                              if (this.field_jb != 37) {
                                break L1;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                stackIn_13_0 = 1;
                break L0;
              }
            }
            stackIn_13_0 = 0;
            break L0;
          }
          return stackIn_13_0 != 0;
        } else {
          return true;
        }
    }

    final boolean e(int param0) {
        if (param0 < 118) {
            this.f(false);
        }
        if (!this.field_z && !this.field_hb) {
            return false;
        }
        return true;
    }

    public static void h(boolean param0) {
        field_H = null;
        field_m = null;
        field_v = null;
        field_S = null;
        field_K = null;
        if (param0) {
            ml.a((dj) null, 88, (byte) 54, (dj) null);
        }
        field_V = null;
    }

    final int r(int param0) {
        if (!this.field_L.field_d) {
            return this.field_u;
        }
        int var2 = -92 % ((param0 - -4) / 53);
        return 1 & this.field_u;
    }

    final int o(int param0) {
        if (param0 != -22625) {
            this.field_W = 1;
        }
        return this.field_jb;
    }

    final void d(int param0, int param1) {
        int statePc = 0;
        String var4_ref_String = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        int var7 = 0;
        mi var8 = null;
        mi var9 = null;
        mi var10 = null;
        mi var11 = null;
        mi var12 = null;
        mi var13 = null;
        mi var14 = null;
        mi var15 = null;
        mi var16 = null;
        mi var17 = null;
        mi var18 = null;
        mi var19 = null;
        mi var20 = null;
        mi var21 = null;
        mi var22 = null;
        mi var23 = null;
        mi var24 = null;
        mi var25 = null;
        mi var26 = null;
        mi var27 = null;
        mi var28 = null;
        mi var29 = null;
        mi var30 = null;
        mi var31 = null;
        mi var32 = null;
        mi var33 = null;
        mi var34 = null;
        mi var35 = null;
        mi var36 = null;
        mi var37 = null;
        mi var38 = null;
        mi var39 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ArcanistsMulti.field_G ? 1 : 0;
                    if (!this.t(57)) {
                        statePc = 12;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if ((this.field_L.field_x[this.field_u] ^ -1) != -5) {
                        statePc = 12;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if ((this.field_L.field_X[this.field_u] ^ -1) >= -1) {
                        statePc = 12;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (0 < 1 + (-1 + this.field_L.field_X[this.field_u]) % 5 + -((this.field_L.field_X[this.field_u] + -1) / 5)) {
                        statePc = 5;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_ib = 20 * ((this.field_L.field_X[this.field_u] - 1) % 5 + 1 - (-1 + this.field_L.field_X[this.field_u]) / 5);
                    this.field_x = 0;
                    var8 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 103, this.field_L, this.field_lb);
                    this.field_L.b(52, var8);
                    this.field_L.a((ml) (this), 0);
                    this.field_lb = this.field_L.field_Ab[this.field_u];
                    this.field_db = this.field_L.field_o[this.field_u];
                    this.field_X = this.field_lb << -1441401276;
                    this.field_R = this.field_db << 1405219364;
                    var9 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 103, this.field_L, this.field_lb);
                    this.field_L.b(52, var9);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (-1 <= ((this.field_L.field_X[this.field_u] - 1) % 5 + (1 - (-1 + this.field_L.field_X[this.field_u]) / 5) ^ -1)) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    this.field_L.field_X[this.field_u] = this.field_L.field_X[this.field_u] + 5;
                    if (var7 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (var7 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.field_z = true;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    return;
                }
                case 12: {
                    if (-28 != (this.field_jb ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (!this.t(109)) {
                        statePc = 26;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (null == this.field_L.field_Ib) {
                        statePc = 22;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    this.field_L.field_Ib.a(0, this.field_T);
                    var4_ref_String = this.field_L.field_Ib.a((byte) 127, param0);
                    this.field_L.field_Ib.a(0, 0, var4_ref_String, this.field_T);
                    var5 = this.field_G;
                    var6 = null;
                    if (var5 < 0) {
                        statePc = 19;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (tc.field_w.length > var5) {
                        statePc = 18;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var6 = tc.field_w[var5];
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (var6 != null) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var6 = "(unknown" + var5 + ")";
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    this.field_L.field_Ib.a(1, 0, (String) (var6), this.field_T);
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (this.field_T == param0) {
                        statePc = 25;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    this.field_L.field_U[param0] = this.field_L.field_U[param0] + 1;
                    if (var7 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    this.field_L.field_U[param0] = this.field_L.field_U[param0] - 1;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (-37 != (this.field_jb ^ -1)) {
                        statePc = 29;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if ((this.field_L.field_H ^ -1) >= (this.field_db ^ -1)) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    this.field_L.field_b[param0] = this.field_L.field_b[param0] + 1;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    this.a((byte) 89, 1);
                    this.field_L.a((ml) (this), 0);
                    if (param1 >= 4) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    return;
                }
                case 31: {
                    var4 = this.field_jb;
                    if (var4 == 40) {
                        statePc = 86;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if ((var4 ^ -1) != -1) {
                        statePc = 35;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (var7 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (-28 == (var4 ^ -1)) {
                        statePc = 87;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (3 == var4) {
                        statePc = 88;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (7 != var4) {
                        statePc = 40;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (var7 == 0) {
                        statePc = 89;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (1 == var4) {
                        statePc = 90;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (var4 == 5) {
                        statePc = 91;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (-3 != (var4 ^ -1)) {
                        statePc = 45;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (var7 == 0) {
                        statePc = 92;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (var4 != 11) {
                        statePc = 48;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (var7 == 0) {
                        statePc = 93;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (-10 == (var4 ^ -1)) {
                        statePc = 94;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if ((var4 ^ -1) == -18) {
                        statePc = 95;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if (var4 == 10) {
                        statePc = 98;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if ((var4 ^ -1) != -7) {
                        statePc = 54;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (var7 == 0) {
                        statePc = 99;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (var4 != 25) {
                        statePc = 57;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (var7 == 0) {
                        statePc = 100;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (-5 == (var4 ^ -1)) {
                        statePc = 101;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if ((var4 ^ -1) == -9) {
                        statePc = 102;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if ((var4 ^ -1) != -14) {
                        statePc = 62;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (var7 == 0) {
                        statePc = 103;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (37 == var4) {
                        statePc = 104;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if (-40 == (var4 ^ -1)) {
                        statePc = 105;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if ((var4 ^ -1) == -16) {
                        statePc = 106;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (var4 != 14) {
                        statePc = 68;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (var7 == 0) {
                        statePc = 107;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (-27 != (var4 ^ -1)) {
                        statePc = 71;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (var7 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (var4 == 12) {
                        statePc = 109;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if ((var4 ^ -1) == -34) {
                        statePc = 111;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (var4 == 31) {
                        statePc = 111;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if ((var4 ^ -1) == -30) {
                        statePc = 112;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if ((var4 ^ -1) != -31) {
                        statePc = 78;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (var7 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (28 != var4) {
                        statePc = 81;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (var7 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (-33 == (var4 ^ -1)) {
                        statePc = 112;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if ((var4 ^ -1) == -35) {
                        statePc = 113;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (var4 != 36) {
                        statePc = 115;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (var7 == 0) {
                        statePc = 114;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    var10 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 101, this.field_L, this.field_lb);
                    this.field_L.b(52, var10);
                    if (var7 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    this.b(-30225, 53);
                    var11 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 101, this.field_L, this.field_lb);
                    this.field_L.b(52, var11);
                    if (var7 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    var12 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 99, this.field_L, this.field_lb);
                    this.field_L.b(52, var12);
                    if (var7 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var13 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 103, this.field_L, this.field_lb);
                    this.field_L.b(52, var13);
                    if (var7 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    var14 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 89, this.field_L, this.field_lb);
                    this.field_L.b(52, var14);
                    if (var7 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    var15 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 94, this.field_L, this.field_lb);
                    this.field_L.b(52, var15);
                    if (var7 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    var16 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 89, this.field_L, this.field_lb);
                    this.field_L.b(52, var16);
                    if (var7 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    var17 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 101, this.field_L, this.field_lb);
                    this.field_L.b(52, var17);
                    if (var7 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    var18 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 108, this.field_L, this.field_lb);
                    this.field_L.b(52, var18);
                    if (var7 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if (this.field_U) {
                        statePc = 97;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    var19 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 108, this.field_L, this.field_lb);
                    this.field_L.b(52, var19);
                    if (var7 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    var20 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 103, this.field_L, this.field_lb);
                    this.field_L.b(52, var20);
                    if (var7 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    var21 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 108, this.field_L, this.field_lb);
                    this.field_L.b(52, var21);
                    if (var7 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    var22 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 103, this.field_L, this.field_lb);
                    this.field_L.b(52, var22);
                    if (var7 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    var23 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 99, this.field_L, this.field_lb);
                    this.field_L.b(52, var23);
                    if (var7 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    var24 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 94, this.field_L, this.field_lb);
                    this.field_L.b(52, var24);
                    if (var7 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    var25 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 103, this.field_L, this.field_lb);
                    this.field_L.b(52, var25);
                    if (var7 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    var26 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 85, this.field_L, this.field_lb);
                    this.field_L.b(52, var26);
                    if (var7 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    var27 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 163, this.field_L, this.field_lb);
                    this.field_L.b(52, var27);
                    if (var7 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    var28 = aj.a(this.field_s, -10 + (-(this.field_Y / 2) + this.field_db), false, 159, this.field_L, -10 + this.field_lb);
                    this.field_L.b(52, var28);
                    var28.field_u = -20;
                    var28.field_F = -20;
                    var29 = aj.a(this.field_s, -(this.field_Y / 2) + this.field_db + -10, false, 159, this.field_L, this.field_lb + 10);
                    this.field_L.b(52, var29);
                    var29.field_u = 20;
                    var29.field_F = -20;
                    var30 = aj.a(this.field_s, this.field_db + -(this.field_Y / 2) + 10, false, 159, this.field_L, this.field_lb + 10);
                    this.field_L.b(52, var30);
                    var30.field_u = 20;
                    var30.field_F = 20;
                    var31 = aj.a(this.field_s, 10 + (this.field_db - this.field_Y / 2), false, 159, this.field_L, -10 + this.field_lb);
                    this.field_L.b(52, var31);
                    var31.field_u = -20;
                    var31.field_F = 20;
                    var32 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 163, this.field_L, this.field_lb);
                    this.field_L.b(52, var32);
                    if (var7 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    var33 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 94, this.field_L, this.field_lb);
                    this.field_L.b(52, var33);
                    if (var7 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    var34 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 99, this.field_L, this.field_lb);
                    this.field_L.b(52, var34);
                    if (var7 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    var35 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 103, this.field_L, this.field_lb);
                    this.field_L.b(52, var35);
                    if (var7 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    this.field_L.a(this.field_db + -256, -60, this.field_lb + -128, go.field_j[29].b());
                    if (var7 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    var36 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 154, this.field_L, this.field_lb);
                    this.field_L.b(52, var36);
                    if (var7 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    var37 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 130, this.field_L, this.field_lb);
                    this.field_L.b(52, var37);
                    if (var7 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    var38 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 146, this.field_L, this.field_lb);
                    this.field_L.b(52, var38);
                    var38.field_y = 250;
                    if (var7 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    var39 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 128, this.field_L, this.field_lb);
                    this.field_L.b(52, var39);
                    statePc = 115;
                    continue stateLoop;
                }
                case 115: {
                    this.a(true);
                    this.a((byte) 88);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(byte param0, int param1, int param2) {
        if (param0 > -35) {
            this.field_n = -119;
        }
        if (!(null == this.field_L.field_rb)) {
            if (!(null == this.field_L.field_rb[param2])) {
                ii.a(param1, false, this.field_L.field_rb[param2], 100 * tm.field_a[param2] / param1);
            }
        }
    }

    final boolean x(int param0) {
        int stackIn_7_0 = 0;
        L0: {
          if (param0 == 32) {
            break L0;
          } else {
            this.field_W = 61;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.f((byte) -107)) {
              break L2;
            } else {
              if (this.field_jb != 32) {
                stackIn_7_0 = 0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackIn_7_0 = 1;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    private final void h(int param0) {
        int var3;
        int var4;
        mi var5;
        mi var6;
        mi var7;
        mi var8;
        mi var9;
        mi var10;
        mi var11;
        mi var12;
        mi var13;
        mi var14;
        mi var15;
        mi var16;
        mi var17;
        mi var18;
        mi var19;
        mi var20;
        mi var21;
        mi var22;
        mi var23;
        mi var24;
        mi var25;
        mi var26;
        mi var27;
        mi var28;
        mi var29;
        mi var30;
        mi var31;
        mi var32;
        mi var33;
        mi var34;
        mi var35;
        mi var36;
        mi var37;
        mi var38;
        mi var39;
        mi var40;
        mi var41;
        mi var42;
        mi var43;
        mi var44;
        mi var45;
        mi var46;
        mi var47;
        mi var48;
        mi var49;
        mi var50;
        mi var51;
        mi var52;
        mi var53;
        mi var54;
        mi var55;
        L0: {
          L1: {
            L2: {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      L7: {
                        L8: {
                          L9: {
                            L10: {
                              L11: {
                                L12: {
                                  L13: {
                                    L14: {
                                      L15: {
                                        L16: {
                                          L17: {
                                            L18: {
                                              L19: {
                                                L20: {
                                                  L21: {
                                                    L22: {
                                                      L23: {
                                                        L24: {
                                                          L25: {
                                                            L26: {
                                                              L27: {
                                                                var4 = ArcanistsMulti.field_G ? 1 : 0;
                                                                var3 = this.field_jb;
                                                                if ((var3 ^ -1) != -1) {
                                                                  break L27;
                                                                } else {
                                                                  if (var4 == 0) {
                                                                    break L26;
                                                                  } else {
                                                                    break L27;
                                                                  }
                                                                }
                                                              }
                                                              L28: {
                                                                if (27 != var3) {
                                                                  break L28;
                                                                } else {
                                                                  if (var4 == 0) {
                                                                    break L26;
                                                                  } else {
                                                                    break L28;
                                                                  }
                                                                }
                                                              }
                                                              L29: {
                                                                if (3 != var3) {
                                                                  break L29;
                                                                } else {
                                                                  if (var4 == 0) {
                                                                    break L25;
                                                                  } else {
                                                                    break L29;
                                                                  }
                                                                }
                                                              }
                                                              L30: {
                                                                if (7 != var3) {
                                                                  break L30;
                                                                } else {
                                                                  if (var4 == 0) {
                                                                    break L24;
                                                                  } else {
                                                                    break L30;
                                                                  }
                                                                }
                                                              }
                                                              if (1 == var3) {
                                                                break L23;
                                                              } else {
                                                                L31: {
                                                                  if ((var3 ^ -1) != -6) {
                                                                    break L31;
                                                                  } else {
                                                                    if (var4 == 0) {
                                                                      break L22;
                                                                    } else {
                                                                      break L31;
                                                                    }
                                                                  }
                                                                }
                                                                L32: {
                                                                  if (2 != var3) {
                                                                    break L32;
                                                                  } else {
                                                                    if (var4 == 0) {
                                                                      break L21;
                                                                    } else {
                                                                      break L32;
                                                                    }
                                                                  }
                                                                }
                                                                L33: {
                                                                  if (var3 != 11) {
                                                                    break L33;
                                                                  } else {
                                                                    if (var4 == 0) {
                                                                      break L20;
                                                                    } else {
                                                                      break L33;
                                                                    }
                                                                  }
                                                                }
                                                                if (-10 == (var3 ^ -1)) {
                                                                  break L19;
                                                                } else {
                                                                  L34: {
                                                                    if ((var3 ^ -1) != -18) {
                                                                      break L34;
                                                                    } else {
                                                                      if (var4 == 0) {
                                                                        break L18;
                                                                      } else {
                                                                        break L34;
                                                                      }
                                                                    }
                                                                  }
                                                                  if (var3 == 10) {
                                                                    break L17;
                                                                  } else {
                                                                    L35: {
                                                                      if (var3 != 6) {
                                                                        break L35;
                                                                      } else {
                                                                        if (var4 == 0) {
                                                                          break L16;
                                                                        } else {
                                                                          break L35;
                                                                        }
                                                                      }
                                                                    }
                                                                    if (var3 == 25) {
                                                                      break L15;
                                                                    } else {
                                                                      if (var3 == 4) {
                                                                        break L14;
                                                                      } else {
                                                                        if ((var3 ^ -1) == -9) {
                                                                          break L13;
                                                                        } else {
                                                                          if (-38 == (var3 ^ -1)) {
                                                                            break L12;
                                                                          } else {
                                                                            L36: {
                                                                              if (39 != var3) {
                                                                                break L36;
                                                                              } else {
                                                                                if (var4 == 0) {
                                                                                  break L11;
                                                                                } else {
                                                                                  break L36;
                                                                                }
                                                                              }
                                                                            }
                                                                            if (13 == var3) {
                                                                              break L10;
                                                                            } else {
                                                                              L37: {
                                                                                if ((var3 ^ -1) != -16) {
                                                                                  break L37;
                                                                                } else {
                                                                                  if (var4 == 0) {
                                                                                    break L9;
                                                                                  } else {
                                                                                    break L37;
                                                                                  }
                                                                                }
                                                                              }
                                                                              if (14 == var3) {
                                                                                break L8;
                                                                              } else {
                                                                                if (26 == var3) {
                                                                                  break L7;
                                                                                } else {
                                                                                  if (12 == var3) {
                                                                                    break L6;
                                                                                  } else {
                                                                                    L38: {
                                                                                      if (28 != var3) {
                                                                                        break L38;
                                                                                      } else {
                                                                                        if (var4 == 0) {
                                                                                          break L5;
                                                                                        } else {
                                                                                          break L38;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    if (32 == var3) {
                                                                                      break L4;
                                                                                    } else {
                                                                                      L39: {
                                                                                        if ((var3 ^ -1) != -34) {
                                                                                          break L39;
                                                                                        } else {
                                                                                          if (var4 == 0) {
                                                                                            break L3;
                                                                                          } else {
                                                                                            break L39;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      L40: {
                                                                                        if (var3 != 31) {
                                                                                          break L40;
                                                                                        } else {
                                                                                          if (var4 == 0) {
                                                                                            break L2;
                                                                                          } else {
                                                                                            break L40;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      if (var3 != 34) {
                                                                                        break L0;
                                                                                      } else {
                                                                                        if (var4 == 0) {
                                                                                          break L1;
                                                                                        } else {
                                                                                          break L26;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            var5 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 101, this.field_L, this.field_lb);
                                                            this.field_L.b(52, var5);
                                                            if (var4 == 0) {
                                                              break L0;
                                                            } else {
                                                              break L25;
                                                            }
                                                          }
                                                          var6 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 99, this.field_L, this.field_lb);
                                                          this.field_L.b(52, var6);
                                                          if (var4 == 0) {
                                                            break L0;
                                                          } else {
                                                            break L24;
                                                          }
                                                        }
                                                        var7 = aj.a((ml) null, this.field_db - this.field_Y, false, 103, this.field_L, this.field_lb);
                                                        this.field_L.b(52, var7);
                                                        var8 = aj.a((ml) null, this.field_db, false, 103, this.field_L, this.field_lb + -(this.field_Y / 2));
                                                        this.field_L.b(52, var8);
                                                        var9 = aj.a((ml) null, this.field_db, false, 103, this.field_L, this.field_lb - -(this.field_Y / 2));
                                                        this.field_L.b(52, var9);
                                                        if (var4 == 0) {
                                                          break L0;
                                                        } else {
                                                          break L23;
                                                        }
                                                      }
                                                      var10 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 89, this.field_L, this.field_lb);
                                                      this.field_L.b(52, var10);
                                                      if (var4 == 0) {
                                                        break L0;
                                                      } else {
                                                        break L22;
                                                      }
                                                    }
                                                    var11 = aj.a((ml) null, this.field_db - this.field_Y, false, 94, this.field_L, this.field_lb);
                                                    this.field_L.b(52, var11);
                                                    var12 = aj.a((ml) null, this.field_db, false, 94, this.field_L, this.field_lb + -(this.field_Y / 2));
                                                    this.field_L.b(52, var12);
                                                    var13 = aj.a((ml) null, this.field_db, false, 94, this.field_L, this.field_Y / 2 + this.field_lb);
                                                    this.field_L.b(52, var13);
                                                    if (var4 == 0) {
                                                      break L0;
                                                    } else {
                                                      break L21;
                                                    }
                                                  }
                                                  var14 = aj.a((ml) null, this.field_db - this.field_Y, false, 89, this.field_L, this.field_lb);
                                                  this.field_L.b(52, var14);
                                                  var15 = aj.a((ml) null, this.field_db, false, 89, this.field_L, -(this.field_Y / 2) + this.field_lb);
                                                  this.field_L.b(52, var15);
                                                  var16 = aj.a((ml) null, this.field_db, false, 89, this.field_L, this.field_lb - -(this.field_Y / 2));
                                                  this.field_L.b(52, var16);
                                                  if (var4 == 0) {
                                                    break L0;
                                                  } else {
                                                    break L20;
                                                  }
                                                }
                                                var17 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 101, this.field_L, this.field_lb);
                                                this.field_L.b(52, var17);
                                                if (var4 == 0) {
                                                  break L0;
                                                } else {
                                                  break L19;
                                                }
                                              }
                                              var18 = aj.a((ml) null, this.field_db - this.field_Y, false, 108, this.field_L, this.field_lb);
                                              this.field_L.b(52, var18);
                                              var19 = aj.a((ml) null, this.field_db, false, 108, this.field_L, -(this.field_Y / 2) + this.field_lb);
                                              this.field_L.b(52, var19);
                                              var20 = aj.a((ml) null, this.field_db, false, 108, this.field_L, this.field_lb - -(this.field_Y / 2));
                                              this.field_L.b(52, var20);
                                              if (var4 == 0) {
                                                break L0;
                                              } else {
                                                break L18;
                                              }
                                            }
                                            var21 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 108, this.field_L, this.field_lb);
                                            this.field_L.b(52, var21);
                                            if (var4 == 0) {
                                              break L0;
                                            } else {
                                              break L17;
                                            }
                                          }
                                          var22 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 108, this.field_L, this.field_lb);
                                          this.field_L.b(52, var22);
                                          if (var4 == 0) {
                                            break L0;
                                          } else {
                                            break L16;
                                          }
                                        }
                                        var23 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 103, this.field_L, this.field_lb);
                                        this.field_L.b(52, var23);
                                        if (var4 == 0) {
                                          break L0;
                                        } else {
                                          break L15;
                                        }
                                      }
                                      var24 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 99, this.field_L, this.field_lb);
                                      this.field_L.b(52, var24);
                                      if (var4 == 0) {
                                        break L0;
                                      } else {
                                        break L14;
                                      }
                                    }
                                    var25 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 94, this.field_L, this.field_lb);
                                    this.field_L.b(52, var25);
                                    if (var4 == 0) {
                                      break L0;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  var26 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 103, this.field_L, this.field_lb);
                                  this.field_L.b(52, var26);
                                  if (var4 == 0) {
                                    break L0;
                                  } else {
                                    break L12;
                                  }
                                }
                                var27 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 163, this.field_L, this.field_lb);
                                this.field_L.b(52, var27);
                                if (var4 == 0) {
                                  break L0;
                                } else {
                                  break L11;
                                }
                              }
                              var28 = aj.a((ml) null, -this.field_Y + this.field_db, false, 163, this.field_L, this.field_lb);
                              this.field_L.b(52, var28);
                              var29 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 163, this.field_L, this.field_lb + -(this.field_Y / 2));
                              this.field_L.b(52, var29);
                              var30 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 163, this.field_L, this.field_lb + this.field_Y / 2);
                              this.field_L.b(52, var30);
                              var31 = aj.a((ml) null, this.field_db, false, 163, this.field_L, this.field_lb);
                              this.field_L.b(52, var31);
                              if (var4 == 0) {
                                break L0;
                              } else {
                                break L10;
                              }
                            }
                            var32 = aj.a((ml) null, this.field_db - this.field_Y, false, 85, this.field_L, this.field_lb);
                            this.field_L.b(52, var32);
                            var33 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 85, this.field_L, -(this.field_Y / 2) + this.field_lb);
                            this.field_L.b(52, var33);
                            var34 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 85, this.field_L, this.field_Y / 2 + this.field_lb);
                            this.field_L.b(52, var34);
                            var35 = aj.a((ml) null, this.field_db, false, 85, this.field_L, this.field_lb);
                            this.field_L.b(52, var35);
                            if (var4 == 0) {
                              break L0;
                            } else {
                              break L9;
                            }
                          }
                          var36 = aj.a((ml) null, this.field_db - this.field_Y, false, 94, this.field_L, this.field_lb);
                          this.field_L.b(52, var36);
                          var37 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 94, this.field_L, this.field_lb + -(this.field_Y / 2));
                          this.field_L.b(52, var37);
                          var38 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 94, this.field_L, this.field_Y / 2 + this.field_lb);
                          this.field_L.b(52, var38);
                          var39 = aj.a((ml) null, this.field_db, false, 94, this.field_L, this.field_lb);
                          this.field_L.b(52, var39);
                          if (var4 == 0) {
                            break L0;
                          } else {
                            break L8;
                          }
                        }
                        var40 = aj.a((ml) null, this.field_db + -this.field_Y, false, 99, this.field_L, this.field_lb);
                        this.field_L.b(52, var40);
                        var41 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 99, this.field_L, this.field_lb + -(this.field_Y / 2));
                        this.field_L.b(52, var41);
                        var42 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 99, this.field_L, this.field_lb + this.field_Y / 2);
                        this.field_L.b(52, var42);
                        var43 = aj.a((ml) null, this.field_db, false, 99, this.field_L, this.field_lb);
                        this.field_L.b(52, var43);
                        if (var4 == 0) {
                          break L0;
                        } else {
                          break L7;
                        }
                      }
                      var44 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 103, this.field_L, this.field_lb);
                      this.field_L.b(52, var44);
                      if (var4 == 0) {
                        break L0;
                      } else {
                        break L6;
                      }
                    }
                    var45 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 108, this.field_L, this.field_lb);
                    this.field_L.b(52, var45);
                    if (var4 == 0) {
                      break L0;
                    } else {
                      break L5;
                    }
                  }
                  var46 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 130, this.field_L, this.field_lb);
                  this.field_L.b(52, var46);
                  if (var4 == 0) {
                    break L0;
                  } else {
                    break L4;
                  }
                }
                var47 = aj.a((ml) null, -this.field_Y + this.field_db, false, 130, this.field_L, this.field_lb);
                this.field_L.b(52, var47);
                var48 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 130, this.field_L, this.field_lb + -(this.field_Y / 2));
                this.field_L.b(52, var48);
                var49 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 130, this.field_L, this.field_lb - -(this.field_Y / 2));
                this.field_L.b(52, var49);
                var50 = aj.a((ml) null, this.field_db, false, 130, this.field_L, this.field_lb);
                this.field_L.b(52, var50);
                if (var4 == 0) {
                  break L0;
                } else {
                  break L3;
                }
              }
              var51 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 128, this.field_L, this.field_lb);
              this.field_L.b(52, var51);
              if (var4 == 0) {
                break L0;
              } else {
                break L2;
              }
            }
            var52 = aj.a((ml) null, this.field_db - this.field_Y, false, 154, this.field_L, this.field_lb);
            this.field_L.b(52, var52);
            var53 = aj.a((ml) null, this.field_db, false, 154, this.field_L, -(this.field_Y / 2) + this.field_lb);
            this.field_L.b(52, var53);
            var54 = aj.a((ml) null, this.field_db, false, 154, this.field_L, this.field_Y / 2 + this.field_lb);
            this.field_L.b(52, var54);
            if (var4 == 0) {
              break L0;
            } else {
              break L1;
            }
          }
          var55 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 131, this.field_L, this.field_lb);
          this.field_L.b(52, var55);
          break L0;
        }
        var3 = -106 / ((param0 - -5) / 36);
    }

    final void b(int param0, int param1, int param2) {
        if (!(param1 != 0)) {
            return;
        }
        if (param1 > 0) {
            if (!(param1 <= this.field_W)) {
                this.field_W = param1;
                this.field_G = param2;
            }
        }
        int var4 = 79 % ((53 - param0) / 56);
        if (this.field_jb == 32 || (this.field_jb ^ -1) == -28) {
            param1 = (param1 + -1) / 2 + 1;
        }
        this.field_x = this.field_x + param1;
    }

    private final void b(int param0, int param1) {
        if (param0 != -30225) {
            return;
        }
        if (!(this.field_L.field_rb == null)) {
            if (!(null == this.field_L.field_rb[param1])) {
                ti.a((byte) -30, tm.field_a[param1], this.field_L.field_rb[param1]);
            }
        }
    }

    private final void h(byte param0) {
        ml stackIn_23_0 = null;
        Object stackIn_28_0 = null;
        boolean stackIn_65_0 = false;
        boolean stackIn_66_0 = false;
        int stackIn_66_1 = 0;
        Object stackIn_117_0 = null;
        Object stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        ml stackOut_22_0;
        int var2;
        int var3;
        int var4;
        int var5;
        ml var6_ref_ml;
        int var6;
        int var7;
        int var8;
        int var9_int;
        ml var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        mi var15;
        int var16;
        L0: {
          L1: {
            var16 = ArcanistsMulti.field_G ? 1 : 0;
            var2 = this.x(32) ? 1 : 0;
            var3 = this.s(-1) ? 1 : 0;
            var4 = 0;
            var5 = 0;
            if (-29 == (this.field_jb ^ -1)) {
              break L1;
            } else {
              if (-30 == (this.field_jb ^ -1)) {
                break L1;
              } else {
                if (-31 == (this.field_jb ^ -1)) {
                  break L1;
                } else {
                  if (32 == this.field_jb) {
                    break L1;
                  } else {
                    if (7 != this.field_L.field_x[this.field_u]) {
                      break L0;
                    } else {
                      if ((this.field_L.field_X[this.field_u] ^ -1) < -1) {
                        break L1;
                      } else {
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          }
          if (this.field_lb < 0) {
            break L0;
          } else {
            if ((this.field_lb ^ -1) >= (this.field_L.field_y ^ -1)) {
              var5 = 1;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L2: {
          L3: {
            if (this.field_q > 0) {
              break L3;
            } else {
              L4: {
                if (-1 == (this.field_jb ^ -1)) {
                  break L4;
                } else {
                  if (18 == this.field_jb) {
                    break L4;
                  } else {
                    if ((this.field_jb ^ -1) == -20) {
                      break L4;
                    } else {
                      if (this.field_jb == 9) {
                        break L4;
                      } else {
                        if (16 == this.field_jb) {
                          break L4;
                        } else {
                          if ((this.field_jb ^ -1) == -8) {
                            break L4;
                          } else {
                            if (-38 != (this.field_jb ^ -1)) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              pi.field_b.a((byte) 113, this.field_L.field_i);
              var6_ref_ml = (ml) ((Object) pi.field_b.b(-51));
              L5: while (true) {
                if (var6_ref_ml == null) {
                  break L3;
                } else {
                  stackOut_22_0 = var6_ref_ml.field_s;
                  stackIn_28_0 = stackOut_22_0;
                  stackIn_23_0 = stackOut_22_0;
                  if (var16 != 0) {
                    break L2;
                  } else {
                    L6: {
                      if (stackIn_23_0 != this) {
                        break L6;
                      } else {
                        if (!var6_ref_ml.x(32)) {
                          break L6;
                        } else {
                          var4 = 1;
                          this.field_L.a(var6_ref_ml, 0);
                          break L6;
                        }
                      }
                    }
                    var6_ref_ml = (ml) ((Object) pi.field_b.d(-18502));
                    if (var16 == 0) {
                      continue L5;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
          }
          stackIn_28_0 = this;
          break L2;
        }
        ((ml) (this)).field_hb = true;
        if (param0 == -120) {
          L7: {
            var6 = this.field_X;
            if ((this.field_P ^ -1) >= -1) {
              this.field_X = this.field_X + this.field_kb;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            L9: {
              var7 = this.field_R;
              this.field_R = this.field_R + this.field_eb;
              if (var3 == 0) {
                break L9;
              } else {
                L10: {
                  this.field_F = this.field_F + 0.4;
                  if (this.field_F > 6.28) {
                    this.field_F = this.field_F - 6.28;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  this.field_kb = this.field_kb * 15 >> -1656332892;
                  this.field_eb = this.field_eb * 15 >> -580871356;
                  if (0 < this.field_kb) {
                    this.field_kb = this.field_kb - 1;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (0 >= this.field_eb) {
                    break L12;
                  } else {
                    this.field_eb = this.field_eb - 1;
                    break L12;
                  }
                }
                L13: {
                  if (-1 >= (this.field_kb ^ -1)) {
                    break L13;
                  } else {
                    this.field_kb = this.field_kb + 1;
                    break L13;
                  }
                }
                L14: {
                  if (-1 >= (this.field_eb ^ -1)) {
                    break L14;
                  } else {
                    this.field_eb = this.field_eb + 1;
                    break L14;
                  }
                }
                L15: {
                  if (0 != Math.abs(this.field_kb)) {
                    break L15;
                  } else {
                    if (-1 != (Math.abs(this.field_eb) ^ -1)) {
                      break L15;
                    } else {
                      this.field_kb = 0;
                      this.field_eb = 0;
                      this.field_z = false;
                      break L15;
                    }
                  }
                }
                L16: {
                  if (this.field_Y << 977062148 <= this.field_R) {
                    break L16;
                  } else {
                    this.field_L.field_G = 25;
                    this.field_R = this.field_Y << 588371396;
                    break L16;
                  }
                }
                L17: {
                  if ((this.field_X ^ -1) > (this.field_Y << -866983357 ^ -1)) {
                    this.field_L.field_G = 25;
                    this.field_X = this.field_Y << 557760323;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                if ((this.field_L.field_y - (this.field_Y >> 507640129) << 607008356 ^ -1) > (this.field_X ^ -1)) {
                  this.field_X = -(this.field_Y >> -1466448863) + this.field_L.field_y << 1069606372;
                  this.field_L.field_G = 25;
                  if (var16 == 0) {
                    break L8;
                  } else {
                    break L9;
                  }
                } else {
                  break L8;
                }
              }
            }
            this.field_eb = this.field_eb + 4;
            break L8;
          }
          L18: {
            if (var2 == 0) {
              break L18;
            } else {
              if (this.field_s.field_q <= 0) {
                this.field_L.a(this.field_s, 0);
                var8 = -this.field_lb + this.field_s.field_lb;
                var9_int = this.field_s.field_db - this.field_db - (-(this.field_Y / 2) - -(this.field_s.field_Y / 2));
                if (var9_int * var9_int + var8 * var8 >= (this.field_s.field_Y + this.field_Y) * (this.field_s.field_Y + this.field_Y) >> -399988894) {
                  break L18;
                } else {
                  L19: {
                    if ((this.field_s.field_x ^ -1) >= -1) {
                      break L19;
                    } else {
                      L20: {
                        stackIn_65_0 = this.field_s.field_U;

                        if (this.field_U) {
                          stackIn_66_0 = stackIn_65_0;
                          stackIn_66_1 = 0;
                          break L20;
                        } else {
                          stackIn_66_0 = stackIn_65_0;
                          stackIn_66_1 = 1;
                          break L20;
                        }
                      }
                      if ((stackIn_66_0 ? 1 : 0) == stackIn_66_1) {
                        break L19;
                      } else {
                        L21: {
                          var10 = this.field_s.field_x;
                          if ((this.field_ib + -this.field_x ^ -1) <= (var10 ^ -1)) {
                            break L21;
                          } else {
                            var10 = this.field_ib - this.field_x;
                            break L21;
                          }
                        }
                        L22: {
                          if (var10 < 0) {
                            var10 = 0;
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                        if (0 < var10) {
                          this.field_L.field_cb[this.field_s.field_u] = this.field_L.field_cb[this.field_s.field_u] + var10;
                          this.field_x = this.field_x + var10;
                          this.field_s.field_x = this.field_s.field_x - var10;
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                    }
                  }
                  L23: {
                    if (!this.field_s.field_z) {
                      break L23;
                    } else {
                      if ((this.field_s.field_eb ^ -1) > -1) {
                        break L18;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L24: {
                    this.field_s.field_R = this.field_R + -(this.field_Y << -1597748957);
                    this.field_s.field_X = this.field_X + -(this.field_E * (this.field_Y << 755019297));
                    if (-33 > (this.field_s.field_Y ^ -1)) {
                      this.field_s.field_R = this.field_s.field_R + 192;
                      this.field_s.field_X = this.field_s.field_X + 0 * this.field_E;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if ((this.field_jb ^ -1) != -33) {
                      break L25;
                    } else {
                      this.field_s.field_X = this.field_s.field_X + 448 * this.field_E;
                      this.field_s.field_R = this.field_s.field_R - 480;
                      break L25;
                    }
                  }
                  this.field_lb = this.field_X >> 91900420;
                  this.field_db = this.field_R >> 595052516;
                  this.field_s.field_db = this.field_s.field_R >> 9382084;
                  this.field_s.field_E = this.field_E;
                  this.field_s.field_lb = this.field_s.field_X >> 1650459556;
                  break L18;
                }
              } else {
                break L18;
              }
            }
          }
          L26: {
            this.field_lb = this.field_X >> -1221777500;
            this.field_db = this.field_R >> -10866364;
            if ((this.field_P ^ -1) >= -1) {
              break L26;
            } else {
              this.field_P = this.field_P - 1;
              break L26;
            }
          }
          L27: {
            L28: {
              L29: {
                if ((this.field_P ^ -1) < -1) {
                  break L29;
                } else {
                  if (this.field_L.b(this.field_db - this.field_Y, 2, -(this.field_Y >> 2084430369) + this.field_lb, this.field_w)) {
                    break L28;
                  } else {
                    break L29;
                  }
                }
              }
              this.field_A = 0;
              if (var16 == 0) {
                break L27;
              } else {
                break L28;
              }
            }
            L30: {
              var10 = this.field_kb;
              var11 = this.field_eb;
              var9_int = this.field_db + -ce.field_k + (this.field_Y >> 1633650273);
              var8 = this.field_lb + -di.field_m;
              var12 = am.a(var9_int, var8, false);
              if ((var12 ^ -1) > -2) {
                var8 = 0;
                var9_int = -1;
                var12 = 1;
                break L30;
              } else {
                break L30;
              }
            }
            L31: {
              var13 = (var8 * (this.field_kb << -2060251416) - -((this.field_eb << -2021083160) * var9_int)) / var12;
              this.field_X = var6;
              var14 = (-((this.field_eb << -376027896) * var8) + (this.field_kb << -247100024) * var9_int) / var12;
              if (this.field_P > 0) {
                break L31;
              } else {
                this.field_R = var7;
                break L31;
              }
            }
            L32: {
              L33: {
                L34: {
                  this.field_db = this.field_R >> 944466084;
                  this.field_lb = this.field_X >> 1911184516;
                  if (32768 < var13) {
                    break L34;
                  } else {
                    if ((this.field_eb ^ -1) > -1) {
                      break L34;
                    } else {
                      if ((Math.abs(var14) ^ -1) >= -8193) {
                        break L33;
                      } else {
                        break L34;
                      }
                    }
                  }
                }
                L35: {
                  var13 = -(var13 >> -1971030206);
                  var14 = var14 >> 1624992738;
                  if (var3 == 0) {
                    break L35;
                  } else {
                    var14 = 0;
                    var13 = var13 << -1818665535;
                    break L35;
                  }
                }
                this.field_eb = (-(var8 * var14) + var13 * var9_int) / var12 >> 847282088;
                this.field_kb = (var14 * var9_int + var13 * var8) / var12 >> -1324582456;
                if (var16 == 0) {
                  break L32;
                } else {
                  break L33;
                }
              }
              var13 = 0;
              var14 = 0;
              this.b(-30225, 51);
              this.field_eb = 0;
              this.field_kb = 0;
              break L32;
            }
            L36: {
              this.field_A = this.field_A + 1;
              if (5 < this.field_A) {
                this.field_eb = 0;
                this.field_z = false;
                this.field_A = 0;
                this.field_kb = 0;
                break L36;
              } else {
                break L36;
              }
            }
            L37: {
              if (Math.abs(var14 >> -792557112) >= 16) {
                break L37;
              } else {
                if (Math.abs(var13 >> -905626744) >= 16) {
                  break L37;
                } else {
                  this.field_A = 0;
                  this.field_z = false;
                  break L37;
                }
              }
            }
            if (0 <= this.field_db - this.field_Y) {
              break L27;
            } else {
              if (-13 == (this.field_jb ^ -1)) {
                break L27;
              } else {
                if (this.g((byte) 109)) {
                  break L27;
                } else {
                  L38: {
                    this.field_kb = 2 * var10;
                    if (4 <= (this.field_kb ^ -1)) {
                      break L38;
                    } else {
                      if (-6 >= (this.field_kb ^ -1)) {
                        break L38;
                      } else {
                        L39: {
                          stackIn_117_0 = this;

                          if (-1 < (this.field_kb ^ -1)) {
                            stackIn_118_0 = this;
                            stackIn_118_1 = -5;
                            break L39;
                          } else {
                            stackIn_118_0 = this;
                            stackIn_118_1 = 5;
                            break L39;
                          }
                        }
                        ((ml) (this)).field_kb = stackIn_118_1;
                        break L38;
                      }
                    }
                  }
                  L40: {
                    this.field_eb = -5 + -Math.abs(var11);
                    var15 = aj.a((ml) null, this.field_db, false, 101, this.field_L, this.field_lb);
                    this.field_L.b(52, var15);
                    this.field_L.a(this.field_lb, this.field_Y * 2, (byte) 51, -(this.field_Y / 2) + this.field_db);
                    this.field_z = true;
                    if (this.field_x < this.field_ib) {
                      this.field_x = this.field_x + 15;
                      break L40;
                    } else {
                      break L40;
                    }
                  }
                  this.field_L.field_G = 25;
                  break L27;
                }
              }
            }
          }
          L41: {
            this.field_M = 0;
            if ((-16 + this.field_L.field_H ^ -1) < (this.field_db ^ -1)) {
              break L41;
            } else {
              if (var5 == 0) {
                break L41;
              } else {
                this.field_db = -16 + this.field_L.field_H;
                this.field_A = 0;
                this.field_R = this.field_db << -1358141692;
                this.field_z = false;
                break L41;
              }
            }
          }
          L42: {
            var8 = -this.field_eb;
            if (this.field_Y >> 1575916801 < var8) {
              var8 = this.field_Y >> -847457759;
              break L42;
            } else {
              break L42;
            }
          }
          L43: {
            if ((-(this.field_Y >> 1492758753) ^ -1) >= (var8 ^ -1)) {
              break L43;
            } else {
              var8 = -(this.field_Y >> -254484223);
              break L43;
            }
          }
          L44: {
            this.field_O = -(var8 >> 981446754);
            this.field_o = var8 >> -519481374;
            this.field_N = -(var8 >> 1755592482);
            this.field_Z = var8 >> 1383209730;
            if (var2 == 0) {
              break L44;
            } else {
              if (0 >= this.field_s.field_ib) {
                break L44;
              } else {
                this.field_L.a(-41, this.field_s);
                break L44;
              }
            }
          }
          L45: {
            L46: {
              if (var4 == 0) {
                break L46;
              } else {
                pi.field_b.a((byte) 87, this.field_L.field_i);
                var9 = (ml) ((Object) pi.field_b.b(-109));
                L47: while (true) {
                  if (var9 == null) {
                    break L46;
                  } else {
                    if (var16 != 0) {
                      break L45;
                    } else {
                      L48: {
                        if (this != var9.field_s) {
                          break L48;
                        } else {
                          if (var9.x(32)) {
                            if ((var9.field_ib ^ -1) < -1) {
                              this.field_L.a(-45, var9);
                              break L48;
                            } else {
                              break L48;
                            }
                          } else {
                            break L48;
                          }
                        }
                      }
                      var9 = (ml) ((Object) pi.field_b.d(param0 ^ 18482));
                      if (var16 == 0) {
                        continue L47;
                      } else {
                        break L46;
                      }
                    }
                  }
                }
              }
            }
            break L45;
          }
          return;
        } else {
          return;
        }
    }

    final ml a(nf param0, byte param1) {
        ml stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        ml var4 = null;
        try {
          L0: {
            var4 = new ml(param0);
            var4.field_T = this.field_T;
            var4.field_U = this.field_U;
            var4.field_u = this.field_u;
            var4.field_jb = this.field_jb;
            var4.a(12, true);
            if ((this.field_x ^ -1) == -1) {
              var4.field_q = this.field_q;
              var4.field_X = this.field_X;
              var4.field_R = this.field_R;
              var4.field_db = this.field_db;
              var4.field_lb = this.field_lb;
              var4.field_p = this.field_p;
              var4.field_ib = this.field_ib;
              var4.field_D = this.field_D;
              if (this.field_z) {
                throw new IllegalStateException();
              } else {
                if (0 != this.field_M) {
                  throw new IllegalStateException();
                } else {
                  L1: {
                    var4.field_O = this.field_O;
                    var4.field_N = this.field_N;
                    var4.field_t = this.field_t;
                    var4.field_E = this.field_E;
                    var4.field_o = this.field_o;
                    var4.field_P = this.field_P;
                    var4.field_y = this.field_y;
                    if (param1 == 59) {
                      break L1;
                    } else {
                      this.b(-34, 73);
                      break L1;
                    }
                  }
                  var4.field_n = this.field_n;
                  var4.field_F = this.field_F;
                  var4.field_r = this.field_r;
                  var4.field_A = this.field_A;
                  var4.field_Z = this.field_Z;
                  stackIn_11_0 = (ml) (var4);
                  break L0;
                }
              }
            } else {
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("ml.G(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_11_0;
    }

    final int y(int param0) {
        if (param0 != 17571) {
            this.field_D = true;
        }
        return this.field_T;
    }

    final int f(int param0) {
        int var2 = 95 / ((param0 - -11) / 35);
        return this.field_lb;
    }

    final boolean c(boolean param0) {
        if (param0) {
            this.field_y = -31;
        }
        return this.field_D;
    }

    private final void n(int param0) {
        int stackIn_29_0 = 0;
        boolean stackIn_56_0 = false;
        boolean stackIn_62_0 = false;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = ArcanistsMulti.field_G ? 1 : 0;
                    var2 = this.g((byte) 117) ? 1 : 0;
                    var3 = this.d(-10265) ? 1 : 0;
                    var4 = this.x(32) ? 1 : 0;
                    var5 = 0;
                    if (this.field_jb == 28) {
                        statePc = 7;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (29 == this.field_jb) {
                        statePc = 7;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if ((this.field_jb ^ -1) == -31) {
                        statePc = 7;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (-33 == (this.field_jb ^ -1)) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (-8 != (this.field_L.field_x[this.field_u] ^ -1)) {
                        statePc = 10;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if ((this.field_L.field_X[this.field_u] ^ -1) < -1) {
                        statePc = 7;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (0 > this.field_lb) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (this.field_lb > this.field_L.field_y) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var5 = 1;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var3 != 0) {
                        statePc = 16;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (this.field_L.a(61, this.field_w, -this.field_Y + this.field_db - -1, -(this.field_Y >> 856517889) + this.field_lb, this.field_db - this.field_Y)) {
                        statePc = 16;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var5 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (this.field_db >= -16 + this.field_L.field_H) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    this.field_P = 0;
                    this.field_eb = 0;
                    this.field_kb = 0;
                    this.field_z = true;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if ((-16 + this.field_L.field_H ^ -1) < (this.field_db ^ -1)) {
                        statePc = 20;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var5 != 0) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    this.field_db = -16 + this.field_L.field_H;
                    this.field_A = 0;
                    this.field_R = this.field_db << 515846852;
                    this.field_z = false;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (this.e(true)) {
                        statePc = 22;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 22: {
                    return;
                }
                case 23: {
                    if (this.field_z) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 25: {
                    this.field_M = 0;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if ((this.field_M ^ -1) != -1) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackIn_29_0 = 1;
                    statePc = 29;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_29_0 = 0;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    var6 = stackIn_29_0;
                    if (-1 == (this.field_M ^ -1)) {
                        statePc = 31;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if ((this.field_jb ^ -1) == -41) {
                        statePc = 38;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if ((this.field_ab ^ -1) != -4) {
                        statePc = 36;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if ((this.field_jb ^ -1) != -1) {
                        statePc = 36;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    this.field_F = this.field_F * 0.9;
                    if (var11 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    this.field_F = 0.0;
                    if (var11 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    this.field_F = this.field_F + 0.1;
                    if (6.283185307179586 >= this.field_F) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    this.field_F = this.field_F - 6.283185307179586;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (var2 != 0) {
                        statePc = 42;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if ((this.field_M ^ -1) == -3) {
                        statePc = 46;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if ((this.field_M ^ -1) == -4) {
                        statePc = 46;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (-1 > (this.field_q ^ -1)) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    this.field_db = this.field_db - this.field_Y / 2;
                    this.field_jb = 0;
                    this.field_R = this.field_db << -590380668;
                    this.field_z = true;
                    this.field_q = 0;
                    this.field_Y = 32;
                    this.field_w = new qb(this.field_Y, this.field_Y);
                    this.field_w.a();
                    de.i(this.field_Y >> 1259726881, this.field_Y >> 291763841, this.field_Y >> 981384481, 16777215);
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (-39 != (this.field_jb ^ -1)) {
                        statePc = 49;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 49: {
                    this.field_M = 0;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    if (this.field_M == -1) {
                        statePc = 53;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (1 != this.field_M) {
                        statePc = 114;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    this.field_E = this.field_M;
                    this.field_db = this.field_R >> -1822090396;
                    this.field_lb = this.field_X >> -1549961436;
                    var7 = this.field_M + this.field_lb;
                    var8 = this.field_db;
                    var9 = 0;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (8 <= var9) {
                        statePc = 61;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    stackIn_62_0 = this.field_L.b(-this.field_Y + var8, 2, -(this.field_Y >> 1393985441) + var7, this.field_w);
                    stackIn_56_0 = stackIn_62_0;
                    if (var11 != 0) {
                        statePc = 62;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (stackIn_56_0) {
                        statePc = 59;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var8++;
                    if (var11 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var8--;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    var9++;
                    if (var11 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    stackIn_62_0 = this.field_L.b(this.field_db - this.field_Y, 2, this.field_lb - (this.field_Y >> 2141450113), this.field_w);
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if (!stackIn_62_0) {
                        statePc = 64;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var8--;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    this.field_kb = 0;
                    this.field_eb = 0;
                    if (var5 == 0) {
                        statePc = 69;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if ((-16 + this.field_L.field_H ^ -1) < (this.field_db ^ -1)) {
                        statePc = 69;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if ((this.field_db ^ -1) > (var8 ^ -1)) {
                        statePc = 68;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var8 = this.field_db;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    if (-1 >= (-this.field_Y + var8 ^ -1)) {
                        statePc = 71;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var8 = -100;
                    this.field_L.field_G = 25;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    if (Math.abs(-this.field_db + var8) >= 5) {
                        statePc = 86;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if ((var7 ^ -1) == (this.field_lb ^ -1)) {
                        statePc = 76;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (this.field_s == null) {
                        statePc = 75;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 75: {
                    this.field_L.field_Ob[this.field_T] = this.field_L.field_Ob[this.field_T] + 1;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    this.field_lb = var7;
                    if ((this.field_ab ^ -1) != -4) {
                        statePc = 79;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if ((this.field_jb ^ -1) == -1) {
                        statePc = 81;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    this.field_F = this.field_F + 0.4;
                    if (var11 == 0) {
                        statePc = 82;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    this.field_F = this.field_F + 0.1;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    this.field_db = var8;
                    if ((this.field_Y ^ -1) < -91) {
                        statePc = 85;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (this.field_jb == 31) {
                        statePc = 85;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 85: {
                    this.field_F = this.field_F - 0.3;
                    if (var11 == 0) {
                        statePc = 100;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (var8 <= this.field_db) {
                        statePc = 89;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if (this.field_jb != 38) {
                        statePc = 95;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if (this.field_db >= var8) {
                        statePc = 100;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if (38 != this.field_jb) {
                        statePc = 100;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    this.field_lb = var7;
                    this.field_F = this.field_F + 0.4;
                    if (90 < this.field_Y) {
                        statePc = 94;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (31 == this.field_jb) {
                        statePc = 94;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 94: {
                    this.field_F = this.field_F - 0.3;
                    if (var11 == 0) {
                        statePc = 100;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    this.field_kb = 16 * this.field_M;
                    this.field_z = true;
                    this.field_eb = -16;
                    if ((this.field_jb ^ -1) != -37) {
                        statePc = 100;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (!this.field_U) {
                        statePc = 99;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (lk.a(0, (byte) -61)) {
                        statePc = 99;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 99: {
                    this.field_kb = 0;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    this.field_X = this.field_lb << 1148909796;
                    this.field_R = this.field_db << -770209884;
                    this.field_M = 0;
                    if (var4 == 0) {
                        statePc = 114;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if ((this.field_s.field_q ^ -1) >= -1) {
                        statePc = 103;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 103: {
                    this.field_L.a(this.field_s, 0);
                    var9 = -this.field_lb + this.field_s.field_lb;
                    var10 = this.field_Y / 2 + (-this.field_db + (this.field_s.field_db - this.field_s.field_Y / 2));
                    if (!this.field_s.field_z) {
                        statePc = 106;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    if (0 > this.field_s.field_eb) {
                        statePc = 114;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    if (((this.field_s.field_Y + this.field_Y) * (this.field_s.field_Y + this.field_Y) >> 1399913218 ^ -1) < (var9 * var9 + var10 * var10 ^ -1)) {
                        statePc = 108;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 108: {
                    this.field_s.field_X = -(this.field_E * (this.field_Y << -1146742303)) + this.field_X;
                    this.field_s.field_R = -(this.field_Y << 739612003) + this.field_R;
                    if (32 >= this.field_s.field_Y) {
                        statePc = 110;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    this.field_s.field_R = this.field_s.field_R + 192;
                    this.field_s.field_X = this.field_s.field_X + 0 * this.field_E;
                    statePc = 110;
                    continue stateLoop;
                }
                case 110: {
                    if (-33 == (this.field_jb ^ -1)) {
                        statePc = 112;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 112: {
                    this.field_s.field_R = this.field_s.field_R - 480;
                    this.field_s.field_X = this.field_s.field_X + this.field_E * 448;
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    this.field_lb = this.field_X >> -860162812;
                    this.field_db = this.field_R >> -372875740;
                    this.field_s.field_E = this.field_E;
                    this.field_s.field_db = this.field_s.field_R >> -102326044;
                    this.field_s.field_lb = this.field_s.field_X >> -966954236;
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    if (2 != this.field_M) {
                        statePc = 150;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    if (null != this.field_s) {
                        statePc = 117;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    this.field_L.field_c[this.field_T] = this.field_L.field_c[this.field_T] + 1;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    this.field_kb = this.field_E * 64;
                    this.field_eb = -96;
                    if (-5 == (this.field_jb ^ -1)) {
                        statePc = 119;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 119: {
                    this.field_eb = -128;
                    this.field_kb = 96 * this.field_E;
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    if (5 == this.field_jb) {
                        statePc = 123;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    if (-32 != (this.field_jb ^ -1)) {
                        statePc = 124;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    this.field_eb = -64;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    if ((this.field_jb ^ -1) == -2) {
                        statePc = 126;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 126: {
                    this.field_kb = 96 * this.field_E;
                    this.field_eb = -32;
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    if ((this.field_jb ^ -1) == -3) {
                        statePc = 130;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    if (32 == this.field_jb) {
                        statePc = 130;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 130: {
                    this.field_eb = -32;
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    if (7 == this.field_jb) {
                        statePc = 134;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    if (-10 == (this.field_jb ^ -1)) {
                        statePc = 134;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 134: {
                    this.field_eb = -32;
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    if (var3 == 0) {
                        statePc = 137;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    this.field_eb = -64;
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    if (-4 == (this.field_L.field_x[this.field_u] ^ -1)) {
                        statePc = 139;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 139: {
                    var7 = this.field_L.field_X[this.field_u] / 20;
                    this.field_kb = this.field_kb + 8 * (var7 * this.field_E);
                    this.field_eb = this.field_eb - 8 * var7;
                    if (96 < this.field_kb * this.field_E) {
                        statePc = 141;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 141: {
                    this.field_kb = this.field_E * 96;
                    statePc = 142;
                    continue stateLoop;
                }
                case 142: {
                    if ((this.field_eb ^ -1) <= 127) {
                        statePc = 144;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    this.field_eb = -128;
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    if (36 != this.field_jb) {
                        statePc = 149;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    if (!this.field_U) {
                        statePc = 148;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    if (!lk.a(0, (byte) -88)) {
                        statePc = 149;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    this.field_kb = 0;
                    this.field_eb = -32;
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    this.field_M = 0;
                    this.field_z = true;
                    this.field_P = 0;
                    this.b(-30225, 49);
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    if ((this.field_M ^ -1) != -4) {
                        statePc = 185;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    if (this.field_s == null) {
                        statePc = 153;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 153: {
                    this.field_L.field_c[this.field_T] = this.field_L.field_c[this.field_T] + 1;
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    this.field_kb = this.field_E * 16;
                    this.field_eb = -128;
                    if (4 == this.field_jb) {
                        statePc = 156;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 156: {
                    this.field_eb = -148;
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    if (-6 == (this.field_jb ^ -1)) {
                        statePc = 160;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    if (this.field_jb != 31) {
                        statePc = 161;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    this.field_eb = -96;
                    statePc = 161;
                    continue stateLoop;
                }
                case 161: {
                    if (-2 == (this.field_jb ^ -1)) {
                        statePc = 163;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 163: {
                    this.field_eb = -64;
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    if (2 != this.field_jb) {
                        statePc = 166;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    this.field_eb = -48;
                    statePc = 166;
                    continue stateLoop;
                }
                case 166: {
                    if (this.field_jb == 7) {
                        statePc = 169;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    if (-10 == (this.field_jb ^ -1)) {
                        statePc = 169;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 169: {
                    this.field_eb = -64;
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    if (var3 != 0) {
                        statePc = 172;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 172: {
                    this.field_kb = 32 * this.field_E;
                    this.field_eb = -128;
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    if ((this.field_L.field_x[this.field_u] ^ -1) != -4) {
                        statePc = 179;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    var7 = this.field_L.field_X[this.field_u] / 20;
                    this.field_eb = this.field_eb - 8 * var7;
                    this.field_kb = this.field_kb + this.field_E * var7 * 4;
                    if ((this.field_kb * this.field_E ^ -1) < -33) {
                        statePc = 176;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 176: {
                    this.field_kb = this.field_E * 32;
                    statePc = 177;
                    continue stateLoop;
                }
                case 177: {
                    if (-196 <= this.field_eb) {
                        statePc = 179;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    this.field_eb = -196;
                    statePc = 179;
                    continue stateLoop;
                }
                case 179: {
                    if ((this.field_jb ^ -1) != -37) {
                        statePc = 184;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    if (!this.field_U) {
                        statePc = 183;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    if (lk.a(0, (byte) -23)) {
                        statePc = 183;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 183: {
                    this.field_eb = -32;
                    this.field_kb = 0;
                    statePc = 184;
                    continue stateLoop;
                }
                case 184: {
                    this.field_M = 0;
                    this.field_z = true;
                    this.field_P = 0;
                    this.b(-30225, 50);
                    statePc = 185;
                    continue stateLoop;
                }
                case 185: {
                    var7 = 117 % ((param0 - -64) / 59);
                    this.field_M = 0;
                    if (this.field_F <= 6.28) {
                        statePc = 187;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    this.field_F = this.field_F - 6.28;
                    this.b(-30225, 48);
                    statePc = 187;
                    continue stateLoop;
                }
                case 187: {
                    if (0.0 <= this.field_F) {
                        statePc = 189;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    this.field_F = this.field_F + 6.28;
                    statePc = 189;
                    continue stateLoop;
                }
                case 189: {
                    var8 = (int)(Math.cos(this.field_F) * (double)(this.field_Y >> 69387618));
                    var9 = (int)(Math.sin(this.field_F) * (double)(this.field_Y >> 846017666));
                    this.field_n = var8 >> 2018888545;
                    this.field_N = var9 >> 1815737922;
                    this.field_O = -(var9 >> -875779294);
                    if (0 < var8) {
                        statePc = 192;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    this.field_Z = 0;
                    if (var11 == 0) {
                        statePc = 193;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    this.field_Z = -var8;
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    this.field_y = -var9;
                    if ((var8 ^ -1) <= -1) {
                        statePc = 196;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    this.field_o = var8;
                    if (var11 == 0) {
                        statePc = 197;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    this.field_o = 0;
                    statePc = 197;
                    continue stateLoop;
                }
                case 197: {
                    this.field_t = var9;
                    this.field_r = -(var8 >> -1765043423);
                    if (var6 == 0) {
                        statePc = 199;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    this.field_N = this.field_O;
                    this.field_Z = this.field_o;
                    statePc = 199;
                    continue stateLoop;
                }
                case 199: {
                    if (var4 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    if (this.field_s.u(92)) {
                        statePc = 202;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 202: {
                    var8 = -this.field_lb + this.field_s.field_lb;
                    var9 = -this.field_db + this.field_s.field_db;
                    if (!this.field_s.field_z) {
                        statePc = 213;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    if (this.field_s.field_eb < 0) {
                        statePc = 213;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    if ((this.field_Y - -this.field_s.field_Y) * (this.field_Y + this.field_s.field_Y) >> 333751778 > var8 * var8 - -(var9 * var9)) {
                        statePc = 206;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 206: {
                    this.field_L.a(this.field_s, 0);
                    this.field_s.field_z = false;
                    this.field_s.field_R = this.field_R + -(this.field_Y << -1234880893);
                    this.field_s.field_eb = 0;
                    this.field_s.field_X = -(this.field_E * (this.field_Y << -43125439)) + this.field_X;
                    this.field_s.field_kb = 0;
                    if ((this.field_s.field_Y ^ -1) < -33) {
                        statePc = 208;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 208: {
                    this.field_s.field_R = this.field_s.field_R + 192;
                    this.field_s.field_X = this.field_s.field_X + 0 * this.field_E;
                    statePc = 209;
                    continue stateLoop;
                }
                case 209: {
                    if (32 != this.field_jb) {
                        statePc = 211;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    this.field_s.field_R = this.field_s.field_R - 480;
                    this.field_s.field_X = this.field_s.field_X + this.field_E * 448;
                    statePc = 211;
                    continue stateLoop;
                }
                case 211: {
                    this.field_lb = this.field_X >> 635118404;
                    this.field_db = this.field_R >> 9273348;
                    this.field_s.field_lb = this.field_s.field_X >> 1738587204;
                    this.field_s.field_E = this.field_E;
                    this.field_s.field_db = this.field_s.field_R >> 328194148;
                    if (0 >= this.field_s.field_ib) {
                        statePc = 213;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    this.field_L.a(-124, this.field_s);
                    statePc = 213;
                    continue stateLoop;
                }
                case 213: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void d(boolean param0) {
        int var2;
        int var3;
        int var4;
        L0: {
          var2 = this.f((byte) -107) ? 1 : 0;
          this.field_F = this.field_F + 0.1;
          if (this.field_F > 6.28) {
            this.field_F = this.field_F - 6.28;
            break L0;
          } else {
            break L0;
          }
        }
        if (!this.e(param0)) {
          L1: {
            if (!this.field_z) {
              break L1;
            } else {
              this.field_M = 0;
              break L1;
            }
          }
          L2: {
            if (this.field_M != -1) {
              break L2;
            } else {
              if (this.field_X > this.field_L.field_y << -1129068924) {
                this.field_M = 0;
                break L2;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if ((this.field_M ^ -1) != -2) {
              break L3;
            } else {
              if (0 > this.field_X) {
                this.field_M = 0;
                break L3;
              } else {
                break L3;
              }
            }
          }
          L4: {
            L5: {
              if (1 == this.field_M) {
                break L5;
              } else {
                if (-1 != this.field_M) {
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              if (this.field_M == this.field_E) {
                break L6;
              } else {
                this.field_E = this.field_M;
                this.field_M = 0;
                this.field_z = true;
                this.field_kb = 32 * this.field_E;
                if (!ArcanistsMulti.field_G) {
                  break L4;
                } else {
                  break L6;
                }
              }
            }
            this.field_E = this.field_M;
            this.field_kb = this.field_E * 96;
            this.field_z = true;
            this.field_M = 0;
            break L4;
          }
          L7: {
            if (-3 != (this.field_M ^ -1)) {
              break L7;
            } else {
              this.field_kb = 32 * this.field_E;
              this.field_eb = 96;
              this.field_M = 0;
              this.field_z = true;
              break L7;
            }
          }
          L8: {
            if (-4 == (this.field_M ^ -1)) {
              this.field_kb = this.field_E * 32;
              this.field_M = 0;
              this.field_eb = -96;
              this.field_z = true;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            this.field_M = 0;
            if (var2 == 0) {
              break L9;
            } else {
              if (!this.field_s.u(101)) {
                break L9;
              } else {
                var3 = this.field_s.field_lb - this.field_lb;
                var4 = this.field_s.field_db - this.field_db;
                if (!this.field_s.field_z) {
                  break L9;
                } else {
                  if (this.field_s.field_eb < 0) {
                    break L9;
                  } else {
                    if (var4 * var4 + var3 * var3 >= (this.field_Y + this.field_s.field_Y) * (this.field_s.field_Y + this.field_Y) >> 1048191266) {
                      break L9;
                    } else {
                      L10: {
                        this.field_L.a(this.field_s, 0);
                        this.field_s.field_z = false;
                        this.field_s.field_kb = 0;
                        this.field_s.field_eb = 0;
                        this.field_s.field_X = -((this.field_Y << 380777057) * this.field_E) + this.field_X;
                        this.field_s.field_R = -(this.field_Y << -1206297917) + this.field_R;
                        if (-33 <= (this.field_s.field_Y ^ -1)) {
                          break L10;
                        } else {
                          this.field_s.field_X = this.field_s.field_X + 0 * this.field_E;
                          this.field_s.field_R = this.field_s.field_R + 192;
                          break L10;
                        }
                      }
                      L11: {
                        if (32 == this.field_jb) {
                          this.field_s.field_X = this.field_s.field_X + this.field_E * 448;
                          this.field_s.field_R = this.field_s.field_R - 480;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      this.field_lb = this.field_X >> -1950423900;
                      this.field_db = this.field_R >> -1953124124;
                      this.field_s.field_lb = this.field_s.field_X >> 1361347428;
                      this.field_s.field_db = this.field_s.field_R >> -1734672284;
                      this.field_s.field_E = this.field_E;
                      if ((this.field_s.field_ib ^ -1) < -1) {
                        this.field_L.a(-55, this.field_s);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final boolean f(boolean param0) {
        int stackIn_10_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            this.field_B = (qb) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!this.b((byte) -82)) {
              break L2;
            } else {
              L3: {
                if (this.field_z) {
                  break L3;
                } else {
                  if (this.field_hb) {
                    break L3;
                  } else {
                    if (-1 != (this.field_x ^ -1)) {
                      break L3;
                    } else {
                      if (this.field_ib > 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              stackIn_10_0 = 1;
              break L1;
            }
          }
          stackIn_10_0 = 0;
          break L1;
        }
        return stackIn_10_0 != 0;
    }

    final static void a(boolean param0, int param1) {
        if (param1 >= -100) {
            ml.a((dj) null, -106, (byte) 51, (dj) null);
        }
        eb.a(param0, -105);
    }

    final boolean j(int param0) {
        int stackIn_10_0 = 0;
        L0: {
          if (param0 == -26) {
            break L0;
          } else {
            this.b(28, -45);
            break L0;
          }
        }
        L1: {
          L2: {
            if (13 == this.field_jb) {
              break L2;
            } else {
              if (this.field_jb == 15) {
                break L2;
              } else {
                if (this.field_jb == 14) {
                  break L2;
                } else {
                  if (this.field_jb == 26) {
                    break L2;
                  } else {
                    if (39 != this.field_jb) {
                      stackIn_10_0 = 0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
          }
          stackIn_10_0 = 1;
          break L1;
        }
        return stackIn_10_0 != 0;
    }

    final void a(byte param0, int param1) {
        int var3;
        L0: {
          if (3 == this.field_jb) {
            this.b(-30225, dm.field_G[param1]);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (this.field_jb != 7) {
            break L1;
          } else {
            this.b(-30225, hi.field_f[param1]);
            break L1;
          }
        }
        L2: {
          if (-2 == (this.field_jb ^ -1)) {
            this.b(-30225, fb.field_b[param1]);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (9 == this.field_jb) {
            this.b(-30225, ed.field_Ib[param1]);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (2 == this.field_jb) {
            this.b(-30225, tc.field_B[param1]);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (-5 == (this.field_jb ^ -1)) {
            this.b(-30225, in.field_Fb[param1]);
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if ((this.field_jb ^ -1) != -9) {
            break L6;
          } else {
            this.b(-30225, s.field_i[param1]);
            break L6;
          }
        }
        L7: {
          if (this.field_jb == 11) {
            this.b(-30225, lj.field_g[param1]);
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if ((this.field_jb ^ -1) == -6) {
            this.b(-30225, mb.field_U[param1]);
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          if (-15 != (this.field_jb ^ -1)) {
            break L9;
          } else {
            this.b(-30225, lj.field_n[param1]);
            break L9;
          }
        }
        L10: {
          if (-16 != (this.field_jb ^ -1)) {
            break L10;
          } else {
            this.b(-30225, gd.field_pb[param1]);
            break L10;
          }
        }
        L11: {
          if (-18 != (this.field_jb ^ -1)) {
            break L11;
          } else {
            this.b(-30225, cj.field_a[param1]);
            break L11;
          }
        }
        L12: {
          if (this.field_jb != 6) {
            break L12;
          } else {
            this.b(-30225, vg.field_c[param1]);
            break L12;
          }
        }
        L13: {
          if (-14 != (this.field_jb ^ -1)) {
            break L13;
          } else {
            this.b(-30225, fi.field_c[param1]);
            break L13;
          }
        }
        L14: {
          if (this.field_jb != 10) {
            break L14;
          } else {
            this.b(-30225, gg.field_j[param1]);
            break L14;
          }
        }
        L15: {
          if (this.field_jb == 37) {
            this.b(-30225, om.field_B[param1]);
            break L15;
          } else {
            break L15;
          }
        }
        L16: {
          if (this.field_jb != 39) {
            break L16;
          } else {
            this.b(-30225, u.field_h[param1]);
            break L16;
          }
        }
        L17: {
          if ((this.field_jb ^ -1) == -34) {
            this.b(-30225, fk.field_h[param1]);
            break L17;
          } else {
            break L17;
          }
        }
        L18: {
          if ((this.field_jb ^ -1) == -32) {
            this.b(-30225, jn.field_a[param1]);
            break L18;
          } else {
            break L18;
          }
        }
        L19: {
          if (this.field_jb != 32) {
            break L19;
          } else {
            this.b(-30225, fd.field_h[param1]);
            break L19;
          }
        }
        L20: {
          if (-29 == (this.field_jb ^ -1)) {
            this.a((byte) -49, 200, cd.field_p[param1]);
            break L20;
          } else {
            break L20;
          }
        }
        L21: {
          if (-30 == (this.field_jb ^ -1)) {
            this.a((byte) -72, 100, cd.field_p[param1]);
            break L21;
          } else {
            break L21;
          }
        }
        L22: {
          if (-31 == (this.field_jb ^ -1)) {
            this.a((byte) -91, 50, cd.field_p[param1]);
            break L22;
          } else {
            break L22;
          }
        }
        L23: {
          if (this.field_jb != 34) {
            break L23;
          } else {
            this.b(-30225, cf.field_a[param1]);
            break L23;
          }
        }
        L24: {
          if (25 == this.field_jb) {
            this.b(-30225, uj.field_c[param1]);
            break L24;
          } else {
            break L24;
          }
        }
        L25: {
          var3 = -17 / ((param0 - 25) / 36);
          if (this.field_s != null) {
            break L25;
          } else {
            break L25;
          }
        }
        L26: {
          if (this.field_jb != 26) {
            break L26;
          } else {
            break L26;
          }
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            try {
              L0: {
                try {
                  L1: {
                    var4 = param1.getCodeBase();
                    if (param0 < -59) {
                      var3 = nm.a(param1, var4, -31843).getFile();
                      ei.a("updatelinks", param1, (byte) 114, new Object[]{"home", var3 + "home.ws"});
                      ei.a("updatelinks", param1, (byte) 114, new Object[]{"gamelist", var3 + "togamelist.ws"});
                      ei.a("updatelinks", param1, (byte) 114, new Object[]{"serverlist", var3 + "toserverlist.ws"});
                      ei.a("updatelinks", param1, (byte) 114, new Object[]{"options", var3 + "options.ws"});
                      ei.a("updatelinks", param1, (byte) 114, new Object[]{"terms", var3 + "terms.ws"});
                      ei.a("updatelinks", param1, (byte) 114, new Object[]{"privacy", var3 + "privacy.ws"});
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2 = decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L2;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref);

                stackIn_8_1 = new StringBuilder().append("ml.KA(").append(param0).append(',');

                if (param1 == null) {
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
              throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void l(int param0) {
        int var2;
        L0: {
          var2 = this.field_L.d(false);
          if (-1 > (this.field_q ^ -1)) {
            L1: {
              this.field_q = this.field_q - this.field_x;
              if (this.field_q <= 0) {
                break L1;
              } else {
                if (22 == this.field_jb) {
                  break L1;
                } else {
                  if (23 == this.field_jb) {
                    break L1;
                  } else {
                    if (-22 == (this.field_jb ^ -1)) {
                      break L1;
                    } else {
                      if (24 == this.field_jb) {
                        break L1;
                      } else {
                        if (35 == this.field_jb) {
                          break L1;
                        } else {
                          if ((this.field_jb ^ -1) == -39) {
                            break L1;
                          } else {
                            break L0;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            L2: {
              L3: {
                if ((this.field_q ^ -1) < -1) {
                  break L3;
                } else {
                  this.field_x = -this.field_q;
                  if (!ArcanistsMulti.field_G) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_x = 0;
              break L2;
            }
            this.field_db = this.field_db - this.field_Y / 2;
            this.field_Y = 32;
            this.field_jb = 0;
            this.field_R = this.field_db << -2077829116;
            this.field_q = 0;
            this.field_z = true;
            this.field_w = new qb(this.field_Y, this.field_Y);
            this.field_w.a();
            de.i(this.field_Y >> -26143359, this.field_Y >> 1318047201, this.field_Y >> 718768545, 16777215);
            break L0;
          } else {
            break L0;
          }
        }
        L4: {
          if (!this.t(107)) {
            break L4;
          } else {
            if (-2 <= (-this.field_x + this.field_ib ^ -1)) {
              break L4;
            } else {
              L5: {
                if ((256 + this.field_L.field_H ^ -1) < (this.field_db ^ -1)) {
                  this.b(-30225, 54);
                  this.field_L.field_Eb[this.field_T] = this.field_L.field_Eb[this.field_T] + 1;
                  if ((this.field_T ^ -1) == (var2 ^ -1)) {
                    this.field_L.field_D = false;
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              this.field_db = 256 + this.field_L.field_H;
              this.field_z = false;
              this.field_R = this.field_db << 1525138404;
              if (param0 == 32704) {
                L6: {
                  this.field_q = 0;
                  if (0 >= this.field_x) {
                    break L6;
                  } else {
                    L7: {
                      if (this.field_jb != 19) {
                        break L7;
                      } else {
                        this.field_z = true;
                        this.field_jb = 0;
                        break L7;
                      }
                    }
                    this.a((byte) -76, 2);
                    this.field_ib = this.field_ib - this.field_x;
                    if ((this.field_ib ^ -1) < -1) {
                      break L6;
                    } else {
                      L8: {
                        this.d(var2, 68);
                        if (!this.t(77)) {
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      return;
                    }
                  }
                }
                L9: {
                  if (0 > this.field_x) {
                    this.a(-this.field_x, -28922);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                this.field_x = 0;
                return;
              } else {
                return;
              }
            }
          }
        }
        L10: {
          this.b(-30225, 54);
          this.d(var2, 70);
          if (this.t(49)) {
            this.field_L.field_Eb[this.field_T] = this.field_L.field_Eb[this.field_T] + 1;
            break L10;
          } else {
            break L10;
          }
        }
        this.field_ib = 0;
    }

    private final boolean d(int param0) {
        boolean discarded$0 = false;
        int var2;
        ml var3;
        int var4;
        int var5;
        int var6;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (!this.u(param0 ^ -10366)) {
          return false;
        } else {
          L0: {
            if (param0 == -10265) {
              break L0;
            } else {
              discarded$0 = this.u(87);
              break L0;
            }
          }
          pi.field_b.a((byte) 125, this.field_L.field_i);
          var2 = 0;
          var3 = (ml) ((Object) pi.field_b.b(param0 + 10161));
          L1: while (true) {
            L2: {
              if (var3 == null) {
                break L2;
              } else {
                L3: {
                  if (this != var3.field_s) {
                    break L3;
                  } else {
                    if (!var3.x(32)) {
                      break L3;
                    } else {
                      var4 = var3.field_lb + -this.field_lb;
                      var5 = var3.field_db + (-this.field_db - var3.field_Y / 2) + this.field_Y / 2;
                      if ((this.field_Y + var3.field_Y) * (var3.field_Y + this.field_Y) >> 1118601698 > var5 * var5 + var4 * var4) {
                        L4: {
                          L5: {
                            if (1 == this.field_M) {
                              break L5;
                            } else {
                              if (0 == (this.field_M ^ -1)) {
                                break L5;
                              } else {
                                break L4;
                              }
                            }
                          }
                          L6: {
                            this.field_E = this.field_M;
                            this.field_M = 0;
                            this.field_R = var3.field_R + -(var3.field_Y << -300368893);
                            this.field_X = -((var3.field_Y << 175864961) * var3.field_E) + var3.field_X;
                            if (-33 <= (this.field_Y ^ -1)) {
                              break L6;
                            } else {
                              this.field_X = this.field_X + 0 * var3.field_E;
                              this.field_R = this.field_R + 192;
                              break L6;
                            }
                          }
                          L7: {
                            if (32 != var3.field_jb) {
                              break L7;
                            } else {
                              this.field_X = this.field_X + 448 * var3.field_E;
                              this.field_R = this.field_R - 480;
                              break L7;
                            }
                          }
                          this.field_lb = this.field_X >> -1218935772;
                          this.field_db = this.field_R >> -950125372;
                          break L4;
                        }
                        var2 = 1;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var3 = (ml) ((Object) pi.field_b.d(-18502));
                if (var6 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            return var2 != 0;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        ml var5;
        int var6;
        int var7;
        int var8;
        int var9;
        L0: {
          if (-13 == (this.field_jb ^ -1)) {
            break L0;
          } else {
            if (40 != this.field_jb) {
              L1: {
                if (param0 == 2) {
                  break L1;
                } else {
                  this.field_P = -86;
                  break L1;
                }
              }
              L2: {
                var4 = nj.field_n[this.field_u];
                var5 = this.field_L.a(this.field_u, true);
                if (var5 == null) {
                  break L2;
                } else {
                  if (var5.field_jb == 27) {
                    var4 = 13417437;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                L4: {
                  var6 = 8421504 ^ (var4 | 8421504);
                  if ((this.field_q ^ -1) < -1) {
                    break L4;
                  } else {
                    L5: {
                      L6: {
                        var7 = this.field_Y;
                        if (7 == this.field_jb) {
                          break L6;
                        } else {
                          if (-10 != (this.field_jb ^ -1)) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var7 = 48;
                      break L5;
                    }
                    var8 = param2 + this.field_lb;
                    var9 = param1 + this.field_db + -(var7 >> 1625000353);
                    de.c(var8, var9, var7 >> -120436959, var4, 128);
                    gn.a(var7 >> -238727231, (byte) 125, 128, var8, var9);
                    if (!ArcanistsMulti.field_G) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                this.field_w.a(this.field_lb + -(this.field_Y >> 1302399425) - (1 + -param2), -this.field_Y + this.field_db + param1, var6);
                this.field_w.a(param2 + (1 + this.field_lb) + -(this.field_Y >> -1485451775), param1 + this.field_db + -this.field_Y, var6);
                this.field_w.a(param2 + (this.field_lb - (this.field_Y >> 961747745)), -1 + -this.field_Y + this.field_db + param1, var6);
                this.field_w.a(param2 + (-(this.field_Y >> -985162559) + this.field_lb), param1 + (1 + -this.field_Y + this.field_db), var6);
                this.field_w.a(param2 + (this.field_lb - (this.field_Y >> -1191850175)), param1 + (this.field_db - this.field_Y), var4);
                break L3;
              }
              return;
            } else {
              break L0;
            }
          }
        }
    }

    final void b(byte param0, int param1) {
        this.field_ib = param1;
        if (param0 > -79) {
            this.y(111);
        }
    }

    private ml(nf param0) {
        this.field_o = 0;
        this.field_N = 0;
        this.field_r = -4;
        this.field_gb = null;
        this.field_O = 0;
        this.field_y = 0;
        this.field_ab = -1;
        this.field_t = 0;
        this.field_n = 0;
        this.field_J = false;
        this.field_Z = 0;
        try {
            this.field_L = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ml.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(dj param0, int param1, byte param2, dj param3) {
        eb.field_a = param1;
        mg.field_C = param3;
        if (param2 < 76) {
            return;
        }
        try {
            ko.field_j = param0;
            td.a(true, de.field_j / 2, de.field_e / 2);
            e.b(1, param3.field_o, param0.field_m + param0.field_o, param0.field_o, param3.field_m + param3.field_o);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ml.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1) {
        this.field_ib = this.field_ib + param0;
        if (!(250 >= this.field_ib)) {
            this.field_ib = 250;
        }
        if (param1 != -28922) {
            this.a((byte) 113, -24);
        }
    }

    ml(int param0, int param1, int param2, int param3, nf param4, int param5) {
        this.field_o = 0;
        this.field_N = 0;
        this.field_r = -4;
        this.field_gb = null;
        this.field_O = 0;
        this.field_y = 0;
        this.field_ab = -1;
        this.field_t = 0;
        this.field_n = 0;
        this.field_J = false;
        this.field_Z = 0;
        try {
            this.field_lb = param1;
            this.field_db = param2;
            this.field_L = param4;
            this.field_T = param3;
            this.field_E = 1;
            this.field_R = this.field_db << -1960783548;
            this.field_jb = param0;
            this.field_u = param5;
            this.field_X = this.field_lb << 2083271332;
            this.field_s = null;
            this.a(12, true);
            this.h(115);
            this.field_L.a(-93, (ml) (this));
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ml.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final int i(byte param0) {
        int var2 = -107 % ((param0 - 58) / 41);
        return this.field_db;
    }

    ml(int param0, int param1, int param2, int param3, nf param4, ml param5) {
        this.field_o = 0;
        this.field_N = 0;
        this.field_r = -4;
        this.field_gb = null;
        this.field_O = 0;
        this.field_y = 0;
        this.field_ab = -1;
        this.field_t = 0;
        this.field_n = 0;
        this.field_J = false;
        this.field_Z = 0;
        try {
            this.field_db = param2;
            this.field_lb = param1;
            this.field_X = this.field_lb << -139780220;
            this.field_s = param5;
            this.field_L = param4;
            this.field_E = 1;
            this.field_T = param3;
            this.field_R = this.field_db << 2112675428;
            this.field_jb = param0;
            this.field_z = true;
            this.field_u = this.field_s.field_u;
            this.a(12, true);
            this.h(-80);
            this.a(12, true);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ml.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_K = "You have fallen into the water! Choose a location to teleport to. Since you don't have Arcane Gate available, you will lose a third of your health (<%1>). If you fail to do this within the time limit, you will forfeit the game!";
    }
}
