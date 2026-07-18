/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg extends qd {
    static int field_q;
    private kb field_t;
    static boolean field_s;
    sl field_o;
    static nc field_p;
    static int field_m;
    static int[] field_r;
    jk field_u;
    static int[][] field_n;

    final void a(int param0) {
        int var2 = 0;
        dl var3 = null;
        int var4 = 0;
        var4 = TorChallenge.field_F ? 1 : 0;
        ((pg) this).field_u.a(param0);
        var3 = (dl) (Object) ((pg) this).field_o.c((byte) -128);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              if (((pg) this).field_t.a(var3, (byte) 22)) {
                break L1;
              } else {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_z >= var2) {
                    this.a(var2, (byte) -45, var3);
                    var3.field_z = var3.field_z - var2;
                    break L1;
                  } else {
                    this.a(var3.field_z, (byte) -45, var3);
                    var2 = var2 - var3.field_z;
                    if (((pg) this).field_t.a(0, (byte) -122, (int[]) null, var2, var3)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            var3 = (dl) (Object) ((pg) this).field_o.c(-270);
            continue L0;
          }
        }
    }

    final static int e(int param0) {
        int var1 = -60 % ((param0 - -80) / 42);
        return vf.field_a;
    }

    final qd b() {
        dl var1 = null;
        L0: while (true) {
          var1 = (dl) (Object) ((pg) this).field_o.c(-270);
          if (var1 != null) {
            if (var1.field_K != null) {
              return (qd) (Object) var1.field_K;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        dl var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            ((pg) this).field_u.b(param0, param1, param2);
            var6 = (dl) (Object) ((pg) this).field_o.c((byte) 112);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (!((pg) this).field_t.a(var6, (byte) 22)) {
                    var5 = param2;
                    var4_int = param1;
                    L3: while (true) {
                      if (var5 <= var6.field_z) {
                        this.a(var6, var4_int - -var5, var5, (byte) 72, param0, var4_int);
                        var6.field_z = var6.field_z - var5;
                        break L2;
                      } else {
                        this.a(var6, var4_int + var5, var6.field_z, (byte) 106, param0, var4_int);
                        var5 = var5 - var6.field_z;
                        var4_int = var4_int + var6.field_z;
                        if (((pg) this).field_t.a(var4_int, (byte) 109, param0, var5, var6)) {
                          break L2;
                        } else {
                          continue L3;
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                var6 = (dl) (Object) ((pg) this).field_o.c(-270);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("pg.E(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static byte[] a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        uf var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] stackIn_21_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_22_0 = null;
        byte[] stackOut_20_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            L1: {
              var9 = new uf(param1);
              if (param0 == -1048576) {
                break L1;
              } else {
                pg.c(38);
                break L1;
              }
            }
            L2: {
              var3 = var9.j(-107);
              var4 = var9.i(29);
              if (var4 < 0) {
                break L2;
              } else {
                L3: {
                  if (ai.field_c == 0) {
                    break L3;
                  } else {
                    if (ai.field_c >= var4) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                if (var3 == 0) {
                  var17 = new byte[var4];
                  var15 = var17;
                  var13 = var15;
                  var11 = var13;
                  var5 = var11;
                  var9.a(param0 ^ -1048518, var17, var4, 0);
                  stackOut_22_0 = (byte[]) var5;
                  stackIn_23_0 = stackOut_22_0;
                  break L0;
                } else {
                  L4: {
                    var5_int = var9.i(92);
                    if (var5_int < 0) {
                      break L4;
                    } else {
                      L5: {
                        if (ai.field_c == 0) {
                          break L5;
                        } else {
                          if (ai.field_c < var5_int) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        var16 = new byte[var5_int];
                        var14 = var16;
                        var12 = var14;
                        var10 = var12;
                        var6 = var10;
                        if (var3 == 1) {
                          int discarded$1 = nl.a(var16, var5_int, param1, var4, 9);
                          break L6;
                        } else {
                          var7 = (Object) (Object) jd.field_b;
                          synchronized (var7) {
                            L7: {
                              jd.field_b.a(var16, (byte) -117, var9);
                              break L7;
                            }
                          }
                          break L6;
                        }
                      }
                      stackOut_20_0 = (byte[]) var6;
                      stackIn_21_0 = stackOut_20_0;
                      return stackIn_21_0;
                    }
                  }
                  throw new RuntimeException();
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var2;
            stackOut_24_1 = new StringBuilder().append("pg.D(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
        return stackIn_23_0;
    }

    final int a() {
        return 0;
    }

    private final void a(int param0, byte param1, dl param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        kb stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        kb stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        kb stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        kb stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        kb stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        kb stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
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
            L1: {
              if ((((pg) this).field_t.field_J[param2.field_G] & 4) == 0) {
                break L1;
              } else {
                if (param2.field_F < 0) {
                  var4_int = ((pg) this).field_t.field_N[param2.field_G] / kh.field_p;
                  var5 = (var4_int + 1048575 - param2.field_x) / var4_int;
                  param2.field_x = 1048575 & param0 * var4_int + param2.field_x;
                  if (var5 > param0) {
                    break L1;
                  } else {
                    L2: {
                      if (0 == ((pg) this).field_t.field_y[param2.field_G]) {
                        param2.field_K = nc.b(param2.field_k, param2.field_K.e(), param2.field_K.f(), param2.field_K.i());
                        break L2;
                      } else {
                        L3: {
                          param2.field_K = nc.b(param2.field_k, param2.field_K.e(), 0, param2.field_K.i());
                          stackOut_5_0 = ((pg) this).field_t;
                          stackOut_5_1 = 256;
                          stackIn_7_0 = stackOut_5_0;
                          stackIn_7_1 = stackOut_5_1;
                          stackIn_6_0 = stackOut_5_0;
                          stackIn_6_1 = stackOut_5_1;
                          if (param2.field_q.field_j[param2.field_p] >= 0) {
                            stackOut_7_0 = (kb) (Object) stackIn_7_0;
                            stackOut_7_1 = stackIn_7_1;
                            stackOut_7_2 = 0;
                            stackIn_8_0 = stackOut_7_0;
                            stackIn_8_1 = stackOut_7_1;
                            stackIn_8_2 = stackOut_7_2;
                            break L3;
                          } else {
                            stackOut_6_0 = (kb) (Object) stackIn_6_0;
                            stackOut_6_1 = stackIn_6_1;
                            stackOut_6_2 = 1;
                            stackIn_8_0 = stackOut_6_0;
                            stackIn_8_1 = stackOut_6_1;
                            stackIn_8_2 = stackOut_6_2;
                            break L3;
                          }
                        }
                        ((kb) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2 != 0, param2);
                        break L2;
                      }
                    }
                    L4: {
                      if (param2.field_q.field_j[param2.field_p] < 0) {
                        param2.field_K.e(-1);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    param0 = param2.field_x / var4_int;
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            param2.field_K.a(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("pg.B(").append(param0).append(',').append(-45).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
    }

    private final void a(dl param0, int param1, int param2, byte param3, int[] param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        nc var11 = null;
        int var12 = 0;
        kb stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        kb stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        kb stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
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
        RuntimeException decompiledCaughtException = null;
        kb stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        kb stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        kb stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
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
        var12 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 == (((pg) this).field_t.field_J[param0.field_G] & 4)) {
                break L1;
              } else {
                if (param0.field_F >= 0) {
                  break L1;
                } else {
                  var7_int = ((pg) this).field_t.field_N[param0.field_G] / kh.field_p;
                  L2: while (true) {
                    var8 = (var7_int + 1048575 - param0.field_x) / var7_int;
                    if (var8 <= param2) {
                      L3: {
                        param0.field_K.b(param4, param5, var8);
                        param2 = param2 - var8;
                        param5 = param5 + var8;
                        param0.field_x = param0.field_x + (-1048576 + var7_int * var8);
                        var9 = kh.field_p / 100;
                        var10 = 262144 / var7_int;
                        if (var9 <= var10) {
                          break L3;
                        } else {
                          var9 = var10;
                          break L3;
                        }
                      }
                      L4: {
                        var11 = param0.field_K;
                        if (((pg) this).field_t.field_y[param0.field_G] == 0) {
                          param0.field_K = nc.b(param0.field_k, var11.e(), var11.f(), var11.i());
                          break L4;
                        } else {
                          L5: {
                            param0.field_K = nc.b(param0.field_k, var11.e(), 0, var11.i());
                            stackOut_9_0 = ((pg) this).field_t;
                            stackOut_9_1 = 256;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            if (param0.field_q.field_j[param0.field_p] >= 0) {
                              stackOut_11_0 = (kb) (Object) stackIn_11_0;
                              stackOut_11_1 = stackIn_11_1;
                              stackOut_11_2 = 0;
                              stackIn_12_0 = stackOut_11_0;
                              stackIn_12_1 = stackOut_11_1;
                              stackIn_12_2 = stackOut_11_2;
                              break L5;
                            } else {
                              stackOut_10_0 = (kb) (Object) stackIn_10_0;
                              stackOut_10_1 = stackIn_10_1;
                              stackOut_10_2 = 1;
                              stackIn_12_0 = stackOut_10_0;
                              stackIn_12_1 = stackOut_10_1;
                              stackIn_12_2 = stackOut_10_2;
                              break L5;
                            }
                          }
                          ((kb) (Object) stackIn_12_0).a(stackIn_12_1, stackIn_12_2 != 0, param0);
                          param0.field_K.a(var9, var11.f());
                          break L4;
                        }
                      }
                      L6: {
                        if (param0.field_q.field_j[param0.field_p] >= 0) {
                          break L6;
                        } else {
                          param0.field_K.e(-1);
                          break L6;
                        }
                      }
                      var11.g(var9);
                      var11.b(param4, param5, param1 + -param5);
                      if (!var11.l()) {
                        continue L2;
                      } else {
                        ((pg) this).field_u.a((qd) (Object) var11);
                        continue L2;
                      }
                    } else {
                      param0.field_x = param0.field_x + var7_int * param2;
                      break L1;
                    }
                  }
                }
              }
            }
            L7: {
              if (param3 > 51) {
                break L7;
              } else {
                qd discarded$1 = ((pg) this).c();
                break L7;
              }
            }
            param0.field_K.b(param4, param5, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var7;
            stackOut_23_1 = new StringBuilder().append("pg.L(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          L9: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param4 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param5 + ')');
        }
    }

    final qd c() {
        dl var1 = (dl) (Object) ((pg) this).field_o.c((byte) 112);
        if (var1 == null) {
            return null;
        }
        if (!(null == var1.field_K)) {
            return (qd) (Object) var1.field_K;
        }
        return ((pg) this).b();
    }

    final static boolean d(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (var2 >= ea.field_g.length) {
                if (0 != var1_int) {
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0 != 0;
                }
              } else {
                L2: {
                  if (null == ea.field_g[var2]) {
                    break L2;
                  } else {
                    if (ea.field_g[var2].field_F != 19) {
                      break L2;
                    } else {
                      var1_int++;
                      break L2;
                    }
                  }
                }
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "pg.C(" + 0 + ')');
        }
        return stackIn_11_0 != 0;
    }

    public static void c(int param0) {
        if (param0 != 16) {
            int discarded$0 = pg.e(93);
        }
        field_n = null;
        field_r = null;
        field_p = null;
    }

    final static gl a(int param0, String param1, int param2) {
        fc var3 = null;
        RuntimeException var3_ref = null;
        fc stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        fc stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3 = new fc();
            ((gl) (Object) var3).field_d = param0;
            ((gl) (Object) var3).field_i = param1;
            stackOut_0_0 = (fc) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("pg.K(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + -111 + ')');
        }
        return (gl) (Object) stackIn_1_0;
    }

    pg(kb param0) {
        ((pg) this).field_o = new sl();
        ((pg) this).field_u = new jk();
        try {
            ((pg) this).field_t = param0;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "pg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = 0;
        field_s = false;
        field_p = null;
        field_n = new int[][]{new int[2], new int[2], new int[2]};
    }
}
