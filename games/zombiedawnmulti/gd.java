/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends gq {
    private int[] field_C;
    static me field_Q;
    private mb[][] field_O;
    private int field_r;
    private int field_N;
    private int[] field_m;
    int[] field_n;
    private int[] field_w;
    private mb[][] field_t;
    private int[] field_k;
    private int[] field_j;
    private int[] field_x;
    private int[] field_z;
    private int[] field_E;
    private int[] field_u;
    private int[] field_D;
    static int field_B;
    private f field_G;
    int[] field_H;
    private int[] field_J;
    int[] field_y;
    private int[] field_K;
    private int[] field_v;
    private mm field_p;
    private ba field_P;
    private long field_l;
    private boolean field_L;
    private long field_A;
    private int field_q;
    private int field_I;
    private boolean field_F;
    private int field_o;
    private ug field_s;

    final synchronized void a(int param0, byte param1) {
        this.field_N = param0;
        if (param1 != 116) {
            this.a(113);
        }
    }

    final static void a(boolean param0, int param1, ja[] param2) {
        try {
            dd.field_f[param1] = param2;
            dd.field_f[param1][dd.field_f[param1].length - 2].a();
            if (!he.field_a) {
                oo.b();
            }
            if (param0) {
                field_B = 38;
            }
            dl.field_h.b((byte) 107);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "gd.Q(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static bm a(byte[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        bm stackIn_3_0 = null;
        bm stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        bm stackOut_7_0 = null;
        bm stackOut_2_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = 90000;
            var3 = 10;
            var4 = 0;
            var5 = new byte[param0.length + 12];
            if (param1 == 46) {
              br.a(0, var5, param1 + -173, re.a(param0, 0, (byte) 71));
              br.a(1, var5, -80, var4);
              br.a(2, var5, -118, var2_int);
              br.a(3, var5, -91, var3);
              var6 = 1;
              L1: while (true) {
                L2: {
                  if ((var6 ^ -1) <= (param0.length / 4 ^ -1)) {
                    break L2;
                  } else {
                    br.a(3 + var6, var5, -127, re.a(param0, var6, (byte) 53));
                    var6++;
                    if (var7 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_7_0 = ij.a(var5, 7);
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = (bm) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var2);
            stackOut_9_1 = new StringBuilder().append("gd.N(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    final synchronized void a(byte param0, int param1) {
        if (param0 != -116) {
            return;
        }
        this.field_r = param1;
    }

    public static void e(int param0) {
        if (param0 != 0) {
            gd.e(70);
        }
        field_Q = null;
    }

    private final void b(int param0, byte param1) {
        mb var3_ref_mb = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        L0: {
          L1: {
            var4 = ZombieDawnMulti.field_E ? 1 : 0;
            if (-1 != (this.field_H[param0] & 2 ^ -1)) {
              var3_ref_mb = (mb) ((Object) this.field_P.field_k.c(109));
              L2: while (true) {
                if (var3_ref_mb == null) {
                  break L1;
                } else {
                  stackOut_4_0 = var3_ref_mb.field_o ^ -1;
                  stackOut_4_1 = param0 ^ -1;
                  stackIn_13_0 = stackOut_4_0;
                  stackIn_13_1 = stackOut_4_1;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  if (var4 != 0) {
                    break L0;
                  } else {
                    L3: {
                      if (stackIn_5_0 != stackIn_5_1) {
                        break L3;
                      } else {
                        if (this.field_O[param0][var3_ref_mb.field_p] == null) {
                          if ((var3_ref_mb.field_l ^ -1) > -1) {
                            var3_ref_mb.field_l = 0;
                            break L3;
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                    var3_ref_mb = (mb) ((Object) this.field_P.field_k.b(6));
                    if (var4 == 0) {
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
          stackOut_12_0 = -45;
          stackOut_12_1 = (param1 - -10) / 54;
          stackIn_13_0 = stackOut_12_0;
          stackIn_13_1 = stackOut_12_1;
          break L0;
        }
        var3 = stackIn_13_0 % stackIn_13_1;
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!this.field_p.b()) {
                    break L3;
                  } else {
                    var4_int = this.field_r * this.field_p.field_g / gp.field_p;
                    L4: while (true) {
                      L5: {
                        var5 = (long)var4_int * (long)param2 + this.field_A;
                        if (this.field_l - var5 < 0L) {
                          break L5;
                        } else {
                          this.field_A = var5;
                          if (var8 != 0) {
                            break L2;
                          } else {
                            if (var8 == 0) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      L6: {
                        var7 = (int)((-1L + (long)var4_int + -this.field_A + this.field_l) / (long)var4_int);
                        this.field_A = this.field_A + (long)var7 * (long)var4_int;
                        this.field_P.b(param0, param1, var7);
                        this.f(113);
                        param1 = param1 + var7;
                        param2 = param2 - var7;
                        if (this.field_p.b()) {
                          break L6;
                        } else {
                          if (var8 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (var8 == 0) {
                        continue L4;
                      } else {
                        this.field_P.b(param0, param1, param2);
                        break L1;
                      }
                    }
                  }
                }
                this.field_P.b(param0, param1, param2);
                break L2;
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var4);
            stackOut_14_1 = new StringBuilder().append("gd.F(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L7;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void d(int param0, int param1, int param2) {
        int discarded$0 = 0;
        if (param0 != -1) {
            discarded$0 = this.a();
        }
    }

    final void a(boolean param0, byte param1, mb param2) {
        int discarded$2 = 0;
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = param2.field_f.field_h.length;
                if (!param0) {
                  break L2;
                } else {
                  if (!param2.field_f.field_i) {
                    break L2;
                  } else {
                    L3: {
                      var6 = -param2.field_f.field_j + var4_int - -var4_int;
                      var5 = (int)((long)this.field_y[param2.field_o] * (long)var6 >> 1865038022);
                      var4_int = var4_int << 8;
                      if ((var5 ^ -1) <= (var4_int ^ -1)) {
                        var5 = -1 + (var4_int + (var4_int + -var5));
                        param2.field_C.b(true);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    if (!ZombieDawnMulti.field_E) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var5 = (int)((long)this.field_y[param2.field_o] * (long)var4_int >> 1861470982);
              break L1;
            }
            L4: {
              if (param1 < -64) {
                break L4;
              } else {
                discarded$2 = gd.a(43, (byte) -76, 101);
                break L4;
              }
            }
            param2.field_C.c(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (runtimeException);
            stackOut_11_1 = new StringBuilder().append("gd.R(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    private final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        L0: {
          var8 = ZombieDawnMulti.field_E ? 1 : 0;
          var3 = 54 % ((param0 - 41) / 56);
          var2 = this.field_q;
          var4 = this.field_I;
          var5 = this.field_l;
          if (this.field_s == null) {
            break L0;
          } else {
            if ((this.field_o ^ -1) == (var4 ^ -1)) {
              this.a(this.field_F, 8695, this.field_s, this.field_L);
              this.f(-106);
              return;
            } else {
              break L0;
            }
          }
        }
        L1: while (true) {
          stackOut_4_0 = this.field_I;
          stackOut_4_1 = var4;
          stackIn_5_0 = stackOut_4_0;
          stackIn_5_1 = stackOut_4_1;
          L2: while (true) {
            L3: {
              L4: {
                L5: {
                  if (stackIn_5_0 != stackIn_5_1) {
                    break L5;
                  } else {
                    L6: while (true) {
                      stackOut_6_0 = var4;
                      stackOut_6_1 = this.field_p.field_h[var2];
                      stackIn_28_0 = stackOut_6_0;
                      stackIn_28_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var8 != 0) {
                        break L4;
                      } else {
                        L7: {
                          if (stackIn_7_0 != stackIn_7_1) {
                            break L7;
                          } else {
                            this.field_p.b(var2);
                            var7 = this.field_p.a(var2);
                            stackOut_8_0 = -2;
                            stackOut_8_1 = var7 ^ -1;
                            stackIn_5_0 = stackOut_8_0;
                            stackIn_5_1 = stackOut_8_1;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            if (var8 != 0) {
                              continue L2;
                            } else {
                              if (stackIn_9_0 == stackIn_9_1) {
                                L8: {
                                  this.field_p.e();
                                  this.field_p.e(var2);
                                  if (this.field_p.c()) {
                                    break L8;
                                  } else {
                                    if (var8 == 0) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                if (null == this.field_s) {
                                  L9: {
                                    if (!this.field_L) {
                                      break L9;
                                    } else {
                                      if (0 != var4) {
                                        this.field_p.a(var5);
                                        if (var8 == 0) {
                                          break L7;
                                        } else {
                                          break L9;
                                        }
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  this.b(-1, true);
                                  this.field_p.f();
                                  return;
                                } else {
                                  this.a(this.field_s, this.field_L, 8361407);
                                  this.f(99);
                                  return;
                                }
                              } else {
                                L10: {
                                  if ((var7 & 128) != 0) {
                                    this.a(-5777, var7);
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                                this.field_p.d(var2);
                                this.field_p.e(var2);
                                if (var8 == 0) {
                                  continue L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                        }
                        var2 = this.field_p.a();
                        var4 = this.field_p.field_h[var2];
                        var5 = this.field_p.f(var4);
                        if (var8 == 0) {
                          continue L1;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
                this.field_q = var2;
                this.field_l = var5;
                this.field_I = var4;
                if (null == this.field_s) {
                  break L3;
                } else {
                  stackOut_27_0 = this.field_o ^ -1;
                  stackOut_27_1 = var4 ^ -1;
                  stackIn_28_0 = stackOut_27_0;
                  stackIn_28_1 = stackOut_27_1;
                  break L4;
                }
              }
              if (stackIn_28_0 <= stackIn_28_1) {
                break L3;
              } else {
                this.field_q = -1;
                this.field_I = this.field_o;
                this.field_l = this.field_p.f(this.field_I);
                break L3;
              }
            }
            return;
          }
        }
    }

    private final void b(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          L1: {
            var4 = ZombieDawnMulti.field_E ? 1 : 0;
            if (!param1) {
              break L1;
            } else {
              this.c(-1, 0);
              if (var4 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.a(-1, true);
          break L0;
        }
        this.d(86, param0);
        var3 = 0;
        L2: while (true) {
          L3: {
            L4: {
              if (var3 >= 16) {
                break L4;
              } else {
                this.field_C[var3] = this.field_j[var3];
                var3++;
                if (var4 != 0) {
                  break L3;
                } else {
                  if (var4 == 0) {
                    continue L2;
                  } else {
                    break L4;
                  }
                }
              }
            }
            var3 = 0;
            break L3;
          }
          L5: while (true) {
            L6: {
              if ((var3 ^ -1) <= -17) {
                break L6;
              } else {
                this.field_z[var3] = tq.b(this.field_j[var3], -128);
                var3++;
                if (var4 != 0) {
                  break L6;
                } else {
                  if (var4 == 0) {
                    continue L5;
                  } else {
                    break L6;
                  }
                }
              }
            }
            return;
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        mb var5 = null;
        jd var6 = null;
        int var6_int = 0;
        mb var7 = null;
        mb var8 = null;
        int var9 = 0;
        po var10 = null;
        po var11 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        L0: {
          var9 = ZombieDawnMulti.field_E ? 1 : 0;
          this.b(param0, param3, 64, 101);
          if (0 != (2 & this.field_H[param3])) {
            var5 = (mb) ((Object) this.field_P.field_k.a((byte) 74));
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if ((param3 ^ -1) != (var5.field_o ^ -1)) {
                    break L2;
                  } else {
                    if ((var5.field_l ^ -1) > -1) {
                      this.field_O[param3][var5.field_p] = null;
                      this.field_O[param3][param0] = var5;
                      var6_int = var5.field_z - -(var5.field_t * var5.field_r >> 163379820);
                      var5.field_z = var5.field_z + (-var5.field_p + param0 << -639144664);
                      var5.field_r = -var5.field_z + var6_int;
                      var5.field_p = param0;
                      var5.field_t = 4096;
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = (mb) ((Object) this.field_P.field_k.c((byte) 121));
                if (var9 == 0) {
                  continue L1;
                } else {
                  break L0;
                }
              }
            }
          } else {
            break L0;
          }
        }
        var10 = (po) ((Object) this.field_G.a(0, (long)this.field_C[param3]));
        var11 = var10;
        if (var11 != null) {
          var6 = var10.field_s[param0];
          if (var6 == null) {
            return;
          } else {
            L3: {
              L4: {
                var7 = new mb();
                var7.field_x = var11;
                var7.field_f = var6;
                var7.field_o = param3;
                var7.field_h = var10.field_q[param0];
                var7.field_m = var10.field_m[param0];
                var7.field_p = param0;
                var7.field_v = 1024 + var10.field_h[param0] * param2 * (param2 * var11.field_o) >> 1056438475;
                var7.field_E = 255 & var10.field_j[param0];
                var7.field_z = (param0 << 1204220360) - (var10.field_g[param0] & 32767);
                var7.field_A = 0;
                var7.field_i = 0;
                var7.field_y = 0;
                var7.field_l = -1;
                var7.field_q = 0;
                if ((this.field_y[param3] ^ -1) == -1) {
                  break L4;
                } else {
                  L5: {
                    var7.field_C = uj.a(var6, this.b(var7, -916428895), 0, this.a(var7, 81682502));
                    stackOut_15_0 = this;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_16_0 = stackOut_15_0;
                    if ((var10.field_g[param0] ^ -1) <= -1) {
                      stackOut_17_0 = this;
                      stackOut_17_1 = 0;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      break L5;
                    } else {
                      stackOut_16_0 = this;
                      stackOut_16_1 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      break L5;
                    }
                  }
                  this.a(stackIn_18_1 != 0, (byte) -107, var7);
                  if (var9 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var7.field_C = uj.a(var6, this.b(var7, -916428895), this.a((byte) 92, var7), this.a(var7, 81682502));
              break L3;
            }
            L6: {
              if (0 <= var10.field_g[param0]) {
                break L6;
              } else {
                var7.field_C.g(-1);
                break L6;
              }
            }
            L7: {
              if (0 <= var7.field_m) {
                L8: {
                  var8 = this.field_t[param3][var7.field_m];
                  if (var8 == null) {
                    break L8;
                  } else {
                    if (0 > var8.field_l) {
                      this.field_O[param3][var8.field_p] = null;
                      var8.field_l = 0;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                this.field_t[param3][var7.field_m] = var7;
                break L7;
              } else {
                break L7;
              }
            }
            L9: {
              if (param1 == 4445) {
                break L9;
              } else {
                this.a(true, 70, (ug) null, true);
                break L9;
              }
            }
            this.field_P.field_k.a(var7, false);
            this.field_O[param3][param0] = var7;
            return;
          }
        } else {
          return;
        }
    }

    private final int a(byte param0, mb param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        nj var10 = null;
        nj var11 = null;
        int stackIn_2_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (0 != this.field_m[param1.field_o]) {
              L1: {
                var10 = param1.field_h;
                var11 = var10;
                var4 = this.field_v[param1.field_o] * this.field_E[param1.field_o] + 4096 >> -650864979;
                var4 = 16384 + var4 * var4 >> -133535185;
                var4 = param1.field_v * var4 + 16384 >> -2127218129;
                var4 = 128 + var4 * this.field_N >> 1732558024;
                var4 = 128 + var4 * this.field_m[param1.field_o] >> 2109697896;
                if (-1 > (var11.field_b ^ -1)) {
                  var4 = (int)(Math.pow(0.5, 0.00001953125 * (double)param1.field_i * (double)var11.field_b) * (double)var4 + 0.5);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (null == var11.field_l) {
                  break L2;
                } else {
                  L3: {
                    var5 = param1.field_A;
                    var6 = var11.field_l[1 + param1.field_q];
                    if ((param1.field_q ^ -1) <= (-2 + var11.field_l.length ^ -1)) {
                      break L3;
                    } else {
                      var7 = var10.field_l[param1.field_q] << -2146315224 & 65280;
                      var8 = 65280 & var11.field_l[2 + param1.field_q] << -1527009176;
                      var6 = var6 + (-var6 + var11.field_l[param1.field_q - -3]) * (var5 + -var7) / (-var7 + var8);
                      break L3;
                    }
                  }
                  var4 = 32 + var6 * var4 >> 1859189670;
                  break L2;
                }
              }
              L4: {
                var5 = 91 / ((param0 - 40) / 47);
                if (0 >= param1.field_l) {
                  break L4;
                } else {
                  if (var11.field_e == null) {
                    break L4;
                  } else {
                    L5: {
                      var6 = param1.field_l;
                      var7 = var11.field_e[param1.field_y - -1];
                      if ((var11.field_e.length + -2 ^ -1) >= (param1.field_y ^ -1)) {
                        break L5;
                      } else {
                        var8 = 65280 & var10.field_e[param1.field_y] << -754907992;
                        var9 = (var11.field_e[2 + param1.field_y] & 255) << 762807432;
                        var7 = var7 + (-var8 + var6) * (var11.field_e[3 + param1.field_y] + -var7) / (var9 - var8);
                        break L5;
                      }
                    }
                    var4 = 32 + var7 * var4 >> 1086222982;
                    break L4;
                  }
                }
              }
              stackOut_15_0 = var4;
              stackIn_16_0 = stackOut_15_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3);
            stackOut_17_1 = new StringBuilder().append("gd.DA(").append(param0).append(',');
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
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_16_0;
        }
    }

    private final int b(mb param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        nj var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              var3_int = (param0.field_r * param0.field_t >> -1783083508) + param0.field_z;
              var3_int = var3_int + (this.field_D[param0.field_o] * (-8192 + this.field_u[param0.field_o]) >> 1545766348);
              if (param1 == -916428895) {
                break L1;
              } else {
                this.field_m = (int[]) null;
                break L1;
              }
            }
            L2: {
              var4 = param0.field_h;
              if (0 >= var4.field_k) {
                break L2;
              } else {
                L3: {
                  if ((var4.field_g ^ -1) < -1) {
                    break L3;
                  } else {
                    if (0 >= this.field_K[param0.field_o]) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  var5 = var4.field_g << -21090558;
                  var6 = var4.field_j << -916428895;
                  if ((param0.field_B ^ -1) > (var6 ^ -1)) {
                    var5 = var5 * param0.field_B / var6;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var5 = var5 + (this.field_K[param0.field_o] >> 932337063);
                var7 = Math.sin(0.01227184630308513 * (double)(511 & param0.field_s));
                var3_int = var3_int + (int)((double)var5 * var7);
                break L2;
              }
            }
            L5: {
              var5 = (int)(0.5 + (double)(param0.field_f.field_g * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)gp.field_p);
              if (-2 >= (var5 ^ -1)) {
                stackOut_12_0 = var5;
                stackIn_13_0 = stackOut_12_0;
                break L5;
              } else {
                stackOut_11_0 = 1;
                stackIn_13_0 = stackOut_11_0;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("gd.W(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        return stackIn_13_0;
    }

    private final void a(int param0, boolean param1) {
        mb var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        boolean stackOut_9_0 = false;
        int stackOut_9_1 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        var3 = (mb) ((Object) this.field_P.field_k.c(124));
        L0: while (true) {
          L1: {
            L2: {
              if (var3 == null) {
                break L2;
              } else {
                stackOut_2_0 = 0;
                stackOut_2_1 = param0;
                stackIn_10_0 = stackOut_2_0;
                stackIn_10_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var4 != 0) {
                  break L1;
                } else {
                  L3: {
                    L4: {
                      if (stackIn_3_0 > stackIn_3_1) {
                        break L4;
                      } else {
                        if ((param0 ^ -1) != (var3.field_o ^ -1)) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (0 <= var3.field_l) {
                      break L3;
                    } else {
                      this.field_O[var3.field_o][var3.field_p] = null;
                      var3.field_l = 0;
                      break L3;
                    }
                  }
                  var3 = (mb) ((Object) this.field_P.field_k.b(6));
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_9_0 = param1;
            stackOut_9_1 = 1;
            stackIn_10_0 = stackOut_9_0 ? 1 : 0;
            stackIn_10_1 = stackOut_9_1;
            break L1;
          }
          L5: {
            if (stackIn_10_0 == stackIn_10_1) {
              break L5;
            } else {
              gd.a(false, -23, (ja[]) null);
              break L5;
            }
          }
          return;
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        mb var7 = null;
        int var8 = 0;
        mb var9 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        var9 = this.field_O[param1][param0];
        if (var9 != null) {
          L0: {
            L1: {
              this.field_O[param1][param0] = null;
              var6 = 70 % ((-23 - param3) / 53);
              if ((this.field_H[param1] & 2 ^ -1) == -1) {
                break L1;
              } else {
                var7 = (mb) ((Object) this.field_P.field_k.c(74));
                L2: while (true) {
                  L3: {
                    if (var7 == null) {
                      break L3;
                    } else {
                      if (var8 != 0) {
                        break L0;
                      } else {
                        L4: {
                          if (var9.field_o != var7.field_o) {
                            break L4;
                          } else {
                            if (var7.field_l >= 0) {
                              break L4;
                            } else {
                              if (var7 == var9) {
                                break L4;
                              } else {
                                var9.field_l = 0;
                                if (var8 == 0) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                        var7 = (mb) ((Object) this.field_P.field_k.b(6));
                        if (var8 == 0) {
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (var8 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            var9.field_l = 0;
            break L0;
          }
          return;
        } else {
          return;
        }
    }

    final synchronized void g(int param0) {
        this.b(true, -82);
        if (param0 != 2) {
            field_B = -55;
        }
    }

    private final void e(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 == -13961) {
            break L0;
          } else {
            this.a(-64, (byte) 120);
            break L0;
          }
        }
        L1: {
          if ((this.field_C[param2] ^ -1) == (param1 ^ -1)) {
            break L1;
          } else {
            this.field_C[param2] = param1;
            var4 = 0;
            L2: while (true) {
              if (var4 >= 128) {
                break L1;
              } else {
                this.field_t[param2][var4] = null;
                var4++;
                if (var5 != 0) {
                  break L1;
                } else {
                  if (var5 == 0) {
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
        }
    }

    final synchronized gq b() {
        return (gq) ((Object) this.field_P);
    }

    private final synchronized void b(boolean param0, int param1) {
        if (param1 != -82) {
            gd.a(false, 13, (ja[]) null);
        }
        this.field_p.f();
        this.field_s = null;
        this.b(-1, param0);
    }

    private final void b(int param0, int param1, int param2) {
        if (param0 != 15) {
            this.a(false, -75, (ug) null, false);
        }
        this.field_x[param1] = param2;
        this.field_n[param1] = (int)(2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param2) + 0.5);
    }

    final synchronized void f(int param0, int param1, int param2) {
        if (param1 != 15) {
            this.field_O = (mb[][]) null;
        }
        this.c(param0, 16532, param2);
    }

    private final int a(mb param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
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
              if (param1 == 81682502) {
                break L1;
              } else {
                gd.a(true, -52, (ja[]) null);
                break L1;
              }
            }
            var3_int = this.field_J[param0.field_o];
            if ((var3_int ^ -1) > -8193) {
              stackOut_5_0 = 32 + var3_int * param0.field_E >> -1857675834;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = -(32 + (128 + -param0.field_E) * (-var3_int + 16384) >> 81682502) + 16384;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("gd.GA(");
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
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = -1 + param2 & param0 >> 831665695;
        int var4 = 21 % ((param1 - -9) / 59);
        return var3 + (param0 - -(param0 >>> 1184361823)) % param2;
    }

    final synchronized boolean a(int param0, me param1, int param2, ug param3, ul param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        kg var8 = null;
        int var9 = 0;
        po var10 = null;
        int var11 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              param3.a();
              var6_int = 1;
              var7 = null;
              if (0 < param2) {
                var7 = new int[]{param2};
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == -10783) {
                break L2;
              } else {
                this.field_x = (int[]) null;
                break L2;
              }
            }
            var8 = (kg) ((Object) param3.field_f.a(0));
            L3: while (true) {
              L4: {
                L5: {
                  L6: {
                    if (var8 == null) {
                      break L6;
                    } else {
                      var9 = (int)var8.field_e;
                      var10 = (po) ((Object) this.field_G.a(param0 ^ -10783, (long)var9));
                      if (var11 != 0) {
                        break L5;
                      } else {
                        L7: {
                          L8: {
                            if (var10 != null) {
                              break L8;
                            } else {
                              L9: {
                                var10 = r.a(param4, var9, (byte) 15);
                                if (var10 == null) {
                                  var6_int = 0;
                                  if (var11 == 0) {
                                    break L7;
                                  } else {
                                    break L9;
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              this.field_G.a(true, (long)var9, var10);
                              break L8;
                            }
                          }
                          if (!var10.a(param1, param0 ^ -10840, var8.field_h, (int[]) (var7))) {
                            var6_int = 0;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var8 = (kg) ((Object) param3.field_f.b(-118));
                        if (var11 == 0) {
                          continue L3;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if (var6_int != 0) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
                param3.b();
                break L4;
              }
              stackOut_21_0 = var6_int;
              stackIn_22_0 = stackOut_21_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var6);
            stackOut_23_1 = new StringBuilder().append("gd.P(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L10;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L10;
            }
          }
          L11: {
            stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L11;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L11;
            }
          }
          L12: {
            stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param4 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L12;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L12;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
        return stackIn_22_0 != 0;
    }

    private final void a(int param0, int param1, int param2) {
        this.field_u[param2] = param1;
        if (param0 != -1) {
            this.d(25);
        }
    }

    private final void c(int param0, int param1, int param2, int param3) {
        if (param2 != 26739) {
            this.c(11, 71);
        }
    }

    final synchronized int a() {
        return 0;
    }

    private final void c(int param0, int param1) {
        mb var3 = null;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        var3 = (mb) ((Object) this.field_P.field_k.c(69));
        if (param1 == 0) {
          L0: while (true) {
            L1: {
              if (var3 == null) {
                break L1;
              } else {
                if (var4 != 0) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if (param0 < 0) {
                        break L3;
                      } else {
                        if (var3.field_o == param0) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L4: {
                      if (var3.field_C == null) {
                        break L4;
                      } else {
                        L5: {
                          var3.field_C.e(gp.field_p / 100);
                          if (!var3.field_C.j()) {
                            break L5;
                          } else {
                            this.field_P.field_o.b(var3.field_C);
                            break L5;
                          }
                        }
                        var3.a((byte) 71);
                        break L4;
                      }
                    }
                    L6: {
                      if (-1 >= (var3.field_l ^ -1)) {
                        break L6;
                      } else {
                        this.field_O[var3.field_o][var3.field_p] = null;
                        break L6;
                      }
                    }
                    var3.a(true);
                    break L2;
                  }
                  var3 = (mb) ((Object) this.field_P.field_k.b(6));
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    private final synchronized void a(boolean param0, int param1, ug param2, boolean param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              this.b(param0, -82);
              this.field_p.a(param2.field_g);
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param3) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            ((gd) (this)).field_L = stackIn_4_1 != 0;
            this.field_A = 0L;
            var5_int = this.field_p.g();
            var6 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var5_int <= var6) {
                    break L4;
                  } else {
                    this.field_p.b(var6);
                    this.field_p.d(var6);
                    this.field_p.e(var6);
                    var6++;
                    if (var7 != 0) {
                      break L3;
                    } else {
                      if (var7 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                this.field_q = this.field_p.a();
                this.field_I = this.field_p.field_h[this.field_q];
                break L3;
              }
              if (param1 == 8695) {
                this.field_l = this.field_p.f(this.field_I);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (runtimeException);
            stackOut_14_1 = new StringBuilder().append("gd.LA(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        var3 = param1 & 240;
        if (-129 == (var3 ^ -1)) {
          var4 = 15 & param1;
          var5 = (32716 & param1) >> -400949176;
          var6 = (param1 & 8359189) >> -1884409296;
          this.b(var5, var4, var6, param0 + 5856);
          return;
        } else {
          if (144 != var3) {
            L0: {
              if (param0 == -5777) {
                break L0;
              } else {
                this.field_E = (int[]) null;
                break L0;
              }
            }
            if (var3 == 160) {
              var4 = param1 & 15;
              var5 = (param1 & 32734) >> 1752552872;
              var6 = param1 >> 1751879408 & 127;
              this.c(var4, var5, 26739, var6);
              return;
            } else {
              if (-177 == (var3 ^ -1)) {
                L1: {
                  var4 = param1 & 15;
                  var5 = param1 >> -1787694168 & 127;
                  var6 = (param1 & 8361407) >> 454487024;
                  if (0 != var5) {
                    break L1;
                  } else {
                    this.field_z[var4] = tq.b(this.field_z[var4], -2080769) - -(var6 << 488676654);
                    break L1;
                  }
                }
                L2: {
                  if (var5 != 32) {
                    break L2;
                  } else {
                    this.field_z[var4] = (var6 << -1435278841) + tq.b(this.field_z[var4], -16257);
                    break L2;
                  }
                }
                L3: {
                  if (var5 == 1) {
                    this.field_K[var4] = (var6 << -2031296441) + tq.b(this.field_K[var4], -16257);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (-34 == (var5 ^ -1)) {
                    this.field_K[var4] = var6 + tq.b(this.field_K[var4], -128);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (5 != var5) {
                    break L5;
                  } else {
                    this.field_k[var4] = (var6 << 1109654247) + tq.b(-16257, this.field_k[var4]);
                    break L5;
                  }
                }
                L6: {
                  if (var5 == 37) {
                    this.field_k[var4] = tq.b(-128, this.field_k[var4]) + var6;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (-8 != (var5 ^ -1)) {
                    break L7;
                  } else {
                    this.field_E[var4] = tq.b(-16257, this.field_E[var4]) - -(var6 << -1045073241);
                    break L7;
                  }
                }
                L8: {
                  if ((var5 ^ -1) != -40) {
                    break L8;
                  } else {
                    this.field_E[var4] = var6 + tq.b(-128, this.field_E[var4]);
                    break L8;
                  }
                }
                L9: {
                  if ((var5 ^ -1) == -11) {
                    this.field_J[var4] = (var6 << 11260071) + tq.b(this.field_J[var4], -16257);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (-43 != (var5 ^ -1)) {
                    break L10;
                  } else {
                    this.field_J[var4] = var6 + tq.b(-128, this.field_J[var4]);
                    break L10;
                  }
                }
                L11: {
                  if (-12 == (var5 ^ -1)) {
                    this.field_v[var4] = (var6 << -411728921) + tq.b(-16257, this.field_v[var4]);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (43 != var5) {
                    break L12;
                  } else {
                    this.field_v[var4] = var6 + tq.b(this.field_v[var4], -128);
                    break L12;
                  }
                }
                L13: {
                  if (var5 != 64) {
                    break L13;
                  } else {
                    L14: {
                      if (64 > var6) {
                        break L14;
                      } else {
                        this.field_H[var4] = cr.b(this.field_H[var4], 1);
                        if (var8 == 0) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    this.field_H[var4] = tq.b(this.field_H[var4], -2);
                    break L13;
                  }
                }
                L15: {
                  if ((var5 ^ -1) != -66) {
                    break L15;
                  } else {
                    L16: {
                      if (64 > var6) {
                        break L16;
                      } else {
                        this.field_H[var4] = cr.b(this.field_H[var4], 2);
                        if (var8 == 0) {
                          break L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                    this.b(var4, (byte) -83);
                    this.field_H[var4] = tq.b(this.field_H[var4], -3);
                    break L15;
                  }
                }
                L17: {
                  if ((var5 ^ -1) != -100) {
                    break L17;
                  } else {
                    this.field_w[var4] = (var6 << 1089795847) + tq.b(this.field_w[var4], 127);
                    break L17;
                  }
                }
                L18: {
                  if (98 == var5) {
                    this.field_w[var4] = tq.b(16256, this.field_w[var4]) + var6;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (-102 == (var5 ^ -1)) {
                    this.field_w[var4] = (var6 << 871389735) + (tq.b(127, this.field_w[var4]) + 16384);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if ((var5 ^ -1) == -101) {
                    this.field_w[var4] = 16384 + (tq.b(this.field_w[var4], 16256) + var6);
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (var5 == 120) {
                    this.c(var4, 0);
                    break L21;
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if (var5 == 121) {
                    this.d(param0 + 5855, var4);
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (-124 == (var5 ^ -1)) {
                    this.a(var4, true);
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if ((var5 ^ -1) != -7) {
                    break L24;
                  } else {
                    var7 = this.field_w[var4];
                    if (var7 != 16384) {
                      break L24;
                    } else {
                      this.field_D[var4] = tq.b(this.field_D[var4], -16257) - -(var6 << 1025235751);
                      break L24;
                    }
                  }
                }
                L25: {
                  if ((var5 ^ -1) != -39) {
                    break L25;
                  } else {
                    var7 = this.field_w[var4];
                    if (var7 != 16384) {
                      break L25;
                    } else {
                      this.field_D[var4] = var6 + tq.b(this.field_D[var4], -128);
                      break L25;
                    }
                  }
                }
                L26: {
                  if (-17 != (var5 ^ -1)) {
                    break L26;
                  } else {
                    this.field_y[var4] = tq.b(-16257, this.field_y[var4]) - -(var6 << -1642972377);
                    break L26;
                  }
                }
                L27: {
                  if (-49 == (var5 ^ -1)) {
                    this.field_y[var4] = tq.b(-128, this.field_y[var4]) + var6;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if ((var5 ^ -1) == -82) {
                    L29: {
                      if ((var6 ^ -1) <= -65) {
                        break L29;
                      } else {
                        this.b(param0 + -24973, var4);
                        this.field_H[var4] = tq.b(this.field_H[var4], -5);
                        if (var8 == 0) {
                          break L28;
                        } else {
                          break L29;
                        }
                      }
                    }
                    this.field_H[var4] = cr.b(this.field_H[var4], 4);
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L30: {
                  if (var5 != 17) {
                    break L30;
                  } else {
                    this.b(15, var4, (var6 << 672423815) + (this.field_x[var4] & -16257));
                    break L30;
                  }
                }
                L31: {
                  if (var5 == 49) {
                    this.b(param0 + 5792, var4, var6 + (this.field_x[var4] & -128));
                    break L31;
                  } else {
                    break L31;
                  }
                }
                return;
              } else {
                if (-193 == (var3 ^ -1)) {
                  var4 = param1 & 15;
                  var5 = (32693 & param1) >> -1150481656;
                  this.e(-13961, var5 + this.field_z[var4], var4);
                  return;
                } else {
                  if (var3 == 208) {
                    var4 = 15 & param1;
                    var5 = param1 >> -148182456 & 127;
                    this.d(-1, var5, var4);
                    return;
                  } else {
                    if (224 != var3) {
                      var3 = 255 & param1;
                      if (-256 == (var3 ^ -1)) {
                        this.b(-1, true);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      var4 = param1 & 15;
                      var5 = ((param1 & 8323368) >> 1148384169) + (127 & param1 >> -1864611672);
                      this.a(-1, var5, var4);
                      return;
                    }
                  }
                }
              }
            }
          } else {
            L32: {
              var4 = param1 & 15;
              var5 = 127 & param1 >> 883085544;
              var6 = (param1 & 8329586) >> -781106320;
              if (0 >= var6) {
                break L32;
              } else {
                this.a(var5, 4445, var6, var4);
                if (var8 == 0) {
                  return;
                } else {
                  break L32;
                }
              }
            }
            this.b(var5, var4, 64, param0 ^ 5876);
            return;
          }
        }
    }

    final synchronized void a(ug param0, boolean param1, int param2) {
        try {
            this.a(true, 8695, param0, param1);
            if (param2 != 8361407) {
                this.c(-40, -4);
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "gd.T(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(int param0, int param1) {
        mb var3 = null;
        int var4 = 0;
        L0: {
          var4 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 == -30750) {
            break L0;
          } else {
            this.b(-109, (byte) -67);
            break L0;
          }
        }
        L1: {
          if (-1 == (4 & this.field_H[param1] ^ -1)) {
            break L1;
          } else {
            var3 = (mb) ((Object) this.field_P.field_k.c(69));
            L2: while (true) {
              L3: {
                if (var3 == null) {
                  break L3;
                } else {
                  if (var4 != 0) {
                    break L1;
                  } else {
                    L4: {
                      if ((var3.field_o ^ -1) == (param1 ^ -1)) {
                        var3.field_w = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var3 = (mb) ((Object) this.field_P.field_k.b(6));
                    if (var4 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              break L1;
            }
          }
        }
    }

    final synchronized void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            var5 = ZombieDawnMulti.field_E ? 1 : 0;
            if (0 <= param1) {
              break L1;
            } else {
              var4 = 0;
              L2: while (true) {
                L3: {
                  if (16 <= var4) {
                    break L3;
                  } else {
                    this.field_m[var4] = param0;
                    var4++;
                    if (var5 != 0) {
                      break L0;
                    } else {
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (var5 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          this.field_m[param1] = param0;
          break L0;
        }
        L4: {
          if (!param2) {
            break L4;
          } else {
            this.field_I = 3;
            break L4;
          }
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = ZombieDawnMulti.field_E ? 1 : 0;
            if (!this.field_p.b()) {
              break L1;
            } else {
              var2 = this.field_p.field_g * this.field_r / gp.field_p;
              L2: while (true) {
                L3: {
                  var3 = this.field_A - -((long)param0 * (long)var2);
                  if (-var3 + this.field_l < 0L) {
                    break L3;
                  } else {
                    this.field_A = var3;
                    if (var6 != 0) {
                      break L0;
                    } else {
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  var5 = (int)((-this.field_A + this.field_l + (long)var2 + -1L) / (long)var2);
                  this.field_A = this.field_A + (long)var2 * (long)var5;
                  this.field_P.a(var5);
                  param0 = param0 - var5;
                  this.f(-20);
                  if (this.field_p.b()) {
                    break L4;
                  } else {
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                if (var6 == 0) {
                  continue L2;
                } else {
                  this.field_P.a(param0);
                  break L0;
                }
              }
            }
          }
          this.field_P.a(param0);
          break L0;
        }
    }

    final boolean a(int param0, mb param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param0 == -1) {
              if (null != param1.field_C) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L1: {
                  if (0 > param1.field_l) {
                    break L1;
                  } else {
                    param1.a(true);
                    if (param1.field_m <= 0) {
                      break L1;
                    } else {
                      if (this.field_t[param1.field_o][param1.field_m] != param1) {
                        break L1;
                      } else {
                        this.field_t[param1.field_o][param1.field_m] = null;
                        return true;
                      }
                    }
                  }
                }
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("gd.FA(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    final synchronized void d(int param0) {
        int var3 = 0;
        po var4 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = (po) ((Object) this.field_G.a(0));
        L0: while (true) {
          L1: {
            L2: {
              if (var4 == null) {
                break L2;
              } else {
                var4.e(-6930);
                var4 = (po) ((Object) this.field_G.b(-110));
                if (var3 != 0) {
                  break L1;
                } else {
                  if (var3 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            if (param0 >= 124) {
              break L1;
            } else {
              this.a(101, (byte) 21);
              break L1;
            }
          }
          return;
        }
    }

    final synchronized gq d() {
        return null;
    }

    final boolean a(mb param0, int param1, int param2, int[] param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        nj var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_10_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_72_0 = 0;
        int stackIn_74_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_71_0 = 0;
        int stackOut_73_0 = 0;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              param0.field_D = gp.field_p / 100;
              if (param0.field_l < 0) {
                break L1;
              } else {
                L2: {
                  if (param0.field_C == null) {
                    break L2;
                  } else {
                    if (param0.field_C.k()) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  param0.a((byte) 71);
                  param0.a(true);
                  if (-1 <= (param0.field_m ^ -1)) {
                    break L3;
                  } else {
                    if (param0 == this.field_t[param0.field_o][param0.field_m]) {
                      this.field_t[param0.field_o][param0.field_m] = null;
                      break L3;
                    } else {
                      return true;
                    }
                  }
                }
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L4: {
              var6_int = param0.field_t;
              if (0 < var6_int) {
                L5: {
                  var6_int = var6_int - (int)(Math.pow(2.0, (double)this.field_k[param0.field_o] * 0.0004921259842519685) * 16.0 + 0.5);
                  if (-1 < (var6_int ^ -1)) {
                    var6_int = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                param0.field_t = var6_int;
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              param0.field_C.i(this.b(param0, -916428895));
              var7 = param0.field_h;
              var11 = 98 % ((param4 - -44) / 58);
              param0.field_s = param0.field_s + var7.field_k;
              var8 = 0;
              param0.field_B = param0.field_B + 1;
              var9 = 0.000005086263020833333 * (double)((-60 + param0.field_p << 281923688) + (param0.field_r * param0.field_t >> 1891726924));
              if (0 < var7.field_b) {
                L7: {
                  L8: {
                    if (var7.field_i > 0) {
                      break L8;
                    } else {
                      param0.field_i = param0.field_i + 128;
                      if (var12 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  param0.field_i = param0.field_i + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_i) * 128.0);
                  break L7;
                }
                if (819200 > param0.field_i * var7.field_b) {
                  break L6;
                } else {
                  var8 = 1;
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L9: {
              if (null == var7.field_l) {
                break L9;
              } else {
                L10: {
                  L11: {
                    if (-1 <= (var7.field_c ^ -1)) {
                      break L11;
                    } else {
                      param0.field_A = param0.field_A + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_c * var9));
                      if (var12 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  param0.field_A = param0.field_A + 128;
                  break L10;
                }
                L12: while (true) {
                  L13: {
                    L14: {
                      if (param0.field_q >= var7.field_l.length - 2) {
                        break L14;
                      } else {
                        stackOut_31_0 = 65280 & var7.field_l[param0.field_q + 2] << 1861777608;
                        stackOut_31_1 = param0.field_A;
                        stackIn_36_0 = stackOut_31_0;
                        stackIn_36_1 = stackOut_31_1;
                        stackIn_32_0 = stackOut_31_0;
                        stackIn_32_1 = stackOut_31_1;
                        if (var12 != 0) {
                          break L13;
                        } else {
                          if (stackIn_32_0 >= stackIn_32_1) {
                            break L14;
                          } else {
                            param0.field_q = param0.field_q + 2;
                            if (var12 == 0) {
                              continue L12;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                    }
                    stackOut_35_0 = var7.field_l.length - 2;
                    stackOut_35_1 = param0.field_q;
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    break L13;
                  }
                  if (stackIn_36_0 != stackIn_36_1) {
                    break L9;
                  } else {
                    if ((var7.field_l[param0.field_q - -1] ^ -1) != -1) {
                      break L9;
                    } else {
                      var8 = 1;
                      break L9;
                    }
                  }
                }
              }
            }
            L15: {
              if (-1 < (param0.field_l ^ -1)) {
                break L15;
              } else {
                if (var7.field_e == null) {
                  break L15;
                } else {
                  if (0 != (this.field_H[param0.field_o] & 1)) {
                    break L15;
                  } else {
                    L16: {
                      if (-1 < (param0.field_m ^ -1)) {
                        break L16;
                      } else {
                        if (param0 == this.field_t[param0.field_o][param0.field_m]) {
                          break L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                    L17: {
                      L18: {
                        if (var7.field_m > 0) {
                          break L18;
                        } else {
                          param0.field_l = param0.field_l + 128;
                          if (var12 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      param0.field_l = param0.field_l + (int)(0.5 + Math.pow(2.0, (double)var7.field_m * var9) * 128.0);
                      break L17;
                    }
                    L19: while (true) {
                      L20: {
                        L21: {
                          if ((var7.field_e.length - 2 ^ -1) >= (param0.field_y ^ -1)) {
                            break L21;
                          } else {
                            stackOut_50_0 = param0.field_l;
                            stackOut_50_1 = var7.field_e[param0.field_y - -2] << 113770408 & 65280;
                            stackIn_55_0 = stackOut_50_0;
                            stackIn_55_1 = stackOut_50_1;
                            stackIn_51_0 = stackOut_50_0;
                            stackIn_51_1 = stackOut_50_1;
                            if (var12 != 0) {
                              break L20;
                            } else {
                              if (stackIn_51_0 <= stackIn_51_1) {
                                break L21;
                              } else {
                                param0.field_y = param0.field_y + 2;
                                if (var12 == 0) {
                                  continue L19;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                        }
                        stackOut_54_0 = var7.field_e.length - 2;
                        stackOut_54_1 = param0.field_y;
                        stackIn_55_0 = stackOut_54_0;
                        stackIn_55_1 = stackOut_54_1;
                        break L20;
                      }
                      if (stackIn_55_0 != stackIn_55_1) {
                        break L15;
                      } else {
                        var8 = 1;
                        break L15;
                      }
                    }
                  }
                }
              }
            }
            if (var8 != 0) {
              L22: {
                L23: {
                  param0.field_C.e(param0.field_D);
                  if (param3 != null) {
                    break L23;
                  } else {
                    param0.field_C.a(param1);
                    if (var12 == 0) {
                      break L22;
                    } else {
                      break L23;
                    }
                  }
                }
                param0.field_C.b(param3, param2, param1);
                break L22;
              }
              L24: {
                if (!param0.field_C.j()) {
                  break L24;
                } else {
                  this.field_P.field_o.b(param0.field_C);
                  break L24;
                }
              }
              L25: {
                param0.a((byte) 71);
                if (param0.field_l >= 0) {
                  param0.a(true);
                  if ((param0.field_m ^ -1) >= -1) {
                    break L25;
                  } else {
                    if (this.field_t[param0.field_o][param0.field_m] == param0) {
                      this.field_t[param0.field_o][param0.field_m] = null;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                } else {
                  break L25;
                }
              }
              stackOut_71_0 = 1;
              stackIn_72_0 = stackOut_71_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              param0.field_C.a(param0.field_D, this.a((byte) 92, param0), this.a(param0, 81682502));
              stackOut_73_0 = 0;
              stackIn_74_0 = stackOut_73_0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var6 = decompiledCaughtException;
            stackOut_75_0 = (RuntimeException) (var6);
            stackOut_75_1 = new StringBuilder().append("gd.HA(");
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param0 == null) {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L26;
            } else {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L26;
            }
          }
          L27: {
            stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
            stackOut_78_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param3 == null) {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L27;
            } else {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L27;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_72_0 != 0;
          } else {
            return stackIn_74_0 != 0;
          }
        }
    }

    final synchronized boolean c(int param0) {
        if (param0 > -35) {
            this.c(-32, 90);
        }
        return this.field_p.b();
    }

    private final void d(int param0, int param1) {
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if ((param1 ^ -1) <= -1) {
          L0: {
            this.field_E[param1] = 12800;
            this.field_J[param1] = 8192;
            this.field_v[param1] = 16383;
            this.field_u[param1] = 8192;
            this.field_K[param1] = 0;
            this.field_k[param1] = 8192;
            this.b(param1, (byte) 103);
            this.b(-30750, param1);
            this.field_H[param1] = 0;
            this.field_w[param1] = 32767;
            this.field_D[param1] = 256;
            this.field_y[param1] = 0;
            this.b(15, param1, 8192);
            if (param0 > 65) {
              break L0;
            } else {
              this.field_P = (ba) null;
              break L0;
            }
          }
          return;
        } else {
          param1 = 0;
          L1: while (true) {
            if ((param1 ^ -1) <= -17) {
              return;
            } else {
              this.d(67, param1);
              param1++;
              if (var4 == 0) {
                continue L1;
              } else {
                return;
              }
            }
          }
        }
    }

    private final void c(int param0, int param1, int param2) {
        if (param1 != 16532) {
            this.field_C = (int[]) null;
        }
        this.field_j[param2] = param0;
        this.field_z[param2] = tq.b(-128, param0);
        this.e(-13961, param0, param2);
    }

    public gd() {
        this.field_O = new mb[16][128];
        this.field_r = 1000000;
        this.field_m = new int[16];
        this.field_N = 256;
        this.field_j = new int[16];
        this.field_t = new mb[16][128];
        this.field_H = new int[16];
        this.field_z = new int[16];
        this.field_E = new int[16];
        this.field_w = new int[16];
        this.field_k = new int[16];
        this.field_C = new int[16];
        this.field_n = new int[16];
        this.field_D = new int[16];
        this.field_v = new int[16];
        this.field_y = new int[16];
        this.field_J = new int[16];
        this.field_x = new int[16];
        this.field_u = new int[16];
        this.field_K = new int[16];
        this.field_p = new mm();
        this.field_P = new ba((gd) (this));
        this.field_G = new f(128);
        this.a(256, -1, false);
        this.b(-1, true);
    }

    static {
    }
}
