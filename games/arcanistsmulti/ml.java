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
        boolean discarded$2 = false;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            discarded$2 = this.x(99);
            break L0;
          }
        }
        L1: {
          L2: {
            if ((this.field_ib ^ -1) >= -1) {
              break L2;
            } else {
              if (this.b((byte) -81)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = 0;
            var4 = -72 / ((param1 - 4) / 62);
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int <= var5) {
                    break L3;
                  } else {
                    stackOut_3_0 = fe.a((byte) 74, param0.charAt(var5)) + ((var3 << -118977147) + -var3);
                    stackIn_6_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      var3 = stackIn_4_0;
                      var5++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_5_0 = var3;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2);
            stackOut_7_1 = new StringBuilder().append("ml.C(");
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
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    final int g(boolean param0) {
        if (param0) {
            this.field_eb = -102;
        }
        return this.field_u;
    }

    private final void g(int param0) {
        boolean discarded$1 = false;
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
        boolean stackIn_12_0 = false;
        int stackIn_18_0 = 0;
        boolean stackOut_11_0 = false;
        int stackOut_17_0 = 0;
        L0: {
          var8 = ArcanistsMulti.field_G ? 1 : 0;
          if (param0 == -5445) {
            break L0;
          } else {
            discarded$1 = this.t(22);
            break L0;
          }
        }
        L1: {
          if (2 != this.field_ab) {
            break L1;
          } else {
            if (null == this.field_s) {
              var2 = this.field_L.field_y * this.field_T / 6;
              var3_int = -var2 + this.field_lb;
              var4_int = this.field_db + (-(this.field_Y >> 120148673) - -480);
              if (-1 <= (var4_int ^ -1)) {
                break L1;
              } else {
                L2: {
                  var5 = Math.abs(var4_int);
                  if (Math.abs(var3_int) > Math.abs(var4_int)) {
                    var5 = Math.abs(var3_int);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var6 = 1;
                var7_int = var5;
                L3: while (true) {
                  L4: {
                    L5: {
                      if ((var7_int ^ -1) >= -1) {
                        break L5;
                      } else {
                        jo.field_b = false;
                        stackOut_11_0 = this.field_L.a(-(this.field_Y >> 1783464865) + (this.field_db + -(var4_int * var7_int / var5)), -(var7_int * var3_int / var5) + this.field_lb, (byte) -83);
                        stackIn_18_0 = stackOut_11_0 ? 1 : 0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var8 != 0) {
                          break L4;
                        } else {
                          L6: {
                            if (!stackIn_12_0) {
                              break L6;
                            } else {
                              if (jo.field_b) {
                                break L6;
                              } else {
                                var6 = 0;
                                if (var8 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var7_int--;
                          if (var8 == 0) {
                            continue L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    stackOut_17_0 = var6;
                    stackIn_18_0 = stackOut_17_0;
                    break L4;
                  }
                  if (stackIn_18_0 != 0) {
                    var7 = aj.a((ml) (this), -480, false, 114, this.field_L, var2);
                    var7.field_F = var4_int;
                    var7.field_u = var3_int;
                    this.field_L.b(52, var7);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            } else {
              break L1;
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
              var2 = (int)(Math.random() * (double)this.field_w.field_q);
              var3_int = (int)(Math.random() * (double)this.field_w.field_y);
              if ((this.field_w.field_A[var3_int * this.field_w.field_q + var2] ^ -1) != -1) {
                var4 = aj.a((ml) null, -256 + (var3_int + this.field_db) - -this.field_w.field_o, false, 109, this.field_L, -128 + this.field_w.field_x + (var2 + this.field_lb));
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
    }

    final int p(int param0) {
        if (param0 != -8323) {
            return -90;
        }
        return this.field_Y;
    }

    final void e(byte param0) {
        L0: {
          if (20 == this.field_jb) {
            this.field_q = 25;
            this.field_Y = uj.field_i[0].field_w;
            this.field_w = new qb(this.field_Y, this.field_Y);
            this.field_w.a();
            uj.field_i[0].a(this.field_Y / 2 - uj.field_i[0].field_n / 2, 0, 16777215);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (this.field_jb == 22) {
            this.field_q = 75;
            this.field_Y = uj.field_i[1].field_w;
            this.field_w = new qb(this.field_Y, this.field_Y);
            this.field_w.a();
            uj.field_i[1].a(-(uj.field_i[1].field_n / 2) + this.field_Y / 2, 0, 16777215);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param0 == 6) {
            break L2;
          } else {
            this.field_gb = (mi) null;
            break L2;
          }
        }
        L3: {
          if ((this.field_jb ^ -1) != -39) {
            break L3;
          } else {
            this.field_Y = uj.field_i[6].field_w;
            this.field_q = 75;
            this.field_w = new qb(this.field_Y, this.field_Y);
            this.field_w.a();
            uj.field_i[6].a(-(uj.field_i[6].field_n / 2) + this.field_Y / 2, 0, 16777215);
            break L3;
          }
        }
        L4: {
          if (this.field_jb == 21) {
            this.field_q = 100;
            this.field_Y = uj.field_i[2].field_w;
            this.field_w = new qb(this.field_Y, this.field_Y);
            this.field_w.a();
            uj.field_i[2].a(this.field_Y / 2 + -(uj.field_i[2].field_n / 2), 0, 16777215);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (-24 != (this.field_jb ^ -1)) {
            break L5;
          } else {
            this.field_Y = uj.field_i[3].field_w;
            this.field_q = 75;
            this.field_w = new qb(this.field_Y, this.field_Y);
            this.field_w.a();
            uj.field_i[3].a(-(uj.field_i[3].field_n / 2) + this.field_Y / 2, 0, 16777215);
            break L5;
          }
        }
        L6: {
          if ((this.field_jb ^ -1) != -25) {
            break L6;
          } else {
            this.field_Y = uj.field_i[4].field_w;
            this.field_q = 75;
            this.field_w = new qb(this.field_Y, this.field_Y);
            this.field_w.a();
            uj.field_i[4].a(-(uj.field_i[4].field_n / 2) + this.field_Y / 2, 0, 16777215);
            break L6;
          }
        }
        L7: {
          if ((this.field_jb ^ -1) == -36) {
            this.field_Y = -16 + (80 + uj.field_i[5].field_w);
            this.field_q = 75;
            this.field_w = new qb(this.field_Y, this.field_Y);
            this.field_w.a();
            uj.field_i[5].a(this.field_Y / 2 + -(uj.field_i[5].field_n / 2), 64, 16777215);
            de.i(this.field_Y / 2, 80, 16, 16777215);
            break L7;
          } else {
            break L7;
          }
        }
    }

    final boolean g(byte param0) {
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
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
                          stackOut_11_0 = 0;
                          stackIn_12_0 = stackOut_11_0;
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
          stackOut_10_0 = 1;
          stackIn_12_0 = stackOut_10_0;
          break L1;
        }
        return stackIn_12_0 != 0;
    }

    final void a(boolean param0, boolean param1) {
        int var3 = 0;
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
        ml stackIn_3_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        Object stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        ml stackOut_2_0 = null;
        pg stackOut_9_0 = null;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
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
            stackOut_9_0 = pi.field_b.b(-58);
            stackIn_10_0 = stackOut_9_0;
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
                                stackOut_47_0 = this;
                                stackOut_47_1 = var7_ref.field_G;
                                stackIn_49_0 = stackOut_47_0;
                                stackIn_49_1 = stackOut_47_1;
                                stackIn_48_0 = stackOut_47_0;
                                stackIn_48_1 = stackOut_47_1;
                                if (param1) {
                                  stackOut_49_0 = this;
                                  stackOut_49_1 = stackIn_49_1;
                                  stackOut_49_2 = 0;
                                  stackIn_50_0 = stackOut_49_0;
                                  stackIn_50_1 = stackOut_49_1;
                                  stackIn_50_2 = stackOut_49_2;
                                  break L15;
                                } else {
                                  stackOut_48_0 = this;
                                  stackOut_48_1 = stackIn_48_1;
                                  stackOut_48_2 = 1;
                                  stackIn_50_0 = stackOut_48_0;
                                  stackIn_50_1 = stackOut_48_1;
                                  stackIn_50_2 = stackOut_48_2;
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
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
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
                            stackOut_22_0 = 0;
                            stackIn_23_0 = stackOut_22_0;
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_21_0 = 1;
                stackIn_23_0 = stackOut_21_0;
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
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -107) {
          L0: {
            L1: {
              if (this.j(param0 + 81)) {
                break L1;
              } else {
                if (this.field_jb != 17) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
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
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        int[] var4 = null;
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
        Object var13 = null;
        int var13_int = 0;
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
        qb var41 = null;
        qb var42 = null;
        qb var43 = null;
        qb var44 = null;
        mi var45 = null;
        mi var46 = null;
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
        ll[] stackOut_125_0 = null;
        ll[] stackOut_127_0 = null;
        int stackOut_127_1 = 0;
        ll[] stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        ll[] stackOut_129_0 = null;
        ll[] stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        ll[] stackOut_130_0 = null;
        int stackOut_130_1 = 0;
        int stackOut_411_0 = 0;
        int stackOut_411_1 = 0;
        int stackOut_417_0 = 0;
        int stackOut_417_1 = 0;
        L0: {
          var34 = ArcanistsMulti.field_G ? 1 : 0;
          if (!this.field_J) {
            this.a(12, false);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          L2: {
            var35 = new int[]{param1 + this.field_lb, this.field_db + param0};
            var4 = var35;
            if (28 == this.field_jb) {
              break L2;
            } else {
              if (-30 == (this.field_jb ^ -1)) {
                break L2;
              } else {
                if (this.field_jb == 30) {
                  break L2;
                } else {
                  if ((this.field_jb ^ -1) != -33) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          if (-16 + this.field_L.field_H > this.field_db) {
            break L1;
          } else {
            var35[1] = (int)((double)var35[1] - (8.0 * Math.sin(3.141592653589793 * (double)ge.field_r / 64.0) + 2.0));
            break L1;
          }
        }
        L3: {
          var5 = nj.field_n[this.field_u];
          if (-40 == (this.field_jb ^ -1)) {
            if (this.field_F <= 2.5) {
              break L3;
            } else {
              var36 = aj.a((ml) null, this.field_db + (-(this.p(-8323) / 2) - -13), false, 166, this.field_L, -(42 * this.field_E) + this.field_lb);
              var36.field_u = 20 * -this.field_E;
              var36.field_F = (int)(-5.0 + 15.0 * Math.random());
              this.field_L.b(52, var36);
              break L3;
            }
          } else {
            break L3;
          }
        }
        L4: {
          var6 = 0;
          if (-39 != (this.field_jb ^ -1)) {
            break L4;
          } else {
            if (this.field_F <= 0.0) {
              break L4;
            } else {
              L5: {
                if (1.0 <= this.field_F) {
                  break L5;
                } else {
                  var37 = aj.a((ml) null, 13 + this.field_db - this.p(param2 ^ -1703912164) / 2, false, 166, this.field_L, -(this.field_E * 22) + this.field_lb);
                  var37.field_u = -this.field_E * 10;
                  var37.field_F = (int)(-5.0 + 15.0 * Math.random());
                  this.field_L.b(52, var37);
                  if (var34 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (2.0 > this.field_F) {
                  break L6;
                } else {
                  L7: {
                    if (this.field_F >= 3.0) {
                      break L7;
                    } else {
                      var38 = aj.a((ml) null, -12 + (this.field_db + -(this.p(-8323) / 2)), false, 166, this.field_L, this.field_lb - this.field_E * 22);
                      var38.field_u = 10 * -this.field_E;
                      var38.field_F = (int)(15.0 * Math.random() - 10.0);
                      this.field_L.b(52, var38);
                      if (var34 == 0) {
                        break L4;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (4.0 > this.field_F) {
                    var39 = aj.a((ml) null, this.field_db + (-(this.p(param2 ^ -1703912164) / 2) - -13 + -5), false, 166, this.field_L, this.field_lb - -(this.field_E * 22));
                    var39.field_u = 30 * this.field_E;
                    var39.field_F = (int)(Math.random() * 15.0);
                    this.field_L.b(52, var39);
                    if (var34 == 0) {
                      break L4;
                    } else {
                      break L6;
                    }
                  } else {
                    break L4;
                  }
                }
              }
              var40 = aj.a((ml) null, -30 + this.field_db - (this.p(-8323) / 2 + -13), false, 166, this.field_L, this.field_lb + this.field_E * 22);
              var40.field_u = 30 * this.field_E;
              var40.field_F = (int)(15.0 * Math.random() - 15.0);
              this.field_L.b(52, var40);
              break L4;
            }
          }
        }
        L8: {
          if (12 != this.field_jb) {
            break L8;
          } else {
            de.h(param1, param0, this.field_L.field_y + param1, an.field_j);
            go.field_j[29].a(-128 + var35[0], var35[1] + -256);
            de.a();
            break L8;
          }
        }
        L9: {
          L10: {
            if (-41 == (this.field_jb ^ -1)) {
              break L10;
            } else {
              L11: {
                if (this.field_jb == 20) {
                  break L11;
                } else {
                  L12: {
                    if (this.field_jb == 22) {
                      break L12;
                    } else {
                      L13: {
                        if (-39 != (this.field_jb ^ -1)) {
                          break L13;
                        } else {
                          uj.field_i[6].c(-(uj.field_i[6].field_n / 2) + var35[0], -this.field_Y + var35[1]);
                          if (null == this.field_I) {
                            break L9;
                          } else {
                            this.field_I.e(-16 + var35[0], var6 + -(this.field_Y >> -1815421503) + var35[1] + -32);
                            if (var34 == 0) {
                              break L9;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                      L14: {
                        if ((this.field_jb ^ -1) != -22) {
                          break L14;
                        } else {
                          uj.field_i[2].c(-(uj.field_i[2].field_n / 2) + var35[0], -this.field_Y + var35[1]);
                          if (null == this.field_I) {
                            break L9;
                          } else {
                            this.field_I.e(-16 + var35[0], var35[1] + -(this.field_Y >> 507989281) + (-32 - -var6));
                            if (var34 == 0) {
                              break L9;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                      L15: {
                        if (-24 != (this.field_jb ^ -1)) {
                          break L15;
                        } else {
                          uj.field_i[3].c(-(uj.field_i[3].field_n / 2) + var35[0], var35[1] + -this.field_Y);
                          if (this.field_I != null) {
                            this.field_I.e(var35[0] - 16, var6 + (-32 + var35[1] - (this.field_Y >> 1449610177)));
                            if (var34 == 0) {
                              break L9;
                            } else {
                              break L15;
                            }
                          } else {
                            break L9;
                          }
                        }
                      }
                      L16: {
                        if (24 != this.field_jb) {
                          break L16;
                        } else {
                          uj.field_i[4].c(var35[0] - uj.field_i[4].field_n / 2, -this.field_Y + var35[1]);
                          if (this.field_I != null) {
                            this.field_I.e(var35[0] + -16, var6 + var35[1] - (this.field_Y >> -1600813727) - 32);
                            if (var34 == 0) {
                              break L9;
                            } else {
                              break L16;
                            }
                          } else {
                            break L9;
                          }
                        }
                      }
                      L17: {
                        if (this.field_jb == 35) {
                          break L17;
                        } else {
                          L18: {
                            if ((this.field_jb ^ -1) != -27) {
                              break L18;
                            } else {
                              if (ff.field_b == null) {
                                break L18;
                              } else {
                                L19: {
                                  var7 = 0;
                                  if (this.field_F <= 1.5) {
                                    break L19;
                                  } else {
                                    var7 = 1;
                                    break L19;
                                  }
                                }
                                L20: {
                                  if (this.field_F > 3.0) {
                                    var7 = 2;
                                    break L20;
                                  } else {
                                    break L20;
                                  }
                                }
                                L21: {
                                  if (4.5 >= this.field_F) {
                                    break L21;
                                  } else {
                                    var7 = 3;
                                    break L21;
                                  }
                                }
                                L22: {
                                  if (0.0 > this.field_F) {
                                    L23: {
                                      var7 = 4;
                                      if (this.field_F > -2.0) {
                                        var7 = 5;
                                        break L23;
                                      } else {
                                        break L23;
                                      }
                                    }
                                    if (this.field_F > -1.0) {
                                      var7 = 6;
                                      break L22;
                                    } else {
                                      break L22;
                                    }
                                  } else {
                                    break L22;
                                  }
                                }
                                L24: {
                                  L25: {
                                    if ((this.field_E ^ -1) != 0) {
                                      break L25;
                                    } else {
                                      ff.field_b[var7].d(var35[0] + -(this.field_Y >> -955111135), var35[1] - this.field_Y);
                                      if (var34 == 0) {
                                        break L24;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                  ff.field_b[var7].a(var35[0] + -(this.field_Y >> 1703903841), var35[1] + -this.field_Y);
                                  break L24;
                                }
                                if (var34 == 0) {
                                  break L9;
                                } else {
                                  break L18;
                                }
                              }
                            }
                          }
                          L26: {
                            if (-40 != (this.field_jb ^ -1)) {
                              break L26;
                            } else {
                              if (ub.field_e == null) {
                                break L26;
                              } else {
                                L27: {
                                  var7 = 0;
                                  if (this.field_F <= 1.5) {
                                    break L27;
                                  } else {
                                    var7 = 1;
                                    break L27;
                                  }
                                }
                                L28: {
                                  if (this.field_F <= 3.0) {
                                    break L28;
                                  } else {
                                    var7 = 2;
                                    break L28;
                                  }
                                }
                                L29: {
                                  if (4.5 < this.field_F) {
                                    var7 = 3;
                                    break L29;
                                  } else {
                                    break L29;
                                  }
                                }
                                L30: {
                                  if (0.0 <= this.field_F) {
                                    break L30;
                                  } else {
                                    L31: {
                                      var7 = 4;
                                      if (-2.0 < this.field_F) {
                                        var7 = 5;
                                        break L31;
                                      } else {
                                        break L31;
                                      }
                                    }
                                    if (this.field_F <= -1.0) {
                                      break L30;
                                    } else {
                                      var7 = 6;
                                      break L30;
                                    }
                                  }
                                }
                                L32: {
                                  L33: {
                                    if (-1 == this.field_E) {
                                      break L33;
                                    } else {
                                      ub.field_e[var7].a(var35[0] - (this.field_Y >> 417241281), -this.field_Y + var35[1]);
                                      if (var34 == 0) {
                                        break L32;
                                      } else {
                                        break L33;
                                      }
                                    }
                                  }
                                  ub.field_e[var7].d(-(this.field_Y >> 1106014241) + var35[0], var35[1] + -this.field_Y);
                                  break L32;
                                }
                                if (var34 == 0) {
                                  break L9;
                                } else {
                                  break L26;
                                }
                              }
                            }
                          }
                          L34: {
                            L35: {
                              if (13 != this.field_jb) {
                                break L35;
                              } else {
                                if (rc.field_d != null) {
                                  break L34;
                                } else {
                                  break L35;
                                }
                              }
                            }
                            L36: {
                              L37: {
                                if (15 != this.field_jb) {
                                  break L37;
                                } else {
                                  if (bk.field_L != null) {
                                    break L36;
                                  } else {
                                    break L37;
                                  }
                                }
                              }
                              L38: {
                                if (14 != this.field_jb) {
                                  break L38;
                                } else {
                                  if (null == jk.field_m) {
                                    break L38;
                                  } else {
                                    L39: {
                                      var7 = 0;
                                      if (this.field_F > 1.5) {
                                        var7 = 1;
                                        break L39;
                                      } else {
                                        break L39;
                                      }
                                    }
                                    L40: {
                                      if (this.field_F <= 3.0) {
                                        break L40;
                                      } else {
                                        var7 = 2;
                                        break L40;
                                      }
                                    }
                                    L41: {
                                      if (this.field_F <= 4.5) {
                                        break L41;
                                      } else {
                                        var7 = 3;
                                        break L41;
                                      }
                                    }
                                    L42: {
                                      if (0.0 <= this.field_F) {
                                        break L42;
                                      } else {
                                        L43: {
                                          var7 = 4;
                                          if (-2.0 >= this.field_F) {
                                            break L43;
                                          } else {
                                            var7 = 5;
                                            break L43;
                                          }
                                        }
                                        if (-1.0 >= this.field_F) {
                                          break L42;
                                        } else {
                                          var7 = 6;
                                          break L42;
                                        }
                                      }
                                    }
                                    L44: {
                                      L45: {
                                        if (-1 == this.field_E) {
                                          break L45;
                                        } else {
                                          jk.field_m[var7].a(var35[0] + -(this.field_Y >> -948359583), var35[1] - this.field_Y);
                                          if (var34 == 0) {
                                            break L44;
                                          } else {
                                            break L45;
                                          }
                                        }
                                      }
                                      jk.field_m[var7].d(-(this.field_Y >> -450855967) + var35[0], var35[1] - this.field_Y);
                                      break L44;
                                    }
                                    if (var34 == 0) {
                                      break L9;
                                    } else {
                                      break L38;
                                    }
                                  }
                                }
                              }
                              L46: {
                                if (17 != this.field_jb) {
                                  break L46;
                                } else {
                                  if (null == ra.field_c) {
                                    break L46;
                                  } else {
                                    L47: {
                                      var7 = 0;
                                      if (this.field_F > 1.5) {
                                        var7 = 1;
                                        break L47;
                                      } else {
                                        break L47;
                                      }
                                    }
                                    L48: {
                                      if (3.0 < this.field_F) {
                                        var7 = 2;
                                        break L48;
                                      } else {
                                        break L48;
                                      }
                                    }
                                    L49: {
                                      if (4.5 >= this.field_F) {
                                        break L49;
                                      } else {
                                        var7 = 3;
                                        break L49;
                                      }
                                    }
                                    L50: {
                                      L51: {
                                        if (-1 == this.field_E) {
                                          break L51;
                                        } else {
                                          L52: {
                                            stackOut_125_0 = ra.field_c;
                                            stackIn_127_0 = stackOut_125_0;
                                            stackIn_126_0 = stackOut_125_0;
                                            if (!this.field_U) {
                                              stackOut_127_0 = (ll[]) ((Object) stackIn_127_0);
                                              stackOut_127_1 = 0;
                                              stackIn_128_0 = stackOut_127_0;
                                              stackIn_128_1 = stackOut_127_1;
                                              break L52;
                                            } else {
                                              stackOut_126_0 = (ll[]) ((Object) stackIn_126_0);
                                              stackOut_126_1 = 4;
                                              stackIn_128_0 = stackOut_126_0;
                                              stackIn_128_1 = stackOut_126_1;
                                              break L52;
                                            }
                                          }
                                          ((ll) (Object) stackIn_128_0[stackIn_128_1 + var7]).a(var35[0] + -(this.field_Y >> -2026173023), var35[1] - this.field_Y);
                                          if (var34 == 0) {
                                            break L50;
                                          } else {
                                            break L51;
                                          }
                                        }
                                      }
                                      L53: {
                                        stackOut_129_0 = ra.field_c;
                                        stackIn_131_0 = stackOut_129_0;
                                        stackIn_130_0 = stackOut_129_0;
                                        if (!this.field_U) {
                                          stackOut_131_0 = (ll[]) ((Object) stackIn_131_0);
                                          stackOut_131_1 = 0;
                                          stackIn_132_0 = stackOut_131_0;
                                          stackIn_132_1 = stackOut_131_1;
                                          break L53;
                                        } else {
                                          stackOut_130_0 = (ll[]) ((Object) stackIn_130_0);
                                          stackOut_130_1 = 4;
                                          stackIn_132_0 = stackOut_130_0;
                                          stackIn_132_1 = stackOut_130_1;
                                          break L53;
                                        }
                                      }
                                      ((ll) (Object) stackIn_132_0[stackIn_132_1 + var7]).d(-(this.field_Y >> -355970495) + var35[0], var35[1] - this.field_Y);
                                      break L50;
                                    }
                                    if (var34 == 0) {
                                      break L9;
                                    } else {
                                      break L46;
                                    }
                                  }
                                }
                              }
                              L54: {
                                if (this.field_jb != 6) {
                                  break L54;
                                } else {
                                  if (null == wl.field_U) {
                                    break L54;
                                  } else {
                                    L55: {
                                      var7 = 0;
                                      if (0.75 >= this.field_F) {
                                        break L55;
                                      } else {
                                        var7 = 1;
                                        break L55;
                                      }
                                    }
                                    L56: {
                                      if (this.field_F > 1.5) {
                                        var7 = 2;
                                        break L56;
                                      } else {
                                        break L56;
                                      }
                                    }
                                    L57: {
                                      if (this.field_F <= 2.25) {
                                        break L57;
                                      } else {
                                        var7 = 3;
                                        break L57;
                                      }
                                    }
                                    L58: {
                                      if (3.0 >= this.field_F) {
                                        break L58;
                                      } else {
                                        var7 = 4;
                                        break L58;
                                      }
                                    }
                                    L59: {
                                      if (this.field_F > 3.75) {
                                        var7 = 5;
                                        break L59;
                                      } else {
                                        break L59;
                                      }
                                    }
                                    L60: {
                                      if (4.5 < this.field_F) {
                                        var7 = 6;
                                        break L60;
                                      } else {
                                        break L60;
                                      }
                                    }
                                    L61: {
                                      if (5.25 < this.field_F) {
                                        var7 = 7;
                                        break L61;
                                      } else {
                                        break L61;
                                      }
                                    }
                                    L62: {
                                      L63: {
                                        if (-1 != this.field_E) {
                                          break L63;
                                        } else {
                                          wl.field_U[var7].d(var35[0] - 24, -36 + var35[1]);
                                          if (var34 == 0) {
                                            break L62;
                                          } else {
                                            break L63;
                                          }
                                        }
                                      }
                                      wl.field_U[var7].a(var35[0] - 24, -36 + var35[1]);
                                      break L62;
                                    }
                                    if (var34 == 0) {
                                      break L9;
                                    } else {
                                      break L54;
                                    }
                                  }
                                }
                              }
                              L64: {
                                L65: {
                                  if (-8 == (this.field_jb ^ -1)) {
                                    break L65;
                                  } else {
                                    if (-10 == (this.field_jb ^ -1)) {
                                      break L65;
                                    } else {
                                      if ((this.field_jb ^ -1) == -3) {
                                        break L65;
                                      } else {
                                        if (this.field_jb == 5) {
                                          break L65;
                                        } else {
                                          if (28 == this.field_jb) {
                                            break L65;
                                          } else {
                                            if (-30 == (this.field_jb ^ -1)) {
                                              break L65;
                                            } else {
                                              if (-31 != (this.field_jb ^ -1)) {
                                                break L64;
                                              } else {
                                                break L65;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                L66: {
                                  L67: {
                                    var7 = this.field_Y;
                                    if ((this.field_jb ^ -1) == -8) {
                                      break L67;
                                    } else {
                                      if ((this.field_jb ^ -1) == -10) {
                                        break L67;
                                      } else {
                                        break L66;
                                      }
                                    }
                                  }
                                  var7 = 64;
                                  break L66;
                                }
                                L68: {
                                  var41 = this.field_fb;
                                  var8_ref_qb = var41;
                                  var9 = -(var7 >> 1427873218) + var35[0] - this.field_n;
                                  if (-1 != this.field_E) {
                                    var9 = -(var7 >> -1876659646) + (var35[0] + -(var7 >> -153590463) + this.field_n);
                                    break L68;
                                  } else {
                                    break L68;
                                  }
                                }
                                L69: {
                                  var10 = var35[1] + -var7 + (this.field_O - -var6);
                                  if ((this.field_E ^ -1) != 0) {
                                    break L69;
                                  } else {
                                    var8_ref_qb = var41.b();
                                    break L69;
                                  }
                                }
                                L70: {
                                  var11 = 0;
                                  if (this.field_gb == null) {
                                    break L70;
                                  } else {
                                    if (121 == this.field_gb.field_I) {
                                      break L70;
                                    } else {
                                      L71: {
                                        if (this.field_gb.field_I == 138) {
                                          break L71;
                                        } else {
                                          L72: {
                                            if (2 != this.field_jb) {
                                              break L72;
                                            } else {
                                              L73: {
                                                if (-13 < (this.field_gb.field_y ^ -1)) {
                                                  break L73;
                                                } else {
                                                  var10 = var10 + (-this.field_gb.field_y + 25) * this.field_gb.field_F / 100;
                                                  var9 = var9 + this.field_gb.field_u * (-this.field_gb.field_y + 25) / 100;
                                                  if (var34 == 0) {
                                                    break L70;
                                                  } else {
                                                    break L73;
                                                  }
                                                }
                                              }
                                              var9 = var9 + this.field_gb.field_y * this.field_gb.field_u / 100;
                                              var10 = var10 + this.field_gb.field_y * this.field_gb.field_F / 100;
                                              if (var34 == 0) {
                                                break L70;
                                              } else {
                                                break L72;
                                              }
                                            }
                                          }
                                          L74: {
                                            if (30 == this.field_jb) {
                                              break L74;
                                            } else {
                                              L75: {
                                                if (this.field_jb == 9) {
                                                  break L75;
                                                } else {
                                                  if (this.field_jb == 5) {
                                                    break L75;
                                                  } else {
                                                    L76: {
                                                      L77: {
                                                        if ((this.field_jb ^ -1) == -29) {
                                                          break L77;
                                                        } else {
                                                          if (this.field_jb != 29) {
                                                            break L76;
                                                          } else {
                                                            break L77;
                                                          }
                                                        }
                                                      }
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
                                                        break L70;
                                                      } else {
                                                        break L76;
                                                      }
                                                    }
                                                    if (-8 != (this.field_jb ^ -1)) {
                                                      break L70;
                                                    } else {
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
                                                        break L70;
                                                      } else {
                                                        break L75;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
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
                                                break L70;
                                              } else {
                                                break L74;
                                              }
                                            }
                                          }
                                          L78: {
                                            if (-13 >= (this.field_gb.field_y ^ -1)) {
                                              break L78;
                                            } else {
                                              var10 = var10 - 5 * this.field_gb.field_F * this.field_gb.field_y / 50;
                                              var9 = var9 - this.field_gb.field_y * this.field_gb.field_u * 5 / 50;
                                              if (var34 == 0) {
                                                break L70;
                                              } else {
                                                break L78;
                                              }
                                            }
                                          }
                                          var9 = var9 - (25 - this.field_gb.field_y) * 5 * this.field_gb.field_u / 50;
                                          var10 = var10 - (25 + -this.field_gb.field_y) * 5 * this.field_gb.field_F / 50;
                                          if (var34 == 0) {
                                            break L70;
                                          } else {
                                            break L71;
                                          }
                                        }
                                      }
                                      var11 = 1;
                                      break L70;
                                    }
                                  }
                                }
                                L79: {
                                  L80: {
                                    if (-1 == this.field_E) {
                                      break L80;
                                    } else {
                                      L81: {
                                        if (this.field_B == null) {
                                          break L81;
                                        } else {
                                          this.field_B.c(-(var7 >> -791114718) + (var35[0] + this.field_r), var6 + (var35[1] - var7 + this.field_O));
                                          break L81;
                                        }
                                      }
                                      L82: {
                                        if (this.field_cb != null) {
                                          this.field_cb.c(-(var7 >> -2062000511) + var35[0] - -this.field_t, this.field_Z + (var35[1] - var7));
                                          break L82;
                                        } else {
                                          break L82;
                                        }
                                      }
                                      L83: {
                                        if (this.field_bb != null) {
                                          this.field_bb.c(var35[0] + -(var7 >> -1669721471), var6 + -var7 + var35[1]);
                                          break L83;
                                        } else {
                                          break L83;
                                        }
                                      }
                                      L84: {
                                        if (this.field_I == null) {
                                          break L84;
                                        } else {
                                          L85: {
                                            if (var11 == 0) {
                                              break L85;
                                            } else {
                                              var12 = -(int)(Math.sin((double)jb.field_v * 0.2) * (500.0 * Math.random() + 1000.0));
                                              this.field_I.a(4096, -(3 * var7 / 4) + (var35[1] - -var6), param2 ^ 1703903772, var35[0], var12);
                                              if (var34 == 0) {
                                                break L84;
                                              } else {
                                                break L85;
                                              }
                                            }
                                          }
                                          this.field_I.c(var35[0] - (var7 >> 1298036705), var6 + -(var7 * 3 / 2) + var35[1]);
                                          break L84;
                                        }
                                      }
                                      L86: {
                                        if (null == this.field_Q) {
                                          break L86;
                                        } else {
                                          this.field_Q.c(-(var7 >> -2027413439) + var35[0] + this.field_y, this.field_o + (-var7 + var35[1]));
                                          break L86;
                                        }
                                      }
                                      if (this.field_fb != null) {
                                        var8_ref_qb.c(var9, var10);
                                        if (var34 == 0) {
                                          break L79;
                                        } else {
                                          break L80;
                                        }
                                      } else {
                                        break L79;
                                      }
                                    }
                                  }
                                  L87: {
                                    if (this.field_B == null) {
                                      break L87;
                                    } else {
                                      this.field_B.e(-this.field_r + var35[0] - (var7 >> -1223359359) + -(var7 >> 1212325410), this.field_O + (-var7 + (var35[1] - -var6)));
                                      break L87;
                                    }
                                  }
                                  L88: {
                                    if (this.field_cb != null) {
                                      this.field_cb.e(var35[0] + -(var7 >> -271457279) - this.field_t, -var7 + (var35[1] + this.field_Z));
                                      break L88;
                                    } else {
                                      break L88;
                                    }
                                  }
                                  L89: {
                                    if (this.field_bb != null) {
                                      this.field_bb.e(var35[0] + -(var7 >> 785879457), -var7 + (var35[1] + var6));
                                      break L89;
                                    } else {
                                      break L89;
                                    }
                                  }
                                  L90: {
                                    if (this.field_I == null) {
                                      break L90;
                                    } else {
                                      L91: {
                                        if (var11 == 0) {
                                          break L91;
                                        } else {
                                          var12 = (int)(Math.sin(0.2 * (double)jb.field_v) * (500.0 * Math.random() + 1000.0));
                                          this.field_I.b().a(4096, var35[1] + (-(var7 * 3 / 4) - -var6), 19, var35[0], var12);
                                          if (var34 == 0) {
                                            break L90;
                                          } else {
                                            break L91;
                                          }
                                        }
                                      }
                                      this.field_I.e(var35[0] + -(var7 >> 1262758529), var35[1] - var7 * 3 / 2 + var6);
                                      break L90;
                                    }
                                  }
                                  L92: {
                                    if (this.field_Q == null) {
                                      break L92;
                                    } else {
                                      this.field_Q.e(-this.field_y + (var35[0] + -(var7 >> -990635199)), this.field_o + (var35[1] + -var7));
                                      break L92;
                                    }
                                  }
                                  if (this.field_fb == null) {
                                    break L79;
                                  } else {
                                    var8_ref_qb.c(var9, var10);
                                    break L79;
                                  }
                                }
                                if (var34 == 0) {
                                  break L9;
                                } else {
                                  break L64;
                                }
                              }
                              L93: {
                                if ((this.field_ab ^ -1) == -4) {
                                  break L93;
                                } else {
                                  L94: {
                                    L95: {
                                      var7 = this.field_Y;
                                      if ((this.field_E ^ -1) != 0) {
                                        break L95;
                                      } else {
                                        L96: {
                                          if (null != this.field_B) {
                                            this.field_B.e(-(var7 >> -1083108222) + (-(var7 >> -2077559391) + var35[0]) - this.field_r, this.field_O + (-var7 + var35[1]) - -var6);
                                            break L96;
                                          } else {
                                            break L96;
                                          }
                                        }
                                        L97: {
                                          if (this.field_cb == null) {
                                            break L97;
                                          } else {
                                            this.field_cb.e(-(var7 >> -1060412223) + var35[0] - this.field_t, this.field_Z + (-var7 + var35[1]));
                                            break L97;
                                          }
                                        }
                                        L98: {
                                          if (this.field_bb != null) {
                                            this.field_bb.e(var35[0] - (var7 >> -1212619103), var6 + (-var7 + var35[1]));
                                            break L98;
                                          } else {
                                            break L98;
                                          }
                                        }
                                        L99: {
                                          L100: {
                                            if (this.field_jb == 32) {
                                              break L100;
                                            } else {
                                              L101: {
                                                if (37 == this.field_jb) {
                                                  break L101;
                                                } else {
                                                  if (null != this.field_I) {
                                                    this.field_I.e(-(var7 >> -41047807) + var35[0], var6 + -(3 * var7 / 2) + var35[1]);
                                                    if (var34 == 0) {
                                                      break L99;
                                                    } else {
                                                      break L101;
                                                    }
                                                  } else {
                                                    break L99;
                                                  }
                                                }
                                              }
                                              if (this.field_I != null) {
                                                this.field_I.e(var35[0] - (var7 >> -305420351), var35[1] + (-(var7 * 3 / 2) + (var6 - 10)));
                                                if (var34 == 0) {
                                                  break L99;
                                                } else {
                                                  break L100;
                                                }
                                              } else {
                                                break L99;
                                              }
                                            }
                                          }
                                          if (this.field_I == null) {
                                            break L99;
                                          } else {
                                            this.field_I.e(-12 + -(var7 >> 13165761) + var35[0], var6 + (-(3 * var7 / 2) + var35[1]));
                                            break L99;
                                          }
                                        }
                                        L102: {
                                          if (null != this.field_Q) {
                                            this.field_Q.e(-this.field_y + -(var7 >> 2121690849) + var35[0], this.field_o + (-var7 + var35[1]));
                                            break L102;
                                          } else {
                                            break L102;
                                          }
                                        }
                                        L103: {
                                          if ((this.field_ab ^ -1) != -2) {
                                            break L103;
                                          } else {
                                            gn.a(12, (byte) 117, 128, var35[0] + ((var7 >> 756631234) + -this.field_n + 4), this.field_N + (8 + var35[1] + (-this.field_Y - -var6)));
                                            var8 = -this.field_n + (var7 >> -1205680158) - (-4 - (int)(13.0 * Math.random() - 6.0));
                                            var9 = this.field_N + -this.field_Y - -8 - (-var6 - (int)(Math.random() * 13.0 - 18.0) - (-6 - -Math.abs(-4 + (var8 + -(var7 >> 1992415010)) + this.field_n)));
                                            var45 = aj.a((ml) null, this.field_db + var9, false, 109, this.field_L, this.field_lb + var8);
                                            var45.field_y = 16;
                                            this.field_L.b(52, var45);
                                            break L103;
                                          }
                                        }
                                        L104: {
                                          L105: {
                                            if ((this.field_ab ^ -1) == -1) {
                                              L106: {
                                                var8 = 0;
                                                if (this.field_L.field_N == null) {
                                                  break L106;
                                                } else {
                                                  var8 = this.field_L.field_N[this.field_T][5] | (this.field_L.field_N[this.field_T][3] << -1008437328 | this.field_L.field_N[this.field_T][4] << 1373199240);
                                                  break L106;
                                                }
                                              }
                                              L107: {
                                                var9 = 4 + ((var7 >> 1112750562) + var35[0] + -this.field_n);
                                                var10 = this.field_N + (-this.field_Y + var35[1]) - (-8 + -var6);
                                                var11 = 255 & jb.field_v;
                                                if (var11 < 128) {
                                                  break L107;
                                                } else {
                                                  var11 = -var11 + 256;
                                                  break L107;
                                                }
                                              }
                                              var11 += 64;
                                              de.c(var9, var10, 12, var8, var11);
                                              de.c(var9, var10, 10, var8, var11);
                                              de.c(var9, var10, 8, var8, var11);
                                              var12 = 0;
                                              L108: while (true) {
                                                if (-8 >= (var12 ^ -1)) {
                                                  break L105;
                                                } else {
                                                  var13_int = var9 - -(int)(9.0 * Math.sin(3.14 * ((double)var12 + 0.1 * (double)jb.field_v) / 3.5));
                                                  var14 = (int)(9.0 * Math.cos(((double)jb.field_v * 0.1 + (double)var12) * 3.14 / 3.5)) + var10;
                                                  jg.field_c[var12].b(-2 + var13_int, var14 + -2);
                                                  de.c(var13_int, var14, 4, var8, 32);
                                                  var12++;
                                                  if (var34 != 0) {
                                                    break L104;
                                                  } else {
                                                    if (var34 == 0) {
                                                      continue L108;
                                                    } else {
                                                      break L105;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L105;
                                            }
                                          }
                                          if (null == this.field_fb) {
                                            break L104;
                                          } else {
                                            this.field_fb.e(-(var7 >> -318913566) + (var35[0] + -this.field_n), this.field_N + (var35[1] + -var7 + var6));
                                            break L104;
                                          }
                                        }
                                        if (-19 != (this.field_jb ^ -1)) {
                                          break L94;
                                        } else {
                                          if (gi.field_m == null) {
                                            break L94;
                                          } else {
                                            L109: {
                                              var8 = 0;
                                              if (this.field_F <= 1.5) {
                                                break L109;
                                              } else {
                                                var8 = 1;
                                                break L109;
                                              }
                                            }
                                            L110: {
                                              if (3.0 >= this.field_F) {
                                                break L110;
                                              } else {
                                                var8 = 2;
                                                break L110;
                                              }
                                            }
                                            L111: {
                                              if (this.field_F <= 4.5) {
                                                break L111;
                                              } else {
                                                var8 = 3;
                                                break L111;
                                              }
                                            }
                                            gi.field_m[var8].d(-32 + (var35[0] + 16), var35[1] - 48);
                                            if (var34 == 0) {
                                              break L94;
                                            } else {
                                              break L95;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L112: {
                                      if (null != this.field_B) {
                                        this.field_B.c(this.field_r + var35[0] + -(var7 >> -1559999806), var35[1] + -var7 - (-this.field_O - var6));
                                        break L112;
                                      } else {
                                        break L112;
                                      }
                                    }
                                    L113: {
                                      if (this.field_cb == null) {
                                        break L113;
                                      } else {
                                        this.field_cb.c(-(var7 >> 1101086049) + (var35[0] - -this.field_t), this.field_Z + (-var7 + var35[1]));
                                        break L113;
                                      }
                                    }
                                    L114: {
                                      if (null == this.field_bb) {
                                        break L114;
                                      } else {
                                        this.field_bb.c(-(var7 >> 825315041) + var35[0], var35[1] - var7 - -var6);
                                        break L114;
                                      }
                                    }
                                    L115: {
                                      L116: {
                                        if (this.field_jb != 32) {
                                          break L116;
                                        } else {
                                          if (this.field_I != null) {
                                            this.field_I.c(var35[0] - (var7 >> -1448803231) + 12, var6 + (var35[1] - var7 * 3 / 2));
                                            if (var34 == 0) {
                                              break L115;
                                            } else {
                                              break L116;
                                            }
                                          } else {
                                            break L115;
                                          }
                                        }
                                      }
                                      L117: {
                                        if ((this.field_jb ^ -1) != -38) {
                                          break L117;
                                        } else {
                                          if (this.field_I == null) {
                                            break L115;
                                          } else {
                                            this.field_I.c(var35[0] + -(var7 >> 1403885217), var35[1] + (-(var7 * 3 / 2) + (var6 - 10)));
                                            if (var34 == 0) {
                                              break L115;
                                            } else {
                                              break L117;
                                            }
                                          }
                                        }
                                      }
                                      if (null == this.field_I) {
                                        break L115;
                                      } else {
                                        this.field_I.c(-(var7 >> -139200287) + var35[0], var6 + (-(3 * var7 / 2) + var35[1]));
                                        break L115;
                                      }
                                    }
                                    L118: {
                                      if (this.field_Q == null) {
                                        break L118;
                                      } else {
                                        this.field_Q.c(var35[0] + -(var7 >> -1414137599) + this.field_y, this.field_o + var35[1] + -var7);
                                        break L118;
                                      }
                                    }
                                    L119: {
                                      L120: {
                                        L121: {
                                          if ((this.field_ab ^ -1) != -1) {
                                            break L121;
                                          } else {
                                            L122: {
                                              var8 = 0;
                                              if (this.field_L.field_N != null) {
                                                var8 = this.field_L.field_N[this.field_T][5] | (this.field_L.field_N[this.field_T][3] << 2016524144 | this.field_L.field_N[this.field_T][4] << -1824116920);
                                                break L122;
                                              } else {
                                                break L122;
                                              }
                                            }
                                            L123: {
                                              var9 = -4 + (this.field_n + var35[0]) + -(var7 >> 1511088770);
                                              var10 = this.field_N + (var35[1] - this.field_Y + (8 - -var6));
                                              var11 = jb.field_v & 255;
                                              if ((var11 ^ -1) <= -129) {
                                                var11 = 256 - var11;
                                                break L123;
                                              } else {
                                                break L123;
                                              }
                                            }
                                            var11 += 64;
                                            de.c(var9, var10, 12, var8, var11);
                                            de.c(var9, var10, 10, var8, var11);
                                            de.c(var9, var10, 8, var8, var11);
                                            var12 = 0;
                                            L124: while (true) {
                                              if ((var12 ^ -1) <= -8) {
                                                break L121;
                                              } else {
                                                var13_int = (int)(9.0 * Math.sin(3.14 * (0.1 * (double)jb.field_v + (double)var12) / 3.5)) + var9;
                                                var14 = var10 + (int)(9.0 * Math.cos(3.14 * ((double)var12 + 0.1 * (double)jb.field_v) / 3.5));
                                                jg.field_c[var12].b(-2 + var13_int, -2 + var14);
                                                de.c(var13_int, var14, 4, var8, 32);
                                                var12++;
                                                if (var34 != 0) {
                                                  break L120;
                                                } else {
                                                  if (var34 == 0) {
                                                    continue L124;
                                                  } else {
                                                    break L121;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        if (-2 == (this.field_ab ^ -1)) {
                                          gn.a(12, (byte) 73, 128, -4 + (this.field_n + -(var7 >> 2102388450)) + var35[0], var6 + this.field_N + var35[1] + (-this.field_Y + 8));
                                          var8 = -4 + -(var7 >> -93290590) + (this.field_n - -(int)(-6.0 + 13.0 * Math.random()));
                                          var9 = -this.field_Y + 8 + this.field_N - (-var6 + -(int)(-18.0 + 13.0 * Math.random()) - (-6 + Math.abs(-this.field_n + var8 + (var7 >> -53822174) - -4)));
                                          break L120;
                                        } else {
                                          break L119;
                                        }
                                      }
                                      var46 = aj.a((ml) null, this.field_db + var9, false, 109, this.field_L, this.field_lb + var8);
                                      var46.field_y = 16;
                                      this.field_L.b(52, var46);
                                      break L119;
                                    }
                                    L125: {
                                      if (this.field_fb == null) {
                                        break L125;
                                      } else {
                                        this.field_fb.c(this.field_n + -(var7 >> -493976734) + var35[0] - (var7 >> 2146500961), var6 + -var7 + (var35[1] - -this.field_N));
                                        break L125;
                                      }
                                    }
                                    if ((this.field_jb ^ -1) != -19) {
                                      break L94;
                                    } else {
                                      if (null == gi.field_m) {
                                        break L94;
                                      } else {
                                        L126: {
                                          var8 = 0;
                                          if (this.field_F <= 1.5) {
                                            break L126;
                                          } else {
                                            var8 = 1;
                                            break L126;
                                          }
                                        }
                                        L127: {
                                          if (3.0 < this.field_F) {
                                            var8 = 2;
                                            break L127;
                                          } else {
                                            break L127;
                                          }
                                        }
                                        L128: {
                                          if (4.5 >= this.field_F) {
                                            break L128;
                                          } else {
                                            var8 = 3;
                                            break L128;
                                          }
                                        }
                                        gi.field_m[var8].a(-48 + var35[0], -48 + var35[1]);
                                        break L94;
                                      }
                                    }
                                  }
                                  if (var34 == 0) {
                                    break L9;
                                  } else {
                                    break L93;
                                  }
                                }
                              }
                              L129: {
                                if (0 != (this.field_E ^ -1)) {
                                  break L129;
                                } else {
                                  this.field_bb.b().a(var35[0], var35[1] + -(this.field_Y >> -196775359), (int)(this.field_F * 65536.0 / 6.28), 4096);
                                  if (var34 == 0) {
                                    break L9;
                                  } else {
                                    break L129;
                                  }
                                }
                              }
                              this.field_bb.a(var35[0], -(this.field_Y >> 1969405025) + var35[1], (int)(-this.field_F * 65536.0 / 6.28), 4096);
                              if (var34 == 0) {
                                break L9;
                              } else {
                                break L36;
                              }
                            }
                            L130: {
                              var7 = 0;
                              if (this.field_F <= 1.5) {
                                break L130;
                              } else {
                                var7 = 1;
                                break L130;
                              }
                            }
                            L131: {
                              if (3.0 >= this.field_F) {
                                break L131;
                              } else {
                                var7 = 2;
                                break L131;
                              }
                            }
                            L132: {
                              if (4.5 < this.field_F) {
                                var7 = 3;
                                break L132;
                              } else {
                                break L132;
                              }
                            }
                            L133: {
                              if (this.field_F < 0.0) {
                                L134: {
                                  var7 = 4;
                                  if (-2.0 >= this.field_F) {
                                    break L134;
                                  } else {
                                    var7 = 5;
                                    break L134;
                                  }
                                }
                                if (-1.0 >= this.field_F) {
                                  break L133;
                                } else {
                                  var7 = 6;
                                  break L133;
                                }
                              } else {
                                break L133;
                              }
                            }
                            L135: {
                              L136: {
                                if (0 != (this.field_E ^ -1)) {
                                  break L136;
                                } else {
                                  bk.field_L[var7].d(var35[0] - (this.field_Y >> -1826153247), var35[1] + -this.field_Y);
                                  if (var34 == 0) {
                                    break L135;
                                  } else {
                                    break L136;
                                  }
                                }
                              }
                              bk.field_L[var7].a(-(this.field_Y >> -745629247) + var35[0], var35[1] + -this.field_Y);
                              break L135;
                            }
                            if (var34 == 0) {
                              break L9;
                            } else {
                              break L34;
                            }
                          }
                          L137: {
                            var7 = 0;
                            if (1.5 >= this.field_F) {
                              break L137;
                            } else {
                              var7 = 1;
                              break L137;
                            }
                          }
                          L138: {
                            if (this.field_F > 3.0) {
                              var7 = 2;
                              break L138;
                            } else {
                              break L138;
                            }
                          }
                          L139: {
                            if (this.field_F > 4.5) {
                              var7 = 3;
                              break L139;
                            } else {
                              break L139;
                            }
                          }
                          L140: {
                            if (0.0 > this.field_F) {
                              L141: {
                                var7 = 4;
                                if (-2.0 >= this.field_F) {
                                  break L141;
                                } else {
                                  var7 = 5;
                                  break L141;
                                }
                              }
                              if (this.field_F <= -1.0) {
                                break L140;
                              } else {
                                var7 = 6;
                                break L140;
                              }
                            } else {
                              break L140;
                            }
                          }
                          L142: {
                            L143: {
                              if (0 != (this.field_E ^ -1)) {
                                break L143;
                              } else {
                                rc.field_d[var7].d(-(this.field_Y >> 411238593) + var35[0], var35[1] - this.field_Y);
                                if (var34 == 0) {
                                  break L142;
                                } else {
                                  break L143;
                                }
                              }
                            }
                            rc.field_d[var7].a(-(this.field_Y >> 668165633) + var35[0], -this.field_Y + var35[1]);
                            break L142;
                          }
                          if (var34 == 0) {
                            break L9;
                          } else {
                            break L17;
                          }
                        }
                      }
                      L144: {
                        L145: {
                          uj.field_i[5].c(-(uj.field_i[5].field_n / 2) + var35[0], -this.field_Y + var35[1] + 64);
                          if (0 == (this.field_E ^ -1)) {
                            break L145;
                          } else {
                            L146: {
                              if (this.field_B == null) {
                                break L146;
                              } else {
                                this.field_B.c(8 + (-16 + var35[0]), var35[1] + -(this.field_Y >> 6723713) - (16 + -var6));
                                break L146;
                              }
                            }
                            L147: {
                              if (null != this.field_bb) {
                                this.field_bb.c(var35[0] - 16, -16 + (var35[1] - ((this.field_Y >> -2084965599) - var6)));
                                break L147;
                              } else {
                                break L147;
                              }
                            }
                            L148: {
                              if (null != this.field_fb) {
                                this.field_fb.c(var35[0] + -24, -(this.field_Y >> 1171247745) + var35[1] + -16 - -var6);
                                break L148;
                              } else {
                                break L148;
                              }
                            }
                            if (null == this.field_I) {
                              break L144;
                            } else {
                              this.field_I.c(-16 + var35[0], var6 + (var35[1] - (this.field_Y >> 1694098401) - 32));
                              if (var34 == 0) {
                                break L144;
                              } else {
                                break L145;
                              }
                            }
                          }
                        }
                        L149: {
                          if (null == this.field_B) {
                            break L149;
                          } else {
                            this.field_B.e(-16 + (var35[0] - 8), -16 + (var35[1] - (this.field_Y >> 1296015649)) - -var6);
                            break L149;
                          }
                        }
                        L150: {
                          if (this.field_bb == null) {
                            break L150;
                          } else {
                            this.field_bb.e(var35[0] + -16, -16 + var35[1] - (this.field_Y >> -2024840191) - -var6);
                            break L150;
                          }
                        }
                        L151: {
                          if (null == this.field_fb) {
                            break L151;
                          } else {
                            this.field_fb.e(8 + (-16 + var35[0]), var35[1] + -(this.field_Y >> -1112801471) + (-16 + var6));
                            break L151;
                          }
                        }
                        if (null == this.field_I) {
                          break L144;
                        } else {
                          this.field_I.e(var35[0] + -16, var6 + (-32 + (var35[1] + -(this.field_Y >> 801269633))));
                          break L144;
                        }
                      }
                      L152: {
                        var7 = 255 & jb.field_v;
                        if (128 >= var7) {
                          break L152;
                        } else {
                          var7 = 256 - var7;
                          break L152;
                        }
                      }
                      gn.a(128, (byte) 114, -320 - var7, var35[0], -48 + var35[1]);
                      if (var34 == 0) {
                        break L9;
                      } else {
                        break L12;
                      }
                    }
                  }
                  uj.field_i[1].c(-(uj.field_i[1].field_n / 2) + var35[0], -this.field_Y + var35[1]);
                  if (this.field_I == null) {
                    break L9;
                  } else {
                    this.field_I.e(var35[0] - 16, var6 + (-32 + (var35[1] + -(this.field_Y >> -327960319))));
                    if (var34 == 0) {
                      break L9;
                    } else {
                      break L11;
                    }
                  }
                }
              }
              uj.field_i[0].c(-(uj.field_i[0].field_n / 2) + var35[0], var35[1] + -this.field_Y);
              if (this.field_I == null) {
                break L9;
              } else {
                this.field_I.e(var35[0] + -16, var6 + var35[1] + (-(this.field_Y >> -368948671) + -32));
                if (var34 == 0) {
                  break L9;
                } else {
                  break L10;
                }
              }
            }
          }
          var7 = (int)(4.0 * Math.sin(this.field_F * 2.0) + 18.0);
          var8 = (int)(32.0 + 4.0 * Math.cos(2.0 * this.field_F));
          var9 = (int)(Math.cos(this.field_F) * 4.0);
          var10 = -8;
          L153: while (true) {
            L154: {
              L155: {
                if (8 <= var10) {
                  break L155;
                } else {
                  de.b(var10 / 4 + var35[0], var35[1], var9 + (var35[0] - -var10), var35[1] - var8, 6303744);
                  var10++;
                  if (var34 != 0) {
                    break L154;
                  } else {
                    if (var34 == 0) {
                      continue L153;
                    } else {
                      break L155;
                    }
                  }
                }
              }
              de.b(var35[0] + -2, var35[1], var9 + (var35[0] + -8), var35[1] + -var8, 0);
              de.b(2 + var35[0], var35[1], 8 + var9 + var35[0], var35[1] - var8, 0);
              de.b(var35[0] + 2, var35[1], var35[0] - 2, var35[1], 0);
              de.i(var35[0] + var9, -var8 + var35[1], var7, 16777215);
              de.c(var35[0] + var9, -var8 + var35[1], var7, 0);
              de.i(var9 + var35[0], -var8 + var35[1], (int)((double)var7 * 0.66), 255);
              break L154;
            }
            de.i(var35[0] + var9, var35[1] - var8, (int)(0.33 * (double)var7), 16711680);
            break L9;
          }
        }
        L156: {
          L157: {
            if (this.field_q > 0) {
              break L157;
            } else {
              if (!this.field_D) {
                break L157;
              } else {
                if (this.field_jb == 12) {
                  break L157;
                } else {
                  if (-41 == (this.field_jb ^ -1)) {
                    break L157;
                  } else {
                    var7 = 0;
                    L158: while (true) {
                      if ((var7 ^ -1) <= -4) {
                        break L157;
                      } else {
                        var8 = var35[0] - -(int)(Math.sin(3.14 * (double)var7 / 1.5 + 0.125 * (double)jb.field_v) * 16.0);
                        var9 = -this.field_Y + (var35[1] - 10);
                        var10 = (int)(Math.cos(3.14 * (double)var7 / 1.5 + 0.125 * (double)jb.field_v) * 8.0);
                        stackOut_411_0 = -1;
                        stackOut_411_1 = var10 ^ -1;
                        stackIn_418_0 = stackOut_411_0;
                        stackIn_418_1 = stackOut_411_1;
                        stackIn_412_0 = stackOut_411_0;
                        stackIn_412_1 = stackOut_411_1;
                        if (var34 != 0) {
                          break L156;
                        } else {
                          L159: {
                            L160: {
                              if (stackIn_412_0 <= stackIn_412_1) {
                                break L160;
                              } else {
                                bb.field_g[(1 & jb.field_v / 7 + var7 * 3) + 86].c(var8 + -20, -20 + (var9 + var10));
                                if (var34 == 0) {
                                  break L159;
                                } else {
                                  break L160;
                                }
                              }
                            }
                            bb.field_g[(3 * var7 + jb.field_v / 7 & 1) + 86].e(var8 + -20, var9 - (-var10 + 20));
                            break L159;
                          }
                          var7++;
                          if (var34 == 0) {
                            continue L158;
                          } else {
                            break L157;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          stackOut_417_0 = this.field_u;
          stackOut_417_1 = this.field_T;
          stackIn_418_0 = stackOut_417_0;
          stackIn_418_1 = stackOut_417_1;
          break L156;
        }
        L161: {
          if (stackIn_418_0 == stackIn_418_1) {
            var7 = this.field_L.field_x[this.field_T];
            if (-11 == (var7 ^ -1)) {
              break L161;
            } else {
              if (-1 > (this.field_L.field_X[this.field_T] ^ -1)) {
                L162: {
                  var8 = this.field_L.field_Ab[this.field_T];
                  var9 = this.field_L.field_o[this.field_T];
                  var10 = var8 - -param1;
                  var11 = var9 + param0;
                  var12 = 0;
                  var13 = null;
                  var14 = 10;
                  if (0 != var7) {
                    break L162;
                  } else {
                    var12 = 1;
                    var13 = lf.field_c;
                    break L162;
                  }
                }
                L163: {
                  if ((var7 ^ -1) == -2) {
                    var13 = tf.field_j;
                    break L163;
                  } else {
                    break L163;
                  }
                }
                L164: {
                  if ((var7 ^ -1) != -3) {
                    break L164;
                  } else {
                    var12 = 1;
                    var13 = ij.field_Pb;
                    break L164;
                  }
                }
                L165: {
                  if (3 == var7) {
                    var13 = fo.field_g;
                    break L165;
                  } else {
                    break L165;
                  }
                }
                L166: {
                  if ((var7 ^ -1) != -5) {
                    break L166;
                  } else {
                    var12 = 1;
                    var13 = fc.field_e;
                    break L166;
                  }
                }
                L167: {
                  if ((var7 ^ -1) != -6) {
                    break L167;
                  } else {
                    var13 = ji.field_h;
                    var12 = 1;
                    break L167;
                  }
                }
                L168: {
                  if ((var7 ^ -1) == -7) {
                    var13 = rc.field_k;
                    var12 = 1;
                    break L168;
                  } else {
                    break L168;
                  }
                }
                L169: {
                  if (-8 == (var7 ^ -1)) {
                    var13 = eo.field_a;
                    break L169;
                  } else {
                    break L169;
                  }
                }
                L170: {
                  if ((var7 ^ -1) != -9) {
                    break L170;
                  } else {
                    var14 = 3;
                    var12 = 1;
                    var13 = ae.field_a;
                    break L170;
                  }
                }
                L171: {
                  L172: {
                    var15 = new int[]{255, 0, 0};
                    var16 = new int[]{0, 255, 0};
                    var17 = new int[]{0, 0, 255};
                    var18 = new int[]{255, 255, 255};
                    var19 = this.field_u;
                    if (-1 == (var19 ^ -1)) {
                      break L172;
                    } else {
                      if (3 == var19) {
                        break L172;
                      } else {
                        if (-5 == (var19 ^ -1)) {
                          break L172;
                        } else {
                          break L171;
                        }
                      }
                    }
                  }
                  var15[2] = 255;
                  var15[1] = 255;
                  break L171;
                }
                L173: {
                  L174: {
                    if (-2 == (var19 ^ -1)) {
                      break L174;
                    } else {
                      if ((var19 ^ -1) == -4) {
                        break L174;
                      } else {
                        if (var19 != 5) {
                          break L173;
                        } else {
                          break L174;
                        }
                      }
                    }
                  }
                  var16[0] = 255;
                  var16[2] = 255;
                  break L173;
                }
                L175: {
                  L176: {
                    if ((var19 ^ -1) == -3) {
                      break L176;
                    } else {
                      if (var19 == 4) {
                        break L176;
                      } else {
                        if (var19 == 5) {
                          break L176;
                        } else {
                          break L175;
                        }
                      }
                    }
                  }
                  var17[2] = 255;
                  var17[0] = 255;
                  break L175;
                }
                L177: {
                  if (this.field_L.field_N == null) {
                    break L177;
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
                    break L177;
                  }
                }
                L178: {
                  if (var12 != 0) {
                    break L178;
                  } else {
                    L179: {
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
                        break L179;
                      } else {
                        var20 = (int)(4.0 * Math.sin((double)(jb.field_v >> 1862564323)) + 4.0);
                        var21_int = -var20;
                        var22_int = (int)(Math.sin((double)(jb.field_v >> -1248468574)) * 4.0);
                        var23 = -var22_int;
                        break L179;
                      }
                    }
                    L180: {
                      L181: {
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
                          break L181;
                        } else {
                          var31.c(var10 + -32, -32 + var11);
                          if (var34 == 0) {
                            break L180;
                          } else {
                            break L181;
                          }
                        }
                      }
                      var31.e(var10 - 32, -32 + var11);
                      break L180;
                    }
                    if (var34 == 0) {
                      break L161;
                    } else {
                      break L178;
                    }
                  }
                }
                L182: {
                  L183: {
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
                      break L183;
                    } else {
                      if (-7 != (var7 ^ -1)) {
                        break L182;
                      } else {
                        break L183;
                      }
                    }
                  }
                  var25 = -1;
                  break L182;
                }
                L184: {
                  if (-1 >= (this.field_E ^ -1)) {
                    break L184;
                  } else {
                    if (var7 == 4) {
                      break L184;
                    } else {
                      var21.e(-(((qb) (((Object[]) (var13))[var20])).field_n / 2) + var10, -var25 + -((qb) (((Object[]) (var13))[var20])).field_w + var11);
                      if (var34 == 0) {
                        break L161;
                      } else {
                        break L184;
                      }
                    }
                  }
                }
                L185: {
                  if ((var7 ^ -1) != -5) {
                    break L185;
                  } else {
                    if (-1 <= ((-1 + this.field_L.field_X[this.field_u]) % 5 - (-1 - -((this.field_L.field_X[this.field_u] + -1) / 5)) ^ -1)) {
                      break L161;
                    } else {
                      break L185;
                    }
                  }
                }
                var21.c(-(((qb) (((Object[]) (var13))[var20])).field_n / 2) + var10, -((qb) (((Object[]) (var13))[var20])).field_w + var11 + -var25);
                break L161;
              } else {
                break L161;
              }
            }
          } else {
            break L161;
          }
        }
        L186: {
          if (this.field_z) {
            break L186;
          } else {
            if ((this.field_jb ^ -1) == -13) {
              break L186;
            } else {
              if ((this.field_jb ^ -1) != -41) {
                L187: {
                  L188: {
                    var7 = this.field_ib;
                    if ((this.field_jb ^ -1) == -33) {
                      break L188;
                    } else {
                      if (27 == this.field_jb) {
                        break L188;
                      } else {
                        break L187;
                      }
                    }
                  }
                  var7 = var7 * 2;
                  break L187;
                }
                L189: {
                  if (0 >= this.field_q) {
                    break L189;
                  } else {
                    var7 = var7 + this.field_q;
                    break L189;
                  }
                }
                var8 = tj.field_t.field_C / 2;
                discarded$3 = mi.field_B.a(Integer.toString(var7), -var8 + param1 + this.field_lb, -(var8 * 2) + (param0 + this.field_db) + (-this.field_Y - 2), var8 * 2, var8 * 2, (var5 | 8421504) ^ 8421504, 0, 1, 1, tj.field_t.field_C);
                discarded$4 = mi.field_B.a(Integer.toString(var7), -1 + (-var8 + (param1 + this.field_lb)), -this.field_Y + param0 + (this.field_db + -(var8 * 2) + -1), 2 * var8, var8 * 2, 8421504 ^ (var5 | 8421504), 0, 1, 1, tj.field_t.field_C);
                discarded$5 = mi.field_B.a(Integer.toString(var7), param1 + this.field_lb + -var8, -(2 * var8) + (this.field_db - -param0) - (this.field_Y - -1), var8 * 2, var8 * 2, var5, -1, 1, 1, tj.field_t.field_C);
                if (null != this.field_s) {
                  break L186;
                } else {
                  if ((this.field_T ^ -1) <= (this.field_L.field_q ^ -1)) {
                    break L186;
                  } else {
                    if (this.field_L.field_S[this.field_T] <= 0) {
                      break L186;
                    } else {
                      rb.field_o[-1 + this.field_L.field_S[this.field_T]].d(param1 + (this.field_lb - 15), -(var8 * 2) + -this.field_Y + (param0 + this.field_db + -13), var5);
                      break L186;
                    }
                  }
                }
              } else {
                break L186;
              }
            }
          }
        }
        L190: {
          if (param2 == 1703903841) {
            break L190;
          } else {
            this.field_L = (nf) null;
            break L190;
          }
        }
    }

    final boolean i(int param0) {
        int var2 = -108 / ((33 - param0) / 56);
        return (this.field_x ^ -1) < -1 ? true : false;
    }

    private final boolean e(boolean param0) {
        int dupTemp$2 = 0;
        ml var3 = null;
        int[] stackIn_11_0 = null;
        nf stackIn_11_1 = null;
        int[] stackIn_12_0 = null;
        nf stackIn_12_1 = null;
        int[] stackIn_13_0 = null;
        nf stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        int[] stackOut_10_0 = null;
        nf stackOut_10_1 = null;
        int[] stackOut_12_0 = null;
        nf stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        int[] stackOut_11_0 = null;
        nf stackOut_11_1 = null;
        int stackOut_11_2 = 0;
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
                      stackOut_10_0 = this.field_L.field_R;
                      stackOut_10_1 = this.field_L;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      if (param0) {
                        stackOut_12_0 = (int[]) ((Object) stackIn_12_0);
                        stackOut_12_1 = (nf) ((Object) stackIn_12_1);
                        stackOut_12_2 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        break L5;
                      } else {
                        stackOut_11_0 = (int[]) ((Object) stackIn_11_0);
                        stackOut_11_1 = (nf) ((Object) stackIn_11_1);
                        stackOut_11_2 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_13_2 = stackOut_11_2;
                        break L5;
                      }
                    }
                    dupTemp$2 = ((nf) (Object) stackIn_13_1).d(stackIn_13_2 != 0);
                    stackIn_13_0[dupTemp$2] = stackIn_13_0[dupTemp$2] + this.field_x;
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
        boolean discarded$1 = false;
        int var2 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          if (param0 == -11) {
            break L0;
          } else {
            discarded$1 = this.f((byte) 37);
            break L0;
          }
        }
        L1: {
          if (!this.s(-1)) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
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
        boolean stackOut_11_0 = false;
        boolean stackOut_17_0 = false;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_78_0 = 0;
        int stackOut_78_1 = 0;
        int stackOut_89_0 = 0;
        int stackOut_89_1 = 0;
        int stackOut_121_0 = 0;
        int stackOut_121_1 = 0;
        int stackOut_128_0 = 0;
        int stackOut_128_1 = 0;
        int stackOut_163_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_166_0 = 0;
        int stackOut_168_0 = 0;
        int stackOut_168_1 = 0;
        int stackOut_167_0 = 0;
        int stackOut_167_1 = 0;
        L0: {
          var6_ref = null;
          var11 = ArcanistsMulti.field_G ? 1 : 0;
          if (this.field_T == this.field_u) {
            var2 = this.field_L.field_x[this.field_T];
            if (10 == var2) {
              break L0;
            } else {
              if (-1 > (this.field_L.field_X[this.field_T] ^ -1)) {
                L1: {
                  L2: {
                    var3 = this.field_L.field_Ab[this.field_T];
                    var4 = this.field_L.field_o[this.field_T];
                    var5_int = this.field_lb + -(this.field_E * this.field_Y / 2);
                    var6 = this.field_db - this.field_Y / 2;
                    if (-2 == (var2 ^ -1)) {
                      break L2;
                    } else {
                      if (-8 == (var2 ^ -1)) {
                        break L2;
                      } else {
                        if (3 != var2) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  var6 = this.field_db;
                  var5_int = -(this.field_E * this.field_Y / 2) + this.field_lb;
                  var7 = 0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (var7 >= 32) {
                          break L5;
                        } else {
                          stackOut_11_0 = this.field_L.a(var6, var5_int, (byte) -83);
                          stackIn_18_0 = stackOut_11_0;
                          stackIn_12_0 = stackOut_11_0;
                          if (var11 != 0) {
                            break L4;
                          } else {
                            L6: {
                              L7: {
                                if (!stackIn_12_0) {
                                  break L7;
                                } else {
                                  var6 -= 2;
                                  if (var11 == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              var6 += 2;
                              break L6;
                            }
                            var7 += 2;
                            if (var11 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      stackOut_17_0 = this.field_L.a(2 + var6, var5_int, (byte) -83);
                      stackIn_18_0 = stackOut_17_0;
                      break L4;
                    }
                    L8: {
                      if (stackIn_18_0) {
                        break L8;
                      } else {
                        var5_int = this.field_lb + -(this.field_E * this.field_Y / 4);
                        var6 = this.field_db;
                        break L8;
                      }
                    }
                    L9: {
                      if ((var6 ^ -1) < (var4 ^ -1)) {
                        var4++;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    if (var4 <= var6) {
                      break L1;
                    } else {
                      var4--;
                      break L1;
                    }
                  }
                }
                L10: {
                  if ((var2 ^ -1) != -7) {
                    break L10;
                  } else {
                    if (null != rc.field_k) {
                      L11: {
                        if (13 > jb.field_v / 10 % rc.field_k.length) {
                          break L11;
                        } else {
                          if (this.field_z) {
                            break L11;
                          } else {
                            var5_int = this.field_lb;
                            var3 = this.field_lb;
                            var6 = this.field_db;
                            var4 = this.field_db;
                            if (var11 == 0) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                      var5_int = var3;
                      var6 = var4;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                }
                L12: {
                  if (2 != var2) {
                    break L12;
                  } else {
                    if (null != rc.field_k) {
                      L13: {
                        if ((jb.field_v / 10 % ij.field_Pb.length ^ -1) > (ij.field_Pb.length - 1 ^ -1)) {
                          break L13;
                        } else {
                          if (this.field_z) {
                            break L13;
                          } else {
                            var5_int = this.field_lb;
                            var3 = this.field_lb;
                            var6 = -16 + -this.field_Y + this.field_db;
                            var4 = -16 + -this.field_Y + this.field_db;
                            if (var11 == 0) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                      var6 = var4;
                      var5_int = var3;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                }
                L14: {
                  if (-5 == (var2 ^ -1)) {
                    var5_int = var3;
                    var6 = var4;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                var3 = var3 * 15 - -var5_int >> 1975998020;
                this.field_L.field_Ab[this.field_T] = var3 * 15 - -var5_int >> 1975998020;
                var4 = 15 * var4 - -var6 >> 648805572;
                this.field_L.field_o[this.field_T] = 15 * var4 - -var6 >> 648805572;
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        L15: {
          if (0 >= this.field_x) {
            break L15;
          } else {
            this.field_D = true;
            break L15;
          }
        }
        L16: {
          if (this.field_D) {
            this.field_M = 0;
            break L16;
          } else {
            break L16;
          }
        }
        L17: {
          L18: {
            L19: {
              if (-18 == (this.field_jb ^ -1)) {
                this.field_s = this.field_L.a(this.field_u, true);
                var2 = 65536;
                pi.field_b.a((byte) 114, this.field_L.field_i);
                var6_ref_ml = (ml) ((Object) pi.field_b.b(-31));
                L20: while (true) {
                  if (var6_ref_ml == null) {
                    break L18;
                  } else {
                    stackOut_65_0 = var6_ref_ml.field_u ^ -1;
                    stackOut_65_1 = this.field_u ^ -1;
                    stackIn_90_0 = stackOut_65_0;
                    stackIn_90_1 = stackOut_65_1;
                    stackIn_66_0 = stackOut_65_0;
                    stackIn_66_1 = stackOut_65_1;
                    if (var11 != 0) {
                      break L17;
                    } else {
                      L21: {
                        if (stackIn_66_0 != stackIn_66_1) {
                          break L21;
                        } else {
                          L22: {
                            if (var6_ref_ml.field_s == null) {
                              break L22;
                            } else {
                              if ((var6_ref_ml.field_jb ^ -1) == -10) {
                                break L22;
                              } else {
                                if (var6_ref_ml.field_jb == 7) {
                                  break L22;
                                } else {
                                  if ((var6_ref_ml.field_jb ^ -1) == -38) {
                                    break L22;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                            }
                          }
                          var5_int = -var6_ref_ml.field_db + this.field_db - this.field_Y / 2;
                          var4 = this.field_lb - var6_ref_ml.field_lb;
                          var3 = var5_int * var5_int + var4 * var4;
                          if ((var2 ^ -1) < (var3 ^ -1)) {
                            var2 = var3;
                            this.field_s = var6_ref_ml;
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                      }
                      var6_ref_ml = (ml) ((Object) pi.field_b.d(-18502));
                      if (var11 == 0) {
                        continue L20;
                      } else {
                        break L19;
                      }
                    }
                  }
                }
              } else {
                if (this.x(32)) {
                  this.field_s = this.field_L.a(this.field_u, true);
                  var2 = 65536;
                  pi.field_b.a((byte) 99, this.field_L.field_i);
                  var6_ref_ml = (ml) ((Object) pi.field_b.b(-47));
                  L23: while (true) {
                    L24: {
                      if (var6_ref_ml == null) {
                        break L24;
                      } else {
                        stackOut_53_0 = var6_ref_ml.field_u ^ -1;
                        stackOut_53_1 = this.field_u ^ -1;
                        stackIn_90_0 = stackOut_53_0;
                        stackIn_90_1 = stackOut_53_1;
                        stackIn_54_0 = stackOut_53_0;
                        stackIn_54_1 = stackOut_53_1;
                        if (var11 != 0) {
                          break L17;
                        } else {
                          L25: {
                            if (stackIn_54_0 != stackIn_54_1) {
                              break L25;
                            } else {
                              L26: {
                                if (null == var6_ref_ml.field_s) {
                                  break L26;
                                } else {
                                  if (var6_ref_ml.field_jb != 37) {
                                    break L25;
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                              var5_int = this.field_db - (this.field_Y / 2 + var6_ref_ml.field_db);
                              var4 = this.field_lb - var6_ref_ml.field_lb;
                              var3 = var4 * var4 + var5_int * var5_int;
                              if ((var2 ^ -1) >= (var3 ^ -1)) {
                                break L25;
                              } else {
                                this.field_s = var6_ref_ml;
                                var2 = var3;
                                break L25;
                              }
                            }
                          }
                          var6_ref_ml = (ml) ((Object) pi.field_b.d(-18502));
                          if (var11 == 0) {
                            continue L23;
                          } else {
                            break L24;
                          }
                        }
                      }
                    }
                    if (var11 == 0) {
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                } else {
                  break L18;
                }
              }
            }
            this.field_s = this.field_L.a(this.field_u, true);
            var2 = 65536;
            pi.field_b.a((byte) 114, this.field_L.field_i);
            var6_ref_ml = (ml) ((Object) pi.field_b.b(-31));
            L27: while (true) {
              if (var6_ref_ml == null) {
                break L18;
              } else {
                stackOut_78_0 = var6_ref_ml.field_u ^ -1;
                stackOut_78_1 = this.field_u ^ -1;
                stackIn_90_0 = stackOut_78_0;
                stackIn_90_1 = stackOut_78_1;
                stackIn_79_0 = stackOut_78_0;
                stackIn_79_1 = stackOut_78_1;
                if (var11 != 0) {
                  break L17;
                } else {
                  L28: {
                    if (stackIn_79_0 != stackIn_79_1) {
                      break L28;
                    } else {
                      L29: {
                        if (var6_ref_ml.field_s == null) {
                          break L29;
                        } else {
                          if ((var6_ref_ml.field_jb ^ -1) == -10) {
                            break L29;
                          } else {
                            if (var6_ref_ml.field_jb == 7) {
                              break L29;
                            } else {
                              if ((var6_ref_ml.field_jb ^ -1) == -38) {
                                break L29;
                              } else {
                                break L28;
                              }
                            }
                          }
                        }
                      }
                      var5_int = -var6_ref_ml.field_db + this.field_db - this.field_Y / 2;
                      var4 = this.field_lb - var6_ref_ml.field_lb;
                      var3 = var5_int * var5_int + var4 * var4;
                      if ((var2 ^ -1) < (var3 ^ -1)) {
                        var2 = var3;
                        this.field_s = var6_ref_ml;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                  }
                  var6_ref_ml = (ml) ((Object) pi.field_b.d(-18502));
                  if (var11 == 0) {
                    continue L27;
                  } else {
                    break L18;
                  }
                }
              }
            }
          }
          stackOut_89_0 = 35;
          stackOut_89_1 = this.field_jb;
          stackIn_90_0 = stackOut_89_0;
          stackIn_90_1 = stackOut_89_1;
          break L17;
        }
        L30: {
          if (stackIn_90_0 != stackIn_90_1) {
            break L30;
          } else {
            this.a(true, true);
            break L30;
          }
        }
        L31: {
          this.g(param0 + -5390);
          this.field_lb = this.field_X >> 2067865092;
          if (250 >= this.field_ib) {
            break L31;
          } else {
            this.field_ib = 250;
            break L31;
          }
        }
        L32: {
          L33: {
            this.field_db = this.field_R >> 833836484;
            var2 = this.field_lb;
            var3 = this.field_db;
            var4 = 0;
            if (this.field_z) {
              break L33;
            } else {
              if (this.field_hb) {
                break L33;
              } else {
                if ((this.field_M ^ -1) == -1) {
                  break L32;
                } else {
                  break L33;
                }
              }
            }
          }
          var4 = 1;
          this.field_L.a((ml) (this), 0);
          break L32;
        }
        L34: {
          if (null == this.field_s) {
            break L34;
          } else {
            if (0 < this.field_s.field_ib) {
              break L34;
            } else {
              if (null != this.field_s.field_s) {
                this.field_s = this.field_s.field_s;
                break L34;
              } else {
                break L34;
              }
            }
          }
        }
        L35: {
          this.field_hb = false;
          var5 = this.field_L.a(this.field_u, true);
          if (this.field_s == null) {
            break L35;
          } else {
            L36: {
              if (var5 == null) {
                break L36;
              } else {
                if (0 < var5.field_ib) {
                  break L35;
                } else {
                  break L36;
                }
              }
            }
            L37: {
              this.field_ib = 0;
              if (var4 != 0) {
                break L37;
              } else {
                this.field_L.a((ml) (this), 0);
                break L37;
              }
            }
            this.d(this.field_L.d(false), 90);
            return;
          }
        }
        if (-1 <= (this.field_ib ^ -1)) {
          L38: {
            this.field_M = 0;
            if (var4 == 0) {
              this.field_L.a((ml) (this), param0 ^ -55);
              break L38;
            } else {
              break L38;
            }
          }
          this.d(this.field_L.d(false), 72);
          return;
        } else {
          L39: {
            L40: {
              if (!this.t(33)) {
                break L40;
              } else {
                if (this.field_L.field_x[this.field_u] == 4) {
                  L41: while (true) {
                    if (this.field_L.a(this.field_L.field_o[this.field_u] + 2, this.field_L.field_Ab[this.field_u], (byte) -83)) {
                      break L40;
                    } else {
                      stackOut_121_0 = this.field_L.field_X[this.field_u] ^ -1;
                      stackOut_121_1 = -1;
                      stackIn_129_0 = stackOut_121_0;
                      stackIn_129_1 = stackOut_121_1;
                      stackIn_122_0 = stackOut_121_0;
                      stackIn_122_1 = stackOut_121_1;
                      if (var11 != 0) {
                        break L39;
                      } else {
                        if (stackIn_122_0 >= stackIn_122_1) {
                          break L40;
                        } else {
                          if (0 >= (this.field_L.field_X[this.field_u] - 1) % 5 - (-1 + (-1 + this.field_L.field_X[this.field_u]) / 5)) {
                            break L40;
                          } else {
                            L42: {
                              this.field_L.field_o[this.field_u] = this.field_L.field_o[this.field_u] + 2;
                              if ((this.field_L.field_o[this.field_u] ^ -1) >= (this.field_L.field_H ^ -1)) {
                                break L42;
                              } else {
                                this.field_L.field_X[this.field_u] = this.field_L.field_X[this.field_u] + 5;
                                if ((this.field_L.d(false) ^ -1) == (this.field_u ^ -1)) {
                                  break L42;
                                } else {
                                  break L42;
                                }
                              }
                            }
                            this.field_z = true;
                            if (var11 == 0) {
                              continue L41;
                            } else {
                              break L40;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L40;
                }
              }
            }
            stackOut_128_0 = this.field_db;
            stackOut_128_1 = -this.field_L.field_H * 10;
            stackIn_129_0 = stackOut_128_0;
            stackIn_129_1 = stackOut_128_1;
            break L39;
          }
          L43: {
            if (stackIn_129_0 >= stackIn_129_1) {
              break L43;
            } else {
              this.field_eb = 0;
              this.field_kb = 0;
              this.field_X = this.field_lb << 1358959780;
              this.field_db = 10 * -this.field_L.field_H;
              this.field_R = this.field_db << -95718108;
              this.field_L.field_u[this.g(false)] = true;
              break L43;
            }
          }
          L44: {
            L45: {
              if (this.field_jb == 22) {
                break L45;
              } else {
                if (this.field_jb == 4) {
                  break L45;
                } else {
                  if ((this.field_jb ^ -1) == -6) {
                    break L45;
                  } else {
                    if (-4 != (this.field_L.field_x[this.field_u] ^ -1)) {
                      break L44;
                    } else {
                      if (-1 <= (this.field_L.field_X[this.field_u] ^ -1)) {
                        break L44;
                      } else {
                        break L45;
                      }
                    }
                  }
                }
              }
            }
            if (-1 < (this.field_lb ^ -1)) {
              break L44;
            } else {
              if ((this.field_L.field_y ^ -1) > (this.field_lb ^ -1)) {
                break L44;
              } else {
                if (-1 < (this.field_eb ^ -1)) {
                  break L44;
                } else {
                  if ((this.field_db ^ -1) >= (-33 + this.field_L.field_H ^ -1)) {
                    break L44;
                  } else {
                    L46: {
                      if ((this.field_ib ^ -1) < -6) {
                        break L46;
                      } else {
                        if ((this.field_q ^ -1) < -1) {
                          break L46;
                        } else {
                          break L44;
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
                      break L44;
                    } else {
                      this.field_ib = this.field_ib - 5;
                      break L44;
                    }
                  }
                }
              }
            }
          }
          L47: {
            if (this.field_db >= this.field_L.field_H + 128) {
              break L47;
            } else {
              if ((-640 - (this.field_Y >> -2048412895) ^ -1) < (this.field_lb ^ -1)) {
                break L47;
              } else {
                if (this.field_lb <= this.field_L.field_y + 640 + (this.field_Y >> 1528860769)) {
                  L48: {
                    L49: {
                      var6 = 0;
                      if (-29 == (this.field_jb ^ -1)) {
                        break L49;
                      } else {
                        if ((this.field_jb ^ -1) == -30) {
                          break L49;
                        } else {
                          if ((this.field_jb ^ -1) == -31) {
                            break L49;
                          } else {
                            if ((this.field_jb ^ -1) == -33) {
                              break L49;
                            } else {
                              if (-8 != (this.field_L.field_x[this.field_u] ^ -1)) {
                                break L48;
                              } else {
                                if (this.field_L.field_X[this.field_u] <= 0) {
                                  break L48;
                                } else {
                                  break L49;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    if (0 > this.field_lb) {
                      break L48;
                    } else {
                      if ((this.field_L.field_y ^ -1) > (this.field_lb ^ -1)) {
                        break L48;
                      } else {
                        var6 = 1;
                        break L48;
                      }
                    }
                  }
                  L50: {
                    if (this.field_db <= this.field_L.field_H - (32 + -(this.field_Y / 2))) {
                      stackOut_163_0 = 0;
                      stackIn_164_0 = stackOut_163_0;
                      break L50;
                    } else {
                      stackOut_162_0 = 1;
                      stackIn_164_0 = stackOut_162_0;
                      break L50;
                    }
                  }
                  L51: {
                    var7 = stackIn_164_0;
                    if (this.s(-1)) {
                      L52: {
                        stackOut_166_0 = var7;
                        stackIn_168_0 = stackOut_166_0;
                        stackIn_167_0 = stackOut_166_0;
                        if (this.field_db < this.field_L.field_H) {
                          stackOut_168_0 = stackIn_168_0;
                          stackOut_168_1 = 0;
                          stackIn_169_0 = stackOut_168_0;
                          stackIn_169_1 = stackOut_168_1;
                          break L52;
                        } else {
                          stackOut_167_0 = stackIn_167_0;
                          stackOut_167_1 = 1;
                          stackIn_169_0 = stackOut_167_0;
                          stackIn_169_1 = stackOut_167_1;
                          break L52;
                        }
                      }
                      var7 = stackIn_169_0 | stackIn_169_1;
                      break L51;
                    } else {
                      break L51;
                    }
                  }
                  L53: {
                    if (var7 == 0) {
                      break L53;
                    } else {
                      if (var6 == 0) {
                        if (-13 == (this.field_jb ^ -1)) {
                          L54: {
                            if (var4 == 0) {
                              this.field_L.a((ml) (this), param0 ^ -55);
                              break L54;
                            } else {
                              break L54;
                            }
                          }
                          this.d(this.field_L.d(false), 89);
                          this.field_ib = 0;
                          return;
                        } else {
                          L55: {
                            this.field_db = this.field_db + 1;
                            this.field_R = this.field_db << -961856892;
                            this.field_M = 0;
                            this.field_eb = this.field_eb + 1;
                            this.field_z = true;
                            var8 = -this.field_eb;
                            if (var8 > this.field_Y >> 355541985) {
                              var8 = this.field_Y >> -1249435487;
                              break L55;
                            } else {
                              break L55;
                            }
                          }
                          L56: {
                            if (var8 >= -(this.field_Y >> 2056283009)) {
                              break L56;
                            } else {
                              var8 = -(this.field_Y >> 1282430497);
                              break L56;
                            }
                          }
                          this.field_o = var8 >> -1919569406;
                          this.field_N = -(var8 >> -543692478);
                          this.field_O = -(var8 >> -982051966);
                          this.field_Z = var8 >> -996882750;
                          return;
                        }
                      } else {
                        break L53;
                      }
                    }
                  }
                  L57: {
                    L58: {
                      if (this.g((byte) 108)) {
                        break L58;
                      } else {
                        if (-13 == (this.field_jb ^ -1)) {
                          break L58;
                        } else {
                          break L57;
                        }
                      }
                    }
                    L59: {
                      if ((this.field_eb ^ -1) > -1) {
                        this.field_eb = 0;
                        break L59;
                      } else {
                        break L59;
                      }
                    }
                    this.field_kb = 0;
                    break L57;
                  }
                  L60: {
                    if (param0 == -55) {
                      break L60;
                    } else {
                      this.e((byte) 40);
                      break L60;
                    }
                  }
                  L61: {
                    L62: {
                      if (this.field_z) {
                        break L62;
                      } else {
                        this.z(param0 + 44);
                        if (var11 == 0) {
                          break L61;
                        } else {
                          break L62;
                        }
                      }
                    }
                    this.h((byte) -120);
                    break L61;
                  }
                  L63: {
                    L64: {
                      if ((this.field_ib ^ -1) >= -1) {
                        break L64;
                      } else {
                        if (this.field_z) {
                          break L64;
                        } else {
                          if (this.field_hb) {
                            break L64;
                          } else {
                            if ((var2 ^ -1) != (this.field_lb ^ -1)) {
                              break L64;
                            } else {
                              if ((var3 ^ -1) != (this.field_db ^ -1)) {
                                break L64;
                              } else {
                                if (var4 == 0) {
                                  break L63;
                                } else {
                                  break L64;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    L65: {
                      var9 = this.field_lb;
                      this.field_lb = var2;
                      var10 = this.field_db;
                      this.field_db = var3;
                      if (var4 != 0) {
                        break L65;
                      } else {
                        L66: {
                          if ((this.field_jb ^ -1) != -13) {
                            break L66;
                          } else {
                            if (this.field_ib <= 0) {
                              break L65;
                            } else {
                              break L66;
                            }
                          }
                        }
                        this.field_L.a((ml) (this), param0 ^ -55);
                        break L65;
                      }
                    }
                    this.field_lb = var9;
                    this.field_db = var10;
                    if (-1 <= (this.field_ib ^ -1)) {
                      break L63;
                    } else {
                      this.field_L.a(-63, (ml) (this));
                      break L63;
                    }
                  }
                  return;
                } else {
                  break L47;
                }
              }
            }
          }
          this.l(param0 ^ -32759);
          this.field_M = 0;
          return;
        }
    }

    final void a(int param0, boolean param1) {
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
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        if (!this.field_J) {
          L0: {
            L1: {
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
                break L1;
              } else {
                if (3 == var7) {
                  break L1;
                } else {
                  if (var7 != 4) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            var16[2] = 255;
            var16[1] = 255;
            break L0;
          }
          L2: {
            L3: {
              if (1 == var7) {
                break L3;
              } else {
                if (var7 == 3) {
                  break L3;
                } else {
                  if (var7 != 5) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
            }
            var17[2] = 255;
            var17[0] = 255;
            break L2;
          }
          L4: {
            L5: {
              if (-3 == (var7 ^ -1)) {
                break L5;
              } else {
                if ((var7 ^ -1) == -5) {
                  break L5;
                } else {
                  if (var7 != 5) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            var18[0] = 255;
            var18[2] = 255;
            break L4;
          }
          L6: {
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
              break L6;
            } else {
              break L6;
            }
          }
          if (param0 == 12) {
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
                                var12 = this.field_jb;
                                if ((var12 ^ -1) == -41) {
                                  break L16;
                                } else {
                                  if (var12 == 12) {
                                    break L15;
                                  } else {
                                    if (var12 == 39) {
                                      break L14;
                                    } else {
                                      if ((var12 ^ -1) == -14) {
                                        break L13;
                                      } else {
                                        L17: {
                                          if (var12 != 15) {
                                            break L17;
                                          } else {
                                            if (var15 == 0) {
                                              break L12;
                                            } else {
                                              break L17;
                                            }
                                          }
                                        }
                                        L18: {
                                          if ((var12 ^ -1) != -15) {
                                            break L18;
                                          } else {
                                            if (var15 == 0) {
                                              break L11;
                                            } else {
                                              break L18;
                                            }
                                          }
                                        }
                                        L19: {
                                          if (26 != var12) {
                                            break L19;
                                          } else {
                                            if (var15 == 0) {
                                              break L10;
                                            } else {
                                              break L19;
                                            }
                                          }
                                        }
                                        L20: {
                                          if ((var12 ^ -1) != -18) {
                                            break L20;
                                          } else {
                                            if (var15 == 0) {
                                              break L9;
                                            } else {
                                              break L20;
                                            }
                                          }
                                        }
                                        if (27 == var12) {
                                          break L8;
                                        } else {
                                          L21: {
                                            L22: {
                                              L23: {
                                                if (var12 == 22) {
                                                  break L23;
                                                } else {
                                                  if (23 == var12) {
                                                    break L23;
                                                  } else {
                                                    L24: {
                                                      if (-22 != (var12 ^ -1)) {
                                                        break L24;
                                                      } else {
                                                        if (var15 == 0) {
                                                          break L23;
                                                        } else {
                                                          break L24;
                                                        }
                                                      }
                                                    }
                                                    L25: {
                                                      if (24 != var12) {
                                                        break L25;
                                                      } else {
                                                        if (var15 == 0) {
                                                          break L23;
                                                        } else {
                                                          break L25;
                                                        }
                                                      }
                                                    }
                                                    if (-36 == (var12 ^ -1)) {
                                                      break L23;
                                                    } else {
                                                      if ((var12 ^ -1) == -21) {
                                                        break L23;
                                                      } else {
                                                        L26: {
                                                          if ((var12 ^ -1) != -1) {
                                                            break L26;
                                                          } else {
                                                            if (var15 == 0) {
                                                              break L23;
                                                            } else {
                                                              break L26;
                                                            }
                                                          }
                                                        }
                                                        L27: {
                                                          if ((var12 ^ -1) != -17) {
                                                            break L27;
                                                          } else {
                                                            if (var15 == 0) {
                                                              break L23;
                                                            } else {
                                                              break L27;
                                                            }
                                                          }
                                                        }
                                                        L28: {
                                                          if (var12 != 18) {
                                                            break L28;
                                                          } else {
                                                            if (var15 == 0) {
                                                              break L23;
                                                            } else {
                                                              break L28;
                                                            }
                                                          }
                                                        }
                                                        if ((var12 ^ -1) == -39) {
                                                          break L23;
                                                        } else {
                                                          L29: {
                                                            if (-7 != (var12 ^ -1)) {
                                                              break L29;
                                                            } else {
                                                              if (var15 == 0) {
                                                                break L22;
                                                              } else {
                                                                break L29;
                                                              }
                                                            }
                                                          }
                                                          if ((var12 ^ -1) == -26) {
                                                            break L22;
                                                          } else {
                                                            if (11 == var12) {
                                                              break L21;
                                                            } else {
                                                              if (var12 == 4) {
                                                                break L21;
                                                              } else {
                                                                L30: {
                                                                  if (-6 != (var12 ^ -1)) {
                                                                    break L30;
                                                                  } else {
                                                                    if (var15 == 0) {
                                                                      break L21;
                                                                    } else {
                                                                      break L30;
                                                                    }
                                                                  }
                                                                }
                                                                if ((var12 ^ -1) == -2) {
                                                                  break L21;
                                                                } else {
                                                                  if (var12 == 2) {
                                                                    break L21;
                                                                  } else {
                                                                    if ((var12 ^ -1) == -4) {
                                                                      break L21;
                                                                    } else {
                                                                      L31: {
                                                                        if (8 != var12) {
                                                                          break L31;
                                                                        } else {
                                                                          if (var15 == 0) {
                                                                            break L21;
                                                                          } else {
                                                                            break L31;
                                                                          }
                                                                        }
                                                                      }
                                                                      if (var12 == 7) {
                                                                        break L21;
                                                                      } else {
                                                                        L32: {
                                                                          if (-11 != (var12 ^ -1)) {
                                                                            break L32;
                                                                          } else {
                                                                            if (var15 == 0) {
                                                                              break L21;
                                                                            } else {
                                                                              break L32;
                                                                            }
                                                                          }
                                                                        }
                                                                        if (9 == var12) {
                                                                          break L21;
                                                                        } else {
                                                                          if (-29 == (var12 ^ -1)) {
                                                                            break L21;
                                                                          } else {
                                                                            L33: {
                                                                              if (29 != var12) {
                                                                                break L33;
                                                                              } else {
                                                                                if (var15 == 0) {
                                                                                  break L21;
                                                                                } else {
                                                                                  break L33;
                                                                                }
                                                                              }
                                                                            }
                                                                            if (-31 == (var12 ^ -1)) {
                                                                              break L21;
                                                                            } else {
                                                                              if (-32 == (var12 ^ -1)) {
                                                                                break L21;
                                                                              } else {
                                                                                if (32 == var12) {
                                                                                  break L21;
                                                                                } else {
                                                                                  if (-34 == (var12 ^ -1)) {
                                                                                    break L21;
                                                                                  } else {
                                                                                    L34: {
                                                                                      if (var12 != 34) {
                                                                                        break L34;
                                                                                      } else {
                                                                                        if (var15 == 0) {
                                                                                          break L21;
                                                                                        } else {
                                                                                          break L34;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L35: {
                                                                                      if (36 != var12) {
                                                                                        break L35;
                                                                                      } else {
                                                                                        if (var15 == 0) {
                                                                                          break L21;
                                                                                        } else {
                                                                                          break L35;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    if (-38 != (var12 ^ -1)) {
                                                                                      break L23;
                                                                                    } else {
                                                                                      if (var15 == 0) {
                                                                                        break L21;
                                                                                      } else {
                                                                                        break L16;
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
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              L36: {
                                                if (param1) {
                                                  this.field_ib = 250;
                                                  break L36;
                                                } else {
                                                  break L36;
                                                }
                                              }
                                              L37: {
                                                this.field_Y = 32;
                                                if (param1) {
                                                  this.field_w = new qb(this.field_Y, this.field_Y);
                                                  this.field_w.a();
                                                  de.i(this.field_Y >> -2098818207, this.field_Y >> -2034858495, this.field_Y >> -672627263, 16777215);
                                                  break L37;
                                                } else {
                                                  break L37;
                                                }
                                              }
                                              L38: {
                                                var8 = new int[]{var7, var7, var7, var7, var7, var7, var7, 0, 0};
                                                if (this.field_L.field_N != null) {
                                                  var12 = 0;
                                                  L39: while (true) {
                                                    if (var12 >= 6) {
                                                      break L38;
                                                    } else {
                                                      var8[var12] = this.field_L.field_N[var7][var12 - -12];
                                                      var12++;
                                                      if (var15 != 0) {
                                                        break L7;
                                                      } else {
                                                        if (var15 == 0) {
                                                          continue L39;
                                                        } else {
                                                          break L38;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  break L38;
                                                }
                                              }
                                              var9 = new qb[][]{kc.field_kb, jd.field_j, ea.field_u, qe.field_i, hn.field_d, tj.field_A, bo.field_a, h.field_I, fn.field_b};
                                              if (kc.field_kb == null) {
                                                this.field_J = false;
                                                if (var15 == 0) {
                                                  break L7;
                                                } else {
                                                  break L22;
                                                }
                                              } else {
                                                L40: {
                                                  L41: {
                                                    var30 = new qb(64, 96);
                                                    var30.a();
                                                    if (this.field_jb != 16) {
                                                      break L41;
                                                    } else {
                                                      pc.a(var18, 16, var31, var16, (byte) 116, var17, tk.field_x[2], 0);
                                                      if (var15 == 0) {
                                                        break L40;
                                                      } else {
                                                        break L41;
                                                      }
                                                    }
                                                  }
                                                  L42: {
                                                    pc.a(var18, 16, var31, var16, (byte) 78, var17, var9[0][var8[1]], 0);
                                                    pc.a(var18, 32, var31, var16, (byte) -91, var17, var9[4][var8[5]], 0);
                                                    if (-54 == (var8[5] ^ -1)) {
                                                      break L42;
                                                    } else {
                                                      if ((var8[5] ^ -1) != -56) {
                                                        pc.a(var18, 32, var31, var16, (byte) -90, var17, var9[6][var8[6]], 0);
                                                        break L42;
                                                      } else {
                                                        break L42;
                                                      }
                                                    }
                                                  }
                                                  pc.a(var18, 16, var31, var16, (byte) 13, var17, var9[5][var8[4]], 0);
                                                  break L40;
                                                }
                                                L43: {
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
                                                    break L43;
                                                  } else {
                                                    var33.a(16, 16, 0, 2048);
                                                    break L43;
                                                  }
                                                }
                                                L44: {
                                                  this.field_Q.e();
                                                  var34 = new qb(64, 64);
                                                  var34.a();
                                                  pc.a(var18, 0, var31, var16, (byte) -81, var17, var9[8][0], 0);
                                                  this.field_cb = new qb(32, 32);
                                                  this.field_cb.a();
                                                  if (-47 == (var8[0] ^ -1)) {
                                                    break L44;
                                                  } else {
                                                    var34.a(16, 16, 0, 2048);
                                                    break L44;
                                                  }
                                                }
                                                L45: {
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
                                                    this.field_ab = 0;
                                                    break L45;
                                                  } else {
                                                    break L45;
                                                  }
                                                }
                                                L46: {
                                                  if (28 != var8[2]) {
                                                    break L46;
                                                  } else {
                                                    this.field_ab = 1;
                                                    break L46;
                                                  }
                                                }
                                                L47: {
                                                  if (-30 == (var8[2] ^ -1)) {
                                                    this.field_ab = 2;
                                                    break L47;
                                                  } else {
                                                    break L47;
                                                  }
                                                }
                                                L48: {
                                                  if ((var8[2] ^ -1) == -55) {
                                                    L49: {
                                                      this.field_ab = 3;
                                                      var37 = new qb(64, 64);
                                                      var37.a();
                                                      var13 = 32;
                                                      if (this.field_B != null) {
                                                        this.field_B.c(32 + (-(var13 >> 1938536642) - 4), 48 + -var13);
                                                        break L49;
                                                      } else {
                                                        break L49;
                                                      }
                                                    }
                                                    L50: {
                                                      if (this.field_cb == null) {
                                                        break L50;
                                                      } else {
                                                        this.field_cb.c(-(var13 >> -896131295) + 32, -var13 + 48);
                                                        break L50;
                                                      }
                                                    }
                                                    L51: {
                                                      if (this.field_bb != null) {
                                                        this.field_bb.c(-(var13 >> 134101377) + 32, -var13 + 48);
                                                        break L51;
                                                      } else {
                                                        break L51;
                                                      }
                                                    }
                                                    L52: {
                                                      if (null != this.field_I) {
                                                        this.field_I.c(-(var13 >> 85799009) + 32, 48 - var13 * 3 / 2);
                                                        break L52;
                                                      } else {
                                                        break L52;
                                                      }
                                                    }
                                                    L53: {
                                                      if (this.field_Q != null) {
                                                        this.field_Q.c(32 - (var13 >> -795307679), 48 + -var13);
                                                        break L53;
                                                      } else {
                                                        break L53;
                                                      }
                                                    }
                                                    L54: {
                                                      if (null == this.field_fb) {
                                                        break L54;
                                                      } else {
                                                        this.field_fb.c(-4 + -(var13 >> 1583231169) + 32, 48 - var13);
                                                        break L54;
                                                      }
                                                    }
                                                    this.field_cb = null;
                                                    this.field_B = null;
                                                    this.field_bb = var37;
                                                    this.field_Q = null;
                                                    this.field_fb = null;
                                                    break L48;
                                                  } else {
                                                    break L48;
                                                  }
                                                }
                                                this.field_J = true;
                                                break L7;
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
                                            if (var15 == 0) {
                                              break L7;
                                            } else {
                                              break L21;
                                            }
                                          }
                                          L55: {
                                            var10 = this.field_ib;
                                            var11 = fb.field_a;
                                            this.field_ib = 10;
                                            this.field_Y = 24;
                                            if (11 != this.field_jb) {
                                              break L55;
                                            } else {
                                              if (-28 != (this.field_L.a(this.field_u, true).field_jb ^ -1)) {
                                                break L55;
                                              } else {
                                                this.field_ib = 100;
                                                break L55;
                                              }
                                            }
                                          }
                                          L56: {
                                            if (4 != this.field_jb) {
                                              break L56;
                                            } else {
                                              this.field_Y = 32;
                                              this.field_ib = 50;
                                              var11 = bj.field_ob;
                                              break L56;
                                            }
                                          }
                                          L57: {
                                            if (5 == this.field_jb) {
                                              this.field_Y = 64;
                                              var11 = ea.field_v;
                                              this.field_ib = 100;
                                              break L57;
                                            } else {
                                              break L57;
                                            }
                                          }
                                          L58: {
                                            if (1 != this.field_jb) {
                                              break L58;
                                            } else {
                                              this.field_Y = 32;
                                              this.field_ib = 50;
                                              var11 = dh.field_Jb;
                                              break L58;
                                            }
                                          }
                                          L59: {
                                            if ((this.field_jb ^ -1) != -34) {
                                              break L59;
                                            } else {
                                              var11 = jk.field_n;
                                              this.field_Y = 32;
                                              this.field_ib = 40;
                                              break L59;
                                            }
                                          }
                                          L60: {
                                            if (-37 == (this.field_jb ^ -1)) {
                                              this.field_ib = 25;
                                              this.field_Y = 32;
                                              var11 = e.field_I;
                                              if (!lk.a(0, (byte) -127)) {
                                                break L60;
                                              } else {
                                                this.field_U = true;
                                                this.field_ib = 75;
                                                break L60;
                                              }
                                            } else {
                                              break L60;
                                            }
                                          }
                                          L61: {
                                            if (34 != this.field_jb) {
                                              break L61;
                                            } else {
                                              var11 = field_v;
                                              this.field_ib = 25;
                                              this.field_Y = 32;
                                              break L61;
                                            }
                                          }
                                          L62: {
                                            if (-3 == (this.field_jb ^ -1)) {
                                              this.field_Y = 64;
                                              this.field_ib = 100;
                                              var11 = i.field_g;
                                              break L62;
                                            } else {
                                              break L62;
                                            }
                                          }
                                          L63: {
                                            if (-4 == (this.field_jb ^ -1)) {
                                              this.field_Y = 64;
                                              var11 = gb.field_c;
                                              this.field_ib = 75;
                                              break L63;
                                            } else {
                                              break L63;
                                            }
                                          }
                                          L64: {
                                            if (8 == this.field_jb) {
                                              this.field_Y = 48;
                                              this.field_ib = 50;
                                              var11 = pm.field_d;
                                              this.field_U = true;
                                              break L64;
                                            } else {
                                              break L64;
                                            }
                                          }
                                          L65: {
                                            if (-8 == (this.field_jb ^ -1)) {
                                              var11 = ra.field_j;
                                              this.field_Y = 64;
                                              this.field_ib = 100;
                                              break L65;
                                            } else {
                                              break L65;
                                            }
                                          }
                                          L66: {
                                            if (-11 == (this.field_jb ^ -1)) {
                                              this.field_ib = 25;
                                              var11 = oe.field_d;
                                              this.field_Y = 16;
                                              break L66;
                                            } else {
                                              break L66;
                                            }
                                          }
                                          L67: {
                                            if (9 != this.field_jb) {
                                              break L67;
                                            } else {
                                              this.field_ib = 100;
                                              var11 = qj.field_d;
                                              this.field_Y = 64;
                                              break L67;
                                            }
                                          }
                                          L68: {
                                            if (-29 != (this.field_jb ^ -1)) {
                                              break L68;
                                            } else {
                                              this.field_Y = 24;
                                              var11 = g.field_f;
                                              this.field_ib = 40;
                                              break L68;
                                            }
                                          }
                                          L69: {
                                            if ((this.field_jb ^ -1) != -30) {
                                              break L69;
                                            } else {
                                              var11 = c.field_a;
                                              this.field_Y = 48;
                                              this.field_ib = 100;
                                              break L69;
                                            }
                                          }
                                          L70: {
                                            if (this.field_jb != 30) {
                                              break L70;
                                            } else {
                                              var11 = vm.field_g;
                                              this.field_ib = 200;
                                              this.field_Y = 100;
                                              break L70;
                                            }
                                          }
                                          L71: {
                                            if (this.field_jb == 31) {
                                              this.field_Y = 64;
                                              var11 = vk.field_w;
                                              this.field_ib = 100;
                                              break L71;
                                            } else {
                                              break L71;
                                            }
                                          }
                                          L72: {
                                            if (-33 != (this.field_jb ^ -1)) {
                                              break L72;
                                            } else {
                                              this.field_ib = 250;
                                              this.field_Y = 128;
                                              var11 = nj.field_k;
                                              break L72;
                                            }
                                          }
                                          L73: {
                                            if (-38 == (this.field_jb ^ -1)) {
                                              this.field_ib = 50;
                                              var11 = fe.field_h;
                                              this.field_Y = 32;
                                              break L73;
                                            } else {
                                              break L73;
                                            }
                                          }
                                          L74: {
                                            if (param1) {
                                              L75: {
                                                L76: {
                                                  if ((this.field_jb ^ -1) == -8) {
                                                    break L76;
                                                  } else {
                                                    if (this.field_jb != 9) {
                                                      break L75;
                                                    } else {
                                                      break L76;
                                                    }
                                                  }
                                                }
                                                this.field_w = new qb(48, 48);
                                                this.field_w.a();
                                                de.i(24, 24, 24, 16777215);
                                                if (var15 == 0) {
                                                  break L74;
                                                } else {
                                                  break L75;
                                                }
                                              }
                                              this.field_w = new qb(this.field_Y, this.field_Y);
                                              this.field_w.a();
                                              de.i(this.field_Y >> -736443263, this.field_Y >> 1158916129, this.field_Y >> 4413505, 16777215);
                                              break L74;
                                            } else {
                                              break L74;
                                            }
                                          }
                                          L77: {
                                            if (var11 == null) {
                                              this.field_J = false;
                                              break L77;
                                            } else {
                                              L78: {
                                                L79: {
                                                  var38 = new qb(this.field_Y, 3 * this.field_Y / 2);
                                                  var38.a();
                                                  if (this.field_jb == 11) {
                                                    break L79;
                                                  } else {
                                                    if (this.field_jb == 8) {
                                                      break L79;
                                                    } else {
                                                      if (6 == this.field_jb) {
                                                        break L79;
                                                      } else {
                                                        if (this.field_jb == 25) {
                                                          break L79;
                                                        } else {
                                                          if (!this.field_U) {
                                                            break L79;
                                                          } else {
                                                            pc.a(var5, this.field_Y / 2, var6, var3, (byte) -111, var4, var11[6].b(), 0);
                                                            if (var15 == 0) {
                                                              break L78;
                                                            } else {
                                                              break L79;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                pc.a(var5, this.field_Y / 2, var6, var3, (byte) -85, var4, var11[2].b(), 0);
                                                break L78;
                                              }
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
                                              break L77;
                                            }
                                          }
                                          if (!param1) {
                                            this.field_ib = var10;
                                            break L7;
                                          } else {
                                            break L7;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              this.field_Y = 64;
                              this.field_ib = 10;
                              this.field_J = true;
                              this.field_w = new qb(this.field_Y, this.field_Y);
                              this.field_w.a();
                              de.i(32, 32, 10, 16777215);
                              de.i(32, 63, 1, 16777215);
                              if (var15 == 0) {
                                break L7;
                              } else {
                                break L15;
                              }
                            }
                            this.field_J = true;
                            this.field_ib = 75;
                            this.field_z = true;
                            this.field_Y = 256;
                            this.field_w = new qb(this.field_Y, this.field_Y);
                            this.field_w.a();
                            go.field_j[29].a(0, 0);
                            de.d(0, -2 + (go.field_j[29].field_f + go.field_j[29].field_c), this.field_Y, this.field_Y, 0);
                            if (var15 == 0) {
                              break L7;
                            } else {
                              break L14;
                            }
                          }
                          this.field_J = true;
                          this.field_Y = 100;
                          this.field_ib = 100;
                          this.field_w = new qb(this.field_Y, this.field_Y);
                          this.field_w.a();
                          de.i(this.field_Y >> 1554575329, this.field_Y >> -1371289439, this.field_Y >> -1607789759, 16777215);
                          if (var15 == 0) {
                            break L7;
                          } else {
                            break L13;
                          }
                        }
                        this.field_J = true;
                        this.field_ib = 200;
                        this.field_Y = 100;
                        this.field_w = new qb(this.field_Y, this.field_Y);
                        this.field_w.a();
                        de.i(this.field_Y >> -917470591, this.field_Y >> 1685513953, this.field_Y >> -100393279, 16777215);
                        if (var15 == 0) {
                          break L7;
                        } else {
                          break L12;
                        }
                      }
                      this.field_J = true;
                      this.field_Y = 100;
                      this.field_ib = 150;
                      this.field_w = new qb(this.field_Y, this.field_Y);
                      this.field_w.a();
                      de.i(this.field_Y >> 1785854017, this.field_Y >> 632717025, this.field_Y >> -2070527903, 16777215);
                      if (var15 == 0) {
                        break L7;
                      } else {
                        break L11;
                      }
                    }
                    this.field_ib = 150;
                    this.field_J = true;
                    this.field_Y = 100;
                    this.field_w = new qb(this.field_Y, this.field_Y);
                    this.field_w.a();
                    de.i(this.field_Y >> -2001765119, this.field_Y >> 614805185, this.field_Y >> 888971745, 16777215);
                    if (var15 == 0) {
                      break L7;
                    } else {
                      break L10;
                    }
                  }
                  this.field_Y = 100;
                  this.field_ib = 150;
                  this.field_J = true;
                  this.field_w = new qb(this.field_Y, this.field_Y);
                  this.field_w.a();
                  de.i(this.field_Y >> -2112440895, this.field_Y >> 1238221953, this.field_Y >> 378147425, 16777215);
                  if (var15 == 0) {
                    break L7;
                  } else {
                    break L9;
                  }
                }
                this.field_Y = 80;
                this.field_J = true;
                this.field_ib = 100;
                this.field_w = new qb(this.field_Y, this.field_Y);
                this.field_w.a();
                de.i(this.field_Y >> 917242145, this.field_Y >> -1507659583, this.field_Y >> -1190423839, 16777215);
                if (var15 == 0) {
                  break L7;
                } else {
                  break L8;
                }
              }
              L80: {
                this.field_Y = 64;
                if (param1) {
                  this.field_ib = 250;
                  break L80;
                } else {
                  break L80;
                }
              }
              L81: {
                this.field_ab = 2;
                if (!param1) {
                  break L81;
                } else {
                  this.field_w = new qb(this.field_Y, this.field_Y);
                  this.field_w.a();
                  de.i(this.field_Y >> 1889445345, this.field_Y >> -487186783, this.field_Y >> -671284735, 16777215);
                  break L81;
                }
              }
              L82: {
                L83: {
                  var24 = new int[]{28, 0, 29, 33, 47, 50, var7, 0, 0};
                  var13_ref_qb____ = new qb[][]{kc.field_kb, jd.field_j, ea.field_u, qe.field_i, hn.field_d, tj.field_A, bo.field_a, h.field_I, fn.field_b};
                  if (kc.field_kb != null) {
                    break L83;
                  } else {
                    this.field_J = false;
                    if (var15 == 0) {
                      break L82;
                    } else {
                      break L83;
                    }
                  }
                }
                L84: {
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
                    break L84;
                  } else {
                    if ((var24[5] ^ -1) == -56) {
                      break L84;
                    } else {
                      pc.a(var20, 32, var21, var22, (byte) 74, var23, var13_ref_qb____[6][var24[6]], 0);
                      break L84;
                    }
                  }
                }
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
                break L82;
              }
              break L7;
            }
            L85: {
              if (!param1) {
                break L85;
              } else {
                this.field_p = this.field_ib;
                this.field_Y = this.field_w.field_n;
                this.e((byte) 6);
                break L85;
              }
            }
            return;
          } else {
            return;
          }
        } else {
          return;
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
        boolean discarded$0 = false;
        this.field_M = param1;
        if (param0 != 0) {
            discarded$0 = this.t(8);
        }
    }

    private final boolean u(int param0) {
        int stackIn_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_12_0 = 0;
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
                stackOut_11_0 = 1;
                stackIn_13_0 = stackOut_11_0;
                break L0;
              }
            }
            stackOut_12_0 = 0;
            stackIn_13_0 = stackOut_12_0;
            break L0;
          }
          return stackIn_13_0 != 0;
        } else {
          return true;
        }
    }

    final boolean e(int param0) {
        boolean discarded$0 = false;
        if (param0 < 118) {
            discarded$0 = this.f(false);
        }
        if (!this.field_z) {
            if (!this.field_hb) {
                return false;
            }
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
        boolean discarded$1 = false;
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
        L0: {
          var7 = ArcanistsMulti.field_G ? 1 : 0;
          if (!this.t(57)) {
            break L0;
          } else {
            if ((this.field_L.field_x[this.field_u] ^ -1) != -5) {
              break L0;
            } else {
              if ((this.field_L.field_X[this.field_u] ^ -1) >= -1) {
                break L0;
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
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (-1 <= ((this.field_L.field_X[this.field_u] - 1) % 5 + (1 - (-1 + this.field_L.field_X[this.field_u]) / 5) ^ -1)) {
                          break L3;
                        } else {
                          this.field_L.field_X[this.field_u] = this.field_L.field_X[this.field_u] + 5;
                          if (var7 != 0) {
                            break L2;
                          } else {
                            if (var7 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      this.field_z = true;
                      break L2;
                    }
                    return;
                  }
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L4: {
          if (-28 != (this.field_jb ^ -1)) {
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (!this.t(109)) {
            break L5;
          } else {
            L6: {
              if (null == this.field_L.field_Ib) {
                break L6;
              } else {
                L7: {
                  discarded$1 = this.field_L.field_Ib.a(0, this.field_T);
                  var4_ref_String = this.field_L.field_Ib.a((byte) 127, param0);
                  this.field_L.field_Ib.a(0, 0, var4_ref_String, this.field_T);
                  var5 = this.field_G;
                  var6 = null;
                  if (var5 < 0) {
                    break L7;
                  } else {
                    if (tc.field_w.length > var5) {
                      var6 = tc.field_w[var5];
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (var6 != null) {
                    break L8;
                  } else {
                    var6 = "(unknown" + var5 + ")";
                    break L8;
                  }
                }
                this.field_L.field_Ib.a(1, 0, (String) (var6), this.field_T);
                break L6;
              }
            }
            L9: {
              if (this.field_T == param0) {
                break L9;
              } else {
                this.field_L.field_U[param0] = this.field_L.field_U[param0] + 1;
                if (var7 == 0) {
                  break L5;
                } else {
                  break L9;
                }
              }
            }
            this.field_L.field_U[param0] = this.field_L.field_U[param0] - 1;
            break L5;
          }
        }
        L10: {
          if (-37 != (this.field_jb ^ -1)) {
            break L10;
          } else {
            if ((this.field_L.field_H ^ -1) >= (this.field_db ^ -1)) {
              break L10;
            } else {
              this.field_L.field_b[param0] = this.field_L.field_b[param0] + 1;
              break L10;
            }
          }
        }
        this.a((byte) 89, 1);
        this.field_L.a((ml) (this), 0);
        if (param1 >= 4) {
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
                                            L28: {
                                              L29: {
                                                L30: {
                                                  L31: {
                                                    L32: {
                                                      L33: {
                                                        L34: {
                                                          L35: {
                                                            L36: {
                                                              L37: {
                                                                var4 = this.field_jb;
                                                                if (var4 == 40) {
                                                                  break L37;
                                                                } else {
                                                                  L38: {
                                                                    if ((var4 ^ -1) != -1) {
                                                                      break L38;
                                                                    } else {
                                                                      if (var7 == 0) {
                                                                        break L36;
                                                                      } else {
                                                                        break L38;
                                                                      }
                                                                    }
                                                                  }
                                                                  if (-28 == (var4 ^ -1)) {
                                                                    break L36;
                                                                  } else {
                                                                    if (3 == var4) {
                                                                      break L35;
                                                                    } else {
                                                                      L39: {
                                                                        if (7 != var4) {
                                                                          break L39;
                                                                        } else {
                                                                          if (var7 == 0) {
                                                                            break L34;
                                                                          } else {
                                                                            break L39;
                                                                          }
                                                                        }
                                                                      }
                                                                      if (1 == var4) {
                                                                        break L33;
                                                                      } else {
                                                                        if (var4 == 5) {
                                                                          break L32;
                                                                        } else {
                                                                          L40: {
                                                                            if (-3 != (var4 ^ -1)) {
                                                                              break L40;
                                                                            } else {
                                                                              if (var7 == 0) {
                                                                                break L31;
                                                                              } else {
                                                                                break L40;
                                                                              }
                                                                            }
                                                                          }
                                                                          L41: {
                                                                            if (var4 != 11) {
                                                                              break L41;
                                                                            } else {
                                                                              if (var7 == 0) {
                                                                                break L30;
                                                                              } else {
                                                                                break L41;
                                                                              }
                                                                            }
                                                                          }
                                                                          if (-10 == (var4 ^ -1)) {
                                                                            break L29;
                                                                          } else {
                                                                            if ((var4 ^ -1) == -18) {
                                                                              break L28;
                                                                            } else {
                                                                              if (var4 == 10) {
                                                                                break L27;
                                                                              } else {
                                                                                L42: {
                                                                                  if ((var4 ^ -1) != -7) {
                                                                                    break L42;
                                                                                  } else {
                                                                                    if (var7 == 0) {
                                                                                      break L26;
                                                                                    } else {
                                                                                      break L42;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L43: {
                                                                                  if (var4 != 25) {
                                                                                    break L43;
                                                                                  } else {
                                                                                    if (var7 == 0) {
                                                                                      break L25;
                                                                                    } else {
                                                                                      break L43;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                if (-5 == (var4 ^ -1)) {
                                                                                  break L24;
                                                                                } else {
                                                                                  if ((var4 ^ -1) == -9) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    L44: {
                                                                                      if ((var4 ^ -1) != -14) {
                                                                                        break L44;
                                                                                      } else {
                                                                                        if (var7 == 0) {
                                                                                          break L22;
                                                                                        } else {
                                                                                          break L44;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    if (37 == var4) {
                                                                                      break L21;
                                                                                    } else {
                                                                                      if (-40 == (var4 ^ -1)) {
                                                                                        break L20;
                                                                                      } else {
                                                                                        if ((var4 ^ -1) == -16) {
                                                                                          break L19;
                                                                                        } else {
                                                                                          L45: {
                                                                                            if (var4 != 14) {
                                                                                              break L45;
                                                                                            } else {
                                                                                              if (var7 == 0) {
                                                                                                break L18;
                                                                                              } else {
                                                                                                break L45;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          L46: {
                                                                                            if (-27 != (var4 ^ -1)) {
                                                                                              break L46;
                                                                                            } else {
                                                                                              if (var7 == 0) {
                                                                                                break L17;
                                                                                              } else {
                                                                                                break L46;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          if (var4 == 12) {
                                                                                            break L16;
                                                                                          } else {
                                                                                            if ((var4 ^ -1) == -34) {
                                                                                              break L15;
                                                                                            } else {
                                                                                              if (var4 == 31) {
                                                                                                break L15;
                                                                                              } else {
                                                                                                if ((var4 ^ -1) == -30) {
                                                                                                  break L14;
                                                                                                } else {
                                                                                                  L47: {
                                                                                                    if ((var4 ^ -1) != -31) {
                                                                                                      break L47;
                                                                                                    } else {
                                                                                                      if (var7 == 0) {
                                                                                                        break L14;
                                                                                                      } else {
                                                                                                        break L47;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                  L48: {
                                                                                                    if (28 != var4) {
                                                                                                      break L48;
                                                                                                    } else {
                                                                                                      if (var7 == 0) {
                                                                                                        break L14;
                                                                                                      } else {
                                                                                                        break L48;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                  if (-33 == (var4 ^ -1)) {
                                                                                                    break L14;
                                                                                                  } else {
                                                                                                    if ((var4 ^ -1) == -35) {
                                                                                                      break L13;
                                                                                                    } else {
                                                                                                      if (var4 != 36) {
                                                                                                        break L11;
                                                                                                      } else {
                                                                                                        if (var7 == 0) {
                                                                                                          break L12;
                                                                                                        } else {
                                                                                                          break L37;
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
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              var10 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 101, this.field_L, this.field_lb);
                                                              this.field_L.b(52, var10);
                                                              if (var7 == 0) {
                                                                break L11;
                                                              } else {
                                                                break L36;
                                                              }
                                                            }
                                                            this.b(-30225, 53);
                                                            var11 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 101, this.field_L, this.field_lb);
                                                            this.field_L.b(52, var11);
                                                            if (var7 == 0) {
                                                              break L11;
                                                            } else {
                                                              break L35;
                                                            }
                                                          }
                                                          var12 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 99, this.field_L, this.field_lb);
                                                          this.field_L.b(52, var12);
                                                          if (var7 == 0) {
                                                            break L11;
                                                          } else {
                                                            break L34;
                                                          }
                                                        }
                                                        var13 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 103, this.field_L, this.field_lb);
                                                        this.field_L.b(52, var13);
                                                        if (var7 == 0) {
                                                          break L11;
                                                        } else {
                                                          break L33;
                                                        }
                                                      }
                                                      var14 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 89, this.field_L, this.field_lb);
                                                      this.field_L.b(52, var14);
                                                      if (var7 == 0) {
                                                        break L11;
                                                      } else {
                                                        break L32;
                                                      }
                                                    }
                                                    var15 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 94, this.field_L, this.field_lb);
                                                    this.field_L.b(52, var15);
                                                    if (var7 == 0) {
                                                      break L11;
                                                    } else {
                                                      break L31;
                                                    }
                                                  }
                                                  var16 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 89, this.field_L, this.field_lb);
                                                  this.field_L.b(52, var16);
                                                  if (var7 == 0) {
                                                    break L11;
                                                  } else {
                                                    break L30;
                                                  }
                                                }
                                                var17 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 101, this.field_L, this.field_lb);
                                                this.field_L.b(52, var17);
                                                if (var7 == 0) {
                                                  break L11;
                                                } else {
                                                  break L29;
                                                }
                                              }
                                              var18 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 108, this.field_L, this.field_lb);
                                              this.field_L.b(52, var18);
                                              if (var7 == 0) {
                                                break L11;
                                              } else {
                                                break L28;
                                              }
                                            }
                                            L49: {
                                              if (this.field_U) {
                                                break L49;
                                              } else {
                                                var19 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 108, this.field_L, this.field_lb);
                                                this.field_L.b(52, var19);
                                                if (var7 == 0) {
                                                  break L11;
                                                } else {
                                                  break L49;
                                                }
                                              }
                                            }
                                            var20 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 103, this.field_L, this.field_lb);
                                            this.field_L.b(52, var20);
                                            if (var7 == 0) {
                                              break L11;
                                            } else {
                                              break L27;
                                            }
                                          }
                                          var21 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 108, this.field_L, this.field_lb);
                                          this.field_L.b(52, var21);
                                          if (var7 == 0) {
                                            break L11;
                                          } else {
                                            break L26;
                                          }
                                        }
                                        var22 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 103, this.field_L, this.field_lb);
                                        this.field_L.b(52, var22);
                                        if (var7 == 0) {
                                          break L11;
                                        } else {
                                          break L25;
                                        }
                                      }
                                      var23 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 99, this.field_L, this.field_lb);
                                      this.field_L.b(52, var23);
                                      if (var7 == 0) {
                                        break L11;
                                      } else {
                                        break L24;
                                      }
                                    }
                                    var24 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 94, this.field_L, this.field_lb);
                                    this.field_L.b(52, var24);
                                    if (var7 == 0) {
                                      break L11;
                                    } else {
                                      break L23;
                                    }
                                  }
                                  var25 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 103, this.field_L, this.field_lb);
                                  this.field_L.b(52, var25);
                                  if (var7 == 0) {
                                    break L11;
                                  } else {
                                    break L22;
                                  }
                                }
                                var26 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 85, this.field_L, this.field_lb);
                                this.field_L.b(52, var26);
                                if (var7 == 0) {
                                  break L11;
                                } else {
                                  break L21;
                                }
                              }
                              var27 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 163, this.field_L, this.field_lb);
                              this.field_L.b(52, var27);
                              if (var7 == 0) {
                                break L11;
                              } else {
                                break L20;
                              }
                            }
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
                              break L11;
                            } else {
                              break L19;
                            }
                          }
                          var33 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 94, this.field_L, this.field_lb);
                          this.field_L.b(52, var33);
                          if (var7 == 0) {
                            break L11;
                          } else {
                            break L18;
                          }
                        }
                        var34 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 99, this.field_L, this.field_lb);
                        this.field_L.b(52, var34);
                        if (var7 == 0) {
                          break L11;
                        } else {
                          break L17;
                        }
                      }
                      var35 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 103, this.field_L, this.field_lb);
                      this.field_L.b(52, var35);
                      if (var7 == 0) {
                        break L11;
                      } else {
                        break L16;
                      }
                    }
                    this.field_L.a(this.field_db + -256, -60, this.field_lb + -128, go.field_j[29].b());
                    if (var7 == 0) {
                      break L11;
                    } else {
                      break L15;
                    }
                  }
                  var36 = aj.a((ml) null, this.field_db + -(this.field_Y / 2), false, 154, this.field_L, this.field_lb);
                  this.field_L.b(52, var36);
                  if (var7 == 0) {
                    break L11;
                  } else {
                    break L14;
                  }
                }
                var37 = aj.a((ml) null, this.field_db - this.field_Y / 2, false, 130, this.field_L, this.field_lb);
                this.field_L.b(52, var37);
                if (var7 == 0) {
                  break L11;
                } else {
                  break L13;
                }
              }
              var38 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 146, this.field_L, this.field_lb);
              this.field_L.b(52, var38);
              var38.field_y = 250;
              if (var7 == 0) {
                break L11;
              } else {
                break L12;
              }
            }
            var39 = aj.a((ml) null, -(this.field_Y / 2) + this.field_db, false, 128, this.field_L, this.field_lb);
            this.field_L.b(52, var39);
            break L11;
          }
          this.a(true);
          this.a((byte) 88);
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0, int param1, int param2) {
        fk discarded$0 = null;
        if (param0 > -35) {
            this.field_n = -119;
        }
        if (!(null == this.field_L.field_rb)) {
            if (!(null == this.field_L.field_rb[param2])) {
                discarded$0 = ii.a(param1, false, this.field_L.field_rb[param2], 100 * tm.field_a[param2] / param1);
            }
        }
    }

    final boolean x(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
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
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    private final void h(int param0) {
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
        int var4 = 0;
        if (param1 == 0) {
          return;
        } else {
          L0: {
            if (param1 <= 0) {
              break L0;
            } else {
              if (param1 > this.field_W) {
                this.field_W = param1;
                this.field_G = param2;
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            L2: {
              var4 = 79 % ((53 - param0) / 56);
              if (this.field_jb == 32) {
                break L2;
              } else {
                if ((this.field_jb ^ -1) != -28) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            param1 = (param1 + -1) / 2 + 1;
            break L1;
          }
          this.field_x = this.field_x + param1;
          return;
        }
    }

    private final void b(int param0, int param1) {
        fk discarded$0 = null;
        if (param0 != -30225) {
            return;
        }
        if (!(this.field_L.field_rb == null)) {
            if (!(null == this.field_L.field_rb[param1])) {
                discarded$0 = ti.a((byte) -30, tm.field_a[param1], this.field_L.field_rb[param1]);
            }
        }
    }

    private final void h(byte param0) {
        int var2 = 0;
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
        ml stackIn_23_0 = null;
        ml stackIn_28_0 = null;
        boolean stackIn_64_0 = false;
        boolean stackIn_65_0 = false;
        boolean stackIn_66_0 = false;
        int stackIn_66_1 = 0;
        Object stackIn_116_0 = null;
        Object stackIn_117_0 = null;
        Object stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        ml stackOut_22_0 = null;
        Object stackOut_27_0 = null;
        boolean stackOut_63_0 = false;
        boolean stackOut_65_0 = false;
        int stackOut_65_1 = 0;
        boolean stackOut_64_0 = false;
        int stackOut_64_1 = 0;
        Object stackOut_115_0 = null;
        Object stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        Object stackOut_116_0 = null;
        int stackOut_116_1 = 0;
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
          stackOut_27_0 = this;
          stackIn_28_0 = (ml) ((Object) stackOut_27_0);
          break L2;
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
                        stackOut_63_0 = this.field_s.field_U;
                        stackIn_65_0 = stackOut_63_0;
                        stackIn_64_0 = stackOut_63_0;
                        if (this.field_U) {
                          stackOut_65_0 = stackIn_65_0;
                          stackOut_65_1 = 0;
                          stackIn_66_0 = stackOut_65_0;
                          stackIn_66_1 = stackOut_65_1;
                          break L20;
                        } else {
                          stackOut_64_0 = stackIn_64_0;
                          stackOut_64_1 = 1;
                          stackIn_66_0 = stackOut_64_0;
                          stackIn_66_1 = stackOut_64_1;
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
                          stackOut_115_0 = this;
                          stackIn_117_0 = stackOut_115_0;
                          stackIn_116_0 = stackOut_115_0;
                          if (-1 < (this.field_kb ^ -1)) {
                            stackOut_117_0 = this;
                            stackOut_117_1 = -5;
                            stackIn_118_0 = stackOut_117_0;
                            stackIn_118_1 = stackOut_117_1;
                            break L39;
                          } else {
                            stackOut_116_0 = this;
                            stackOut_116_1 = 5;
                            stackIn_118_0 = stackOut_116_0;
                            stackIn_118_1 = stackOut_116_1;
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
        RuntimeException var3 = null;
        ml var4 = null;
        ml stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        ml stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
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
                  stackOut_10_0 = (ml) (var4);
                  stackIn_11_0 = stackOut_10_0;
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
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("ml.G(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
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
        int stackIn_29_0 = 0;
        boolean stackIn_56_0 = false;
        boolean stackIn_62_0 = false;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        boolean stackOut_55_0 = false;
        boolean stackOut_61_0 = false;
        L0: {
          L1: {
            var11 = ArcanistsMulti.field_G ? 1 : 0;
            var2 = this.g((byte) 117) ? 1 : 0;
            var3 = this.d(-10265) ? 1 : 0;
            var4 = this.x(32) ? 1 : 0;
            var5 = 0;
            if (this.field_jb == 28) {
              break L1;
            } else {
              if (29 == this.field_jb) {
                break L1;
              } else {
                if ((this.field_jb ^ -1) == -31) {
                  break L1;
                } else {
                  if (-33 == (this.field_jb ^ -1)) {
                    break L1;
                  } else {
                    if (-8 != (this.field_L.field_x[this.field_u] ^ -1)) {
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
          if (0 > this.field_lb) {
            break L0;
          } else {
            if (this.field_lb > this.field_L.field_y) {
              break L0;
            } else {
              var5 = 1;
              break L0;
            }
          }
        }
        L2: {
          if (var3 != 0) {
            break L2;
          } else {
            if (this.field_L.a(61, this.field_w, -this.field_Y + this.field_db - -1, -(this.field_Y >> 856517889) + this.field_lb, this.field_db - this.field_Y)) {
              break L2;
            } else {
              L3: {
                if (var5 == 0) {
                  break L3;
                } else {
                  if (this.field_db >= -16 + this.field_L.field_H) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_P = 0;
              this.field_eb = 0;
              this.field_kb = 0;
              this.field_z = true;
              break L2;
            }
          }
        }
        L4: {
          if ((-16 + this.field_L.field_H ^ -1) < (this.field_db ^ -1)) {
            break L4;
          } else {
            if (var5 != 0) {
              this.field_db = -16 + this.field_L.field_H;
              this.field_A = 0;
              this.field_R = this.field_db << 515846852;
              this.field_z = false;
              break L4;
            } else {
              break L4;
            }
          }
        }
        if (this.e(true)) {
          return;
        } else {
          L5: {
            if (this.field_z) {
              this.field_M = 0;
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if ((this.field_M ^ -1) != -1) {
              stackOut_28_0 = 0;
              stackIn_29_0 = stackOut_28_0;
              break L6;
            } else {
              stackOut_27_0 = 1;
              stackIn_29_0 = stackOut_27_0;
              break L6;
            }
          }
          L7: {
            var6 = stackIn_29_0;
            if (-1 == (this.field_M ^ -1)) {
              L8: {
                if ((this.field_jb ^ -1) == -41) {
                  break L8;
                } else {
                  L9: {
                    if ((this.field_ab ^ -1) != -4) {
                      break L9;
                    } else {
                      if ((this.field_jb ^ -1) != -1) {
                        break L9;
                      } else {
                        this.field_F = this.field_F * 0.9;
                        if (var11 == 0) {
                          break L7;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  this.field_F = 0.0;
                  if (var11 == 0) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              this.field_F = this.field_F + 0.1;
              if (6.283185307179586 >= this.field_F) {
                break L7;
              } else {
                this.field_F = this.field_F - 6.283185307179586;
                break L7;
              }
            } else {
              break L7;
            }
          }
          L10: {
            if (var2 != 0) {
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
              L16: {
                L17: {
                  if (8 <= var9) {
                    break L17;
                  } else {
                    stackOut_55_0 = this.field_L.b(-this.field_Y + var8, 2, -(this.field_Y >> 1393985441) + var7, this.field_w);
                    stackIn_62_0 = stackOut_55_0;
                    stackIn_56_0 = stackOut_55_0;
                    if (var11 != 0) {
                      break L16;
                    } else {
                      L18: {
                        L19: {
                          if (stackIn_56_0) {
                            break L19;
                          } else {
                            var8++;
                            if (var11 == 0) {
                              break L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        var8--;
                        break L18;
                      }
                      var9++;
                      if (var11 == 0) {
                        continue L15;
                      } else {
                        break L17;
                      }
                    }
                  }
                }
                stackOut_61_0 = this.field_L.b(this.field_db - this.field_Y, 2, this.field_lb - (this.field_Y >> 2141450113), this.field_w);
                stackIn_62_0 = stackOut_61_0;
                break L16;
              }
              L20: {
                if (!stackIn_62_0) {
                  break L20;
                } else {
                  var8--;
                  break L20;
                }
              }
              L21: {
                this.field_kb = 0;
                this.field_eb = 0;
                if (var5 == 0) {
                  break L21;
                } else {
                  if ((-16 + this.field_L.field_H ^ -1) < (this.field_db ^ -1)) {
                    break L21;
                  } else {
                    if ((this.field_db ^ -1) > (var8 ^ -1)) {
                      var8 = this.field_db;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                }
              }
              L22: {
                if (-1 >= (-this.field_Y + var8 ^ -1)) {
                  break L22;
                } else {
                  var8 = -100;
                  this.field_L.field_G = 25;
                  break L22;
                }
              }
              L23: {
                L24: {
                  if (Math.abs(-this.field_db + var8) >= 5) {
                    break L24;
                  } else {
                    L25: {
                      if ((var7 ^ -1) == (this.field_lb ^ -1)) {
                        break L25;
                      } else {
                        if (this.field_s == null) {
                          this.field_L.field_Ob[this.field_T] = this.field_L.field_Ob[this.field_T] + 1;
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                    }
                    L26: {
                      L27: {
                        L28: {
                          this.field_lb = var7;
                          if ((this.field_ab ^ -1) != -4) {
                            break L28;
                          } else {
                            if ((this.field_jb ^ -1) == -1) {
                              break L27;
                            } else {
                              break L28;
                            }
                          }
                        }
                        this.field_F = this.field_F + 0.4;
                        if (var11 == 0) {
                          break L26;
                        } else {
                          break L27;
                        }
                      }
                      this.field_F = this.field_F + 0.1;
                      break L26;
                    }
                    L29: {
                      this.field_db = var8;
                      if ((this.field_Y ^ -1) < -91) {
                        break L29;
                      } else {
                        if (this.field_jb == 31) {
                          break L29;
                        } else {
                          break L23;
                        }
                      }
                    }
                    this.field_F = this.field_F - 0.3;
                    if (var11 == 0) {
                      break L23;
                    } else {
                      break L24;
                    }
                  }
                }
                L30: {
                  L31: {
                    if (var8 <= this.field_db) {
                      break L31;
                    } else {
                      if (this.field_jb != 38) {
                        break L30;
                      } else {
                        break L31;
                      }
                    }
                  }
                  if (this.field_db >= var8) {
                    break L23;
                  } else {
                    if (38 != this.field_jb) {
                      break L23;
                    } else {
                      L32: {
                        this.field_lb = var7;
                        this.field_F = this.field_F + 0.4;
                        if (90 < this.field_Y) {
                          break L32;
                        } else {
                          if (31 == this.field_jb) {
                            break L32;
                          } else {
                            break L23;
                          }
                        }
                      }
                      this.field_F = this.field_F - 0.3;
                      if (var11 == 0) {
                        break L23;
                      } else {
                        break L30;
                      }
                    }
                  }
                }
                this.field_kb = 16 * this.field_M;
                this.field_z = true;
                this.field_eb = -16;
                if ((this.field_jb ^ -1) != -37) {
                  break L23;
                } else {
                  L33: {
                    if (!this.field_U) {
                      break L33;
                    } else {
                      if (lk.a(0, (byte) -61)) {
                        break L33;
                      } else {
                        break L23;
                      }
                    }
                  }
                  this.field_kb = 0;
                  break L23;
                }
              }
              this.field_X = this.field_lb << 1148909796;
              this.field_R = this.field_db << -770209884;
              this.field_M = 0;
              if (var4 == 0) {
                break L13;
              } else {
                if ((this.field_s.field_q ^ -1) >= -1) {
                  L34: {
                    this.field_L.a(this.field_s, 0);
                    var9 = -this.field_lb + this.field_s.field_lb;
                    var10 = this.field_Y / 2 + (-this.field_db + (this.field_s.field_db - this.field_s.field_Y / 2));
                    if (!this.field_s.field_z) {
                      break L34;
                    } else {
                      if (0 > this.field_s.field_eb) {
                        break L13;
                      } else {
                        break L34;
                      }
                    }
                  }
                  if (((this.field_s.field_Y + this.field_Y) * (this.field_s.field_Y + this.field_Y) >> 1399913218 ^ -1) < (var9 * var9 + var10 * var10 ^ -1)) {
                    L35: {
                      this.field_s.field_X = -(this.field_E * (this.field_Y << -1146742303)) + this.field_X;
                      this.field_s.field_R = -(this.field_Y << 739612003) + this.field_R;
                      if (32 >= this.field_s.field_Y) {
                        break L35;
                      } else {
                        this.field_s.field_R = this.field_s.field_R + 192;
                        this.field_s.field_X = this.field_s.field_X + 0 * this.field_E;
                        break L35;
                      }
                    }
                    L36: {
                      if (-33 == (this.field_jb ^ -1)) {
                        this.field_s.field_R = this.field_s.field_R - 480;
                        this.field_s.field_X = this.field_s.field_X + this.field_E * 448;
                        break L36;
                      } else {
                        break L36;
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
            }
          }
          L37: {
            if (2 != this.field_M) {
              break L37;
            } else {
              L38: {
                if (null != this.field_s) {
                  break L38;
                } else {
                  this.field_L.field_c[this.field_T] = this.field_L.field_c[this.field_T] + 1;
                  break L38;
                }
              }
              L39: {
                this.field_kb = this.field_E * 64;
                this.field_eb = -96;
                if (-5 == (this.field_jb ^ -1)) {
                  this.field_eb = -128;
                  this.field_kb = 96 * this.field_E;
                  break L39;
                } else {
                  break L39;
                }
              }
              L40: {
                L41: {
                  if (5 == this.field_jb) {
                    break L41;
                  } else {
                    if (-32 != (this.field_jb ^ -1)) {
                      break L40;
                    } else {
                      break L41;
                    }
                  }
                }
                this.field_eb = -64;
                break L40;
              }
              L42: {
                if ((this.field_jb ^ -1) == -2) {
                  this.field_kb = 96 * this.field_E;
                  this.field_eb = -32;
                  break L42;
                } else {
                  break L42;
                }
              }
              L43: {
                L44: {
                  if ((this.field_jb ^ -1) == -3) {
                    break L44;
                  } else {
                    if (32 == this.field_jb) {
                      break L44;
                    } else {
                      break L43;
                    }
                  }
                }
                this.field_eb = -32;
                break L43;
              }
              L45: {
                L46: {
                  if (7 == this.field_jb) {
                    break L46;
                  } else {
                    if (-10 == (this.field_jb ^ -1)) {
                      break L46;
                    } else {
                      break L45;
                    }
                  }
                }
                this.field_eb = -32;
                break L45;
              }
              L47: {
                if (var3 == 0) {
                  break L47;
                } else {
                  this.field_eb = -64;
                  break L47;
                }
              }
              L48: {
                if (-4 == (this.field_L.field_x[this.field_u] ^ -1)) {
                  L49: {
                    var7 = this.field_L.field_X[this.field_u] / 20;
                    this.field_kb = this.field_kb + 8 * (var7 * this.field_E);
                    this.field_eb = this.field_eb - 8 * var7;
                    if (96 < this.field_kb * this.field_E) {
                      this.field_kb = this.field_E * 96;
                      break L49;
                    } else {
                      break L49;
                    }
                  }
                  if ((this.field_eb ^ -1) <= 127) {
                    break L48;
                  } else {
                    this.field_eb = -128;
                    break L48;
                  }
                } else {
                  break L48;
                }
              }
              L50: {
                if (36 != this.field_jb) {
                  break L50;
                } else {
                  L51: {
                    if (!this.field_U) {
                      break L51;
                    } else {
                      if (!lk.a(0, (byte) -88)) {
                        break L50;
                      } else {
                        break L51;
                      }
                    }
                  }
                  this.field_kb = 0;
                  this.field_eb = -32;
                  break L50;
                }
              }
              this.field_M = 0;
              this.field_z = true;
              this.field_P = 0;
              this.b(-30225, 49);
              break L37;
            }
          }
          L52: {
            if ((this.field_M ^ -1) != -4) {
              break L52;
            } else {
              L53: {
                if (this.field_s == null) {
                  this.field_L.field_c[this.field_T] = this.field_L.field_c[this.field_T] + 1;
                  break L53;
                } else {
                  break L53;
                }
              }
              L54: {
                this.field_kb = this.field_E * 16;
                this.field_eb = -128;
                if (4 == this.field_jb) {
                  this.field_eb = -148;
                  break L54;
                } else {
                  break L54;
                }
              }
              L55: {
                L56: {
                  if (-6 == (this.field_jb ^ -1)) {
                    break L56;
                  } else {
                    if (this.field_jb != 31) {
                      break L55;
                    } else {
                      break L56;
                    }
                  }
                }
                this.field_eb = -96;
                break L55;
              }
              L57: {
                if (-2 == (this.field_jb ^ -1)) {
                  this.field_eb = -64;
                  break L57;
                } else {
                  break L57;
                }
              }
              L58: {
                if (2 != this.field_jb) {
                  break L58;
                } else {
                  this.field_eb = -48;
                  break L58;
                }
              }
              L59: {
                L60: {
                  if (this.field_jb == 7) {
                    break L60;
                  } else {
                    if (-10 == (this.field_jb ^ -1)) {
                      break L60;
                    } else {
                      break L59;
                    }
                  }
                }
                this.field_eb = -64;
                break L59;
              }
              L61: {
                if (var3 != 0) {
                  this.field_kb = 32 * this.field_E;
                  this.field_eb = -128;
                  break L61;
                } else {
                  break L61;
                }
              }
              L62: {
                if ((this.field_L.field_x[this.field_u] ^ -1) != -4) {
                  break L62;
                } else {
                  L63: {
                    var7 = this.field_L.field_X[this.field_u] / 20;
                    this.field_eb = this.field_eb - 8 * var7;
                    this.field_kb = this.field_kb + this.field_E * var7 * 4;
                    if ((this.field_kb * this.field_E ^ -1) < -33) {
                      this.field_kb = this.field_E * 32;
                      break L63;
                    } else {
                      break L63;
                    }
                  }
                  if (-196 <= this.field_eb) {
                    break L62;
                  } else {
                    this.field_eb = -196;
                    break L62;
                  }
                }
              }
              L64: {
                if ((this.field_jb ^ -1) != -37) {
                  break L64;
                } else {
                  L65: {
                    if (!this.field_U) {
                      break L65;
                    } else {
                      if (lk.a(0, (byte) -23)) {
                        break L65;
                      } else {
                        break L64;
                      }
                    }
                  }
                  this.field_eb = -32;
                  this.field_kb = 0;
                  break L64;
                }
              }
              this.field_M = 0;
              this.field_z = true;
              this.field_P = 0;
              this.b(-30225, 50);
              break L52;
            }
          }
          L66: {
            var7 = 117 % ((param0 - -64) / 59);
            this.field_M = 0;
            if (this.field_F <= 6.28) {
              break L66;
            } else {
              this.field_F = this.field_F - 6.28;
              this.b(-30225, 48);
              break L66;
            }
          }
          L67: {
            if (0.0 <= this.field_F) {
              break L67;
            } else {
              this.field_F = this.field_F + 6.28;
              break L67;
            }
          }
          L68: {
            L69: {
              var8 = (int)(Math.cos(this.field_F) * (double)(this.field_Y >> 69387618));
              var9 = (int)(Math.sin(this.field_F) * (double)(this.field_Y >> 846017666));
              this.field_n = var8 >> 2018888545;
              this.field_N = var9 >> 1815737922;
              this.field_O = -(var9 >> -875779294);
              if (0 < var8) {
                break L69;
              } else {
                this.field_Z = 0;
                if (var11 == 0) {
                  break L68;
                } else {
                  break L69;
                }
              }
            }
            this.field_Z = -var8;
            break L68;
          }
          L70: {
            L71: {
              this.field_y = -var9;
              if ((var8 ^ -1) <= -1) {
                break L71;
              } else {
                this.field_o = var8;
                if (var11 == 0) {
                  break L70;
                } else {
                  break L71;
                }
              }
            }
            this.field_o = 0;
            break L70;
          }
          L72: {
            this.field_t = var9;
            this.field_r = -(var8 >> -1765043423);
            if (var6 == 0) {
              break L72;
            } else {
              this.field_N = this.field_O;
              this.field_Z = this.field_o;
              break L72;
            }
          }
          L73: {
            if (var4 == 0) {
              break L73;
            } else {
              if (this.field_s.u(92)) {
                var8 = -this.field_lb + this.field_s.field_lb;
                var9 = -this.field_db + this.field_s.field_db;
                if (!this.field_s.field_z) {
                  break L73;
                } else {
                  if (this.field_s.field_eb < 0) {
                    break L73;
                  } else {
                    if ((this.field_Y - -this.field_s.field_Y) * (this.field_Y + this.field_s.field_Y) >> 333751778 > var8 * var8 - -(var9 * var9)) {
                      L74: {
                        this.field_L.a(this.field_s, 0);
                        this.field_s.field_z = false;
                        this.field_s.field_R = this.field_R + -(this.field_Y << -1234880893);
                        this.field_s.field_eb = 0;
                        this.field_s.field_X = -(this.field_E * (this.field_Y << -43125439)) + this.field_X;
                        this.field_s.field_kb = 0;
                        if ((this.field_s.field_Y ^ -1) < -33) {
                          this.field_s.field_R = this.field_s.field_R + 192;
                          this.field_s.field_X = this.field_s.field_X + 0 * this.field_E;
                          break L74;
                        } else {
                          break L74;
                        }
                      }
                      L75: {
                        if (32 != this.field_jb) {
                          break L75;
                        } else {
                          this.field_s.field_R = this.field_s.field_R - 480;
                          this.field_s.field_X = this.field_s.field_X + this.field_E * 448;
                          break L75;
                        }
                      }
                      this.field_lb = this.field_X >> 635118404;
                      this.field_db = this.field_R >> 9273348;
                      this.field_s.field_lb = this.field_s.field_X >> 1738587204;
                      this.field_s.field_E = this.field_E;
                      this.field_s.field_db = this.field_s.field_R >> 328194148;
                      if (0 >= this.field_s.field_ib) {
                        break L73;
                      } else {
                        this.field_L.a(-124, this.field_s);
                        break L73;
                      }
                    } else {
                      break L73;
                    }
                  }
                }
              } else {
                break L73;
              }
            }
          }
          return;
        }
    }

    private final void d(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
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
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
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
              stackOut_8_0 = 1;
              stackIn_10_0 = stackOut_8_0;
              break L1;
            }
          }
          stackOut_9_0 = 0;
          stackIn_10_0 = stackOut_9_0;
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
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
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
                      stackOut_9_0 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
          }
          stackOut_8_0 = 1;
          stackIn_10_0 = stackOut_8_0;
          break L1;
        }
        return stackIn_10_0 != 0;
    }

    final void a(byte param0, int param1) {
        int var3 = 0;
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
            Object discarded$6 = null;
            Object discarded$7 = null;
            Object discarded$8 = null;
            Object discarded$9 = null;
            Object discarded$10 = null;
            Object discarded$11 = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
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
                try {
                  L1: {
                    var4 = param1.getCodeBase();
                    if (param0 < -59) {
                      var3 = nm.a(param1, var4, -31843).getFile();
                      discarded$6 = ei.a("updatelinks", param1, (byte) 114, new Object[]{"home", var3 + "home.ws"});
                      discarded$7 = ei.a("updatelinks", param1, (byte) 114, new Object[]{"gamelist", var3 + "togamelist.ws"});
                      discarded$8 = ei.a("updatelinks", param1, (byte) 114, new Object[]{"serverlist", var3 + "toserverlist.ws"});
                      discarded$9 = ei.a("updatelinks", param1, (byte) 114, new Object[]{"options", var3 + "options.ws"});
                      discarded$10 = ei.a("updatelinks", param1, (byte) 114, new Object[]{"terms", var3 + "terms.ws"});
                      discarded$11 = ei.a("updatelinks", param1, (byte) 114, new Object[]{"privacy", var3 + "privacy.ws"});
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
                stackOut_6_0 = (RuntimeException) (var2_ref);
                stackOut_6_1 = new StringBuilder().append("ml.KA(").append(param0).append(',');
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
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
        int var2 = 0;
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
        boolean discarded$1 = false;
        int var2 = 0;
        ml var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (!this.u(param0 ^ -10366)) {
          return false;
        } else {
          L0: {
            if (param0 == -10265) {
              break L0;
            } else {
              discarded$1 = this.u(87);
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
        int var4 = 0;
        ml var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
        int discarded$0 = 0;
        this.field_ib = param1;
        if (param0 > -79) {
            discarded$0 = this.y(111);
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
        RuntimeException var7 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
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
            var7 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var7);
            stackOut_3_1 = new StringBuilder().append("ml.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param4 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param5 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    static {
        field_K = "You have fallen into the water! Choose a location to teleport to. Since you don't have Arcane Gate available, you will lose a third of your health (<%1>). If you fail to do this within the time limit, you will forfeit the game!";
    }
}
