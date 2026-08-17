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
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                this.x(99);
                break L1;
              }
            }
            L2: {
              L3: {
                if ((this.field_ib ^ -1) >= -1) {
                  break L3;
                } else {
                  if (this.b((byte) -81)) {
                    stackIn_8_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_8_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.MB(" + param0 + ')');
        }
        return stackIn_8_0 != 0;
    }

    final int v(int param0) {
        boolean discarded$1 = false;
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -110) {
                break L1;
              } else {
                discarded$1 = this.e(true);
                break L1;
              }
            }
            stackIn_3_0 = this.field_q;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.JA(" + param0 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = 0;
            var4 = -72 / ((param1 - 4) / 62);
            var5 = 0;
            L1: while (true) {
              if (var2_int <= var5) {
                stackIn_5_0 = var3;
                break L0;
              } else {
                var3 = fe.a((byte) 74, param0.charAt(var5)) + ((var3 << -118977147) + -var3);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("ml.C(");

            if (param0 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    final int g(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                this.field_eb = -102;
                break L1;
              }
            }
            stackIn_3_0 = this.field_u;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.IB(" + param0 + ')');
        }
        return stackIn_3_0;
    }

    private final void g(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
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
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -5445) {
                break L1;
              } else {
                this.t(22);
                break L1;
              }
            }
            L2: {
              if (2 != this.field_ab) {
                break L2;
              } else {
                if (null == this.field_s) {
                  var2_int = this.field_L.field_y * this.field_T / 6;
                  var3_int = -var2_int + this.field_lb;
                  var4_int = this.field_db + (-(this.field_Y >> 120148673) - -480);
                  if (-1 <= (var4_int ^ -1)) {
                    break L2;
                  } else {
                    L3: {
                      var5 = Math.abs(var4_int);
                      if (Math.abs(var3_int) > Math.abs(var4_int)) {
                        var5 = Math.abs(var3_int);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var6 = 1;
                    var7_int = var5;
                    L4: while (true) {
                      L5: {
                        if ((var7_int ^ -1) >= -1) {
                          break L5;
                        } else {
                          L6: {
                            jo.field_b = false;
                            if (!this.field_L.a(-(this.field_Y >> 1783464865) + (this.field_db + -(var4_int * var7_int / var5)), -(var7_int * var3_int / var5) + this.field_lb, (byte) -83)) {
                              break L6;
                            } else {
                              if (jo.field_b) {
                                break L6;
                              } else {
                                var6 = 0;
                                break L5;
                              }
                            }
                          }
                          var7_int--;
                          continue L4;
                        }
                      }
                      if (var6 != 0) {
                        var7 = aj.a((ml) (this), -480, false, 114, this.field_L, var2_int);
                        var7.field_F = var4_int;
                        var7.field_u = var3_int;
                        this.field_L.b(52, var7);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            L7: {
              if (-13 != (this.field_jb ^ -1)) {
                break L7;
              } else {
                if (Math.random() * 75.0 >= (double)this.field_ib) {
                  break L7;
                } else {
                  var2_int = (int)(Math.random() * (double)this.field_w.field_q);
                  var3_int = (int)(Math.random() * (double)this.field_w.field_y);
                  if (this.field_w.field_A[var3_int * this.field_w.field_q + var2_int] != 0) {
                    var4 = aj.a((ml) null, -256 + (var3_int + this.field_db) - -this.field_w.field_o, false, 109, this.field_L, -128 + this.field_w.field_x + (var2_int + this.field_lb));
                    this.field_L.b(52, var4);
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
            }
            L8: {
              if (this.field_jb == 25) {
                var9 = aj.a((ml) null, this.field_db - (this.field_Y >> 993997537), false, 100, this.field_L, this.field_lb);
                var3 = Math.random() * 6.28;
                var9.field_u = (int)((double)(12 * -this.field_E) + 16.0 * Math.sin(var3));
                var9.field_F = (int)(Math.cos(var3) * 16.0);
                this.field_L.b(52, var9);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (this.field_jb == 19) {
                var10 = aj.a((ml) null, this.field_db, false, 100, this.field_L, this.field_lb);
                var3 = Math.random() * 6.28;
                var10.field_F = (int)(8.0 + Math.sin(var3) * 12.0);
                var10.field_u = (int)(16.0 * Math.cos(var3));
                this.field_L.b(param0 + 5497, var10);
                break L9;
              } else {
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.HA(" + param0 + ')');
        }
    }

    final int p(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -8323) {
              stackIn_4_0 = this.field_Y;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -90;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.WA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void e(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (20 == this.field_jb) {
                this.field_q = 25;
                this.field_Y = uj.field_i[0].field_w;
                this.field_w = new qb(this.field_Y, this.field_Y);
                this.field_w.a();
                uj.field_i[0].a(this.field_Y / 2 - uj.field_i[0].field_n / 2, 0, 16777215);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_jb == 22) {
                this.field_q = 75;
                this.field_Y = uj.field_i[1].field_w;
                this.field_w = new qb(this.field_Y, this.field_Y);
                this.field_w.a();
                uj.field_i[1].a(-(uj.field_i[1].field_n / 2) + this.field_Y / 2, 0, 16777215);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 == 6) {
                break L3;
              } else {
                this.field_gb = (mi) null;
                break L3;
              }
            }
            L4: {
              if ((this.field_jb ^ -1) != -39) {
                break L4;
              } else {
                this.field_Y = uj.field_i[6].field_w;
                this.field_q = 75;
                this.field_w = new qb(this.field_Y, this.field_Y);
                this.field_w.a();
                uj.field_i[6].a(-(uj.field_i[6].field_n / 2) + this.field_Y / 2, 0, 16777215);
                break L4;
              }
            }
            L5: {
              if (this.field_jb == 21) {
                this.field_q = 100;
                this.field_Y = uj.field_i[2].field_w;
                this.field_w = new qb(this.field_Y, this.field_Y);
                this.field_w.a();
                uj.field_i[2].a(this.field_Y / 2 + -(uj.field_i[2].field_n / 2), 0, 16777215);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (-24 != (this.field_jb ^ -1)) {
                break L6;
              } else {
                this.field_Y = uj.field_i[3].field_w;
                this.field_q = 75;
                this.field_w = new qb(this.field_Y, this.field_Y);
                this.field_w.a();
                uj.field_i[3].a(-(uj.field_i[3].field_n / 2) + this.field_Y / 2, 0, 16777215);
                break L6;
              }
            }
            L7: {
              if ((this.field_jb ^ -1) != -25) {
                break L7;
              } else {
                this.field_Y = uj.field_i[4].field_w;
                this.field_q = 75;
                this.field_w = new qb(this.field_Y, this.field_Y);
                this.field_w.a();
                uj.field_i[4].a(-(uj.field_i[4].field_n / 2) + this.field_Y / 2, 0, 16777215);
                break L7;
              }
            }
            L8: {
              if ((this.field_jb ^ -1) == -36) {
                this.field_Y = -16 + (80 + uj.field_i[5].field_w);
                this.field_q = 75;
                this.field_w = new qb(this.field_Y, this.field_Y);
                this.field_w.a();
                uj.field_i[5].a(this.field_Y / 2 + -(uj.field_i[5].field_n / 2), 64, 16777215);
                de.i(this.field_Y / 2, 80, 16, 16777215);
                break L8;
              } else {
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.EA(" + param0 + ')');
        }
    }

    final boolean g(byte param0) {
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 88) {
                break L1;
              } else {
                this.field_N = 58;
                break L1;
              }
            }
            L2: {
              L3: {
                if ((this.field_jb ^ -1) == -21) {
                  break L3;
                } else {
                  if (22 == this.field_jb) {
                    break L3;
                  } else {
                    if ((this.field_jb ^ -1) == -22) {
                      break L3;
                    } else {
                      if ((this.field_jb ^ -1) == -24) {
                        break L3;
                      } else {
                        if (-25 == (this.field_jb ^ -1)) {
                          break L3;
                        } else {
                          if (this.field_jb == 35) {
                            break L3;
                          } else {
                            if ((this.field_jb ^ -1) != -39) {
                              stackIn_13_0 = 0;
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackIn_13_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.AB(" + param0 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final void a(boolean param0, boolean param1) {
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int stackIn_54_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ml var7 = null;
        mi var7_ref = null;
        int var9 = 0;
        mi var10 = null;
        mi var11 = null;
        mi var12 = null;
        mi var13 = null;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var6 = 16384;
            pi.field_b.a((byte) 95, this.field_L.field_i);
            var7 = (ml) ((Object) pi.field_b.b(-83));
            L1: while (true) {
              if (var7 == null) {
                L2: {
                  pi.field_b.a((byte) 91, this.field_L.field_Kb);
                  var7_ref = (mi) ((Object) pi.field_b.b(-58));
                  if (param1) {
                    break L2;
                  } else {
                    this.a(-6, -62);
                    break L2;
                  }
                }
                L3: while (true) {
                  if (var7_ref == null) {
                    break L0;
                  } else {
                    L4: {
                      L5: {
                        if ((var7_ref.field_I ^ -1) == -56) {
                          break L5;
                        } else {
                          if (157 == var7_ref.field_I) {
                            break L5;
                          } else {
                            if (-169 == (var7_ref.field_I ^ -1)) {
                              break L5;
                            } else {
                              if (111 == var7_ref.field_I) {
                                break L5;
                              } else {
                                if (var7_ref.field_I == 68) {
                                  break L5;
                                } else {
                                  if (-70 == (var7_ref.field_I ^ -1)) {
                                    break L5;
                                  } else {
                                    if ((var7_ref.field_I ^ -1) == -71) {
                                      break L5;
                                    } else {
                                      if (-57 == (var7_ref.field_I ^ -1)) {
                                        break L5;
                                      } else {
                                        if (-107 == (var7_ref.field_I ^ -1)) {
                                          break L5;
                                        } else {
                                          if (-108 == (var7_ref.field_I ^ -1)) {
                                            break L5;
                                          } else {
                                            if (var7_ref.field_I == 117) {
                                              break L5;
                                            } else {
                                              if ((var7_ref.field_I ^ -1) == -4) {
                                                break L5;
                                              } else {
                                                if (121 == var7_ref.field_I) {
                                                  break L5;
                                                } else {
                                                  if (-150 == (var7_ref.field_I ^ -1)) {
                                                    break L5;
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
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      var3_int = -var7_ref.field_v + this.field_lb;
                      var4 = -var7_ref.field_G + this.field_db + -48;
                      var5 = var3_int * var3_int - -(var4 * var4);
                      if (var5 < var6) {
                        L6: {
                          if (this == var7_ref.field_t) {
                            break L6;
                          } else {
                            if (117 == var7_ref.field_I) {
                              break L6;
                            } else {
                              if ((var7_ref.field_I ^ -1) == -4) {
                                break L6;
                              } else {
                                if (149 != var7_ref.field_I) {
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                        L7: {
                          if (!param0) {
                            break L7;
                          } else {
                            var10 = aj.a((ml) (this), var7_ref.field_G, false, 154, this.field_L, var7_ref.field_v);
                            this.field_L.b(52, var10);
                            var11 = aj.a((ml) (this), -48 + this.field_db, false, 108, this.field_L, this.field_lb);
                            this.field_L.b(52, var11);
                            break L7;
                          }
                        }
                        L8: {
                          if (var7_ref.field_I == 157) {
                            break L8;
                          } else {
                            if (-169 == (var7_ref.field_I ^ -1)) {
                              break L8;
                            } else {
                              var7_ref.f(0);
                              break L4;
                            }
                          }
                        }
                        var7_ref.field_y = -1;
                        var7_ref.a(this.field_L.n((byte) -75), (byte) -83, this.field_L.field_t, this.field_L.field_mb);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L9: {
                      if (-150 != (var7_ref.field_I ^ -1)) {
                        break L9;
                      } else {
                        var3_int = -var7_ref.field_u + (-var7_ref.field_v + this.field_lb);
                        var4 = -var7_ref.field_G + (-48 + (this.field_db + -var7_ref.field_F));
                        var5 = var3_int * var3_int - -(var4 * var4);
                        if (var6 <= var5) {
                          break L9;
                        } else {
                          L10: {
                            if (param0) {
                              L11: {
                                stackIn_53_0 = this;

                                stackIn_53_1 = var7_ref.field_G;

                                if (param1) {
                                  stackIn_54_0 = this;
                                  stackIn_54_1 = stackIn_53_1;
                                  stackIn_54_2 = 0;
                                  break L11;
                                } else {
                                  stackIn_54_0 = this;
                                  stackIn_54_1 = stackIn_53_1;
                                  stackIn_54_2 = 1;
                                  break L11;
                                }
                              }
                              var12 = aj.a((ml) (this), stackIn_54_1, stackIn_54_2 != 0, 154, this.field_L, var7_ref.field_v);
                              this.field_L.b(52, var12);
                              var13 = aj.a((ml) (this), this.field_db + -48, false, 108, this.field_L, this.field_lb);
                              this.field_L.b(52, var13);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var7_ref.f(0);
                          break L9;
                        }
                      }
                    }
                    var7_ref = (mi) ((Object) pi.field_b.d(-18502));
                    continue L3;
                  }
                }
              } else {
                L12: {
                  if (var7.field_jb == 19) {
                    var4 = -var7.field_db + (-48 + this.field_db);
                    var3_int = -var7.field_lb + this.field_lb;
                    var5 = var3_int * var3_int + var4 * var4;
                    if (var5 < var6) {
                      var7.field_z = true;
                      var7.field_jb = 0;
                      break L12;
                    } else {
                      break L12;
                    }
                  } else {
                    break L12;
                  }
                }
                var7 = (ml) ((Object) pi.field_b.d(-18502));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "ml.K(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean s(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_28_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (this.field_X >> -1454644252 < this.field_Y / 2) {
                break L1;
              } else {
                if (this.field_X >> 1735964836 > -(this.field_Y / 2) + this.field_L.field_y) {
                  break L1;
                } else {
                  L2: {
                    if (param0 == -1) {
                      break L2;
                    } else {
                      this.field_t = 29;
                      break L2;
                    }
                  }
                  L3: {
                    if (null == this.field_gb) {
                      break L3;
                    } else {
                      if ((this.field_gb.field_I ^ -1) == -122) {
                        stackIn_13_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      if (this.f((byte) -107)) {
                        break L5;
                      } else {
                        if (8 == this.field_jb) {
                          break L5;
                        } else {
                          if ((this.field_jb ^ -1) == -7) {
                            break L5;
                          } else {
                            if (-26 == (this.field_jb ^ -1)) {
                              break L5;
                            } else {
                              if (10 == this.field_jb) {
                                break L5;
                              } else {
                                L6: {
                                  if ((this.field_lb ^ -1) > -1) {
                                    break L6;
                                  } else {
                                    if (this.field_lb > this.field_L.field_y) {
                                      break L6;
                                    } else {
                                      if (-20 == (this.field_jb ^ -1)) {
                                        break L5;
                                      } else {
                                        if (18 != this.field_jb) {
                                          break L6;
                                        } else {
                                          if ((this.field_x ^ -1) < -1) {
                                            break L6;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                stackIn_28_0 = 0;
                                break L4;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackIn_28_0 = 1;
                    break L4;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
            stackIn_5_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.DA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_28_0 != 0;
          }
        }
    }

    private final boolean f(byte param0) {
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (param0 == -107) {
              L1: {
                L2: {
                  if (this.j(param0 + 81)) {
                    break L2;
                  } else {
                    if (this.field_jb != 17) {
                      stackIn_9_0 = 0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_9_0 = 1;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.LB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final boolean t(int param0) {
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (param0 >= 25) {
              L1: {
                if (this.field_s != null) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.H(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final void c(int param0, int param1, int param2) {
        ll[] stackIn_143_0 = null;
        ll[] stackIn_144_0 = null;
        int stackIn_144_1 = 0;
        ll[] stackIn_148_0 = null;
        ll[] stackIn_149_0 = null;
        int stackIn_149_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        qb var8_ref_qb = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        qb var12_ref_qb = null;
        int var13_int = 0;
        Object var13 = null;
        int var14 = 0;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        qb var21 = null;
        int var21_int = 0;
        int[] var22 = null;
        int var22_int = 0;
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
        int[] var41 = null;
        qb var42 = null;
        qb var43 = null;
        qb var44 = null;
        qb var45 = null;
        mi var46 = null;
        mi var47 = null;
        var34 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_J) {
                this.a(12, false);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                var35 = new int[]{param1 + this.field_lb, this.field_db + param0};
                var41 = var35;
                if (28 == this.field_jb) {
                  break L3;
                } else {
                  if (-30 == (this.field_jb ^ -1)) {
                    break L3;
                  } else {
                    if (this.field_jb == 30) {
                      break L3;
                    } else {
                      if ((this.field_jb ^ -1) != -33) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              if (-16 + this.field_L.field_H > this.field_db) {
                break L2;
              } else {
                var35[1] = (int)((double)var35[1] - (8.0 * Math.sin(3.141592653589793 * (double)ge.field_r / 64.0) + 2.0));
                break L2;
              }
            }
            L4: {
              var5 = nj.field_n[this.field_u];
              if (-40 == (this.field_jb ^ -1)) {
                if (this.field_F <= 2.5) {
                  break L4;
                } else {
                  var36 = aj.a((ml) null, this.field_db + (-(this.p(-8323) / 2) - -13), false, 166, this.field_L, -(42 * this.field_E) + this.field_lb);
                  var36.field_u = 20 * -this.field_E;
                  var36.field_F = (int)(-5.0 + 15.0 * Math.random());
                  this.field_L.b(52, var36);
                  break L4;
                }
              } else {
                break L4;
              }
            }
            L5: {
              var6 = 0;
              if (-39 != (this.field_jb ^ -1)) {
                break L5;
              } else {
                if (this.field_F <= 0.0) {
                  break L5;
                } else {
                  if (1.0 <= this.field_F) {
                    if (2.0 > this.field_F) {
                      var40 = aj.a((ml) null, -30 + this.field_db - (this.p(-8323) / 2 + -13), false, 166, this.field_L, this.field_lb + this.field_E * 22);
                      var40.field_u = 30 * this.field_E;
                      var40.field_F = (int)(15.0 * Math.random() - 15.0);
                      this.field_L.b(52, var40);
                      break L5;
                    } else {
                      if (this.field_F >= 3.0) {
                        if (4.0 > this.field_F) {
                          var39 = aj.a((ml) null, this.field_db + (-(this.p(param2 ^ -1703912164) / 2) - -13 + -5), false, 166, this.field_L, this.field_lb - -(this.field_E * 22));
                          var39.field_u = 30 * this.field_E;
                          var39.field_F = (int)(Math.random() * 15.0);
                          this.field_L.b(52, var39);
                          break L5;
                        } else {
                          break L5;
                        }
                      } else {
                        var38 = aj.a((ml) null, -12 + (this.field_db + -(this.p(-8323) / 2)), false, 166, this.field_L, this.field_lb - this.field_E * 22);
                        var38.field_u = 10 * -this.field_E;
                        var38.field_F = (int)(15.0 * Math.random() - 10.0);
                        this.field_L.b(52, var38);
                        break L5;
                      }
                    }
                  } else {
                    var37 = aj.a((ml) null, 13 + this.field_db - this.p(param2 ^ -1703912164) / 2, false, 166, this.field_L, -(this.field_E * 22) + this.field_lb);
                    var37.field_u = -this.field_E * 10;
                    var37.field_F = (int)(-5.0 + 15.0 * Math.random());
                    this.field_L.b(52, var37);
                    break L5;
                  }
                }
              }
            }
            L6: {
              if (12 != this.field_jb) {
                break L6;
              } else {
                de.h(param1, param0, this.field_L.field_y + param1, an.field_j);
                go.field_j[29].a(-128 + var35[0], var35[1] + -256);
                de.a();
                break L6;
              }
            }
            L7: {
              if (-41 == (this.field_jb ^ -1)) {
                var7 = (int)(4.0 * Math.sin(this.field_F * 2.0) + 18.0);
                var8 = (int)(32.0 + 4.0 * Math.cos(2.0 * this.field_F));
                var9 = (int)(Math.cos(this.field_F) * 4.0);
                var10 = -8;
                L8: while (true) {
                  if (8 <= var10) {
                    de.b(var41[0] + -2, var41[1], var9 + (var41[0] + -8), var41[1] + -var8, 0);
                    de.b(2 + var41[0], var41[1], 8 + var9 + var41[0], var41[1] - var8, 0);
                    de.b(var41[0] + 2, var41[1], var41[0] - 2, var41[1], 0);
                    de.i(var41[0] + var9, -var8 + var41[1], var7, 16777215);
                    de.c(var41[0] + var9, -var8 + var41[1], var7, 0);
                    de.i(var9 + var41[0], -var8 + var41[1], (int)((double)var7 * 0.66), 255);
                    de.i(var41[0] + var9, var41[1] - var8, (int)(0.33 * (double)var7), 16711680);
                    break L7;
                  } else {
                    de.b(var10 / 4 + var41[0], var41[1], var9 + (var41[0] - -var10), var41[1] - var8, 6303744);
                    var10++;
                    continue L8;
                  }
                }
              } else {
                if (this.field_jb == 20) {
                  uj.field_i[0].c(-(uj.field_i[0].field_n / 2) + var41[0], var41[1] + -this.field_Y);
                  if (this.field_I == null) {
                    break L7;
                  } else {
                    this.field_I.e(var41[0] + -16, var6 + var41[1] + (-(this.field_Y >> -368948671) + -32));
                    break L7;
                  }
                } else {
                  if (this.field_jb == 22) {
                    uj.field_i[1].c(-(uj.field_i[1].field_n / 2) + var35[0], -this.field_Y + var35[1]);
                    if (this.field_I == null) {
                      break L7;
                    } else {
                      this.field_I.e(var35[0] - 16, var6 + (-32 + (var35[1] + -(this.field_Y >> -327960319))));
                      break L7;
                    }
                  } else {
                    if (-39 != (this.field_jb ^ -1)) {
                      if ((this.field_jb ^ -1) != -22) {
                        if (-24 != (this.field_jb ^ -1)) {
                          if (24 != this.field_jb) {
                            if (this.field_jb == 35) {
                              L9: {
                                uj.field_i[5].c(-(uj.field_i[5].field_n / 2) + var41[0], -this.field_Y + var41[1] + 64);
                                if (0 == (this.field_E ^ -1)) {
                                  L10: {
                                    if (null == this.field_B) {
                                      break L10;
                                    } else {
                                      this.field_B.e(-16 + (var41[0] - 8), -16 + (var41[1] - (this.field_Y >> 1296015649)) - -var6);
                                      break L10;
                                    }
                                  }
                                  L11: {
                                    if (this.field_bb == null) {
                                      break L11;
                                    } else {
                                      this.field_bb.e(var41[0] + -16, -16 + var41[1] - (this.field_Y >> -2024840191) - -var6);
                                      break L11;
                                    }
                                  }
                                  L12: {
                                    if (null == this.field_fb) {
                                      break L12;
                                    } else {
                                      this.field_fb.e(8 + (-16 + var41[0]), var41[1] + -(this.field_Y >> -1112801471) + (-16 + var6));
                                      break L12;
                                    }
                                  }
                                  if (null == this.field_I) {
                                    break L9;
                                  } else {
                                    this.field_I.e(var41[0] + -16, var6 + (-32 + (var41[1] + -(this.field_Y >> 801269633))));
                                    break L9;
                                  }
                                } else {
                                  L13: {
                                    if (this.field_B == null) {
                                      break L13;
                                    } else {
                                      this.field_B.c(8 + (-16 + var41[0]), var41[1] + -(this.field_Y >> 6723713) - (16 + -var6));
                                      break L13;
                                    }
                                  }
                                  L14: {
                                    if (null != this.field_bb) {
                                      this.field_bb.c(var41[0] - 16, -16 + (var41[1] - ((this.field_Y >> -2084965599) - var6)));
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    if (null != this.field_fb) {
                                      this.field_fb.c(var41[0] + -24, -(this.field_Y >> 1171247745) + var41[1] + -16 - -var6);
                                      break L15;
                                    } else {
                                      break L15;
                                    }
                                  }
                                  if (null == this.field_I) {
                                    break L9;
                                  } else {
                                    this.field_I.c(-16 + var41[0], var6 + (var41[1] - (this.field_Y >> 1694098401) - 32));
                                    break L9;
                                  }
                                }
                              }
                              L16: {
                                var7 = 255 & jb.field_v;
                                if (128 >= var7) {
                                  break L16;
                                } else {
                                  var7 = 256 - var7;
                                  break L16;
                                }
                              }
                              gn.a(128, (byte) 114, -320 - var7, var41[0], -48 + var41[1]);
                              break L7;
                            } else {
                              L17: {
                                if ((this.field_jb ^ -1) != -27) {
                                  break L17;
                                } else {
                                  if (ff.field_b == null) {
                                    break L17;
                                  } else {
                                    L18: {
                                      var7 = 0;
                                      if (this.field_F <= 1.5) {
                                        break L18;
                                      } else {
                                        var7 = 1;
                                        break L18;
                                      }
                                    }
                                    L19: {
                                      if (this.field_F > 3.0) {
                                        var7 = 2;
                                        break L19;
                                      } else {
                                        break L19;
                                      }
                                    }
                                    L20: {
                                      if (4.5 >= this.field_F) {
                                        break L20;
                                      } else {
                                        var7 = 3;
                                        break L20;
                                      }
                                    }
                                    L21: {
                                      if (0.0 > this.field_F) {
                                        L22: {
                                          var7 = 4;
                                          if (this.field_F > -2.0) {
                                            var7 = 5;
                                            break L22;
                                          } else {
                                            break L22;
                                          }
                                        }
                                        if (this.field_F > -1.0) {
                                          var7 = 6;
                                          break L21;
                                        } else {
                                          break L21;
                                        }
                                      } else {
                                        break L21;
                                      }
                                    }
                                    if ((this.field_E ^ -1) != 0) {
                                      ff.field_b[var7].a(var41[0] + -(this.field_Y >> 1703903841), var41[1] + -this.field_Y);
                                      break L7;
                                    } else {
                                      ff.field_b[var7].d(var41[0] + -(this.field_Y >> -955111135), var41[1] - this.field_Y);
                                      break L7;
                                    }
                                  }
                                }
                              }
                              L23: {
                                if (-40 != (this.field_jb ^ -1)) {
                                  break L23;
                                } else {
                                  if (ub.field_e == null) {
                                    break L23;
                                  } else {
                                    L24: {
                                      var7 = 0;
                                      if (this.field_F <= 1.5) {
                                        break L24;
                                      } else {
                                        var7 = 1;
                                        break L24;
                                      }
                                    }
                                    L25: {
                                      if (this.field_F <= 3.0) {
                                        break L25;
                                      } else {
                                        var7 = 2;
                                        break L25;
                                      }
                                    }
                                    L26: {
                                      if (4.5 < this.field_F) {
                                        var7 = 3;
                                        break L26;
                                      } else {
                                        break L26;
                                      }
                                    }
                                    L27: {
                                      if (0.0 <= this.field_F) {
                                        break L27;
                                      } else {
                                        L28: {
                                          var7 = 4;
                                          if (-2.0 < this.field_F) {
                                            var7 = 5;
                                            break L28;
                                          } else {
                                            break L28;
                                          }
                                        }
                                        if (this.field_F <= -1.0) {
                                          break L27;
                                        } else {
                                          var7 = 6;
                                          break L27;
                                        }
                                      }
                                    }
                                    if (-1 == this.field_E) {
                                      ub.field_e[var7].d(-(this.field_Y >> 1106014241) + var41[0], var41[1] + -this.field_Y);
                                      break L7;
                                    } else {
                                      ub.field_e[var7].a(var41[0] - (this.field_Y >> 417241281), -this.field_Y + var41[1]);
                                      break L7;
                                    }
                                  }
                                }
                              }
                              L29: {
                                if (13 != this.field_jb) {
                                  break L29;
                                } else {
                                  if (rc.field_d != null) {
                                    L30: {
                                      var7 = 0;
                                      if (1.5 >= this.field_F) {
                                        break L30;
                                      } else {
                                        var7 = 1;
                                        break L30;
                                      }
                                    }
                                    L31: {
                                      if (this.field_F > 3.0) {
                                        var7 = 2;
                                        break L31;
                                      } else {
                                        break L31;
                                      }
                                    }
                                    L32: {
                                      if (this.field_F > 4.5) {
                                        var7 = 3;
                                        break L32;
                                      } else {
                                        break L32;
                                      }
                                    }
                                    L33: {
                                      if (0.0 > this.field_F) {
                                        L34: {
                                          var7 = 4;
                                          if (-2.0 >= this.field_F) {
                                            break L34;
                                          } else {
                                            var7 = 5;
                                            break L34;
                                          }
                                        }
                                        if (this.field_F <= -1.0) {
                                          break L33;
                                        } else {
                                          var7 = 6;
                                          break L33;
                                        }
                                      } else {
                                        break L33;
                                      }
                                    }
                                    if (0 != (this.field_E ^ -1)) {
                                      rc.field_d[var7].a(-(this.field_Y >> 668165633) + var41[0], -this.field_Y + var41[1]);
                                      break L7;
                                    } else {
                                      rc.field_d[var7].d(-(this.field_Y >> 411238593) + var41[0], var41[1] - this.field_Y);
                                      break L7;
                                    }
                                  } else {
                                    break L29;
                                  }
                                }
                              }
                              L35: {
                                if (15 != this.field_jb) {
                                  break L35;
                                } else {
                                  if (bk.field_L != null) {
                                    L36: {
                                      var7 = 0;
                                      if (this.field_F <= 1.5) {
                                        break L36;
                                      } else {
                                        var7 = 1;
                                        break L36;
                                      }
                                    }
                                    L37: {
                                      if (3.0 >= this.field_F) {
                                        break L37;
                                      } else {
                                        var7 = 2;
                                        break L37;
                                      }
                                    }
                                    L38: {
                                      if (4.5 < this.field_F) {
                                        var7 = 3;
                                        break L38;
                                      } else {
                                        break L38;
                                      }
                                    }
                                    L39: {
                                      if (this.field_F < 0.0) {
                                        L40: {
                                          var7 = 4;
                                          if (-2.0 >= this.field_F) {
                                            break L40;
                                          } else {
                                            var7 = 5;
                                            break L40;
                                          }
                                        }
                                        if (-1.0 >= this.field_F) {
                                          break L39;
                                        } else {
                                          var7 = 6;
                                          break L39;
                                        }
                                      } else {
                                        break L39;
                                      }
                                    }
                                    if (0 != (this.field_E ^ -1)) {
                                      bk.field_L[var7].a(-(this.field_Y >> -745629247) + var41[0], var41[1] + -this.field_Y);
                                      break L7;
                                    } else {
                                      bk.field_L[var7].d(var41[0] - (this.field_Y >> -1826153247), var41[1] + -this.field_Y);
                                      break L7;
                                    }
                                  } else {
                                    break L35;
                                  }
                                }
                              }
                              L41: {
                                if (14 != this.field_jb) {
                                  break L41;
                                } else {
                                  if (null == jk.field_m) {
                                    break L41;
                                  } else {
                                    L42: {
                                      var7 = 0;
                                      if (this.field_F > 1.5) {
                                        var7 = 1;
                                        break L42;
                                      } else {
                                        break L42;
                                      }
                                    }
                                    L43: {
                                      if (this.field_F <= 3.0) {
                                        break L43;
                                      } else {
                                        var7 = 2;
                                        break L43;
                                      }
                                    }
                                    L44: {
                                      if (this.field_F <= 4.5) {
                                        break L44;
                                      } else {
                                        var7 = 3;
                                        break L44;
                                      }
                                    }
                                    L45: {
                                      if (0.0 <= this.field_F) {
                                        break L45;
                                      } else {
                                        L46: {
                                          var7 = 4;
                                          if (-2.0 >= this.field_F) {
                                            break L46;
                                          } else {
                                            var7 = 5;
                                            break L46;
                                          }
                                        }
                                        if (-1.0 >= this.field_F) {
                                          break L45;
                                        } else {
                                          var7 = 6;
                                          break L45;
                                        }
                                      }
                                    }
                                    if (-1 == this.field_E) {
                                      jk.field_m[var7].d(-(this.field_Y >> -450855967) + var41[0], var41[1] - this.field_Y);
                                      break L7;
                                    } else {
                                      jk.field_m[var7].a(var41[0] + -(this.field_Y >> -948359583), var41[1] - this.field_Y);
                                      break L7;
                                    }
                                  }
                                }
                              }
                              L47: {
                                if (17 != this.field_jb) {
                                  break L47;
                                } else {
                                  if (null == ra.field_c) {
                                    break L47;
                                  } else {
                                    L48: {
                                      var7 = 0;
                                      if (this.field_F > 1.5) {
                                        var7 = 1;
                                        break L48;
                                      } else {
                                        break L48;
                                      }
                                    }
                                    L49: {
                                      if (3.0 < this.field_F) {
                                        var7 = 2;
                                        break L49;
                                      } else {
                                        break L49;
                                      }
                                    }
                                    L50: {
                                      if (4.5 >= this.field_F) {
                                        break L50;
                                      } else {
                                        var7 = 3;
                                        break L50;
                                      }
                                    }
                                    if (-1 == this.field_E) {
                                      L51: {
                                        stackIn_148_0 = ra.field_c;

                                        if (!this.field_U) {
                                          stackIn_149_0 = (ll[]) ((Object) stackIn_148_0);
                                          stackIn_149_1 = 0;
                                          break L51;
                                        } else {
                                          stackIn_149_0 = (ll[]) ((Object) stackIn_148_0);
                                          stackIn_149_1 = 4;
                                          break L51;
                                        }
                                      }
                                      ((ll) (Object) stackIn_149_0[stackIn_149_1 + var7]).d(-(this.field_Y >> -355970495) + var41[0], var41[1] - this.field_Y);
                                      break L7;
                                    } else {
                                      L52: {
                                        stackIn_143_0 = ra.field_c;

                                        if (!this.field_U) {
                                          stackIn_144_0 = (ll[]) ((Object) stackIn_143_0);
                                          stackIn_144_1 = 0;
                                          break L52;
                                        } else {
                                          stackIn_144_0 = (ll[]) ((Object) stackIn_143_0);
                                          stackIn_144_1 = 4;
                                          break L52;
                                        }
                                      }
                                      ((ll) (Object) stackIn_144_0[stackIn_144_1 + var7]).a(var41[0] + -(this.field_Y >> -2026173023), var41[1] - this.field_Y);
                                      break L7;
                                    }
                                  }
                                }
                              }
                              L53: {
                                if (this.field_jb != 6) {
                                  break L53;
                                } else {
                                  if (null == wl.field_U) {
                                    break L53;
                                  } else {
                                    L54: {
                                      var7 = 0;
                                      if (0.75 >= this.field_F) {
                                        break L54;
                                      } else {
                                        var7 = 1;
                                        break L54;
                                      }
                                    }
                                    L55: {
                                      if (this.field_F > 1.5) {
                                        var7 = 2;
                                        break L55;
                                      } else {
                                        break L55;
                                      }
                                    }
                                    L56: {
                                      if (this.field_F <= 2.25) {
                                        break L56;
                                      } else {
                                        var7 = 3;
                                        break L56;
                                      }
                                    }
                                    L57: {
                                      if (3.0 >= this.field_F) {
                                        break L57;
                                      } else {
                                        var7 = 4;
                                        break L57;
                                      }
                                    }
                                    L58: {
                                      if (this.field_F > 3.75) {
                                        var7 = 5;
                                        break L58;
                                      } else {
                                        break L58;
                                      }
                                    }
                                    L59: {
                                      if (4.5 < this.field_F) {
                                        var7 = 6;
                                        break L59;
                                      } else {
                                        break L59;
                                      }
                                    }
                                    L60: {
                                      if (5.25 < this.field_F) {
                                        var7 = 7;
                                        break L60;
                                      } else {
                                        break L60;
                                      }
                                    }
                                    if (-1 != this.field_E) {
                                      wl.field_U[var7].a(var41[0] - 24, -36 + var41[1]);
                                      break L7;
                                    } else {
                                      wl.field_U[var7].d(var41[0] - 24, -36 + var41[1]);
                                      break L7;
                                    }
                                  }
                                }
                              }
                              L61: {
                                if (-8 == (this.field_jb ^ -1)) {
                                  break L61;
                                } else {
                                  if (-10 == (this.field_jb ^ -1)) {
                                    break L61;
                                  } else {
                                    if ((this.field_jb ^ -1) == -3) {
                                      break L61;
                                    } else {
                                      if (this.field_jb == 5) {
                                        break L61;
                                      } else {
                                        if (28 == this.field_jb) {
                                          break L61;
                                        } else {
                                          if (-30 == (this.field_jb ^ -1)) {
                                            break L61;
                                          } else {
                                            if (-31 != (this.field_jb ^ -1)) {
                                              if ((this.field_ab ^ -1) == -4) {
                                                if (0 != (this.field_E ^ -1)) {
                                                  this.field_bb.a(var41[0], -(this.field_Y >> 1969405025) + var41[1], (int)(-this.field_F * 65536.0 / 6.28), 4096);
                                                  break L7;
                                                } else {
                                                  this.field_bb.b().a(var41[0], var41[1] + -(this.field_Y >> -196775359), (int)(this.field_F * 65536.0 / 6.28), 4096);
                                                  break L7;
                                                }
                                              } else {
                                                var7 = this.field_Y;
                                                if ((this.field_E ^ -1) != 0) {
                                                  L62: {
                                                    if (null != this.field_B) {
                                                      this.field_B.c(this.field_r + var41[0] + -(var7 >> -1559999806), var41[1] + -var7 - (-this.field_O - var6));
                                                      break L62;
                                                    } else {
                                                      break L62;
                                                    }
                                                  }
                                                  L63: {
                                                    if (this.field_cb == null) {
                                                      break L63;
                                                    } else {
                                                      this.field_cb.c(-(var7 >> 1101086049) + (var41[0] - -this.field_t), this.field_Z + (-var7 + var41[1]));
                                                      break L63;
                                                    }
                                                  }
                                                  L64: {
                                                    if (null == this.field_bb) {
                                                      break L64;
                                                    } else {
                                                      this.field_bb.c(-(var7 >> 825315041) + var41[0], var41[1] - var7 - -var6);
                                                      break L64;
                                                    }
                                                  }
                                                  L65: {
                                                    if (this.field_jb != 32) {
                                                      if ((this.field_jb ^ -1) != -38) {
                                                        if (null == this.field_I) {
                                                          break L65;
                                                        } else {
                                                          this.field_I.c(-(var7 >> -139200287) + var41[0], var6 + (-(3 * var7 / 2) + var41[1]));
                                                          break L65;
                                                        }
                                                      } else {
                                                        if (this.field_I == null) {
                                                          break L65;
                                                        } else {
                                                          this.field_I.c(var41[0] + -(var7 >> 1403885217), var41[1] + (-(var7 * 3 / 2) + (var6 - 10)));
                                                          break L65;
                                                        }
                                                      }
                                                    } else {
                                                      if (this.field_I != null) {
                                                        this.field_I.c(var41[0] - (var7 >> -1448803231) + 12, var6 + (var41[1] - var7 * 3 / 2));
                                                        break L65;
                                                      } else {
                                                        break L65;
                                                      }
                                                    }
                                                  }
                                                  L66: {
                                                    if (this.field_Q == null) {
                                                      break L66;
                                                    } else {
                                                      this.field_Q.c(var41[0] + -(var7 >> -1414137599) + this.field_y, this.field_o + var41[1] + -var7);
                                                      break L66;
                                                    }
                                                  }
                                                  L67: {
                                                    if (this.field_ab != 0) {
                                                      break L67;
                                                    } else {
                                                      L68: {
                                                        var8 = 0;
                                                        if (this.field_L.field_N != null) {
                                                          var8 = this.field_L.field_N[this.field_T][5] | (this.field_L.field_N[this.field_T][3] << 2016524144 | this.field_L.field_N[this.field_T][4] << -1824116920);
                                                          break L68;
                                                        } else {
                                                          break L68;
                                                        }
                                                      }
                                                      L69: {
                                                        var9 = -4 + (this.field_n + var41[0]) + -(var7 >> 1511088770);
                                                        var10 = this.field_N + (var41[1] - this.field_Y + (8 - -var6));
                                                        var11 = jb.field_v & 255;
                                                        if ((var11 ^ -1) <= -129) {
                                                          var11 = 256 - var11;
                                                          break L69;
                                                        } else {
                                                          break L69;
                                                        }
                                                      }
                                                      var11 += 64;
                                                      de.c(var9, var10, 12, var8, var11);
                                                      de.c(var9, var10, 10, var8, var11);
                                                      de.c(var9, var10, 8, var8, var11);
                                                      var12 = 0;
                                                      L70: while (true) {
                                                        if ((var12 ^ -1) <= -8) {
                                                          break L67;
                                                        } else {
                                                          var13_int = (int)(9.0 * Math.sin(3.14 * (0.1 * (double)jb.field_v + (double)var12) / 3.5)) + var9;
                                                          var14 = var10 + (int)(9.0 * Math.cos(3.14 * ((double)var12 + 0.1 * (double)jb.field_v) / 3.5));
                                                          jg.field_c[var12].b(-2 + var13_int, -2 + var14);
                                                          de.c(var13_int, var14, 4, var8, 32);
                                                          var12++;
                                                          continue L70;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  L71: {
                                                    if (-2 == (this.field_ab ^ -1)) {
                                                      gn.a(12, (byte) 73, 128, -4 + (this.field_n + -(var7 >> 2102388450)) + var41[0], var6 + this.field_N + var41[1] + (-this.field_Y + 8));
                                                      var8 = -4 + -(var7 >> -93290590) + (this.field_n - -(int)(-6.0 + 13.0 * Math.random()));
                                                      var9 = -this.field_Y + 8 + this.field_N - (-var6 + -(int)(-18.0 + 13.0 * Math.random()) - (-6 + Math.abs(-this.field_n + var8 + (var7 >> -53822174) - -4)));
                                                      var47 = aj.a((ml) null, this.field_db + var9, false, 109, this.field_L, this.field_lb + var8);
                                                      var47.field_y = 16;
                                                      this.field_L.b(52, var47);
                                                      break L71;
                                                    } else {
                                                      break L71;
                                                    }
                                                  }
                                                  L72: {
                                                    if (this.field_fb == null) {
                                                      break L72;
                                                    } else {
                                                      this.field_fb.c(this.field_n + -(var7 >> -493976734) + var41[0] - (var7 >> 2146500961), var6 + -var7 + (var41[1] - -this.field_N));
                                                      break L72;
                                                    }
                                                  }
                                                  if ((this.field_jb ^ -1) != -19) {
                                                    break L7;
                                                  } else {
                                                    if (null == gi.field_m) {
                                                      break L7;
                                                    } else {
                                                      L73: {
                                                        var8 = 0;
                                                        if (this.field_F <= 1.5) {
                                                          break L73;
                                                        } else {
                                                          var8 = 1;
                                                          break L73;
                                                        }
                                                      }
                                                      L74: {
                                                        if (3.0 < this.field_F) {
                                                          var8 = 2;
                                                          break L74;
                                                        } else {
                                                          break L74;
                                                        }
                                                      }
                                                      L75: {
                                                        if (4.5 >= this.field_F) {
                                                          break L75;
                                                        } else {
                                                          var8 = 3;
                                                          break L75;
                                                        }
                                                      }
                                                      gi.field_m[var8].a(-48 + var41[0], -48 + var41[1]);
                                                      break L7;
                                                    }
                                                  }
                                                } else {
                                                  L76: {
                                                    if (null != this.field_B) {
                                                      this.field_B.e(-(var7 >> -1083108222) + (-(var7 >> -2077559391) + var41[0]) - this.field_r, this.field_O + (-var7 + var41[1]) - -var6);
                                                      break L76;
                                                    } else {
                                                      break L76;
                                                    }
                                                  }
                                                  L77: {
                                                    if (this.field_cb == null) {
                                                      break L77;
                                                    } else {
                                                      this.field_cb.e(-(var7 >> -1060412223) + var41[0] - this.field_t, this.field_Z + (-var7 + var41[1]));
                                                      break L77;
                                                    }
                                                  }
                                                  L78: {
                                                    if (this.field_bb != null) {
                                                      this.field_bb.e(var41[0] - (var7 >> -1212619103), var6 + (-var7 + var41[1]));
                                                      break L78;
                                                    } else {
                                                      break L78;
                                                    }
                                                  }
                                                  L79: {
                                                    if (this.field_jb == 32) {
                                                      if (this.field_I == null) {
                                                        break L79;
                                                      } else {
                                                        this.field_I.e(-12 + -(var7 >> 13165761) + var41[0], var6 + (-(3 * var7 / 2) + var41[1]));
                                                        break L79;
                                                      }
                                                    } else {
                                                      if (37 == this.field_jb) {
                                                        if (this.field_I != null) {
                                                          this.field_I.e(var41[0] - (var7 >> -305420351), var41[1] + (-(var7 * 3 / 2) + (var6 - 10)));
                                                          break L79;
                                                        } else {
                                                          break L79;
                                                        }
                                                      } else {
                                                        if (null != this.field_I) {
                                                          this.field_I.e(-(var7 >> -41047807) + var41[0], var6 + -(3 * var7 / 2) + var41[1]);
                                                          break L79;
                                                        } else {
                                                          break L79;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  L80: {
                                                    if (null != this.field_Q) {
                                                      this.field_Q.e(-this.field_y + -(var7 >> 2121690849) + var41[0], this.field_o + (-var7 + var41[1]));
                                                      break L80;
                                                    } else {
                                                      break L80;
                                                    }
                                                  }
                                                  L81: {
                                                    if ((this.field_ab ^ -1) != -2) {
                                                      break L81;
                                                    } else {
                                                      gn.a(12, (byte) 117, 128, var41[0] + ((var7 >> 756631234) + -this.field_n + 4), this.field_N + (8 + var41[1] + (-this.field_Y - -var6)));
                                                      var8 = -this.field_n + (var7 >> -1205680158) - (-4 - (int)(13.0 * Math.random() - 6.0));
                                                      var9 = this.field_N + -this.field_Y - -8 - (-var6 - (int)(Math.random() * 13.0 - 18.0) - (-6 - -Math.abs(-4 + (var8 + -(var7 >> 1992415010)) + this.field_n)));
                                                      var46 = aj.a((ml) null, this.field_db + var9, false, 109, this.field_L, this.field_lb + var8);
                                                      var46.field_y = 16;
                                                      this.field_L.b(52, var46);
                                                      break L81;
                                                    }
                                                  }
                                                  L82: {
                                                    if (this.field_ab == 0) {
                                                      L83: {
                                                        var8 = 0;
                                                        if (this.field_L.field_N == null) {
                                                          break L83;
                                                        } else {
                                                          var8 = this.field_L.field_N[this.field_T][5] | (this.field_L.field_N[this.field_T][3] << -1008437328 | this.field_L.field_N[this.field_T][4] << 1373199240);
                                                          break L83;
                                                        }
                                                      }
                                                      L84: {
                                                        var9 = 4 + ((var7 >> 1112750562) + var41[0] + -this.field_n);
                                                        var10 = this.field_N + (-this.field_Y + var41[1]) - (-8 + -var6);
                                                        var11 = 255 & jb.field_v;
                                                        if (var11 < 128) {
                                                          break L84;
                                                        } else {
                                                          var11 = -var11 + 256;
                                                          break L84;
                                                        }
                                                      }
                                                      var11 += 64;
                                                      de.c(var9, var10, 12, var8, var11);
                                                      de.c(var9, var10, 10, var8, var11);
                                                      de.c(var9, var10, 8, var8, var11);
                                                      var12 = 0;
                                                      L85: while (true) {
                                                        if (-8 >= (var12 ^ -1)) {
                                                          break L82;
                                                        } else {
                                                          var13_int = var9 - -(int)(9.0 * Math.sin(3.14 * ((double)var12 + 0.1 * (double)jb.field_v) / 3.5));
                                                          var14 = (int)(9.0 * Math.cos(((double)jb.field_v * 0.1 + (double)var12) * 3.14 / 3.5)) + var10;
                                                          jg.field_c[var12].b(-2 + var13_int, var14 + -2);
                                                          de.c(var13_int, var14, 4, var8, 32);
                                                          var12++;
                                                          continue L85;
                                                        }
                                                      }
                                                    } else {
                                                      break L82;
                                                    }
                                                  }
                                                  L86: {
                                                    if (null == this.field_fb) {
                                                      break L86;
                                                    } else {
                                                      this.field_fb.e(-(var7 >> -318913566) + (var41[0] + -this.field_n), this.field_N + (var41[1] + -var7 + var6));
                                                      break L86;
                                                    }
                                                  }
                                                  if (-19 != (this.field_jb ^ -1)) {
                                                    break L7;
                                                  } else {
                                                    if (gi.field_m == null) {
                                                      break L7;
                                                    } else {
                                                      L87: {
                                                        var8 = 0;
                                                        if (this.field_F <= 1.5) {
                                                          break L87;
                                                        } else {
                                                          var8 = 1;
                                                          break L87;
                                                        }
                                                      }
                                                      L88: {
                                                        if (3.0 >= this.field_F) {
                                                          break L88;
                                                        } else {
                                                          var8 = 2;
                                                          break L88;
                                                        }
                                                      }
                                                      L89: {
                                                        if (this.field_F <= 4.5) {
                                                          break L89;
                                                        } else {
                                                          var8 = 3;
                                                          break L89;
                                                        }
                                                      }
                                                      gi.field_m[var8].d(-32 + (var41[0] + 16), var41[1] - 48);
                                                      break L7;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L61;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L90: {
                                L91: {
                                  var7 = this.field_Y;
                                  if ((this.field_jb ^ -1) == -8) {
                                    break L91;
                                  } else {
                                    if ((this.field_jb ^ -1) == -10) {
                                      break L91;
                                    } else {
                                      break L90;
                                    }
                                  }
                                }
                                var7 = 64;
                                break L90;
                              }
                              L92: {
                                var42 = this.field_fb;
                                var8_ref_qb = var42;
                                var9 = -(var7 >> 1427873218) + var41[0] - this.field_n;
                                if (-1 != this.field_E) {
                                  var9 = -(var7 >> -1876659646) + (var41[0] + -(var7 >> -153590463) + this.field_n);
                                  break L92;
                                } else {
                                  break L92;
                                }
                              }
                              L93: {
                                var10 = var41[1] + -var7 + (this.field_O - -var6);
                                if ((this.field_E ^ -1) != 0) {
                                  break L93;
                                } else {
                                  var8_ref_qb = var42.b();
                                  break L93;
                                }
                              }
                              L94: {
                                var11 = 0;
                                if (this.field_gb == null) {
                                  break L94;
                                } else {
                                  if (121 == this.field_gb.field_I) {
                                    break L94;
                                  } else {
                                    if (this.field_gb.field_I == 138) {
                                      var11 = 1;
                                      break L94;
                                    } else {
                                      if (2 != this.field_jb) {
                                        if (30 == this.field_jb) {
                                          if (-13 >= (this.field_gb.field_y ^ -1)) {
                                            var9 = var9 - (25 - this.field_gb.field_y) * 5 * this.field_gb.field_u / 50;
                                            var10 = var10 - (25 + -this.field_gb.field_y) * 5 * this.field_gb.field_F / 50;
                                            break L94;
                                          } else {
                                            var10 = var10 - 5 * this.field_gb.field_F * this.field_gb.field_y / 50;
                                            var9 = var9 - this.field_gb.field_y * this.field_gb.field_u * 5 / 50;
                                            break L94;
                                          }
                                        } else {
                                          L95: {
                                            if (this.field_jb == 9) {
                                              break L95;
                                            } else {
                                              if (this.field_jb == 5) {
                                                break L95;
                                              } else {
                                                L96: {
                                                  if ((this.field_jb ^ -1) == -29) {
                                                    break L96;
                                                  } else {
                                                    if (this.field_jb != 29) {
                                                      if (-8 != (this.field_jb ^ -1)) {
                                                        break L94;
                                                      } else {
                                                        var9 = var9 + this.field_gb.field_u / 2;
                                                        var10 = var10 + this.field_gb.field_F / 2;
                                                        var12_ref_qb = var8_ref_qb;
                                                        var44 = new qb(128, 128);
                                                        var8_ref_qb = var44;
                                                        var10 -= 32;
                                                        var9 -= 32;
                                                        var44.a();
                                                        var12_ref_qb.b(512, 768, 1024, 1024, this.field_E * -this.field_gb.field_y * 8000, 4096);
                                                        ce.field_m.a(true);
                                                        break L94;
                                                      }
                                                    } else {
                                                      break L96;
                                                    }
                                                  }
                                                }
                                                var10 = var10 - this.field_gb.field_y * this.field_gb.field_F / 100;
                                                var9 = var9 - this.field_gb.field_y * this.field_gb.field_u / 100;
                                                var12_ref_qb = var8_ref_qb;
                                                var43 = new qb(2 * this.field_Y, this.field_Y * 2);
                                                var8_ref_qb = var43;
                                                var9 = var9 - this.field_Y / 2;
                                                var10 = var10 - this.field_Y / 2;
                                                var43.a();
                                                var12_ref_qb.b(this.field_Y / 2 << 1882738244, 3 * this.field_Y / 4 << 632778852, this.field_Y << 1126029156, this.field_Y << 595061316, this.field_E * 4000 * -this.field_gb.field_y, 4096);
                                                ce.field_m.a(true);
                                                break L94;
                                              }
                                            }
                                          }
                                          var9 = var9 + this.field_gb.field_u * this.field_gb.field_y / 200;
                                          var10 = var10 + this.field_gb.field_y * this.field_gb.field_F / 200;
                                          var12_ref_qb = var8_ref_qb;
                                          var9 -= 32;
                                          var10 -= 32;
                                          var45 = new qb(128, 128);
                                          var8_ref_qb = var45;
                                          var45.a();
                                          var12_ref_qb.b(512, 768, 1024, 1024, this.field_E * 4000 * -this.field_gb.field_y, 4096);
                                          ce.field_m.a(true);
                                          break L94;
                                        }
                                      } else {
                                        if (-13 < (this.field_gb.field_y ^ -1)) {
                                          var9 = var9 + this.field_gb.field_y * this.field_gb.field_u / 100;
                                          var10 = var10 + this.field_gb.field_y * this.field_gb.field_F / 100;
                                          break L94;
                                        } else {
                                          var10 = var10 + (-this.field_gb.field_y + 25) * this.field_gb.field_F / 100;
                                          var9 = var9 + this.field_gb.field_u * (-this.field_gb.field_y + 25) / 100;
                                          break L94;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              if (-1 == this.field_E) {
                                L97: {
                                  if (this.field_B == null) {
                                    break L97;
                                  } else {
                                    this.field_B.e(-this.field_r + var41[0] - (var7 >> -1223359359) + -(var7 >> 1212325410), this.field_O + (-var7 + (var41[1] - -var6)));
                                    break L97;
                                  }
                                }
                                L98: {
                                  if (this.field_cb != null) {
                                    this.field_cb.e(var41[0] + -(var7 >> -271457279) - this.field_t, -var7 + (var41[1] + this.field_Z));
                                    break L98;
                                  } else {
                                    break L98;
                                  }
                                }
                                L99: {
                                  if (this.field_bb != null) {
                                    this.field_bb.e(var41[0] + -(var7 >> 785879457), -var7 + (var41[1] + var6));
                                    break L99;
                                  } else {
                                    break L99;
                                  }
                                }
                                L100: {
                                  if (this.field_I == null) {
                                    break L100;
                                  } else {
                                    if (var11 == 0) {
                                      this.field_I.e(var41[0] + -(var7 >> 1262758529), var41[1] - var7 * 3 / 2 + var6);
                                      break L100;
                                    } else {
                                      var12 = (int)(Math.sin(0.2 * (double)jb.field_v) * (500.0 * Math.random() + 1000.0));
                                      this.field_I.b().a(4096, var41[1] + (-(var7 * 3 / 4) - -var6), 19, var41[0], var12);
                                      break L100;
                                    }
                                  }
                                }
                                L101: {
                                  if (this.field_Q == null) {
                                    break L101;
                                  } else {
                                    this.field_Q.e(-this.field_y + (var41[0] + -(var7 >> -990635199)), this.field_o + (var41[1] + -var7));
                                    break L101;
                                  }
                                }
                                if (this.field_fb == null) {
                                  break L7;
                                } else {
                                  var8_ref_qb.c(var9, var10);
                                  break L7;
                                }
                              } else {
                                L102: {
                                  if (this.field_B == null) {
                                    break L102;
                                  } else {
                                    this.field_B.c(-(var7 >> -791114718) + (var41[0] + this.field_r), var6 + (var41[1] - var7 + this.field_O));
                                    break L102;
                                  }
                                }
                                L103: {
                                  if (this.field_cb != null) {
                                    this.field_cb.c(-(var7 >> -2062000511) + var41[0] - -this.field_t, this.field_Z + (var41[1] - var7));
                                    break L103;
                                  } else {
                                    break L103;
                                  }
                                }
                                L104: {
                                  if (this.field_bb != null) {
                                    this.field_bb.c(var41[0] + -(var7 >> -1669721471), var6 + -var7 + var41[1]);
                                    break L104;
                                  } else {
                                    break L104;
                                  }
                                }
                                L105: {
                                  if (this.field_I == null) {
                                    break L105;
                                  } else {
                                    if (var11 == 0) {
                                      this.field_I.c(var41[0] - (var7 >> 1298036705), var6 + -(var7 * 3 / 2) + var41[1]);
                                      break L105;
                                    } else {
                                      var12 = -(int)(Math.sin((double)jb.field_v * 0.2) * (500.0 * Math.random() + 1000.0));
                                      this.field_I.a(4096, -(3 * var7 / 4) + (var41[1] - -var6), param2 ^ 1703903772, var41[0], var12);
                                      break L105;
                                    }
                                  }
                                }
                                L106: {
                                  if (null == this.field_Q) {
                                    break L106;
                                  } else {
                                    this.field_Q.c(-(var7 >> -2027413439) + var41[0] + this.field_y, this.field_o + (-var7 + var41[1]));
                                    break L106;
                                  }
                                }
                                if (this.field_fb == null) {
                                  break L7;
                                } else {
                                  var8_ref_qb.c(var9, var10);
                                  break L7;
                                }
                              }
                            }
                          } else {
                            uj.field_i[4].c(var41[0] - uj.field_i[4].field_n / 2, -this.field_Y + var41[1]);
                            if (this.field_I != null) {
                              this.field_I.e(var41[0] + -16, var6 + var41[1] - (this.field_Y >> -1600813727) - 32);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                        } else {
                          uj.field_i[3].c(-(uj.field_i[3].field_n / 2) + var41[0], var41[1] + -this.field_Y);
                          if (this.field_I != null) {
                            this.field_I.e(var41[0] - 16, var6 + (-32 + var41[1] - (this.field_Y >> 1449610177)));
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      } else {
                        uj.field_i[2].c(-(uj.field_i[2].field_n / 2) + var41[0], -this.field_Y + var41[1]);
                        if (null == this.field_I) {
                          break L7;
                        } else {
                          this.field_I.e(-16 + var41[0], var41[1] + -(this.field_Y >> 507989281) + (-32 - -var6));
                          break L7;
                        }
                      }
                    } else {
                      uj.field_i[6].c(-(uj.field_i[6].field_n / 2) + var35[0], -this.field_Y + var35[1]);
                      if (null == this.field_I) {
                        break L7;
                      } else {
                        this.field_I.e(-16 + var35[0], var6 + -(this.field_Y >> -1815421503) + var35[1] + -32);
                        break L7;
                      }
                    }
                  }
                }
              }
            }
            L107: {
              if (this.field_q > 0) {
                break L107;
              } else {
                if (!this.field_D) {
                  break L107;
                } else {
                  if (this.field_jb == 12) {
                    break L107;
                  } else {
                    if (-41 == (this.field_jb ^ -1)) {
                      break L107;
                    } else {
                      var7 = 0;
                      L108: while (true) {
                        if ((var7 ^ -1) <= -4) {
                          break L107;
                        } else {
                          L109: {
                            var8 = var41[0] - -(int)(Math.sin(3.14 * (double)var7 / 1.5 + 0.125 * (double)jb.field_v) * 16.0);
                            var9 = -this.field_Y + (var41[1] - 10);
                            var10 = (int)(Math.cos(3.14 * (double)var7 / 1.5 + 0.125 * (double)jb.field_v) * 8.0);
                            if (-1 <= (var10 ^ -1)) {
                              bb.field_g[(3 * var7 + jb.field_v / 7 & 1) + 86].e(var8 + -20, var9 - (-var10 + 20));
                              break L109;
                            } else {
                              bb.field_g[(1 & jb.field_v / 7 + var7 * 3) + 86].c(var8 + -20, -20 + (var9 + var10));
                              break L109;
                            }
                          }
                          var7++;
                          continue L108;
                        }
                      }
                    }
                  }
                }
              }
            }
            L110: {
              if (this.field_u == this.field_T) {
                var7 = this.field_L.field_x[this.field_T];
                if (-11 == (var7 ^ -1)) {
                  break L110;
                } else {
                  if (-1 > (this.field_L.field_X[this.field_T] ^ -1)) {
                    L111: {
                      var8 = this.field_L.field_Ab[this.field_T];
                      var9 = this.field_L.field_o[this.field_T];
                      var10 = var8 - -param1;
                      var11 = var9 + param0;
                      var12 = 0;
                      var13 = null;
                      var14 = 10;
                      if (0 != var7) {
                        break L111;
                      } else {
                        var12 = 1;
                        var13 = lf.field_c;
                        break L111;
                      }
                    }
                    L112: {
                      if ((var7 ^ -1) == -2) {
                        var13 = tf.field_j;
                        break L112;
                      } else {
                        break L112;
                      }
                    }
                    L113: {
                      if ((var7 ^ -1) != -3) {
                        break L113;
                      } else {
                        var12 = 1;
                        var13 = ij.field_Pb;
                        break L113;
                      }
                    }
                    L114: {
                      if (3 == var7) {
                        var13 = fo.field_g;
                        break L114;
                      } else {
                        break L114;
                      }
                    }
                    L115: {
                      if ((var7 ^ -1) != -5) {
                        break L115;
                      } else {
                        var12 = 1;
                        var13 = fc.field_e;
                        break L115;
                      }
                    }
                    L116: {
                      if ((var7 ^ -1) != -6) {
                        break L116;
                      } else {
                        var13 = ji.field_h;
                        var12 = 1;
                        break L116;
                      }
                    }
                    L117: {
                      if ((var7 ^ -1) == -7) {
                        var13 = rc.field_k;
                        var12 = 1;
                        break L117;
                      } else {
                        break L117;
                      }
                    }
                    L118: {
                      if (-8 == (var7 ^ -1)) {
                        var13 = eo.field_a;
                        break L118;
                      } else {
                        break L118;
                      }
                    }
                    L119: {
                      if ((var7 ^ -1) != -9) {
                        break L119;
                      } else {
                        var14 = 3;
                        var12 = 1;
                        var13 = ae.field_a;
                        break L119;
                      }
                    }
                    L120: {
                      L121: {
                        var15 = new int[]{255, 0, 0};
                        var16 = new int[]{0, 255, 0};
                        var17 = new int[]{0, 0, 255};
                        var18 = new int[]{255, 255, 255};
                        var19 = this.field_u;
                        if (-1 == (var19 ^ -1)) {
                          break L121;
                        } else {
                          if (3 == var19) {
                            break L121;
                          } else {
                            if (-5 == (var19 ^ -1)) {
                              break L121;
                            } else {
                              break L120;
                            }
                          }
                        }
                      }
                      var15[2] = 255;
                      var15[1] = 255;
                      break L120;
                    }
                    L122: {
                      L123: {
                        if (-2 == (var19 ^ -1)) {
                          break L123;
                        } else {
                          if ((var19 ^ -1) == -4) {
                            break L123;
                          } else {
                            if (var19 != 5) {
                              break L122;
                            } else {
                              break L123;
                            }
                          }
                        }
                      }
                      var16[0] = 255;
                      var16[2] = 255;
                      break L122;
                    }
                    L124: {
                      L125: {
                        if ((var19 ^ -1) == -3) {
                          break L125;
                        } else {
                          if (var19 == 4) {
                            break L125;
                          } else {
                            if (var19 == 5) {
                              break L125;
                            } else {
                              break L124;
                            }
                          }
                        }
                      }
                      var17[2] = 255;
                      var17[0] = 255;
                      break L124;
                    }
                    L126: {
                      if (this.field_L.field_N == null) {
                        break L126;
                      } else {
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
                        break L126;
                      }
                    }
                    if (var12 != 0) {
                      L127: {
                        L128: {
                          var20 = jb.field_v / var14 % java.lang.reflect.Array.getLength(var13);
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
                            break L128;
                          } else {
                            if (-7 != (var7 ^ -1)) {
                              break L127;
                            } else {
                              break L128;
                            }
                          }
                        }
                        var25 = -1;
                        break L127;
                      }
                      L129: {
                        if (-1 >= (this.field_E ^ -1)) {
                          break L129;
                        } else {
                          if (var7 == 4) {
                            break L129;
                          } else {
                            var21.e(-(((qb) (((Object[]) (var13))[var20])).field_n / 2) + var10, -var25 + -((qb) (((Object[]) (var13))[var20])).field_w + var11);
                            break L110;
                          }
                        }
                      }
                      L130: {
                        if ((var7 ^ -1) != -5) {
                          break L130;
                        } else {
                          if (-1 <= ((-1 + this.field_L.field_X[this.field_u]) % 5 - (-1 - -((this.field_L.field_X[this.field_u] + -1) / 5)) ^ -1)) {
                            break L110;
                          } else {
                            break L130;
                          }
                        }
                      }
                      var21.c(-(((qb) (((Object[]) (var13))[var20])).field_n / 2) + var10, -((qb) (((Object[]) (var13))[var20])).field_w + var11 + -var25);
                      break L110;
                    } else {
                      L131: {
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
                          break L131;
                        } else {
                          var20 = (int)(4.0 * Math.sin((double)(jb.field_v >> 1862564323)) + 4.0);
                          var21_int = -var20;
                          var22_int = (int)(Math.sin((double)(jb.field_v >> -1248468574)) * 4.0);
                          var23 = -var22_int;
                          break L131;
                        }
                      }
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
                        var31.e(var10 - 32, -32 + var11);
                        break L110;
                      } else {
                        var31.c(var10 + -32, -32 + var11);
                        break L110;
                      }
                    }
                  } else {
                    break L110;
                  }
                }
              } else {
                break L110;
              }
            }
            L132: {
              if (this.field_z) {
                break L132;
              } else {
                if ((this.field_jb ^ -1) == -13) {
                  break L132;
                } else {
                  if ((this.field_jb ^ -1) != -41) {
                    L133: {
                      L134: {
                        var7 = this.field_ib;
                        if ((this.field_jb ^ -1) == -33) {
                          break L134;
                        } else {
                          if (27 == this.field_jb) {
                            break L134;
                          } else {
                            break L133;
                          }
                        }
                      }
                      var7 = var7 * 2;
                      break L133;
                    }
                    L135: {
                      if (0 >= this.field_q) {
                        break L135;
                      } else {
                        var7 = var7 + this.field_q;
                        break L135;
                      }
                    }
                    var8 = tj.field_t.field_C / 2;
                    mi.field_B.a(Integer.toString(var7), -var8 + param1 + this.field_lb, -(var8 * 2) + (param0 + this.field_db) + (-this.field_Y - 2), var8 * 2, var8 * 2, (var5 | 8421504) ^ 8421504, 0, 1, 1, tj.field_t.field_C);
                    mi.field_B.a(Integer.toString(var7), -1 + (-var8 + (param1 + this.field_lb)), -this.field_Y + param0 + (this.field_db + -(var8 * 2) + -1), 2 * var8, var8 * 2, 8421504 ^ (var5 | 8421504), 0, 1, 1, tj.field_t.field_C);
                    mi.field_B.a(Integer.toString(var7), param1 + this.field_lb + -var8, -(2 * var8) + (this.field_db - -param0) - (this.field_Y - -1), var8 * 2, var8 * 2, var5, -1, 1, 1, tj.field_t.field_C);
                    if (null != this.field_s) {
                      break L132;
                    } else {
                      if (this.field_T >= this.field_L.field_q) {
                        break L132;
                      } else {
                        if (this.field_L.field_S[this.field_T] <= 0) {
                          break L132;
                        } else {
                          rb.field_o[-1 + this.field_L.field_S[this.field_T]].d(param1 + (this.field_lb - 15), -(var8 * 2) + -this.field_Y + (param0 + this.field_db + -13), var5);
                          break L132;
                        }
                      }
                    }
                  } else {
                    break L132;
                  }
                }
              }
            }
            L136: {
              if (param2 == 1703903841) {
                break L136;
              } else {
                this.field_L = (nf) null;
                break L136;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var4), "ml.PA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean i(int param0) {
        int var2_int = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              var2_int = -108 / ((33 - param0) / 56);
              if ((this.field_x ^ -1) >= -1) {
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.BB(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    private final boolean e(boolean param0) {
        int dupTemp$0 = 0;
        int[] stackIn_15_0 = null;
        nf stackIn_15_1 = null;
        int[] stackIn_16_0 = null;
        nf stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        int stackIn_20_0 = 0;
        int stackIn_27_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        ml var3 = null;
        try {
          L0: {
            L1: {
              if (-1 <= (this.field_x ^ -1)) {
                break L1;
              } else {
                L2: {
                  if (19 == this.field_jb) {
                    this.field_jb = 0;
                    this.field_z = true;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  this.a((byte) 101, 2);
                  if ((this.field_q ^ -1) < -1) {
                    L4: {
                      var3 = this.field_L.a(this.field_L.d(false), true);
                      if (var3 == null) {
                        break L4;
                      } else {
                        if (var3.g((byte) 103)) {
                          L5: {
                            stackIn_15_0 = this.field_L.field_R;

                            stackIn_15_1 = this.field_L;

                            if (param0) {
                              stackIn_16_0 = (int[]) ((Object) stackIn_15_0);
                              stackIn_16_1 = (nf) ((Object) stackIn_15_1);
                              stackIn_16_2 = 0;
                              break L5;
                            } else {
                              stackIn_16_0 = (int[]) ((Object) stackIn_15_0);
                              stackIn_16_1 = (nf) ((Object) stackIn_15_1);
                              stackIn_16_2 = 1;
                              break L5;
                            }
                          }
                          dupTemp$0 = ((nf) (Object) stackIn_16_1).d(stackIn_16_2 != 0);
                          stackIn_16_0[dupTemp$0] = stackIn_16_0[dupTemp$0] + this.field_x;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_q = this.field_q - this.field_x;
                    break L3;
                  } else {
                    this.field_ib = this.field_ib - this.field_x;
                    break L3;
                  }
                }
                if (this.field_ib > 0) {
                  break L1;
                } else {
                  this.field_M = 0;
                  this.field_L.a((ml) (this), 0);
                  this.d(this.field_L.d(false), 120);
                  stackIn_20_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
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
              stackIn_27_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_D = true;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.SA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_20_0 != 0;
        } else {
          return stackIn_27_0 != 0;
        }
    }

    final ml w(int param0) {
        RuntimeException var2 = null;
        ml stackIn_3_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 24501) {
                break L1;
              } else {
                this.field_bb = (qb) null;
                break L1;
              }
            }
            stackIn_3_0 = this.field_s;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.EB(" + param0 + ')');
        }
        return stackIn_3_0;
    }

    final boolean q(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 > 12) {
              stackIn_4_0 = this.field_U;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.KB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void z(int param0) {
        boolean discarded$0 = false;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -11) {
                break L1;
              } else {
                discarded$0 = this.f((byte) 37);
                break L1;
              }
            }
            L2: {
              if (!this.s(-1)) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            L3: {
              var2_int = stackIn_5_0;
              if (12 != this.field_jb) {
                break L3;
              } else {
                var2_int = 1;
                break L3;
              }
            }
            L4: {
              L5: {
                if ((this.field_jb ^ -1) == -23) {
                  break L5;
                } else {
                  if (-5 == (this.field_jb ^ -1)) {
                    break L5;
                  } else {
                    if (this.field_jb == 5) {
                      break L5;
                    } else {
                      if ((this.field_L.field_x[this.field_u] ^ -1) != -4) {
                        break L4;
                      } else {
                        if (0 >= this.field_L.field_X[this.field_u]) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
              }
              if (this.field_lb < 0) {
                break L4;
              } else {
                if (this.field_lb > this.field_L.field_y) {
                  break L4;
                } else {
                  if (-32 + this.field_L.field_H >= this.field_db) {
                    break L4;
                  } else {
                    L6: {
                      if (this.field_ib > 5) {
                        break L6;
                      } else {
                        if (0 < this.field_q) {
                          break L6;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_db = -32 + this.field_L.field_H;
                    this.field_L.a(-115, this.field_lb - 24, gj.field_f[9], -gj.field_f[9].field_f + this.field_L.field_H + -32);
                    this.field_L.a(param0 ^ 117, -8 + this.field_lb, gj.field_f[9], -gj.field_f[9].field_f + -32 + this.field_L.field_H);
                    this.field_L.a(param0 + 92, 8 + this.field_lb, gj.field_f[9], this.field_L.field_H - 32 - gj.field_f[9].field_f);
                    if (22 != this.field_jb) {
                      this.field_ib = this.field_ib - 5;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            }
            L7: {
              if (var2_int == 0) {
                this.n(-126);
                break L7;
              } else {
                this.d(true);
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.BA(" + param0 + ')');
        }
    }

    final void k(int param0) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int stackIn_162_0 = 0;
        int stackIn_168_0 = 0;
        int stackIn_169_0 = 0;
        int stackIn_169_1 = 0;
        int stackIn_194_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
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
        var6_ref = null;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_T == this.field_u) {
                var2_int = this.field_L.field_x[this.field_T];
                if (10 == var2_int) {
                  break L1;
                } else {
                  if (-1 > (this.field_L.field_X[this.field_T] ^ -1)) {
                    L2: {
                      L3: {
                        var3 = this.field_L.field_Ab[this.field_T];
                        var4 = this.field_L.field_o[this.field_T];
                        var5_int = this.field_lb + -(this.field_E * this.field_Y / 2);
                        var6 = this.field_db - this.field_Y / 2;
                        if (-2 == (var2_int ^ -1)) {
                          break L3;
                        } else {
                          if (-8 == (var2_int ^ -1)) {
                            break L3;
                          } else {
                            if (3 != var2_int) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      var6 = this.field_db;
                      var5_int = -(this.field_E * this.field_Y / 2) + this.field_lb;
                      var7 = 0;
                      L4: while (true) {
                        if (var7 >= 32) {
                          L5: {
                            if (this.field_L.a(2 + var6, var5_int, (byte) -83)) {
                              break L5;
                            } else {
                              var5_int = this.field_lb + -(this.field_E * this.field_Y / 4);
                              var6 = this.field_db;
                              break L5;
                            }
                          }
                          L6: {
                            if (var6 > var4) {
                              var4++;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          if (var4 <= var6) {
                            break L2;
                          } else {
                            var4--;
                            break L2;
                          }
                        } else {
                          L7: {
                            if (!this.field_L.a(var6, var5_int, (byte) -83)) {
                              var6 += 2;
                              break L7;
                            } else {
                              var6 -= 2;
                              break L7;
                            }
                          }
                          var7 += 2;
                          continue L4;
                        }
                      }
                    }
                    L8: {
                      if ((var2_int ^ -1) != -7) {
                        break L8;
                      } else {
                        if (null != rc.field_k) {
                          L9: {
                            if (13 > jb.field_v / 10 % rc.field_k.length) {
                              break L9;
                            } else {
                              if (this.field_z) {
                                break L9;
                              } else {
                                var5_int = this.field_lb;
                                var3 = this.field_lb;
                                var6 = this.field_db;
                                var4 = this.field_db;
                                break L8;
                              }
                            }
                          }
                          var5_int = var3;
                          var6 = var4;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L10: {
                      if (2 != var2_int) {
                        break L10;
                      } else {
                        if (null != rc.field_k) {
                          L11: {
                            if (jb.field_v / 10 % ij.field_Pb.length < ij.field_Pb.length - 1) {
                              break L11;
                            } else {
                              if (this.field_z) {
                                break L11;
                              } else {
                                var5_int = this.field_lb;
                                var3 = this.field_lb;
                                var6 = -16 + -this.field_Y + this.field_db;
                                var4 = -16 + -this.field_Y + this.field_db;
                                break L10;
                              }
                            }
                          }
                          var6 = var4;
                          var5_int = var3;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L12: {
                      if (-5 == (var2_int ^ -1)) {
                        var5_int = var3;
                        var6 = var4;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    localTemp$0 = var3 * 15 - -var5_int >> 1975998020;
                    var3 = localTemp$0;
                    this.field_L.field_Ab[this.field_T] = localTemp$0;
                    localTemp$1 = 15 * var4 - -var6 >> 648805572;
                    var4 = localTemp$1;
                    this.field_L.field_o[this.field_T] = localTemp$1;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            L13: {
              if (0 >= this.field_x) {
                break L13;
              } else {
                this.field_D = true;
                break L13;
              }
            }
            L14: {
              if (this.field_D) {
                this.field_M = 0;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (-18 == (this.field_jb ^ -1)) {
                this.field_s = this.field_L.a(this.field_u, true);
                var2_int = 65536;
                pi.field_b.a((byte) 114, this.field_L.field_i);
                var6_ref_ml = (ml) ((Object) pi.field_b.b(-31));
                L16: while (true) {
                  if (var6_ref_ml == null) {
                    break L15;
                  } else {
                    L17: {
                      if ((var6_ref_ml.field_u ^ -1) != (this.field_u ^ -1)) {
                        break L17;
                      } else {
                        L18: {
                          if (var6_ref_ml.field_s == null) {
                            break L18;
                          } else {
                            if ((var6_ref_ml.field_jb ^ -1) == -10) {
                              break L18;
                            } else {
                              if (var6_ref_ml.field_jb == 7) {
                                break L18;
                              } else {
                                if ((var6_ref_ml.field_jb ^ -1) == -38) {
                                  break L18;
                                } else {
                                  var6_ref_ml = (ml) ((Object) pi.field_b.d(-18502));
                                  continue L16;
                                }
                              }
                            }
                          }
                        }
                        var5_int = -var6_ref_ml.field_db + this.field_db - this.field_Y / 2;
                        var4 = this.field_lb - var6_ref_ml.field_lb;
                        var3 = var5_int * var5_int + var4 * var4;
                        if (var2_int > var3) {
                          var2_int = var3;
                          this.field_s = var6_ref_ml;
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                    }
                    var6_ref_ml = (ml) ((Object) pi.field_b.d(-18502));
                    continue L16;
                  }
                }
              } else {
                if (this.x(32)) {
                  this.field_s = this.field_L.a(this.field_u, true);
                  var2_int = 65536;
                  pi.field_b.a((byte) 99, this.field_L.field_i);
                  var6_ref_ml = (ml) ((Object) pi.field_b.b(-47));
                  L19: while (true) {
                    if (var6_ref_ml == null) {
                      break L15;
                    } else {
                      L20: {
                        if ((var6_ref_ml.field_u ^ -1) != (this.field_u ^ -1)) {
                          break L20;
                        } else {
                          L21: {
                            if (null == var6_ref_ml.field_s) {
                              break L21;
                            } else {
                              if (var6_ref_ml.field_jb != 37) {
                                break L20;
                              } else {
                                break L21;
                              }
                            }
                          }
                          var5_int = this.field_db - (this.field_Y / 2 + var6_ref_ml.field_db);
                          var4 = this.field_lb - var6_ref_ml.field_lb;
                          var3 = var4 * var4 + var5_int * var5_int;
                          if (var2_int <= var3) {
                            break L20;
                          } else {
                            this.field_s = var6_ref_ml;
                            var2_int = var3;
                            break L20;
                          }
                        }
                      }
                      var6_ref_ml = (ml) ((Object) pi.field_b.d(-18502));
                      continue L19;
                    }
                  }
                } else {
                  break L15;
                }
              }
            }
            L22: {
              if (35 != this.field_jb) {
                break L22;
              } else {
                this.a(true, true);
                break L22;
              }
            }
            L23: {
              this.g(param0 + -5390);
              this.field_lb = this.field_X >> 2067865092;
              if (250 >= this.field_ib) {
                break L23;
              } else {
                this.field_ib = 250;
                break L23;
              }
            }
            L24: {
              L25: {
                this.field_db = this.field_R >> 833836484;
                var2_int = this.field_lb;
                var3 = this.field_db;
                var4 = 0;
                if (this.field_z) {
                  break L25;
                } else {
                  if (this.field_hb) {
                    break L25;
                  } else {
                    if (this.field_M == 0) {
                      break L24;
                    } else {
                      break L25;
                    }
                  }
                }
              }
              var4 = 1;
              this.field_L.a((ml) (this), 0);
              break L24;
            }
            L26: {
              if (null == this.field_s) {
                break L26;
              } else {
                if (0 < this.field_s.field_ib) {
                  break L26;
                } else {
                  if (null != this.field_s.field_s) {
                    this.field_s = this.field_s.field_s;
                    break L26;
                  } else {
                    break L26;
                  }
                }
              }
            }
            L27: {
              this.field_hb = false;
              var5 = this.field_L.a(this.field_u, true);
              if (this.field_s == null) {
                break L27;
              } else {
                L28: {
                  if (var5 == null) {
                    break L28;
                  } else {
                    if (0 < var5.field_ib) {
                      break L27;
                    } else {
                      break L28;
                    }
                  }
                }
                L29: {
                  this.field_ib = 0;
                  if (var4 != 0) {
                    break L29;
                  } else {
                    this.field_L.a((ml) (this), 0);
                    break L29;
                  }
                }
                this.d(this.field_L.d(false), 90);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            if (-1 <= (this.field_ib ^ -1)) {
              L30: {
                this.field_M = 0;
                if (var4 == 0) {
                  this.field_L.a((ml) (this), param0 ^ -55);
                  break L30;
                } else {
                  break L30;
                }
              }
              this.d(this.field_L.d(false), 72);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L31: {
                if (!this.t(33)) {
                  break L31;
                } else {
                  if (this.field_L.field_x[this.field_u] == 4) {
                    L32: while (true) {
                      if (this.field_L.a(this.field_L.field_o[this.field_u] + 2, this.field_L.field_Ab[this.field_u], (byte) -83)) {
                        break L31;
                      } else {
                        if ((this.field_L.field_X[this.field_u] ^ -1) >= -1) {
                          break L31;
                        } else {
                          if (0 >= (this.field_L.field_X[this.field_u] - 1) % 5 - (-1 + (-1 + this.field_L.field_X[this.field_u]) / 5)) {
                            break L31;
                          } else {
                            L33: {
                              this.field_L.field_o[this.field_u] = this.field_L.field_o[this.field_u] + 2;
                              if (this.field_L.field_o[this.field_u] <= this.field_L.field_H) {
                                break L33;
                              } else {
                                this.field_L.field_X[this.field_u] = this.field_L.field_X[this.field_u] + 5;
                                if (this.field_L.d(false) == this.field_u) {
                                  break L33;
                                } else {
                                  break L33;
                                }
                              }
                            }
                            this.field_z = true;
                            continue L32;
                          }
                        }
                      }
                    }
                  } else {
                    break L31;
                  }
                }
              }
              L34: {
                if (this.field_db >= -this.field_L.field_H * 10) {
                  break L34;
                } else {
                  this.field_eb = 0;
                  this.field_kb = 0;
                  this.field_X = this.field_lb << 1358959780;
                  this.field_db = 10 * -this.field_L.field_H;
                  this.field_R = this.field_db << -95718108;
                  this.field_L.field_u[this.g(false)] = true;
                  break L34;
                }
              }
              L35: {
                L36: {
                  if (this.field_jb == 22) {
                    break L36;
                  } else {
                    if (this.field_jb == 4) {
                      break L36;
                    } else {
                      if ((this.field_jb ^ -1) == -6) {
                        break L36;
                      } else {
                        if (-4 != (this.field_L.field_x[this.field_u] ^ -1)) {
                          break L35;
                        } else {
                          if (-1 <= (this.field_L.field_X[this.field_u] ^ -1)) {
                            break L35;
                          } else {
                            break L36;
                          }
                        }
                      }
                    }
                  }
                }
                if (-1 < (this.field_lb ^ -1)) {
                  break L35;
                } else {
                  if (this.field_L.field_y < this.field_lb) {
                    break L35;
                  } else {
                    if (-1 < (this.field_eb ^ -1)) {
                      break L35;
                    } else {
                      if (this.field_db <= -33 + this.field_L.field_H) {
                        break L35;
                      } else {
                        L37: {
                          if ((this.field_ib ^ -1) < -6) {
                            break L37;
                          } else {
                            if ((this.field_q ^ -1) < -1) {
                              break L37;
                            } else {
                              break L35;
                            }
                          }
                        }
                        this.field_eb = 0;
                        this.field_db = -33 + this.field_L.field_H;
                        this.field_R = this.field_db << 437427396;
                        this.field_L.a(param0 ^ -57, -24 + this.field_lb, gj.field_f[9], -gj.field_f[9].field_f + (-33 + this.field_L.field_H));
                        this.field_L.a(-25, -8 + this.field_lb, gj.field_f[9], this.field_L.field_H - (33 + gj.field_f[9].field_f));
                        this.field_L.a(89, this.field_lb + 8, gj.field_f[9], -33 + (this.field_L.field_H - gj.field_f[9].field_f));
                        if (this.field_jb == 22) {
                          break L35;
                        } else {
                          this.field_ib = this.field_ib - 5;
                          break L35;
                        }
                      }
                    }
                  }
                }
              }
              L38: {
                if (this.field_db >= this.field_L.field_H + 128) {
                  break L38;
                } else {
                  if (-640 - (this.field_Y >> -2048412895) > this.field_lb) {
                    break L38;
                  } else {
                    if (this.field_lb <= this.field_L.field_y + 640 + (this.field_Y >> 1528860769)) {
                      L39: {
                        L40: {
                          var6 = 0;
                          if (-29 == (this.field_jb ^ -1)) {
                            break L40;
                          } else {
                            if ((this.field_jb ^ -1) == -30) {
                              break L40;
                            } else {
                              if ((this.field_jb ^ -1) == -31) {
                                break L40;
                              } else {
                                if ((this.field_jb ^ -1) == -33) {
                                  break L40;
                                } else {
                                  if (-8 != (this.field_L.field_x[this.field_u] ^ -1)) {
                                    break L39;
                                  } else {
                                    if (this.field_L.field_X[this.field_u] <= 0) {
                                      break L39;
                                    } else {
                                      break L40;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        if (0 > this.field_lb) {
                          break L39;
                        } else {
                          if (this.field_L.field_y < this.field_lb) {
                            break L39;
                          } else {
                            var6 = 1;
                            break L39;
                          }
                        }
                      }
                      L41: {
                        if (this.field_db <= this.field_L.field_H - (32 + -(this.field_Y / 2))) {
                          stackIn_162_0 = 0;
                          break L41;
                        } else {
                          stackIn_162_0 = 1;
                          break L41;
                        }
                      }
                      L42: {
                        var7 = stackIn_162_0;
                        if (this.s(-1)) {
                          L43: {
                            stackIn_168_0 = var7;

                            if (this.field_db < this.field_L.field_H) {
                              stackIn_169_0 = stackIn_168_0;
                              stackIn_169_1 = 0;
                              break L43;
                            } else {
                              stackIn_169_0 = stackIn_168_0;
                              stackIn_169_1 = 1;
                              break L43;
                            }
                          }
                          var7 = stackIn_169_0 | stackIn_169_1;
                          break L42;
                        } else {
                          break L42;
                        }
                      }
                      L44: {
                        if (var7 == 0) {
                          break L44;
                        } else {
                          if (var6 == 0) {
                            if (-13 == (this.field_jb ^ -1)) {
                              L45: {
                                if (var4 == 0) {
                                  this.field_L.a((ml) (this), param0 ^ -55);
                                  break L45;
                                } else {
                                  break L45;
                                }
                              }
                              this.d(this.field_L.d(false), 89);
                              this.field_ib = 0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              L46: {
                                this.field_db = this.field_db + 1;
                                this.field_R = this.field_db << -961856892;
                                this.field_M = 0;
                                this.field_eb = this.field_eb + 1;
                                this.field_z = true;
                                var8 = -this.field_eb;
                                if (var8 > this.field_Y >> 355541985) {
                                  var8 = this.field_Y >> -1249435487;
                                  break L46;
                                } else {
                                  break L46;
                                }
                              }
                              L47: {
                                if (var8 >= -(this.field_Y >> 2056283009)) {
                                  break L47;
                                } else {
                                  var8 = -(this.field_Y >> 1282430497);
                                  break L47;
                                }
                              }
                              this.field_o = var8 >> -1919569406;
                              this.field_N = -(var8 >> -543692478);
                              this.field_O = -(var8 >> -982051966);
                              this.field_Z = var8 >> -996882750;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            }
                          } else {
                            break L44;
                          }
                        }
                      }
                      L48: {
                        if (!this.g((byte) 108)) {
                          stackIn_194_0 = 0;
                          break L48;
                        } else {
                          stackIn_194_0 = 1;
                          break L48;
                        }
                      }
                      L49: {
                        L50: {
                          var8 = stackIn_194_0;
                          if (var8 != 0) {
                            break L50;
                          } else {
                            if (-13 == (this.field_jb ^ -1)) {
                              break L50;
                            } else {
                              break L49;
                            }
                          }
                        }
                        L51: {
                          if ((this.field_eb ^ -1) > -1) {
                            this.field_eb = 0;
                            break L51;
                          } else {
                            break L51;
                          }
                        }
                        this.field_kb = 0;
                        break L49;
                      }
                      L52: {
                        if (param0 == -55) {
                          break L52;
                        } else {
                          this.e((byte) 40);
                          break L52;
                        }
                      }
                      L53: {
                        if (!this.field_z) {
                          this.z(param0 + 44);
                          break L53;
                        } else {
                          this.h((byte) -120);
                          break L53;
                        }
                      }
                      L54: {
                        L55: {
                          L56: {
                            if ((this.field_ib ^ -1) >= -1) {
                              break L56;
                            } else {
                              if (this.field_z) {
                                break L56;
                              } else {
                                if (this.field_hb) {
                                  break L56;
                                } else {
                                  if (var2_int != this.field_lb) {
                                    break L56;
                                  } else {
                                    if (var3 != this.field_db) {
                                      break L56;
                                    } else {
                                      if (var4 == 0) {
                                        break L55;
                                      } else {
                                        break L56;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L57: {
                            var9 = this.field_lb;
                            this.field_lb = var2_int;
                            var10 = this.field_db;
                            this.field_db = var3;
                            if (var4 != 0) {
                              break L57;
                            } else {
                              L58: {
                                if ((this.field_jb ^ -1) != -13) {
                                  break L58;
                                } else {
                                  if (this.field_ib <= 0) {
                                    break L57;
                                  } else {
                                    break L58;
                                  }
                                }
                              }
                              this.field_L.a((ml) (this), param0 ^ -55);
                              break L57;
                            }
                          }
                          this.field_lb = var9;
                          this.field_db = var10;
                          if (-1 <= (this.field_ib ^ -1)) {
                            break L55;
                          } else {
                            this.field_L.a(-63, (ml) (this));
                            break L54;
                          }
                        }
                        break L54;
                      }
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      break L38;
                    }
                  }
                }
              }
              this.l(param0 ^ -32759);
              this.field_M = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.MA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    final void a(int param0, boolean param1) {
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
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
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        qb var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        qb var26 = null;
        qb var27 = null;
        qb var28 = null;
        qb var29 = null;
        qb var30 = null;
        qb var31 = null;
        int[] var32 = null;
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
        qb var44 = null;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (!this.field_J) {
              L1: {
                L2: {
                  var17 = new int[]{255, 0, 0};
                  var3 = var17;
                  var18 = new int[]{0, 255, 0};
                  var4 = var18;
                  var19 = new int[]{0, 0, 255};
                  var5 = var19;
                  var32 = new int[]{255, 255, 255};
                  var6 = var32;
                  var7 = this.field_u;
                  if (-1 == (var7 ^ -1)) {
                    break L2;
                  } else {
                    if (3 == var7) {
                      break L2;
                    } else {
                      if (var7 != 4) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var17[2] = 255;
                var17[1] = 255;
                break L1;
              }
              L3: {
                L4: {
                  if (1 == var7) {
                    break L4;
                  } else {
                    if (var7 == 3) {
                      break L4;
                    } else {
                      if (var7 != 5) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var18[2] = 255;
                var18[0] = 255;
                break L3;
              }
              L5: {
                L6: {
                  if (-3 == (var7 ^ -1)) {
                    break L6;
                  } else {
                    if ((var7 ^ -1) == -5) {
                      break L6;
                    } else {
                      if (var7 != 5) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                var19[0] = 255;
                var19[2] = 255;
                break L5;
              }
              L7: {
                if (null != this.field_L.field_N) {
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
                  break L7;
                } else {
                  break L7;
                }
              }
              if (param0 == 12) {
                L8: {
                  var12 = this.field_jb;
                  if ((var12 ^ -1) == -41) {
                    this.field_Y = 64;
                    this.field_ib = 10;
                    this.field_J = true;
                    this.field_w = new qb(this.field_Y, this.field_Y);
                    this.field_w.a();
                    de.i(32, 32, 10, 16777215);
                    de.i(32, 63, 1, 16777215);
                    break L8;
                  } else {
                    if (var12 == 12) {
                      this.field_J = true;
                      this.field_ib = 75;
                      this.field_z = true;
                      this.field_Y = 256;
                      this.field_w = new qb(this.field_Y, this.field_Y);
                      this.field_w.a();
                      go.field_j[29].a(0, 0);
                      de.d(0, -2 + (go.field_j[29].field_f + go.field_j[29].field_c), this.field_Y, this.field_Y, 0);
                      break L8;
                    } else {
                      if (var12 == 39) {
                        this.field_J = true;
                        this.field_Y = 100;
                        this.field_ib = 100;
                        this.field_w = new qb(this.field_Y, this.field_Y);
                        this.field_w.a();
                        de.i(this.field_Y >> 1554575329, this.field_Y >> -1371289439, this.field_Y >> -1607789759, 16777215);
                        break L8;
                      } else {
                        if ((var12 ^ -1) == -14) {
                          this.field_J = true;
                          this.field_ib = 200;
                          this.field_Y = 100;
                          this.field_w = new qb(this.field_Y, this.field_Y);
                          this.field_w.a();
                          de.i(this.field_Y >> -917470591, this.field_Y >> 1685513953, this.field_Y >> -100393279, 16777215);
                          break L8;
                        } else {
                          if (var12 != 15) {
                            if ((var12 ^ -1) != -15) {
                              if (26 != var12) {
                                if ((var12 ^ -1) != -18) {
                                  if (27 == var12) {
                                    L9: {
                                      this.field_Y = 64;
                                      if (param1) {
                                        this.field_ib = 250;
                                        break L9;
                                      } else {
                                        break L9;
                                      }
                                    }
                                    L10: {
                                      this.field_ab = 2;
                                      if (!param1) {
                                        break L10;
                                      } else {
                                        this.field_w = new qb(this.field_Y, this.field_Y);
                                        this.field_w.a();
                                        de.i(this.field_Y >> 1889445345, this.field_Y >> -487186783, this.field_Y >> -671284735, 16777215);
                                        break L10;
                                      }
                                    }
                                    var25 = new int[]{28, 0, 29, 33, 47, 50, var7, 0, 0};
                                    var13_ref_qb____ = new qb[][]{kc.field_kb, jd.field_j, ea.field_u, qe.field_i, hn.field_d, tj.field_A, bo.field_a, h.field_I, fn.field_b};
                                    if (kc.field_kb != null) {
                                      L11: {
                                        var23 = new int[]{204, 170, 238};
                                        var3 = var23;
                                        var21 = new int[]{32, 32, 32};
                                        var5 = var21;
                                        var22 = new int[]{128, 64, 128};
                                        var6 = var22;
                                        var24 = new int[]{255, 192, 255};
                                        var4 = var24;
                                        var20 = new qb(64, 96);
                                        var20.a();
                                        pc.a(var21, 16, var22, var23, (byte) -8, var24, var13_ref_qb____[0][var25[1]], 0);
                                        pc.a(var21, 32, var22, var23, (byte) -96, var24, var13_ref_qb____[4][var25[5]], 0);
                                        if (53 == var25[5]) {
                                          break L11;
                                        } else {
                                          if ((var25[5] ^ -1) == -56) {
                                            break L11;
                                          } else {
                                            pc.a(var21, 32, var22, var23, (byte) 74, var24, var13_ref_qb____[6][var25[6]], 0);
                                            break L11;
                                          }
                                        }
                                      }
                                      pc.a(var21, 16, var22, var23, (byte) 25, var24, var13_ref_qb____[5][var25[4]], 0);
                                      this.field_I = new qb(64, 96);
                                      this.field_I.a();
                                      var20.a(32, 48, 0, 4096);
                                      this.field_I.e();
                                      var26 = new qb(64, 64);
                                      var26.a();
                                      pc.a(var21, 0, var22, var23, (byte) 49, var24, var13_ref_qb____[1][var25[0]], 0);
                                      this.field_bb = new qb(64, 64);
                                      this.field_bb.a();
                                      var26.a(32, 32, 0, 4096);
                                      this.field_bb.e();
                                      var27 = new qb(64, 64);
                                      var27.a();
                                      pc.a(var21, 0, var22, var23, (byte) -104, var24, var13_ref_qb____[7][0], 0);
                                      this.field_Q = new qb(64, 64);
                                      this.field_Q.a();
                                      var27.a(32, 32, 0, 4096);
                                      this.field_Q.e();
                                      var28 = new qb(64, 64);
                                      var28.a();
                                      pc.a(var21, 0, var22, var23, (byte) -124, var24, var13_ref_qb____[8][0], 0);
                                      this.field_cb = new qb(64, 64);
                                      this.field_cb.a();
                                      var28.a(32, 32, 0, 4096);
                                      this.field_cb.e();
                                      var29 = new qb(64, 64);
                                      var29.a();
                                      pc.a(var21, 0, var22, var23, (byte) -112, var24, var13_ref_qb____[2][var25[2]], 0);
                                      this.field_fb = new qb(64, 64);
                                      this.field_fb.a();
                                      var29.a(32, 32, 0, 4096);
                                      this.field_fb.e();
                                      var30 = new qb(64, 64);
                                      var30.a();
                                      pc.a(var21, 0, var22, var23, (byte) -79, var24, var13_ref_qb____[3][var25[3]], 0);
                                      this.field_B = new qb(64, 64);
                                      this.field_B.a();
                                      var30.a(32, 32, 0, 4096);
                                      this.field_B.e();
                                      this.field_J = true;
                                      break L8;
                                    } else {
                                      this.field_J = false;
                                      break L8;
                                    }
                                  } else {
                                    L12: {
                                      if (var12 == 22) {
                                        break L12;
                                      } else {
                                        if (23 == var12) {
                                          break L12;
                                        } else {
                                          if (-22 != (var12 ^ -1)) {
                                            if (24 != var12) {
                                              if (-36 == (var12 ^ -1)) {
                                                break L12;
                                              } else {
                                                if ((var12 ^ -1) == -21) {
                                                  break L12;
                                                } else {
                                                  if (var12 != 0) {
                                                    if ((var12 ^ -1) != -17) {
                                                      if (var12 != 18) {
                                                        if ((var12 ^ -1) == -39) {
                                                          break L12;
                                                        } else {
                                                          L13: {
                                                            if (-7 != (var12 ^ -1)) {
                                                              if ((var12 ^ -1) == -26) {
                                                                break L13;
                                                              } else {
                                                                L14: {
                                                                  if (11 == var12) {
                                                                    break L14;
                                                                  } else {
                                                                    if (var12 == 4) {
                                                                      break L14;
                                                                    } else {
                                                                      if (-6 != (var12 ^ -1)) {
                                                                        if ((var12 ^ -1) == -2) {
                                                                          break L14;
                                                                        } else {
                                                                          if (var12 == 2) {
                                                                            break L14;
                                                                          } else {
                                                                            if ((var12 ^ -1) == -4) {
                                                                              break L14;
                                                                            } else {
                                                                              if (8 != var12) {
                                                                                if (var12 == 7) {
                                                                                  break L14;
                                                                                } else {
                                                                                  if (-11 != (var12 ^ -1)) {
                                                                                    if (9 == var12) {
                                                                                      break L14;
                                                                                    } else {
                                                                                      if (-29 == (var12 ^ -1)) {
                                                                                        break L14;
                                                                                      } else {
                                                                                        if (29 != var12) {
                                                                                          if (-31 == (var12 ^ -1)) {
                                                                                            break L14;
                                                                                          } else {
                                                                                            if (-32 == (var12 ^ -1)) {
                                                                                              break L14;
                                                                                            } else {
                                                                                              if (32 == var12) {
                                                                                                break L14;
                                                                                              } else {
                                                                                                if (-34 == (var12 ^ -1)) {
                                                                                                  break L14;
                                                                                                } else {
                                                                                                  if (var12 != 34) {
                                                                                                    if (36 != var12) {
                                                                                                      if (-38 != (var12 ^ -1)) {
                                                                                                        break L12;
                                                                                                      } else {
                                                                                                        break L14;
                                                                                                      }
                                                                                                    } else {
                                                                                                      break L14;
                                                                                                    }
                                                                                                  } else {
                                                                                                    break L14;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          break L14;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    break L14;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                break L14;
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      } else {
                                                                        break L14;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                L15: {
                                                                  var10 = this.field_ib;
                                                                  var11 = fb.field_a;
                                                                  this.field_ib = 10;
                                                                  this.field_Y = 24;
                                                                  if (11 != this.field_jb) {
                                                                    break L15;
                                                                  } else {
                                                                    if (-28 != (this.field_L.a(this.field_u, true).field_jb ^ -1)) {
                                                                      break L15;
                                                                    } else {
                                                                      this.field_ib = 100;
                                                                      break L15;
                                                                    }
                                                                  }
                                                                }
                                                                L16: {
                                                                  if (4 != this.field_jb) {
                                                                    break L16;
                                                                  } else {
                                                                    this.field_Y = 32;
                                                                    this.field_ib = 50;
                                                                    var11 = bj.field_ob;
                                                                    break L16;
                                                                  }
                                                                }
                                                                L17: {
                                                                  if (5 == this.field_jb) {
                                                                    this.field_Y = 64;
                                                                    var11 = ea.field_v;
                                                                    this.field_ib = 100;
                                                                    break L17;
                                                                  } else {
                                                                    break L17;
                                                                  }
                                                                }
                                                                L18: {
                                                                  if (1 != this.field_jb) {
                                                                    break L18;
                                                                  } else {
                                                                    this.field_Y = 32;
                                                                    this.field_ib = 50;
                                                                    var11 = dh.field_Jb;
                                                                    break L18;
                                                                  }
                                                                }
                                                                L19: {
                                                                  if ((this.field_jb ^ -1) != -34) {
                                                                    break L19;
                                                                  } else {
                                                                    var11 = jk.field_n;
                                                                    this.field_Y = 32;
                                                                    this.field_ib = 40;
                                                                    break L19;
                                                                  }
                                                                }
                                                                L20: {
                                                                  if (-37 == (this.field_jb ^ -1)) {
                                                                    this.field_ib = 25;
                                                                    this.field_Y = 32;
                                                                    var11 = e.field_I;
                                                                    if (!lk.a(0, (byte) -127)) {
                                                                      break L20;
                                                                    } else {
                                                                      this.field_U = true;
                                                                      this.field_ib = 75;
                                                                      break L20;
                                                                    }
                                                                  } else {
                                                                    break L20;
                                                                  }
                                                                }
                                                                L21: {
                                                                  if (34 != this.field_jb) {
                                                                    break L21;
                                                                  } else {
                                                                    var11 = field_v;
                                                                    this.field_ib = 25;
                                                                    this.field_Y = 32;
                                                                    break L21;
                                                                  }
                                                                }
                                                                L22: {
                                                                  if (-3 == (this.field_jb ^ -1)) {
                                                                    this.field_Y = 64;
                                                                    this.field_ib = 100;
                                                                    var11 = i.field_g;
                                                                    break L22;
                                                                  } else {
                                                                    break L22;
                                                                  }
                                                                }
                                                                L23: {
                                                                  if (-4 == (this.field_jb ^ -1)) {
                                                                    this.field_Y = 64;
                                                                    var11 = gb.field_c;
                                                                    this.field_ib = 75;
                                                                    break L23;
                                                                  } else {
                                                                    break L23;
                                                                  }
                                                                }
                                                                L24: {
                                                                  if (8 == this.field_jb) {
                                                                    this.field_Y = 48;
                                                                    this.field_ib = 50;
                                                                    var11 = pm.field_d;
                                                                    this.field_U = true;
                                                                    break L24;
                                                                  } else {
                                                                    break L24;
                                                                  }
                                                                }
                                                                L25: {
                                                                  if (-8 == (this.field_jb ^ -1)) {
                                                                    var11 = ra.field_j;
                                                                    this.field_Y = 64;
                                                                    this.field_ib = 100;
                                                                    break L25;
                                                                  } else {
                                                                    break L25;
                                                                  }
                                                                }
                                                                L26: {
                                                                  if (-11 == (this.field_jb ^ -1)) {
                                                                    this.field_ib = 25;
                                                                    var11 = oe.field_d;
                                                                    this.field_Y = 16;
                                                                    break L26;
                                                                  } else {
                                                                    break L26;
                                                                  }
                                                                }
                                                                L27: {
                                                                  if (9 != this.field_jb) {
                                                                    break L27;
                                                                  } else {
                                                                    this.field_ib = 100;
                                                                    var11 = qj.field_d;
                                                                    this.field_Y = 64;
                                                                    break L27;
                                                                  }
                                                                }
                                                                L28: {
                                                                  if (-29 != (this.field_jb ^ -1)) {
                                                                    break L28;
                                                                  } else {
                                                                    this.field_Y = 24;
                                                                    var11 = g.field_f;
                                                                    this.field_ib = 40;
                                                                    break L28;
                                                                  }
                                                                }
                                                                L29: {
                                                                  if ((this.field_jb ^ -1) != -30) {
                                                                    break L29;
                                                                  } else {
                                                                    var11 = c.field_a;
                                                                    this.field_Y = 48;
                                                                    this.field_ib = 100;
                                                                    break L29;
                                                                  }
                                                                }
                                                                L30: {
                                                                  if (this.field_jb != 30) {
                                                                    break L30;
                                                                  } else {
                                                                    var11 = vm.field_g;
                                                                    this.field_ib = 200;
                                                                    this.field_Y = 100;
                                                                    break L30;
                                                                  }
                                                                }
                                                                L31: {
                                                                  if (this.field_jb == 31) {
                                                                    this.field_Y = 64;
                                                                    var11 = vk.field_w;
                                                                    this.field_ib = 100;
                                                                    break L31;
                                                                  } else {
                                                                    break L31;
                                                                  }
                                                                }
                                                                L32: {
                                                                  if (-33 != (this.field_jb ^ -1)) {
                                                                    break L32;
                                                                  } else {
                                                                    this.field_ib = 250;
                                                                    this.field_Y = 128;
                                                                    var11 = nj.field_k;
                                                                    break L32;
                                                                  }
                                                                }
                                                                L33: {
                                                                  if (-38 == (this.field_jb ^ -1)) {
                                                                    this.field_ib = 50;
                                                                    var11 = fe.field_h;
                                                                    this.field_Y = 32;
                                                                    break L33;
                                                                  } else {
                                                                    break L33;
                                                                  }
                                                                }
                                                                L34: {
                                                                  if (param1) {
                                                                    L35: {
                                                                      if ((this.field_jb ^ -1) == -8) {
                                                                        break L35;
                                                                      } else {
                                                                        if (this.field_jb != 9) {
                                                                          this.field_w = new qb(this.field_Y, this.field_Y);
                                                                          this.field_w.a();
                                                                          de.i(this.field_Y >> -736443263, this.field_Y >> 1158916129, this.field_Y >> 4413505, 16777215);
                                                                          break L34;
                                                                        } else {
                                                                          break L35;
                                                                        }
                                                                      }
                                                                    }
                                                                    this.field_w = new qb(48, 48);
                                                                    this.field_w.a();
                                                                    de.i(24, 24, 24, 16777215);
                                                                    break L34;
                                                                  } else {
                                                                    break L34;
                                                                  }
                                                                }
                                                                L36: {
                                                                  if (var11 == null) {
                                                                    this.field_J = false;
                                                                    break L36;
                                                                  } else {
                                                                    L37: {
                                                                      L38: {
                                                                        var39 = new qb(this.field_Y, 3 * this.field_Y / 2);
                                                                        var39.a();
                                                                        if (this.field_jb == 11) {
                                                                          break L38;
                                                                        } else {
                                                                          if (this.field_jb == 8) {
                                                                            break L38;
                                                                          } else {
                                                                            if (6 == this.field_jb) {
                                                                              break L38;
                                                                            } else {
                                                                              if (this.field_jb == 25) {
                                                                                break L38;
                                                                              } else {
                                                                                if (!this.field_U) {
                                                                                  break L38;
                                                                                } else {
                                                                                  pc.a(var5, this.field_Y / 2, var6, var3, (byte) -111, var4, var11[6].b(), 0);
                                                                                  break L37;
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                      pc.a(var5, this.field_Y / 2, var6, var3, (byte) -85, var4, var11[2].b(), 0);
                                                                      break L37;
                                                                    }
                                                                    this.field_I = var39.g();
                                                                    var40 = new qb(this.field_Y, this.field_Y);
                                                                    var40.a();
                                                                    pc.a(var5, 0, var6, var3, (byte) 70, var4, var11[3].b(), 0);
                                                                    this.field_bb = var40.g();
                                                                    var41 = new qb(this.field_Y, this.field_Y);
                                                                    var41.a();
                                                                    pc.a(var5, 0, var6, var3, (byte) 33, var4, var11[1].b(), 0);
                                                                    this.field_Q = var41.g();
                                                                    var42 = new qb(this.field_Y, this.field_Y);
                                                                    var42.a();
                                                                    pc.a(var5, 0, var6, var3, (byte) -127, var4, var11[4].b(), 0);
                                                                    this.field_cb = var42.g();
                                                                    var43 = new qb(this.field_Y, this.field_Y);
                                                                    var43.a();
                                                                    pc.a(var5, 0, var6, var3, (byte) -4, var4, var11[0].b(), 0);
                                                                    this.field_fb = var43.g();
                                                                    var44 = new qb(this.field_Y, this.field_Y);
                                                                    var44.a();
                                                                    pc.a(var5, 0, var6, var3, (byte) -86, var4, var11[5].b(), 0);
                                                                    this.field_B = var44.g();
                                                                    this.field_J = true;
                                                                    break L36;
                                                                  }
                                                                }
                                                                if (!param1) {
                                                                  this.field_ib = var10;
                                                                  break L8;
                                                                } else {
                                                                  break L8;
                                                                }
                                                              }
                                                            } else {
                                                              break L13;
                                                            }
                                                          }
                                                          this.field_J = true;
                                                          this.field_Y = 24;
                                                          this.field_ib = 25;
                                                          this.field_w = new qb(this.field_Y, this.field_Y);
                                                          this.field_w.a();
                                                          de.i(12, 12, 12, 16777215);
                                                          this.field_p = this.field_ib;
                                                          this.field_Y = this.field_w.field_n;
                                                          this.e((byte) 6);
                                                          break L8;
                                                        }
                                                      } else {
                                                        break L12;
                                                      }
                                                    } else {
                                                      break L12;
                                                    }
                                                  } else {
                                                    break L12;
                                                  }
                                                }
                                              }
                                            } else {
                                              break L12;
                                            }
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                    }
                                    L39: {
                                      if (param1) {
                                        this.field_ib = 250;
                                        break L39;
                                      } else {
                                        break L39;
                                      }
                                    }
                                    L40: {
                                      this.field_Y = 32;
                                      if (param1) {
                                        this.field_w = new qb(this.field_Y, this.field_Y);
                                        this.field_w.a();
                                        de.i(this.field_Y >> -2098818207, this.field_Y >> -2034858495, this.field_Y >> -672627263, 16777215);
                                        break L40;
                                      } else {
                                        break L40;
                                      }
                                    }
                                    L41: {
                                      var8 = new int[]{var7, var7, var7, var7, var7, var7, var7, 0, 0};
                                      if (this.field_L.field_N != null) {
                                        var16 = 0;
                                        var12 = var16;
                                        L42: while (true) {
                                          if (var16 >= 6) {
                                            break L41;
                                          } else {
                                            var8[var16] = this.field_L.field_N[var7][var16 - -12];
                                            var16++;
                                            continue L42;
                                          }
                                        }
                                      } else {
                                        break L41;
                                      }
                                    }
                                    var9 = new qb[][]{kc.field_kb, jd.field_j, ea.field_u, qe.field_i, hn.field_d, tj.field_A, bo.field_a, h.field_I, fn.field_b};
                                    if (kc.field_kb == null) {
                                      this.field_J = false;
                                      break L8;
                                    } else {
                                      L43: {
                                        var31 = new qb(64, 96);
                                        var31.a();
                                        if (this.field_jb != 16) {
                                          L44: {
                                            pc.a(var19, 16, var32, var17, (byte) 78, var18, var9[0][var8[1]], 0);
                                            pc.a(var19, 32, var32, var17, (byte) -91, var18, var9[4][var8[5]], 0);
                                            if (-54 == (var8[5] ^ -1)) {
                                              break L44;
                                            } else {
                                              if ((var8[5] ^ -1) != -56) {
                                                pc.a(var19, 32, var32, var17, (byte) -90, var18, var9[6][var8[6]], 0);
                                                break L44;
                                              } else {
                                                break L44;
                                              }
                                            }
                                          }
                                          pc.a(var19, 16, var32, var17, (byte) 13, var18, var9[5][var8[4]], 0);
                                          break L43;
                                        } else {
                                          pc.a(var19, 16, var32, var17, (byte) 116, var18, tk.field_x[2], 0);
                                          break L43;
                                        }
                                      }
                                      L45: {
                                        this.field_I = new qb(32, 48);
                                        this.field_I.a();
                                        var31.a(16, 24, 0, 2048);
                                        this.field_I.e();
                                        var33 = new qb(64, 64);
                                        var33.a();
                                        pc.a(var19, 0, var32, var17, (byte) 91, var18, var9[1][var8[0]], 0);
                                        this.field_bb = new qb(32, 32);
                                        this.field_bb.a();
                                        var33.a(16, 16, 0, 2048);
                                        this.field_bb.e();
                                        var34 = new qb(64, 64);
                                        var34.a();
                                        pc.a(var19, 0, var32, var17, (byte) 123, var18, var9[7][0], 0);
                                        this.field_Q = new qb(32, 32);
                                        this.field_Q.a();
                                        if (-47 == (var8[0] ^ -1)) {
                                          break L45;
                                        } else {
                                          var34.a(16, 16, 0, 2048);
                                          break L45;
                                        }
                                      }
                                      L46: {
                                        this.field_Q.e();
                                        var35 = new qb(64, 64);
                                        var35.a();
                                        pc.a(var19, 0, var32, var17, (byte) -81, var18, var9[8][0], 0);
                                        this.field_cb = new qb(32, 32);
                                        this.field_cb.a();
                                        if (-47 == (var8[0] ^ -1)) {
                                          break L46;
                                        } else {
                                          var35.a(16, 16, 0, 2048);
                                          break L46;
                                        }
                                      }
                                      L47: {
                                        this.field_cb.e();
                                        var36 = new qb(64, 64);
                                        var36.a();
                                        pc.a(var19, 0, var32, var17, (byte) 126, var18, var9[2][var8[2]], 0);
                                        this.field_fb = new qb(32, 32);
                                        this.field_fb.a();
                                        var36.a(16, 16, 0, 2048);
                                        this.field_fb.e();
                                        var37 = new qb(64, 64);
                                        var37.a();
                                        pc.a(var19, 0, var32, var17, (byte) 14, var18, var9[3][var8[3]], 0);
                                        this.field_B = new qb(32, 32);
                                        this.field_B.a();
                                        var37.a(16, 16, 0, 2048);
                                        this.field_B.e();
                                        this.field_ab = -1;
                                        if (var8[2] == 27) {
                                          this.field_ab = 0;
                                          break L47;
                                        } else {
                                          break L47;
                                        }
                                      }
                                      L48: {
                                        if (28 != var8[2]) {
                                          break L48;
                                        } else {
                                          this.field_ab = 1;
                                          break L48;
                                        }
                                      }
                                      L49: {
                                        if (-30 == (var8[2] ^ -1)) {
                                          this.field_ab = 2;
                                          break L49;
                                        } else {
                                          break L49;
                                        }
                                      }
                                      L50: {
                                        if ((var8[2] ^ -1) == -55) {
                                          L51: {
                                            this.field_ab = 3;
                                            var38 = new qb(64, 64);
                                            var38.a();
                                            var13 = 32;
                                            if (this.field_B != null) {
                                              this.field_B.c(32 + (-(var13 >> 1938536642) - 4), 48 + -var13);
                                              break L51;
                                            } else {
                                              break L51;
                                            }
                                          }
                                          L52: {
                                            if (this.field_cb == null) {
                                              break L52;
                                            } else {
                                              this.field_cb.c(-(var13 >> -896131295) + 32, -var13 + 48);
                                              break L52;
                                            }
                                          }
                                          L53: {
                                            if (this.field_bb != null) {
                                              this.field_bb.c(-(var13 >> 134101377) + 32, -var13 + 48);
                                              break L53;
                                            } else {
                                              break L53;
                                            }
                                          }
                                          L54: {
                                            if (null != this.field_I) {
                                              this.field_I.c(-(var13 >> 85799009) + 32, 48 - var13 * 3 / 2);
                                              break L54;
                                            } else {
                                              break L54;
                                            }
                                          }
                                          L55: {
                                            if (this.field_Q != null) {
                                              this.field_Q.c(32 - (var13 >> -795307679), 48 + -var13);
                                              break L55;
                                            } else {
                                              break L55;
                                            }
                                          }
                                          L56: {
                                            if (null == this.field_fb) {
                                              break L56;
                                            } else {
                                              this.field_fb.c(-4 + -(var13 >> 1583231169) + 32, 48 - var13);
                                              break L56;
                                            }
                                          }
                                          this.field_cb = null;
                                          this.field_B = null;
                                          this.field_bb = var38;
                                          this.field_Q = null;
                                          this.field_fb = null;
                                          break L50;
                                        } else {
                                          break L50;
                                        }
                                      }
                                      this.field_J = true;
                                      break L8;
                                    }
                                  }
                                } else {
                                  this.field_Y = 80;
                                  this.field_J = true;
                                  this.field_ib = 100;
                                  this.field_w = new qb(this.field_Y, this.field_Y);
                                  this.field_w.a();
                                  de.i(this.field_Y >> 917242145, this.field_Y >> -1507659583, this.field_Y >> -1190423839, 16777215);
                                  break L8;
                                }
                              } else {
                                this.field_Y = 100;
                                this.field_ib = 150;
                                this.field_J = true;
                                this.field_w = new qb(this.field_Y, this.field_Y);
                                this.field_w.a();
                                de.i(this.field_Y >> -2112440895, this.field_Y >> 1238221953, this.field_Y >> 378147425, 16777215);
                                break L8;
                              }
                            } else {
                              this.field_ib = 150;
                              this.field_J = true;
                              this.field_Y = 100;
                              this.field_w = new qb(this.field_Y, this.field_Y);
                              this.field_w.a();
                              de.i(this.field_Y >> -2001765119, this.field_Y >> 614805185, this.field_Y >> 888971745, 16777215);
                              break L8;
                            }
                          } else {
                            this.field_J = true;
                            this.field_Y = 100;
                            this.field_ib = 150;
                            this.field_w = new qb(this.field_Y, this.field_Y);
                            this.field_w.a();
                            de.i(this.field_Y >> 1785854017, this.field_Y >> 632717025, this.field_Y >> -2070527903, 16777215);
                            break L8;
                          }
                        }
                      }
                    }
                  }
                }
                L57: {
                  if (!param1) {
                    break L57;
                  } else {
                    this.field_p = this.field_ib;
                    this.field_Y = this.field_w.field_n;
                    this.e((byte) 6);
                    break L57;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3_ref), "ml.W(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final int m(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -20357) {
                break L1;
              } else {
                this.field_u = 27;
                break L1;
              }
            }
            if (this.field_jb == 27) {
              stackIn_6_0 = this.field_ib * 2;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackIn_8_0 = this.field_ib;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.IA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_8_0;
        }
    }

    final void c(int param0, int param1) {
        try {
            this.field_M = param1;
            if (param0 != 0) {
                this.t(8);
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ml.U(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean u(int param0) {
        int stackIn_2_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (param0 >= 84) {
              L1: {
                L2: {
                  if (-1 > (this.field_q ^ -1)) {
                    break L2;
                  } else {
                    L3: {
                      if (0 == this.field_jb) {
                        break L3;
                      } else {
                        if ((this.field_jb ^ -1) == -19) {
                          break L3;
                        } else {
                          if (-20 == (this.field_jb ^ -1)) {
                            break L3;
                          } else {
                            if (9 == this.field_jb) {
                              break L3;
                            } else {
                              if (16 == this.field_jb) {
                                break L3;
                              } else {
                                if (this.field_jb == 7) {
                                  break L3;
                                } else {
                                  if (this.field_jb != 37) {
                                    break L2;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackIn_15_0 = 1;
                    break L1;
                  }
                }
                stackIn_15_0 = 0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.TA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_15_0 != 0;
        }
    }

    final boolean e(int param0) {
        RuntimeException var2 = null;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 118) {
                break L1;
              } else {
                this.f(false);
                break L1;
              }
            }
            L2: {
              if (this.field_z) {
                break L2;
              } else {
                if (this.field_hb) {
                  break L2;
                } else {
                  return false;
                }
              }
            }
            stackIn_8_0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.FB(" + param0 + ')');
        }
        return stackIn_8_0 != 0;
    }

    public static void h(boolean param0) {
        try {
            field_H = null;
            field_m = null;
            field_v = null;
            field_S = null;
            field_K = null;
            if (param0) {
                ml.a((dj) null, 88, (byte) 54, (dj) null);
            }
            field_V = null;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ml.NA(" + param0 + ')');
        }
    }

    final int r(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_L.field_d) {
              var2_int = -92 % ((param0 - -4) / 53);
              stackIn_4_0 = 1 & this.field_u;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = this.field_u;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final int o(int param0) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -22625) {
                break L1;
              } else {
                this.field_W = 1;
                break L1;
              }
            }
            stackIn_3_0 = this.field_jb;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.LA(" + param0 + ')');
        }
        return stackIn_3_0;
    }

    final void d(int param0, int param1) {
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
        mi var38 = null;
        mi var39 = null;
        mi var40 = null;
        mi var41 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.t(57)) {
                break L1;
              } else {
                if ((this.field_L.field_x[this.field_u] ^ -1) != -5) {
                  break L1;
                } else {
                  if ((this.field_L.field_X[this.field_u] ^ -1) >= -1) {
                    break L1;
                  } else {
                    if (0 < 1 + (-1 + this.field_L.field_X[this.field_u]) % 5 + -((this.field_L.field_X[this.field_u] + -1) / 5)) {
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
                      L2: while (true) {
                        if (-1 <= ((this.field_L.field_X[this.field_u] - 1) % 5 + (1 - (-1 + this.field_L.field_X[this.field_u]) / 5) ^ -1)) {
                          this.field_z = true;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          this.field_L.field_X[this.field_u] = this.field_L.field_X[this.field_u] + 5;
                          continue L2;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            L3: {
              if (-28 != (this.field_jb ^ -1)) {
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!this.t(109)) {
                break L4;
              } else {
                L5: {
                  if (null == this.field_L.field_Ib) {
                    break L5;
                  } else {
                    L6: {
                      this.field_L.field_Ib.a(0, this.field_T);
                      var4_ref_String = this.field_L.field_Ib.a((byte) 127, param0);
                      this.field_L.field_Ib.a(0, 0, var4_ref_String, this.field_T);
                      var5 = this.field_G;
                      var6 = null;
                      if (var5 < 0) {
                        break L6;
                      } else {
                        if (tc.field_w.length > var5) {
                          var6 = tc.field_w[var5];
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var6 != null) {
                        break L7;
                      } else {
                        var6 = "(unknown" + var5 + ")";
                        break L7;
                      }
                    }
                    this.field_L.field_Ib.a(1, 0, (String) (var6), this.field_T);
                    break L5;
                  }
                }
                if (this.field_T == param0) {
                  this.field_L.field_U[param0] = this.field_L.field_U[param0] - 1;
                  break L4;
                } else {
                  this.field_L.field_U[param0] = this.field_L.field_U[param0] + 1;
                  break L4;
                }
              }
            }
            L8: {
              if (-37 != (this.field_jb ^ -1)) {
                break L8;
              } else {
                if (this.field_L.field_H <= this.field_db) {
                  break L8;
                } else {
                  this.field_L.field_b[param0] = this.field_L.field_b[param0] + 1;
                  break L8;
                }
              }
            }
            this.a((byte) 89, 1);
            this.field_L.a((ml) (this), 0);
            if (param1 >= 4) {
              L9: {
                var4 = this.field_jb;
                if (var4 == 40) {
                  var10 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 101, this.field_L, this.field_lb);
                  this.field_L.b(52, var10);
                  break L9;
                } else {
                  L10: {
                    if (var4 != 0) {
                      if (-28 == (var4 ^ -1)) {
                        break L10;
                      } else {
                        if (3 == var4) {
                          var12 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 99, this.field_L, this.field_lb);
                          this.field_L.b(52, var12);
                          break L9;
                        } else {
                          if (7 != var4) {
                            if (1 == var4) {
                              var14 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 89, this.field_L, this.field_lb);
                              this.field_L.b(52, var14);
                              break L9;
                            } else {
                              if (var4 == 5) {
                                var15 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 94, this.field_L, this.field_lb);
                                this.field_L.b(52, var15);
                                break L9;
                              } else {
                                if (-3 != (var4 ^ -1)) {
                                  if (var4 != 11) {
                                    if (-10 == (var4 ^ -1)) {
                                      var18 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 108, this.field_L, this.field_lb);
                                      this.field_L.b(52, var18);
                                      break L9;
                                    } else {
                                      if ((var4 ^ -1) == -18) {
                                        if (this.field_U) {
                                          var20 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 103, this.field_L, this.field_lb);
                                          this.field_L.b(52, var20);
                                          break L9;
                                        } else {
                                          var19 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 108, this.field_L, this.field_lb);
                                          this.field_L.b(52, var19);
                                          break L9;
                                        }
                                      } else {
                                        if (var4 == 10) {
                                          var21 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 108, this.field_L, this.field_lb);
                                          this.field_L.b(52, var21);
                                          break L9;
                                        } else {
                                          if ((var4 ^ -1) != -7) {
                                            if (var4 != 25) {
                                              if (-5 == (var4 ^ -1)) {
                                                var24 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 94, this.field_L, this.field_lb);
                                                this.field_L.b(52, var24);
                                                break L9;
                                              } else {
                                                if ((var4 ^ -1) == -9) {
                                                  var25 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 103, this.field_L, this.field_lb);
                                                  this.field_L.b(52, var25);
                                                  break L9;
                                                } else {
                                                  if ((var4 ^ -1) != -14) {
                                                    if (37 == var4) {
                                                      var27 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 163, this.field_L, this.field_lb);
                                                      this.field_L.b(52, var27);
                                                      break L9;
                                                    } else {
                                                      if (-40 == (var4 ^ -1)) {
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
                                                        break L9;
                                                      } else {
                                                        if ((var4 ^ -1) == -16) {
                                                          var33 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 94, this.field_L, this.field_lb);
                                                          this.field_L.b(52, var33);
                                                          break L9;
                                                        } else {
                                                          if (var4 != 14) {
                                                            if (-27 != (var4 ^ -1)) {
                                                              if (var4 == 12) {
                                                                this.field_L.a(this.field_db + -256, -60, this.field_lb + -128, go.field_j[29].b());
                                                                break L9;
                                                              } else {
                                                                L11: {
                                                                  if ((var4 ^ -1) == -34) {
                                                                    break L11;
                                                                  } else {
                                                                    if (var4 == 31) {
                                                                      break L11;
                                                                    } else {
                                                                      L12: {
                                                                        if ((var4 ^ -1) == -30) {
                                                                          break L12;
                                                                        } else {
                                                                          if ((var4 ^ -1) != -31) {
                                                                            if (28 != var4) {
                                                                              if (-33 == (var4 ^ -1)) {
                                                                                break L12;
                                                                              } else {
                                                                                if ((var4 ^ -1) == -35) {
                                                                                  var38 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 146, this.field_L, this.field_lb);
                                                                                  this.field_L.b(52, var38);
                                                                                  var38.field_y = 250;
                                                                                  break L9;
                                                                                } else {
                                                                                  if (var4 != 36) {
                                                                                    break L9;
                                                                                  } else {
                                                                                    var39 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 128, this.field_L, this.field_lb);
                                                                                    this.field_L.b(52, var39);
                                                                                    break L9;
                                                                                  }
                                                                                }
                                                                              }
                                                                            } else {
                                                                              var40 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 130, this.field_L, this.field_lb);
                                                                              this.field_L.b(52, var40);
                                                                              break L9;
                                                                            }
                                                                          } else {
                                                                            break L12;
                                                                          }
                                                                        }
                                                                      }
                                                                      var41 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 130, this.field_L, this.field_lb);
                                                                      this.field_L.b(52, var41);
                                                                      break L9;
                                                                    }
                                                                  }
                                                                }
                                                                var36 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 154, this.field_L, this.field_lb);
                                                                this.field_L.b(52, var36);
                                                                break L9;
                                                              }
                                                            } else {
                                                              var35 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 103, this.field_L, this.field_lb);
                                                              this.field_L.b(52, var35);
                                                              break L9;
                                                            }
                                                          } else {
                                                            var34 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 99, this.field_L, this.field_lb);
                                                            this.field_L.b(52, var34);
                                                            break L9;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    var26 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 85, this.field_L, this.field_lb);
                                                    this.field_L.b(52, var26);
                                                    break L9;
                                                  }
                                                }
                                              }
                                            } else {
                                              var23 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 99, this.field_L, this.field_lb);
                                              this.field_L.b(52, var23);
                                              break L9;
                                            }
                                          } else {
                                            var22 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 103, this.field_L, this.field_lb);
                                            this.field_L.b(52, var22);
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var17 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 101, this.field_L, this.field_lb);
                                    this.field_L.b(52, var17);
                                    break L9;
                                  }
                                } else {
                                  var16 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 89, this.field_L, this.field_lb);
                                  this.field_L.b(52, var16);
                                  break L9;
                                }
                              }
                            }
                          } else {
                            var13 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 103, this.field_L, this.field_lb);
                            this.field_L.b(52, var13);
                            break L9;
                          }
                        }
                      }
                    } else {
                      break L10;
                    }
                  }
                  this.b(-30225, 53);
                  var11 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 101, this.field_L, this.field_lb);
                  this.field_L.b(52, var11);
                  break L9;
                }
              }
              this.a(true);
              this.a((byte) 88);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "ml.RA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final void a(byte param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -35) {
                break L1;
              } else {
                this.field_n = -119;
                break L1;
              }
            }
            L2: {
              if (null != this.field_L.field_rb) {
                if (null != this.field_L.field_rb[param2]) {
                  ii.a(param1, false, this.field_L.field_rb[param2], 100 * tm.field_a[param2] / param1);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var4), "ml.CB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean x(int param0) {
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 32) {
                break L1;
              } else {
                this.field_W = 61;
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.f((byte) -107)) {
                  break L3;
                } else {
                  if (this.field_jb != 32) {
                    stackIn_8_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_8_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.OA(" + param0 + ')');
        }
        return stackIn_8_0 != 0;
    }

    private final void h(int param0) {
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        mi var5 = null;
        mi var6 = null;
        mi var7 = null;
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
        mi var40 = null;
        mi var41 = null;
        mi var42 = null;
        mi var43 = null;
        mi var44 = null;
        mi var45 = null;
        mi var46 = null;
        mi var47 = null;
        mi var48 = null;
        mi var49 = null;
        mi var50 = null;
        mi var51 = null;
        mi var52 = null;
        mi var53 = null;
        mi var54 = null;
        mi var55 = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var3 = this.field_jb;
                if (var3 != 0) {
                  if (27 != var3) {
                    if (3 != var3) {
                      if (7 != var3) {
                        if (1 == var3) {
                          var10 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 89, this.field_L, this.field_lb);
                          this.field_L.b(52, var10);
                          break L1;
                        } else {
                          if ((var3 ^ -1) != -6) {
                            if (2 != var3) {
                              if (var3 != 11) {
                                if (-10 == (var3 ^ -1)) {
                                  var18 = aj.a((ml) null, this.field_db - this.field_Y, false, 108, this.field_L, this.field_lb);
                                  this.field_L.b(52, var18);
                                  var19 = aj.a((ml) null, this.field_db, false, 108, this.field_L, -(this.field_Y / 2) + this.field_lb);
                                  this.field_L.b(52, var19);
                                  var20 = aj.a((ml) null, this.field_db, false, 108, this.field_L, this.field_lb - -(this.field_Y / 2));
                                  this.field_L.b(52, var20);
                                  break L1;
                                } else {
                                  if ((var3 ^ -1) != -18) {
                                    if (var3 == 10) {
                                      var22 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 108, this.field_L, this.field_lb);
                                      this.field_L.b(52, var22);
                                      break L1;
                                    } else {
                                      if (var3 != 6) {
                                        if (var3 == 25) {
                                          var24 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 99, this.field_L, this.field_lb);
                                          this.field_L.b(52, var24);
                                          break L1;
                                        } else {
                                          if (var3 == 4) {
                                            var25 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 94, this.field_L, this.field_lb);
                                            this.field_L.b(52, var25);
                                            break L1;
                                          } else {
                                            if ((var3 ^ -1) == -9) {
                                              var26 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 103, this.field_L, this.field_lb);
                                              this.field_L.b(52, var26);
                                              break L1;
                                            } else {
                                              if (-38 == (var3 ^ -1)) {
                                                var27 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 163, this.field_L, this.field_lb);
                                                this.field_L.b(52, var27);
                                                break L1;
                                              } else {
                                                if (39 != var3) {
                                                  if (13 == var3) {
                                                    var32 = aj.a((ml) null, this.field_db - this.field_Y, false, 85, this.field_L, this.field_lb);
                                                    this.field_L.b(52, var32);
                                                    var33 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 85, this.field_L, -(this.field_Y / 2) + this.field_lb);
                                                    this.field_L.b(52, var33);
                                                    var34 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 85, this.field_L, this.field_Y / 2 + this.field_lb);
                                                    this.field_L.b(52, var34);
                                                    var35 = aj.a((ml) null, this.field_db, false, 85, this.field_L, this.field_lb);
                                                    this.field_L.b(52, var35);
                                                    break L1;
                                                  } else {
                                                    if ((var3 ^ -1) != -16) {
                                                      if (14 == var3) {
                                                        var40 = aj.a((ml) null, this.field_db + -this.field_Y, false, 99, this.field_L, this.field_lb);
                                                        this.field_L.b(52, var40);
                                                        var41 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 99, this.field_L, this.field_lb + -(this.field_Y / 2));
                                                        this.field_L.b(52, var41);
                                                        var42 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 99, this.field_L, this.field_lb + this.field_Y / 2);
                                                        this.field_L.b(52, var42);
                                                        var43 = aj.a((ml) null, this.field_db, false, 99, this.field_L, this.field_lb);
                                                        this.field_L.b(52, var43);
                                                        break L1;
                                                      } else {
                                                        if (26 == var3) {
                                                          var44 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 103, this.field_L, this.field_lb);
                                                          this.field_L.b(52, var44);
                                                          break L1;
                                                        } else {
                                                          if (12 == var3) {
                                                            var45 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 108, this.field_L, this.field_lb);
                                                            this.field_L.b(52, var45);
                                                            break L1;
                                                          } else {
                                                            if (28 != var3) {
                                                              if (32 == var3) {
                                                                var47 = aj.a((ml) null, -this.field_Y + this.field_db, false, 130, this.field_L, this.field_lb);
                                                                this.field_L.b(52, var47);
                                                                var48 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 130, this.field_L, this.field_lb + -(this.field_Y / 2));
                                                                this.field_L.b(52, var48);
                                                                var49 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 130, this.field_L, this.field_lb - -(this.field_Y / 2));
                                                                this.field_L.b(52, var49);
                                                                var50 = aj.a((ml) null, this.field_db, false, 130, this.field_L, this.field_lb);
                                                                this.field_L.b(52, var50);
                                                                break L1;
                                                              } else {
                                                                if ((var3 ^ -1) != -34) {
                                                                  if (var3 != 31) {
                                                                    if (var3 != 34) {
                                                                      break L1;
                                                                    } else {
                                                                      var55 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 131, this.field_L, this.field_lb);
                                                                      this.field_L.b(52, var55);
                                                                      break L1;
                                                                    }
                                                                  } else {
                                                                    var52 = aj.a((ml) null, this.field_db - this.field_Y, false, 154, this.field_L, this.field_lb);
                                                                    this.field_L.b(52, var52);
                                                                    var53 = aj.a((ml) null, this.field_db, false, 154, this.field_L, -(this.field_Y / 2) + this.field_lb);
                                                                    this.field_L.b(52, var53);
                                                                    var54 = aj.a((ml) null, this.field_db, false, 154, this.field_L, this.field_Y / 2 + this.field_lb);
                                                                    this.field_L.b(52, var54);
                                                                    break L1;
                                                                  }
                                                                } else {
                                                                  var51 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 128, this.field_L, this.field_lb);
                                                                  this.field_L.b(52, var51);
                                                                  break L1;
                                                                }
                                                              }
                                                            } else {
                                                              var46 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 130, this.field_L, this.field_lb);
                                                              this.field_L.b(52, var46);
                                                              break L1;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      var36 = aj.a((ml) null, this.field_db - this.field_Y, false, 94, this.field_L, this.field_lb);
                                                      this.field_L.b(52, var36);
                                                      var37 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 94, this.field_L, this.field_lb + -(this.field_Y / 2));
                                                      this.field_L.b(52, var37);
                                                      var38 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 94, this.field_L, this.field_Y / 2 + this.field_lb);
                                                      this.field_L.b(52, var38);
                                                      var39 = aj.a((ml) null, this.field_db, false, 94, this.field_L, this.field_lb);
                                                      this.field_L.b(52, var39);
                                                      break L1;
                                                    }
                                                  }
                                                } else {
                                                  var28 = aj.a((ml) null, -this.field_Y + this.field_db, false, 163, this.field_L, this.field_lb);
                                                  this.field_L.b(52, var28);
                                                  var29 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 163, this.field_L, this.field_lb + -(this.field_Y / 2));
                                                  this.field_L.b(52, var29);
                                                  var30 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 163, this.field_L, this.field_lb + this.field_Y / 2);
                                                  this.field_L.b(52, var30);
                                                  var31 = aj.a((ml) null, this.field_db, false, 163, this.field_L, this.field_lb);
                                                  this.field_L.b(52, var31);
                                                  break L1;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var23 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 103, this.field_L, this.field_lb);
                                        this.field_L.b(52, var23);
                                        break L1;
                                      }
                                    }
                                  } else {
                                    var21 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 108, this.field_L, this.field_lb);
                                    this.field_L.b(52, var21);
                                    break L1;
                                  }
                                }
                              } else {
                                var17 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 101, this.field_L, this.field_lb);
                                this.field_L.b(52, var17);
                                break L1;
                              }
                            } else {
                              var14 = aj.a((ml) null, this.field_db - this.field_Y, false, 89, this.field_L, this.field_lb);
                              this.field_L.b(52, var14);
                              var15 = aj.a((ml) null, this.field_db, false, 89, this.field_L, -(this.field_Y / 2) + this.field_lb);
                              this.field_L.b(52, var15);
                              var16 = aj.a((ml) null, this.field_db, false, 89, this.field_L, this.field_lb - -(this.field_Y / 2));
                              this.field_L.b(52, var16);
                              break L1;
                            }
                          } else {
                            var11 = aj.a((ml) null, this.field_db - this.field_Y, false, 94, this.field_L, this.field_lb);
                            this.field_L.b(52, var11);
                            var12 = aj.a((ml) null, this.field_db, false, 94, this.field_L, this.field_lb + -(this.field_Y / 2));
                            this.field_L.b(52, var12);
                            var13 = aj.a((ml) null, this.field_db, false, 94, this.field_L, this.field_Y / 2 + this.field_lb);
                            this.field_L.b(52, var13);
                            break L1;
                          }
                        }
                      } else {
                        var7 = aj.a((ml) null, this.field_db - this.field_Y, false, 103, this.field_L, this.field_lb);
                        this.field_L.b(52, var7);
                        var8 = aj.a((ml) null, this.field_db, false, 103, this.field_L, this.field_lb + -(this.field_Y / 2));
                        this.field_L.b(52, var8);
                        var9 = aj.a((ml) null, this.field_db, false, 103, this.field_L, this.field_lb - -(this.field_Y / 2));
                        this.field_L.b(52, var9);
                        break L1;
                      }
                    } else {
                      var6 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 99, this.field_L, this.field_lb);
                      this.field_L.b(52, var6);
                      break L1;
                    }
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              var5 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 101, this.field_L, this.field_lb);
              this.field_L.b(52, var5);
              break L1;
            }
            var3 = -106 / ((param0 - -5) / 36);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.J(" + param0 + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 0) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 <= 0) {
                  break L1;
                } else {
                  if (param1 > this.field_W) {
                    this.field_W = param1;
                    this.field_G = param2;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                L3: {
                  var4_int = 79 % ((53 - param0) / 56);
                  if (this.field_jb == 32) {
                    break L3;
                  } else {
                    if ((this.field_jb ^ -1) != -28) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                param1 = (param1 + -1) / 2 + 1;
                break L2;
              }
              this.field_x = this.field_x + param1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) runtimeException), "ml.CA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(int param0, int param1) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if (param0 == -30225) {
              L1: {
                if (this.field_L.field_rb != null) {
                  if (null != this.field_L.field_rb[param1]) {
                    ti.a((byte) -30, tm.field_a[param1], this.field_L.field_rb[param1]);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "ml.S(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void h(byte param0) {
        boolean stackIn_73_0 = false;
        boolean stackIn_74_0 = false;
        int stackIn_74_1 = 0;
        Object stackIn_131_0 = null;
        Object stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ml var6_ref_ml = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        ml var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        mi var15 = null;
        int var16 = 0;
        var16 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = this.x(32) ? 1 : 0;
                var3 = this.s(-1) ? 1 : 0;
                var4 = 0;
                var5 = 0;
                if (-29 == (this.field_jb ^ -1)) {
                  break L2;
                } else {
                  if (-30 == (this.field_jb ^ -1)) {
                    break L2;
                  } else {
                    if (-31 == (this.field_jb ^ -1)) {
                      break L2;
                    } else {
                      if (32 == this.field_jb) {
                        break L2;
                      } else {
                        if (7 != this.field_L.field_x[this.field_u]) {
                          break L1;
                        } else {
                          if ((this.field_L.field_X[this.field_u] ^ -1) < -1) {
                            break L2;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                  }
                }
              }
              if (this.field_lb < 0) {
                break L1;
              } else {
                if (this.field_lb <= this.field_L.field_y) {
                  var5 = 1;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
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
                    L6: {
                      if (var6_ref_ml.field_s != this) {
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
                    continue L5;
                  }
                }
              }
            }
            this.field_hb = true;
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
                var7 = this.field_R;
                this.field_R = this.field_R + this.field_eb;
                if (var3 == 0) {
                  this.field_eb = this.field_eb + 4;
                  break L8;
                } else {
                  L9: {
                    this.field_F = this.field_F + 0.4;
                    if (this.field_F > 6.28) {
                      this.field_F = this.field_F - 6.28;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    this.field_kb = this.field_kb * 15 >> -1656332892;
                    this.field_eb = this.field_eb * 15 >> -580871356;
                    if (0 < this.field_kb) {
                      this.field_kb = this.field_kb - 1;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (0 >= this.field_eb) {
                      break L11;
                    } else {
                      this.field_eb = this.field_eb - 1;
                      break L11;
                    }
                  }
                  L12: {
                    if (-1 >= (this.field_kb ^ -1)) {
                      break L12;
                    } else {
                      this.field_kb = this.field_kb + 1;
                      break L12;
                    }
                  }
                  L13: {
                    if (-1 >= (this.field_eb ^ -1)) {
                      break L13;
                    } else {
                      this.field_eb = this.field_eb + 1;
                      break L13;
                    }
                  }
                  L14: {
                    if (0 != Math.abs(this.field_kb)) {
                      break L14;
                    } else {
                      if (-1 != (Math.abs(this.field_eb) ^ -1)) {
                        break L14;
                      } else {
                        this.field_kb = 0;
                        this.field_eb = 0;
                        this.field_z = false;
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (this.field_Y << 977062148 <= this.field_R) {
                      break L15;
                    } else {
                      this.field_L.field_G = 25;
                      this.field_R = this.field_Y << 588371396;
                      break L15;
                    }
                  }
                  L16: {
                    if (this.field_X < this.field_Y << -866983357) {
                      this.field_L.field_G = 25;
                      this.field_X = this.field_Y << 557760323;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  if (this.field_L.field_y - (this.field_Y >> 507640129) << 607008356 < this.field_X) {
                    this.field_X = -(this.field_Y >> -1466448863) + this.field_L.field_y << 1069606372;
                    this.field_L.field_G = 25;
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              L17: {
                if (var2_int == 0) {
                  break L17;
                } else {
                  if (this.field_s.field_q <= 0) {
                    this.field_L.a(this.field_s, 0);
                    var8 = -this.field_lb + this.field_s.field_lb;
                    var9_int = this.field_s.field_db - this.field_db - (-(this.field_Y / 2) - -(this.field_s.field_Y / 2));
                    if (var9_int * var9_int + var8 * var8 >= (this.field_s.field_Y + this.field_Y) * (this.field_s.field_Y + this.field_Y) >> -399988894) {
                      break L17;
                    } else {
                      L18: {
                        if ((this.field_s.field_x ^ -1) >= -1) {
                          break L18;
                        } else {
                          L19: {
                            stackIn_73_0 = this.field_s.field_U;

                            if (this.field_U) {
                              stackIn_74_0 = stackIn_73_0;
                              stackIn_74_1 = 0;
                              break L19;
                            } else {
                              stackIn_74_0 = stackIn_73_0;
                              stackIn_74_1 = 1;
                              break L19;
                            }
                          }
                          if ((stackIn_74_0 ? 1 : 0) == stackIn_74_1) {
                            break L18;
                          } else {
                            L20: {
                              var10 = this.field_s.field_x;
                              if (this.field_ib + -this.field_x >= var10) {
                                break L20;
                              } else {
                                var10 = this.field_ib - this.field_x;
                                break L20;
                              }
                            }
                            L21: {
                              if (var10 < 0) {
                                var10 = 0;
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                            if (0 < var10) {
                              this.field_L.field_cb[this.field_s.field_u] = this.field_L.field_cb[this.field_s.field_u] + var10;
                              this.field_x = this.field_x + var10;
                              this.field_s.field_x = this.field_s.field_x - var10;
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                      L22: {
                        if (!this.field_s.field_z) {
                          break L22;
                        } else {
                          if ((this.field_s.field_eb ^ -1) > -1) {
                            break L17;
                          } else {
                            break L22;
                          }
                        }
                      }
                      L23: {
                        this.field_s.field_R = this.field_R + -(this.field_Y << -1597748957);
                        this.field_s.field_X = this.field_X + -(this.field_E * (this.field_Y << 755019297));
                        if (-33 > (this.field_s.field_Y ^ -1)) {
                          this.field_s.field_R = this.field_s.field_R + 192;
                          this.field_s.field_X = this.field_s.field_X + 0 * this.field_E;
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                      L24: {
                        if ((this.field_jb ^ -1) != -33) {
                          break L24;
                        } else {
                          this.field_s.field_X = this.field_s.field_X + 448 * this.field_E;
                          this.field_s.field_R = this.field_s.field_R - 480;
                          break L24;
                        }
                      }
                      this.field_lb = this.field_X >> 91900420;
                      this.field_db = this.field_R >> 595052516;
                      this.field_s.field_db = this.field_s.field_R >> 9382084;
                      this.field_s.field_E = this.field_E;
                      this.field_s.field_lb = this.field_s.field_X >> 1650459556;
                      break L17;
                    }
                  } else {
                    break L17;
                  }
                }
              }
              L25: {
                this.field_lb = this.field_X >> -1221777500;
                this.field_db = this.field_R >> -10866364;
                if ((this.field_P ^ -1) >= -1) {
                  break L25;
                } else {
                  this.field_P = this.field_P - 1;
                  break L25;
                }
              }
              L26: {
                L27: {
                  if ((this.field_P ^ -1) < -1) {
                    break L27;
                  } else {
                    if (this.field_L.b(this.field_db - this.field_Y, 2, -(this.field_Y >> 2084430369) + this.field_lb, this.field_w)) {
                      L28: {
                        var10 = this.field_kb;
                        var11 = this.field_eb;
                        var9_int = this.field_db + -ce.field_k + (this.field_Y >> 1633650273);
                        var8 = this.field_lb + -di.field_m;
                        var12 = am.a(var9_int, var8, false);
                        if ((var12 ^ -1) > -2) {
                          var8 = 0;
                          var9_int = -1;
                          var12 = 1;
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                      L29: {
                        var13 = (var8 * (this.field_kb << -2060251416) - -((this.field_eb << -2021083160) * var9_int)) / var12;
                        this.field_X = var6;
                        var14 = (-((this.field_eb << -376027896) * var8) + (this.field_kb << -247100024) * var9_int) / var12;
                        if (this.field_P > 0) {
                          break L29;
                        } else {
                          this.field_R = var7;
                          break L29;
                        }
                      }
                      L30: {
                        L31: {
                          this.field_db = this.field_R >> 944466084;
                          this.field_lb = this.field_X >> 1911184516;
                          if (32768 < var13) {
                            break L31;
                          } else {
                            if ((this.field_eb ^ -1) > -1) {
                              break L31;
                            } else {
                              if ((Math.abs(var14) ^ -1) >= -8193) {
                                var13 = 0;
                                var14 = 0;
                                this.b(-30225, 51);
                                this.field_eb = 0;
                                this.field_kb = 0;
                                break L30;
                              } else {
                                break L31;
                              }
                            }
                          }
                        }
                        L32: {
                          var13 = -(var13 >> -1971030206);
                          var14 = var14 >> 1624992738;
                          if (var3 == 0) {
                            break L32;
                          } else {
                            var14 = 0;
                            var13 = var13 << -1818665535;
                            break L32;
                          }
                        }
                        this.field_eb = (-(var8 * var14) + var13 * var9_int) / var12 >> 847282088;
                        this.field_kb = (var14 * var9_int + var13 * var8) / var12 >> -1324582456;
                        break L30;
                      }
                      L33: {
                        this.field_A = this.field_A + 1;
                        if (5 < this.field_A) {
                          this.field_eb = 0;
                          this.field_z = false;
                          this.field_A = 0;
                          this.field_kb = 0;
                          break L33;
                        } else {
                          break L33;
                        }
                      }
                      L34: {
                        if (Math.abs(var14 >> -792557112) >= 16) {
                          break L34;
                        } else {
                          if (Math.abs(var13 >> -905626744) >= 16) {
                            break L34;
                          } else {
                            this.field_A = 0;
                            this.field_z = false;
                            break L34;
                          }
                        }
                      }
                      if (0 <= this.field_db - this.field_Y) {
                        break L26;
                      } else {
                        if (-13 == (this.field_jb ^ -1)) {
                          break L26;
                        } else {
                          if (this.g((byte) 109)) {
                            break L26;
                          } else {
                            L35: {
                              this.field_kb = 2 * var10;
                              if (4 <= (this.field_kb ^ -1)) {
                                break L35;
                              } else {
                                if (-6 >= (this.field_kb ^ -1)) {
                                  break L35;
                                } else {
                                  L36: {
                                    stackIn_131_0 = this;

                                    if (-1 < (this.field_kb ^ -1)) {
                                      stackIn_132_0 = this;
                                      stackIn_132_1 = -5;
                                      break L36;
                                    } else {
                                      stackIn_132_0 = this;
                                      stackIn_132_1 = 5;
                                      break L36;
                                    }
                                  }
                                  ((ml) (this)).field_kb = stackIn_132_1;
                                  break L35;
                                }
                              }
                            }
                            L37: {
                              this.field_eb = -5 + -Math.abs(var11);
                              var15 = aj.a((ml) null, this.field_db, false, 101, this.field_L, this.field_lb);
                              this.field_L.b(52, var15);
                              this.field_L.a(this.field_lb, this.field_Y * 2, (byte) 51, -(this.field_Y / 2) + this.field_db);
                              this.field_z = true;
                              if (this.field_x < this.field_ib) {
                                this.field_x = this.field_x + 15;
                                break L37;
                              } else {
                                break L37;
                              }
                            }
                            this.field_L.field_G = 25;
                            break L26;
                          }
                        }
                      }
                    } else {
                      break L27;
                    }
                  }
                }
                this.field_A = 0;
                break L26;
              }
              L38: {
                this.field_M = 0;
                if (-16 + this.field_L.field_H > this.field_db) {
                  break L38;
                } else {
                  if (var5 == 0) {
                    break L38;
                  } else {
                    this.field_db = -16 + this.field_L.field_H;
                    this.field_A = 0;
                    this.field_R = this.field_db << -1358141692;
                    this.field_z = false;
                    break L38;
                  }
                }
              }
              L39: {
                var8 = -this.field_eb;
                if (this.field_Y >> 1575916801 < var8) {
                  var8 = this.field_Y >> -847457759;
                  break L39;
                } else {
                  break L39;
                }
              }
              L40: {
                if (-(this.field_Y >> 1492758753) <= var8) {
                  break L40;
                } else {
                  var8 = -(this.field_Y >> -254484223);
                  break L40;
                }
              }
              L41: {
                this.field_O = -(var8 >> 981446754);
                this.field_o = var8 >> -519481374;
                this.field_N = -(var8 >> 1755592482);
                this.field_Z = var8 >> 1383209730;
                if (var2_int == 0) {
                  break L41;
                } else {
                  if (0 >= this.field_s.field_ib) {
                    break L41;
                  } else {
                    this.field_L.a(-41, this.field_s);
                    break L41;
                  }
                }
              }
              L42: {
                if (var4 == 0) {
                  break L42;
                } else {
                  pi.field_b.a((byte) 87, this.field_L.field_i);
                  var9 = (ml) ((Object) pi.field_b.b(-109));
                  L43: while (true) {
                    if (var9 == null) {
                      break L42;
                    } else {
                      L44: {
                        if (this != var9.field_s) {
                          break L44;
                        } else {
                          if (var9.x(32)) {
                            if ((var9.field_ib ^ -1) < -1) {
                              this.field_L.a(-45, var9);
                              break L44;
                            } else {
                              break L44;
                            }
                          } else {
                            var9 = (ml) ((Object) pi.field_b.d(param0 ^ 18482));
                            continue L43;
                          }
                        }
                      }
                      var9 = (ml) ((Object) pi.field_b.d(param0 ^ 18482));
                      continue L43;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.QA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final ml a(nf param0, byte param1) {
        ml var4 = null;
        ml stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            var4 = new ml(param0);
            var4.field_T = this.field_T;
            var4.field_U = this.field_U;
            var4.field_u = this.field_u;
            var4.field_jb = this.field_jb;
            var4.a(12, true);
            if (this.field_x == 0) {
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
                  stackIn_14_0 = (ml) (var4);
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
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("ml.G(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L2;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        return stackIn_14_0;
    }

    final int y(int param0) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 17571) {
                break L1;
              } else {
                this.field_D = true;
                break L1;
              }
            }
            stackIn_3_0 = this.field_T;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.AA(" + param0 + ')');
        }
        return stackIn_3_0;
    }

    final int f(int param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          L0: {
            var2_int = 95 / ((param0 - -11) / 35);
            stackIn_1_0 = this.field_lb;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.B(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    final boolean c(boolean param0) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                this.field_y = -31;
                break L1;
              }
            }
            stackIn_3_0 = this.field_D;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.GB(" + param0 + ')');
        }
        return stackIn_3_0;
    }

    private final void n(int param0) {
        int stackIn_35_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = this.g((byte) 117) ? 1 : 0;
                var3 = this.d(-10265) ? 1 : 0;
                var4 = this.x(32) ? 1 : 0;
                var5 = 0;
                if (this.field_jb == 28) {
                  break L2;
                } else {
                  if (29 == this.field_jb) {
                    break L2;
                  } else {
                    if ((this.field_jb ^ -1) == -31) {
                      break L2;
                    } else {
                      if (-33 == (this.field_jb ^ -1)) {
                        break L2;
                      } else {
                        if (-8 != (this.field_L.field_x[this.field_u] ^ -1)) {
                          break L1;
                        } else {
                          if ((this.field_L.field_X[this.field_u] ^ -1) < -1) {
                            break L2;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                  }
                }
              }
              if (0 > this.field_lb) {
                break L1;
              } else {
                if (this.field_lb > this.field_L.field_y) {
                  break L1;
                } else {
                  var5 = 1;
                  break L1;
                }
              }
            }
            L3: {
              if (var3 != 0) {
                break L3;
              } else {
                if (this.field_L.a(61, this.field_w, -this.field_Y + this.field_db - -1, -(this.field_Y >> 856517889) + this.field_lb, this.field_db - this.field_Y)) {
                  break L3;
                } else {
                  L4: {
                    if (var5 == 0) {
                      break L4;
                    } else {
                      if (this.field_db >= -16 + this.field_L.field_H) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_P = 0;
                  this.field_eb = 0;
                  this.field_kb = 0;
                  this.field_z = true;
                  break L3;
                }
              }
            }
            L5: {
              if (-16 + this.field_L.field_H > this.field_db) {
                break L5;
              } else {
                if (var5 != 0) {
                  this.field_db = -16 + this.field_L.field_H;
                  this.field_A = 0;
                  this.field_R = this.field_db << 515846852;
                  this.field_z = false;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            if (this.e(true)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L6: {
                if (this.field_z) {
                  this.field_M = 0;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (this.field_M != 0) {
                  stackIn_35_0 = 0;
                  break L7;
                } else {
                  stackIn_35_0 = 1;
                  break L7;
                }
              }
              L8: {
                var6 = stackIn_35_0;
                if (-1 == (this.field_M ^ -1)) {
                  if ((this.field_jb ^ -1) == -41) {
                    this.field_F = this.field_F + 0.1;
                    if (6.283185307179586 >= this.field_F) {
                      break L8;
                    } else {
                      this.field_F = this.field_F - 6.283185307179586;
                      break L8;
                    }
                  } else {
                    L9: {
                      if ((this.field_ab ^ -1) != -4) {
                        break L9;
                      } else {
                        if (this.field_jb != 0) {
                          break L9;
                        } else {
                          this.field_F = this.field_F * 0.9;
                          break L8;
                        }
                      }
                    }
                    this.field_F = 0.0;
                    break L8;
                  }
                } else {
                  break L8;
                }
              }
              L10: {
                if (var2_int != 0) {
                  L11: {
                    L12: {
                      if ((this.field_M ^ -1) == -3) {
                        break L12;
                      } else {
                        if ((this.field_M ^ -1) == -4) {
                          break L12;
                        } else {
                          if (-1 > (this.field_q ^ -1)) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    this.field_db = this.field_db - this.field_Y / 2;
                    this.field_jb = 0;
                    this.field_R = this.field_db << -590380668;
                    this.field_z = true;
                    this.field_q = 0;
                    this.field_Y = 32;
                    this.field_w = new qb(this.field_Y, this.field_Y);
                    this.field_w.a();
                    de.i(this.field_Y >> 1259726881, this.field_Y >> 291763841, this.field_Y >> 981384481, 16777215);
                    break L11;
                  }
                  if (-39 != (this.field_jb ^ -1)) {
                    this.field_M = 0;
                    break L10;
                  } else {
                    break L10;
                  }
                } else {
                  break L10;
                }
              }
              L13: {
                L14: {
                  if (this.field_M == -1) {
                    break L14;
                  } else {
                    if (1 != this.field_M) {
                      break L13;
                    } else {
                      break L14;
                    }
                  }
                }
                this.field_E = this.field_M;
                this.field_db = this.field_R >> -1822090396;
                this.field_lb = this.field_X >> -1549961436;
                var7 = this.field_M + this.field_lb;
                var8 = this.field_db;
                var9 = 0;
                L15: while (true) {
                  if (8 <= var9) {
                    L16: {
                      if (!this.field_L.b(this.field_db - this.field_Y, 2, this.field_lb - (this.field_Y >> 2141450113), this.field_w)) {
                        break L16;
                      } else {
                        var8--;
                        break L16;
                      }
                    }
                    L17: {
                      this.field_kb = 0;
                      this.field_eb = 0;
                      if (var5 == 0) {
                        break L17;
                      } else {
                        if (-16 + this.field_L.field_H > this.field_db) {
                          break L17;
                        } else {
                          if (this.field_db < var8) {
                            var8 = this.field_db;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                      }
                    }
                    L18: {
                      if (-1 >= (-this.field_Y + var8 ^ -1)) {
                        break L18;
                      } else {
                        var8 = -100;
                        this.field_L.field_G = 25;
                        break L18;
                      }
                    }
                    L19: {
                      if (Math.abs(-this.field_db + var8) >= 5) {
                        L20: {
                          if (var8 <= this.field_db) {
                            break L20;
                          } else {
                            if (this.field_jb != 38) {
                              this.field_kb = 16 * this.field_M;
                              this.field_z = true;
                              this.field_eb = -16;
                              if ((this.field_jb ^ -1) != -37) {
                                break L19;
                              } else {
                                L21: {
                                  if (!this.field_U) {
                                    break L21;
                                  } else {
                                    if (lk.a(0, (byte) -61)) {
                                      break L21;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                                this.field_kb = 0;
                                break L19;
                              }
                            } else {
                              break L20;
                            }
                          }
                        }
                        if (this.field_db >= var8) {
                          break L19;
                        } else {
                          if (38 != this.field_jb) {
                            break L19;
                          } else {
                            L22: {
                              this.field_lb = var7;
                              this.field_F = this.field_F + 0.4;
                              if (90 < this.field_Y) {
                                break L22;
                              } else {
                                if (31 == this.field_jb) {
                                  break L22;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            this.field_F = this.field_F - 0.3;
                            break L19;
                          }
                        }
                      } else {
                        L23: {
                          if (var7 == this.field_lb) {
                            break L23;
                          } else {
                            if (this.field_s == null) {
                              this.field_L.field_Ob[this.field_T] = this.field_L.field_Ob[this.field_T] + 1;
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                        }
                        L24: {
                          L25: {
                            this.field_lb = var7;
                            if ((this.field_ab ^ -1) != -4) {
                              break L25;
                            } else {
                              if (this.field_jb == 0) {
                                this.field_F = this.field_F + 0.1;
                                break L24;
                              } else {
                                break L25;
                              }
                            }
                          }
                          this.field_F = this.field_F + 0.4;
                          break L24;
                        }
                        L26: {
                          this.field_db = var8;
                          if ((this.field_Y ^ -1) < -91) {
                            break L26;
                          } else {
                            if (this.field_jb == 31) {
                              break L26;
                            } else {
                              break L19;
                            }
                          }
                        }
                        this.field_F = this.field_F - 0.3;
                        break L19;
                      }
                    }
                    this.field_X = this.field_lb << 1148909796;
                    this.field_R = this.field_db << -770209884;
                    this.field_M = 0;
                    if (var4 == 0) {
                      break L13;
                    } else {
                      if ((this.field_s.field_q ^ -1) >= -1) {
                        L27: {
                          this.field_L.a(this.field_s, 0);
                          var9 = -this.field_lb + this.field_s.field_lb;
                          var10 = this.field_Y / 2 + (-this.field_db + (this.field_s.field_db - this.field_s.field_Y / 2));
                          if (!this.field_s.field_z) {
                            break L27;
                          } else {
                            if (0 > this.field_s.field_eb) {
                              break L13;
                            } else {
                              break L27;
                            }
                          }
                        }
                        if ((this.field_s.field_Y + this.field_Y) * (this.field_s.field_Y + this.field_Y) >> 1399913218 > var9 * var9 + var10 * var10) {
                          L28: {
                            this.field_s.field_X = -(this.field_E * (this.field_Y << -1146742303)) + this.field_X;
                            this.field_s.field_R = -(this.field_Y << 739612003) + this.field_R;
                            if (32 >= this.field_s.field_Y) {
                              break L28;
                            } else {
                              this.field_s.field_R = this.field_s.field_R + 192;
                              this.field_s.field_X = this.field_s.field_X + 0 * this.field_E;
                              break L28;
                            }
                          }
                          L29: {
                            if (-33 == (this.field_jb ^ -1)) {
                              this.field_s.field_R = this.field_s.field_R - 480;
                              this.field_s.field_X = this.field_s.field_X + this.field_E * 448;
                              break L29;
                            } else {
                              break L29;
                            }
                          }
                          this.field_lb = this.field_X >> -860162812;
                          this.field_db = this.field_R >> -372875740;
                          this.field_s.field_E = this.field_E;
                          this.field_s.field_db = this.field_s.field_R >> -102326044;
                          this.field_s.field_lb = this.field_s.field_X >> -966954236;
                          break L13;
                        } else {
                          break L13;
                        }
                      } else {
                        break L13;
                      }
                    }
                  } else {
                    L30: {
                      if (this.field_L.b(-this.field_Y + var8, 2, -(this.field_Y >> 1393985441) + var7, this.field_w)) {
                        var8--;
                        break L30;
                      } else {
                        var8++;
                        break L30;
                      }
                    }
                    var9++;
                    continue L15;
                  }
                }
              }
              L31: {
                if (2 != this.field_M) {
                  break L31;
                } else {
                  L32: {
                    if (null != this.field_s) {
                      break L32;
                    } else {
                      this.field_L.field_c[this.field_T] = this.field_L.field_c[this.field_T] + 1;
                      break L32;
                    }
                  }
                  L33: {
                    this.field_kb = this.field_E * 64;
                    this.field_eb = -96;
                    if (-5 == (this.field_jb ^ -1)) {
                      this.field_eb = -128;
                      this.field_kb = 96 * this.field_E;
                      break L33;
                    } else {
                      break L33;
                    }
                  }
                  L34: {
                    L35: {
                      if (5 == this.field_jb) {
                        break L35;
                      } else {
                        if (-32 != (this.field_jb ^ -1)) {
                          break L34;
                        } else {
                          break L35;
                        }
                      }
                    }
                    this.field_eb = -64;
                    break L34;
                  }
                  L36: {
                    if ((this.field_jb ^ -1) == -2) {
                      this.field_kb = 96 * this.field_E;
                      this.field_eb = -32;
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                  L37: {
                    L38: {
                      if ((this.field_jb ^ -1) == -3) {
                        break L38;
                      } else {
                        if (32 == this.field_jb) {
                          break L38;
                        } else {
                          break L37;
                        }
                      }
                    }
                    this.field_eb = -32;
                    break L37;
                  }
                  L39: {
                    L40: {
                      if (7 == this.field_jb) {
                        break L40;
                      } else {
                        if (-10 == (this.field_jb ^ -1)) {
                          break L40;
                        } else {
                          break L39;
                        }
                      }
                    }
                    this.field_eb = -32;
                    break L39;
                  }
                  L41: {
                    if (var3 == 0) {
                      break L41;
                    } else {
                      this.field_eb = -64;
                      break L41;
                    }
                  }
                  L42: {
                    if (-4 == (this.field_L.field_x[this.field_u] ^ -1)) {
                      L43: {
                        var7 = this.field_L.field_X[this.field_u] / 20;
                        this.field_kb = this.field_kb + 8 * (var7 * this.field_E);
                        this.field_eb = this.field_eb - 8 * var7;
                        if (96 < this.field_kb * this.field_E) {
                          this.field_kb = this.field_E * 96;
                          break L43;
                        } else {
                          break L43;
                        }
                      }
                      if ((this.field_eb ^ -1) <= 127) {
                        break L42;
                      } else {
                        this.field_eb = -128;
                        break L42;
                      }
                    } else {
                      break L42;
                    }
                  }
                  L44: {
                    if (36 != this.field_jb) {
                      break L44;
                    } else {
                      L45: {
                        if (!this.field_U) {
                          break L45;
                        } else {
                          if (!lk.a(0, (byte) -88)) {
                            break L44;
                          } else {
                            break L45;
                          }
                        }
                      }
                      this.field_kb = 0;
                      this.field_eb = -32;
                      break L44;
                    }
                  }
                  this.field_M = 0;
                  this.field_z = true;
                  this.field_P = 0;
                  this.b(-30225, 49);
                  break L31;
                }
              }
              L46: {
                if ((this.field_M ^ -1) != -4) {
                  break L46;
                } else {
                  L47: {
                    if (this.field_s == null) {
                      this.field_L.field_c[this.field_T] = this.field_L.field_c[this.field_T] + 1;
                      break L47;
                    } else {
                      break L47;
                    }
                  }
                  L48: {
                    this.field_kb = this.field_E * 16;
                    this.field_eb = -128;
                    if (4 == this.field_jb) {
                      this.field_eb = -148;
                      break L48;
                    } else {
                      break L48;
                    }
                  }
                  L49: {
                    L50: {
                      if (-6 == (this.field_jb ^ -1)) {
                        break L50;
                      } else {
                        if (this.field_jb != 31) {
                          break L49;
                        } else {
                          break L50;
                        }
                      }
                    }
                    this.field_eb = -96;
                    break L49;
                  }
                  L51: {
                    if (-2 == (this.field_jb ^ -1)) {
                      this.field_eb = -64;
                      break L51;
                    } else {
                      break L51;
                    }
                  }
                  L52: {
                    if (2 != this.field_jb) {
                      break L52;
                    } else {
                      this.field_eb = -48;
                      break L52;
                    }
                  }
                  L53: {
                    L54: {
                      if (this.field_jb == 7) {
                        break L54;
                      } else {
                        if (-10 == (this.field_jb ^ -1)) {
                          break L54;
                        } else {
                          break L53;
                        }
                      }
                    }
                    this.field_eb = -64;
                    break L53;
                  }
                  L55: {
                    if (var3 != 0) {
                      this.field_kb = 32 * this.field_E;
                      this.field_eb = -128;
                      break L55;
                    } else {
                      break L55;
                    }
                  }
                  L56: {
                    if ((this.field_L.field_x[this.field_u] ^ -1) != -4) {
                      break L56;
                    } else {
                      L57: {
                        var7 = this.field_L.field_X[this.field_u] / 20;
                        this.field_eb = this.field_eb - 8 * var7;
                        this.field_kb = this.field_kb + this.field_E * var7 * 4;
                        if ((this.field_kb * this.field_E ^ -1) < -33) {
                          this.field_kb = this.field_E * 32;
                          break L57;
                        } else {
                          break L57;
                        }
                      }
                      if (-196 <= this.field_eb) {
                        break L56;
                      } else {
                        this.field_eb = -196;
                        break L56;
                      }
                    }
                  }
                  L58: {
                    if ((this.field_jb ^ -1) != -37) {
                      break L58;
                    } else {
                      L59: {
                        if (!this.field_U) {
                          break L59;
                        } else {
                          if (lk.a(0, (byte) -23)) {
                            break L59;
                          } else {
                            break L58;
                          }
                        }
                      }
                      this.field_eb = -32;
                      this.field_kb = 0;
                      break L58;
                    }
                  }
                  this.field_M = 0;
                  this.field_z = true;
                  this.field_P = 0;
                  this.b(-30225, 50);
                  break L46;
                }
              }
              L60: {
                var7 = 117 % ((param0 - -64) / 59);
                this.field_M = 0;
                if (this.field_F <= 6.28) {
                  break L60;
                } else {
                  this.field_F = this.field_F - 6.28;
                  this.b(-30225, 48);
                  break L60;
                }
              }
              L61: {
                if (0.0 <= this.field_F) {
                  break L61;
                } else {
                  this.field_F = this.field_F + 6.28;
                  break L61;
                }
              }
              L62: {
                var8 = (int)(Math.cos(this.field_F) * (double)(this.field_Y >> 69387618));
                var9 = (int)(Math.sin(this.field_F) * (double)(this.field_Y >> 846017666));
                this.field_n = var8 >> 2018888545;
                this.field_N = var9 >> 1815737922;
                this.field_O = -(var9 >> -875779294);
                if (0 < var8) {
                  this.field_Z = -var8;
                  break L62;
                } else {
                  this.field_Z = 0;
                  break L62;
                }
              }
              L63: {
                this.field_y = -var9;
                if ((var8 ^ -1) <= -1) {
                  this.field_o = 0;
                  break L63;
                } else {
                  this.field_o = var8;
                  break L63;
                }
              }
              L64: {
                this.field_t = var9;
                this.field_r = -(var8 >> -1765043423);
                if (var6 == 0) {
                  break L64;
                } else {
                  this.field_N = this.field_O;
                  this.field_Z = this.field_o;
                  break L64;
                }
              }
              L65: {
                L66: {
                  if (var4 == 0) {
                    break L66;
                  } else {
                    if (this.field_s.u(92)) {
                      var8 = -this.field_lb + this.field_s.field_lb;
                      var9 = -this.field_db + this.field_s.field_db;
                      if (!this.field_s.field_z) {
                        break L66;
                      } else {
                        if (this.field_s.field_eb < 0) {
                          break L66;
                        } else {
                          if ((this.field_Y - -this.field_s.field_Y) * (this.field_Y + this.field_s.field_Y) >> 333751778 > var8 * var8 - -(var9 * var9)) {
                            L67: {
                              this.field_L.a(this.field_s, 0);
                              this.field_s.field_z = false;
                              this.field_s.field_R = this.field_R + -(this.field_Y << -1234880893);
                              this.field_s.field_eb = 0;
                              this.field_s.field_X = -(this.field_E * (this.field_Y << -43125439)) + this.field_X;
                              this.field_s.field_kb = 0;
                              if ((this.field_s.field_Y ^ -1) < -33) {
                                this.field_s.field_R = this.field_s.field_R + 192;
                                this.field_s.field_X = this.field_s.field_X + 0 * this.field_E;
                                break L67;
                              } else {
                                break L67;
                              }
                            }
                            L68: {
                              if (32 != this.field_jb) {
                                break L68;
                              } else {
                                this.field_s.field_R = this.field_s.field_R - 480;
                                this.field_s.field_X = this.field_s.field_X + this.field_E * 448;
                                break L68;
                              }
                            }
                            this.field_lb = this.field_X >> 635118404;
                            this.field_db = this.field_R >> 9273348;
                            this.field_s.field_lb = this.field_s.field_X >> 1738587204;
                            this.field_s.field_E = this.field_E;
                            this.field_s.field_db = this.field_s.field_R >> 328194148;
                            if (0 >= this.field_s.field_ib) {
                              break L66;
                            } else {
                              this.field_L.a(-124, this.field_s);
                              break L65;
                            }
                          } else {
                            break L65;
                          }
                        }
                      }
                    } else {
                      break L65;
                    }
                  }
                }
                break L65;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.VA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void d(boolean param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          L0: {
            L1: {
              var2_int = this.f((byte) -107) ? 1 : 0;
              this.field_F = this.field_F + 0.1;
              if (this.field_F > 6.28) {
                this.field_F = this.field_F - 6.28;
                break L1;
              } else {
                break L1;
              }
            }
            if (!this.e(param0)) {
              L2: {
                if (!this.field_z) {
                  break L2;
                } else {
                  this.field_M = 0;
                  break L2;
                }
              }
              L3: {
                if (this.field_M != -1) {
                  break L3;
                } else {
                  if (this.field_X > this.field_L.field_y << -1129068924) {
                    this.field_M = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if ((this.field_M ^ -1) != -2) {
                  break L4;
                } else {
                  if (0 > this.field_X) {
                    this.field_M = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                L6: {
                  if (1 == this.field_M) {
                    break L6;
                  } else {
                    if (-1 != this.field_M) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if (this.field_M == this.field_E) {
                  this.field_E = this.field_M;
                  this.field_kb = this.field_E * 96;
                  this.field_z = true;
                  this.field_M = 0;
                  break L5;
                } else {
                  this.field_E = this.field_M;
                  this.field_M = 0;
                  this.field_z = true;
                  this.field_kb = 32 * this.field_E;
                  break L5;
                }
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
                L10: {
                  this.field_M = 0;
                  if (var2_int == 0) {
                    break L10;
                  } else {
                    if (!this.field_s.u(101)) {
                      break L10;
                    } else {
                      var3 = this.field_s.field_lb - this.field_lb;
                      var4 = this.field_s.field_db - this.field_db;
                      if (!this.field_s.field_z) {
                        break L10;
                      } else {
                        if (this.field_s.field_eb < 0) {
                          break L10;
                        } else {
                          if (var4 * var4 + var3 * var3 >= (this.field_Y + this.field_s.field_Y) * (this.field_s.field_Y + this.field_Y) >> 1048191266) {
                            break L10;
                          } else {
                            L11: {
                              this.field_L.a(this.field_s, 0);
                              this.field_s.field_z = false;
                              this.field_s.field_kb = 0;
                              this.field_s.field_eb = 0;
                              this.field_s.field_X = -((this.field_Y << 380777057) * this.field_E) + this.field_X;
                              this.field_s.field_R = -(this.field_Y << -1206297917) + this.field_R;
                              if (-33 <= (this.field_s.field_Y ^ -1)) {
                                break L11;
                              } else {
                                this.field_s.field_X = this.field_s.field_X + 0 * this.field_E;
                                this.field_s.field_R = this.field_s.field_R + 192;
                                break L11;
                              }
                            }
                            L12: {
                              if (32 == this.field_jb) {
                                this.field_s.field_X = this.field_s.field_X + this.field_E * 448;
                                this.field_s.field_R = this.field_s.field_R - 480;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            this.field_lb = this.field_X >> -1950423900;
                            this.field_db = this.field_R >> -1953124124;
                            this.field_s.field_lb = this.field_s.field_X >> 1361347428;
                            this.field_s.field_db = this.field_s.field_R >> -1734672284;
                            this.field_s.field_E = this.field_E;
                            if ((this.field_s.field_ib ^ -1) < -1) {
                              this.field_L.a(-55, this.field_s);
                              break L10;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                break L9;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.UA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean f(boolean param0) {
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                this.field_B = (qb) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (!this.b((byte) -82)) {
                  break L3;
                } else {
                  L4: {
                    if (this.field_z) {
                      break L4;
                    } else {
                      if (this.field_hb) {
                        break L4;
                      } else {
                        if (-1 != (this.field_x ^ -1)) {
                          break L4;
                        } else {
                          if (this.field_ib > 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  stackIn_11_0 = 1;
                  break L2;
                }
              }
              stackIn_11_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.JB(" + param0 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final static void a(boolean param0, int param1) {
        try {
            if (param1 >= -100) {
                ml.a((dj) null, -106, (byte) 51, (dj) null);
            }
            eb.a(param0, -105);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ml.V(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean j(int param0) {
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -26) {
                break L1;
              } else {
                this.b(28, -45);
                break L1;
              }
            }
            L2: {
              L3: {
                if (13 == this.field_jb) {
                  break L3;
                } else {
                  if (this.field_jb == 15) {
                    break L3;
                  } else {
                    if (this.field_jb == 14) {
                      break L3;
                    } else {
                      if (this.field_jb == 26) {
                        break L3;
                      } else {
                        if (39 != this.field_jb) {
                          stackIn_11_0 = 0;
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              stackIn_11_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.T(" + param0 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final void a(byte param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (3 == this.field_jb) {
                this.b(-30225, dm.field_G[param1]);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_jb != 7) {
                break L2;
              } else {
                this.b(-30225, hi.field_f[param1]);
                break L2;
              }
            }
            L3: {
              if (-2 == (this.field_jb ^ -1)) {
                this.b(-30225, fb.field_b[param1]);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (9 == this.field_jb) {
                this.b(-30225, ed.field_Ib[param1]);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (2 == this.field_jb) {
                this.b(-30225, tc.field_B[param1]);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (-5 == (this.field_jb ^ -1)) {
                this.b(-30225, in.field_Fb[param1]);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if ((this.field_jb ^ -1) != -9) {
                break L7;
              } else {
                this.b(-30225, s.field_i[param1]);
                break L7;
              }
            }
            L8: {
              if (this.field_jb == 11) {
                this.b(-30225, lj.field_g[param1]);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if ((this.field_jb ^ -1) == -6) {
                this.b(-30225, mb.field_U[param1]);
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (-15 != (this.field_jb ^ -1)) {
                break L10;
              } else {
                this.b(-30225, lj.field_n[param1]);
                break L10;
              }
            }
            L11: {
              if (-16 != (this.field_jb ^ -1)) {
                break L11;
              } else {
                this.b(-30225, gd.field_pb[param1]);
                break L11;
              }
            }
            L12: {
              if (-18 != (this.field_jb ^ -1)) {
                break L12;
              } else {
                this.b(-30225, cj.field_a[param1]);
                break L12;
              }
            }
            L13: {
              if (this.field_jb != 6) {
                break L13;
              } else {
                this.b(-30225, vg.field_c[param1]);
                break L13;
              }
            }
            L14: {
              if (-14 != (this.field_jb ^ -1)) {
                break L14;
              } else {
                this.b(-30225, fi.field_c[param1]);
                break L14;
              }
            }
            L15: {
              if (this.field_jb != 10) {
                break L15;
              } else {
                this.b(-30225, gg.field_j[param1]);
                break L15;
              }
            }
            L16: {
              if (this.field_jb == 37) {
                this.b(-30225, om.field_B[param1]);
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              if (this.field_jb != 39) {
                break L17;
              } else {
                this.b(-30225, u.field_h[param1]);
                break L17;
              }
            }
            L18: {
              if ((this.field_jb ^ -1) == -34) {
                this.b(-30225, fk.field_h[param1]);
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              if ((this.field_jb ^ -1) == -32) {
                this.b(-30225, jn.field_a[param1]);
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if (this.field_jb != 32) {
                break L20;
              } else {
                this.b(-30225, fd.field_h[param1]);
                break L20;
              }
            }
            L21: {
              if (-29 == (this.field_jb ^ -1)) {
                this.a((byte) -49, 200, cd.field_p[param1]);
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              if (-30 == (this.field_jb ^ -1)) {
                this.a((byte) -72, 100, cd.field_p[param1]);
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              if (-31 == (this.field_jb ^ -1)) {
                this.a((byte) -91, 50, cd.field_p[param1]);
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              if (this.field_jb != 34) {
                break L24;
              } else {
                this.b(-30225, cf.field_a[param1]);
                break L24;
              }
            }
            L25: {
              if (25 == this.field_jb) {
                this.b(-30225, uj.field_c[param1]);
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              var3_int = -17 / ((param0 - 25) / 36);
              if (this.field_s != null) {
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              if (this.field_jb != 26) {
                break L27;
              } else {
                break L27;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "ml.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
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
                stackIn_9_0 = (RuntimeException) (var2_ref);

                stackIn_9_1 = new StringBuilder().append("ml.KA(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "null";
                  break L3;
                } else {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "{...}";
                  break L3;
                }
              }
              throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              var2_int = this.field_L.d(false);
              if (-1 > (this.field_q ^ -1)) {
                L2: {
                  this.field_q = this.field_q - this.field_x;
                  if (this.field_q <= 0) {
                    break L2;
                  } else {
                    if (22 == this.field_jb) {
                      break L2;
                    } else {
                      if (23 == this.field_jb) {
                        break L2;
                      } else {
                        if (-22 == (this.field_jb ^ -1)) {
                          break L2;
                        } else {
                          if (24 == this.field_jb) {
                            break L2;
                          } else {
                            if (35 == this.field_jb) {
                              break L2;
                            } else {
                              if ((this.field_jb ^ -1) == -39) {
                                break L2;
                              } else {
                                break L1;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L3: {
                  if ((this.field_q ^ -1) < -1) {
                    this.field_x = 0;
                    break L3;
                  } else {
                    this.field_x = -this.field_q;
                    break L3;
                  }
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
                break L1;
              } else {
                break L1;
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
                    if (256 + this.field_L.field_H > this.field_db) {
                      this.b(-30225, 54);
                      this.field_L.field_Eb[this.field_T] = this.field_L.field_Eb[this.field_T] + 1;
                      if (this.field_T == var2_int) {
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
                            this.d(var2_int, 68);
                            if (!this.t(77)) {
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          decompiledRegionSelector0 = 2;
                          break L0;
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
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            L10: {
              this.b(-30225, 54);
              this.d(var2_int, 70);
              if (this.t(49)) {
                this.field_L.field_Eb[this.field_T] = this.field_L.field_Eb[this.field_T] + 1;
                break L10;
              } else {
                break L10;
              }
            }
            this.field_ib = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.HB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    private final boolean d(int param0) {
        boolean discarded$0 = false;
        int stackIn_5_0 = 0;
        int stackIn_27_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        ml var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (!this.u(param0 ^ -10366)) {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == -10265) {
                  break L1;
                } else {
                  discarded$0 = this.u(87);
                  break L1;
                }
              }
              pi.field_b.a((byte) 125, this.field_L.field_i);
              var2_int = 0;
              var3 = (ml) ((Object) pi.field_b.b(param0 + 10161));
              L2: while (true) {
                if (var3 == null) {
                  stackIn_27_0 = var2_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
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
                          var2_int = 1;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var3 = (ml) ((Object) pi.field_b.d(-18502));
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_27_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4_int = 0;
        ml var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (-13 == (this.field_jb ^ -1)) {
                break L1;
              } else {
                if (40 != this.field_jb) {
                  L2: {
                    if (param0 == 2) {
                      break L2;
                    } else {
                      this.field_P = -86;
                      break L2;
                    }
                  }
                  L3: {
                    var4_int = nj.field_n[this.field_u];
                    var5 = this.field_L.a(this.field_u, true);
                    if (var5 == null) {
                      break L3;
                    } else {
                      if (var5.field_jb == 27) {
                        var4_int = 13417437;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    var6 = 8421504 ^ (var4_int | 8421504);
                    if ((this.field_q ^ -1) < -1) {
                      this.field_w.a(this.field_lb + -(this.field_Y >> 1302399425) - (1 + -param2), -this.field_Y + this.field_db + param1, var6);
                      this.field_w.a(param2 + (1 + this.field_lb) + -(this.field_Y >> -1485451775), param1 + this.field_db + -this.field_Y, var6);
                      this.field_w.a(param2 + (this.field_lb - (this.field_Y >> 961747745)), -1 + -this.field_Y + this.field_db + param1, var6);
                      this.field_w.a(param2 + (-(this.field_Y >> -985162559) + this.field_lb), param1 + (1 + -this.field_Y + this.field_db), var6);
                      this.field_w.a(param2 + (this.field_lb - (this.field_Y >> -1191850175)), param1 + (this.field_db - this.field_Y), var4_int);
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
                      de.c(var8, var9, var7 >> -120436959, var4_int, 128);
                      gn.a(var7 >> -238727231, (byte) 125, 128, var8, var9);
                      break L4;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var4), "ml.GA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(byte param0, int param1) {
        try {
            this.field_ib = param1;
            if (param0 > -79) {
                this.y(111);
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ml.DB(" + param0 + ',' + param1 + ')');
        }
    }

    private ml(nf param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
          L0: {
            this.field_L = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("ml.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final static void a(dj param0, int param1, byte param2, dj param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            eb.field_a = param1;
            mg.field_C = param3;
            if (param2 >= 76) {
              ko.field_j = param0;
              td.a(true, de.field_j / 2, de.field_e / 2);
              e.b(1, param3.field_o, param0.field_m + param0.field_o, param0.field_o, param3.field_m + param3.field_o);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("ml.I(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_8_0);

            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              this.field_ib = this.field_ib + param0;
              if (250 < this.field_ib) {
                this.field_ib = 250;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == -28922) {
                break L2;
              } else {
                this.a((byte) 113, -24);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "ml.FA(" + param0 + ',' + param1 + ')');
        }
    }

    ml(int param0, int param1, int param2, int param3, nf param4, int param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
          L0: {
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("ml.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param5 + ')');
        }
    }

    final int i(byte param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          L0: {
            var2_int = -107 % ((param0 - 58) / 41);
            stackIn_1_0 = this.field_db;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ml.E(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    ml(int param0, int param1, int param2, int param3, nf param4, ml param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
          L0: {
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("ml.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          L2: {
            stackIn_10_0 = (RuntimeException) ((Object) stackIn_7_0);

            stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param5 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    static {
        field_K = "You have fallen into the water! Choose a location to teleport to. Since you don't have Arcane Gate available, you will lose a third of your health (<%1>). If you fail to do this within the time limit, you will forfeit the game!";
    }
}
