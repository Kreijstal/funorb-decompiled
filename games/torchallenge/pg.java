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
        int var4 = TorChallenge.field_F ? 1 : 0;
        ((pg) this).field_u.a(param0);
        dl var3 = (dl) (Object) ((pg) this).field_o.c((byte) -128);
        while (var3 != null) {
            if (!((pg) this).field_t.a(var3, (byte) 22)) {
                var2 = param0;
                while (var3.field_z < var2) {
                    this.a(var3.field_z, (byte) -45, var3);
                    var2 = var2 - var3.field_z;
                    // ifne L120
                }
                this.a(var2, (byte) -45, var3);
                var3.field_z = var3.field_z - var2;
            }
            var3 = (dl) (Object) ((pg) this).field_o.c(-270);
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
        int var5 = 0;
        int var4 = 0;
        int var7 = TorChallenge.field_F ? 1 : 0;
        ((pg) this).field_u.b(param0, param1, param2);
        dl var6 = (dl) (Object) ((pg) this).field_o.c((byte) 112);
        while (var6 != null) {
            if (!(((pg) this).field_t.a(var6, (byte) 22))) {
                var5 = param2;
                var4 = param1;
                while (var5 > var6.field_z) {
                    this.a(var6, var4 + var5, var6.field_z, (byte) 106, param0, var4);
                    var5 = var5 - var6.field_z;
                    var4 = var4 + var6.field_z;
                    // ifne L176
                }
                this.a(var6, var4 - -var5, var5, (byte) 72, param0, var4);
                var6.field_z = var6.field_z - var5;
            }
            var6 = (dl) (Object) ((pg) this).field_o.c(-270);
        }
    }

    final static byte[] a(int param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        byte[] var5 = null;
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
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = new uf(param1);
                    if (param0 == -1048576) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    pg.c(38);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var3 = var9.j(-107);
                    var4 = var9.i(29);
                    if (var4 < 0) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (ai.field_c == 0) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (ai.field_c >= var4) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    throw new RuntimeException();
                }
                case 7: {
                    if (-1 == (var3 ^ -1)) {
                        statePc = 21;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var5_int = var9.i(92);
                    if (var5_int < 0) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (ai.field_c == 0) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (ai.field_c < var5_int) {
                        statePc = 12;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 12: {
                    throw new RuntimeException();
                }
                case 13: {
                    var16 = new byte[var5_int];
                    var14 = var16;
                    var12 = var14;
                    var10 = var12;
                    var6 = var10;
                    if (-2 == (var3 ^ -1)) {
                        statePc = 19;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var7 = (Object) (Object) jd.field_b;
                    // monitorenter jd.field_b
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    try {
                        jd.field_b.a(var16, (byte) -117, var9);
                        // monitorexit var7
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 18: {
                    throw (RuntimeException) (Object) var8;
                }
                case 19: {
                    int discarded$1 = nl.a(var16, var5_int, param1, var4, 9);
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    return var6;
                }
                case 21: {
                    var17 = new byte[var4];
                    var15 = var17;
                    var13 = var15;
                    var11 = var13;
                    var5 = var11;
                    var9.a(param0 ^ -1048518, var17, var4, 0);
                    return var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a() {
        return 0;
    }

    private final void a(int param0, byte param1, dl param2) {
        int var4 = 0;
        int var5 = 0;
        kb stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        kb stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        kb stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        kb stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        kb stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        kb stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        L0: {
          if ((((pg) this).field_t.field_J[param2.field_G] & 4) == 0) {
            break L0;
          } else {
            if (param2.field_F < 0) {
              var4 = ((pg) this).field_t.field_N[param2.field_G] / kh.field_p;
              var5 = (var4 + 1048575 - param2.field_x) / var4;
              param2.field_x = 1048575 & param0 * var4 + param2.field_x;
              if (var5 > param0) {
                break L0;
              } else {
                L1: {
                  if (0 == ((pg) this).field_t.field_y[param2.field_G]) {
                    param2.field_K = nc.b(param2.field_k, param2.field_K.e(), param2.field_K.f(), param2.field_K.i());
                    break L1;
                  } else {
                    L2: {
                      param2.field_K = nc.b(param2.field_k, param2.field_K.e(), 0, param2.field_K.i());
                      stackOut_5_0 = ((pg) this).field_t;
                      stackOut_5_1 = param1 + 301;
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
                        break L2;
                      } else {
                        stackOut_6_0 = (kb) (Object) stackIn_6_0;
                        stackOut_6_1 = stackIn_6_1;
                        stackOut_6_2 = 1;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        stackIn_8_2 = stackOut_6_2;
                        break L2;
                      }
                    }
                    ((kb) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2 != 0, param2);
                    break L1;
                  }
                }
                L3: {
                  if (param2.field_q.field_j[param2.field_p] < 0) {
                    param2.field_K.e(-1);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                param0 = param2.field_x / var4;
                break L0;
              }
            } else {
              break L0;
            }
          }
        }
        if (param1 == -45) {
          param2.field_K.a(param0);
          return;
        } else {
          return;
        }
    }

    private final void a(dl param0, int param1, int param2, byte param3, int[] param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        nc var11 = null;
        int var12 = 0;
        kb stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        kb stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        kb stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        kb stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        kb stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        kb stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        L0: {
          var12 = TorChallenge.field_F ? 1 : 0;
          if (0 == (((pg) this).field_t.field_J[param0.field_G] & 4)) {
            break L0;
          } else {
            if ((param0.field_F ^ -1) <= -1) {
              break L0;
            } else {
              var7 = ((pg) this).field_t.field_N[param0.field_G] / kh.field_p;
              L1: while (true) {
                var8 = (var7 + 1048575 - param0.field_x) / var7;
                if (var8 <= param2) {
                  L2: {
                    param0.field_K.b(param4, param5, var8);
                    param2 = param2 - var8;
                    param5 = param5 + var8;
                    param0.field_x = param0.field_x + (-1048576 + var7 * var8);
                    var9 = kh.field_p / 100;
                    var10 = 262144 / var7;
                    if (var9 <= var10) {
                      break L2;
                    } else {
                      var9 = var10;
                      break L2;
                    }
                  }
                  L3: {
                    var11 = param0.field_K;
                    if (-1 == (((pg) this).field_t.field_y[param0.field_G] ^ -1)) {
                      param0.field_K = nc.b(param0.field_k, var11.e(), var11.f(), var11.i());
                      break L3;
                    } else {
                      L4: {
                        param0.field_K = nc.b(param0.field_k, var11.e(), 0, var11.i());
                        stackOut_8_0 = ((pg) this).field_t;
                        stackOut_8_1 = 256;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if ((param0.field_q.field_j[param0.field_p] ^ -1) <= -1) {
                          stackOut_10_0 = (kb) (Object) stackIn_10_0;
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = 0;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          stackIn_11_2 = stackOut_10_2;
                          break L4;
                        } else {
                          stackOut_9_0 = (kb) (Object) stackIn_9_0;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = 1;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          stackIn_11_2 = stackOut_9_2;
                          break L4;
                        }
                      }
                      ((kb) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_11_2 != 0, param0);
                      param0.field_K.a(var9, var11.f());
                      break L3;
                    }
                  }
                  L5: {
                    if (param0.field_q.field_j[param0.field_p] >= 0) {
                      break L5;
                    } else {
                      param0.field_K.e(-1);
                      break L5;
                    }
                  }
                  var11.g(var9);
                  var11.b(param4, param5, param1 + -param5);
                  if (!var11.l()) {
                    continue L1;
                  } else {
                    ((pg) this).field_u.a((qd) (Object) var11);
                    continue L1;
                  }
                } else {
                  param0.field_x = param0.field_x + var7 * param2;
                  break L0;
                }
              }
            }
          }
        }
        L6: {
          if (param3 > 51) {
            break L6;
          } else {
            qd discarded$1 = ((pg) this).c();
            break L6;
          }
        }
        param0.field_K.b(param4, param5, param2);
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
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        var1 = 0;
        var2 = param0;
        L0: while (true) {
          if (var2 >= ea.field_g.length) {
            if (0 != var1) {
              return true;
            } else {
              return false;
            }
          } else {
            if (null != ea.field_g[var2]) {
              if ((ea.field_g[var2].field_F ^ -1) == -20) {
                var1++;
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
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
        fc var3 = new fc();
        ((gl) (Object) var3).field_d = param0;
        if (param2 >= -16) {
            field_m = -121;
        }
        ((gl) (Object) var3).field_i = param1;
        return (gl) (Object) var3;
    }

    pg(kb param0) {
        ((pg) this).field_o = new sl();
        ((pg) this).field_u = new jk();
        ((pg) this).field_t = param0;
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
