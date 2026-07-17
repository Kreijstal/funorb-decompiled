/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cd implements Runnable {
    static int field_c;
    static String field_a;
    static String field_h;
    static int field_e;
    static String field_d;
    private th field_f;
    private Thread field_i;
    private boolean field_g;
    int field_b;

    final static void a(int param0, va param1, int param2, int param3, int param4) {
        param1.b((byte) 11, 12);
        if (param2 != 20443) {
            return;
        }
        try {
            param1.b(-1947079288, 17);
            param1.b(-1947079288, param4);
            param1.b(-1947079288, param3);
            param1.b((byte) 11, param0);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "cd.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          wl.a("", param0, (byte) -98);
          ga.a(param0, (byte) -72);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("cd.C(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + -113 + 41);
        }
    }

    final void a(byte param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        if (param0 > 58) {
          ((cd) this).field_g = true;
          var2 = (Object) (Object) ((cd) this).field_f;
          synchronized (var2) {
            L0: {
              ((Object) (Object) ((cd) this).field_f).notifyAll();
              break L0;
            }
          }
          try {
            L1: {
              ((cd) this).field_i.join();
              break L1;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L2: {
              interruptedException = (InterruptedException) (Object) decompiledCaughtException;
              break L2;
            }
          }
          ((cd) this).field_i = null;
          return;
        } else {
          return;
        }
    }

    final static int a(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            va var2 = null;
            int stackIn_12_0 = 0;
            int stackIn_23_0 = 0;
            int stackIn_26_0 = 0;
            int stackIn_31_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_11_0 = 0;
            int stackOut_25_0 = 0;
            int stackOut_22_0 = 0;
            int stackOut_30_0 = 0;
            if (ii.field_f.field_k < 4) {
              try {
                L0: {
                  L1: {
                    if (wc.field_k != 0) {
                      break L1;
                    } else {
                      hb.field_k = vk.field_p.a(aa.field_hb, nf.field_b, (byte) -20);
                      wc.field_k = wc.field_k + 1;
                      break L1;
                    }
                  }
                  L2: {
                    if (1 != wc.field_k) {
                      break L2;
                    } else {
                      if (hb.field_k.field_a != 2) {
                        if (hb.field_k.field_a == 1) {
                          wc.field_k = wc.field_k + 1;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        stackOut_11_0 = mh.a((byte) -121, -1);
                        stackIn_12_0 = stackOut_11_0;
                        return stackIn_12_0;
                      }
                    }
                  }
                  L3: {
                    if (wc.field_k != 2) {
                      break L3;
                    } else {
                      si.field_q = new hi((java.net.Socket) hb.field_k.field_e, vk.field_p);
                      var2 = new va(13);
                      cd.a(ej.field_d, var2, 20443, fg.field_c, he.field_q);
                      var2.b((byte) 11, 15);
                      var2.f(pg.field_j, 613003928);
                      si.field_q.a(13, var2.field_k, 1, 0);
                      wc.field_k = wc.field_k + 1;
                      la.field_g = d.a((byte) 109) + 30000L;
                      break L3;
                    }
                  }
                  L4: {
                    if (wc.field_k == 3) {
                      if (si.field_q.c((byte) 89) > 0) {
                        var1_int = si.field_q.a((byte) 19);
                        if (var1_int == 0) {
                          wc.field_k = wc.field_k + 1;
                          break L4;
                        } else {
                          stackOut_25_0 = mh.a((byte) 85, var1_int);
                          stackIn_26_0 = stackOut_25_0;
                          return stackIn_26_0;
                        }
                      } else {
                        if (la.field_g >= d.a((byte) 127)) {
                          break L4;
                        } else {
                          stackOut_22_0 = mh.a((byte) 122, -2);
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  if (wc.field_k == 4) {
                    ii.field_f.a(gi.field_b, (Object) (Object) si.field_q, 122);
                    wc.field_k = 0;
                    hb.field_k = null;
                    si.field_q = null;
                    stackOut_30_0 = 0;
                    stackIn_31_0 = stackOut_30_0;
                    break L0;
                  } else {
                    return -1;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return mh.a((byte) 87, -3);
              }
              return stackIn_31_0;
            } else {
              if (-1 == ii.field_f.field_n) {
                return 3;
              } else {
                if (ii.field_f.field_n == -2) {
                  return 4;
                } else {
                  return 1;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static rb[] a(boolean param0, vh param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        rb[] var4 = null;
        int var5 = 0;
        rb var6 = null;
        int var7 = 0;
        jh var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        rb[] stackIn_4_0 = null;
        long stackIn_8_0 = 0L;
        long stackIn_9_0 = 0L;
        long stackIn_10_0 = 0L;
        int stackIn_10_1 = 0;
        rb[] stackIn_13_0 = null;
        rb[] stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        rb[] stackOut_3_0 = null;
        rb[] stackOut_19_0 = null;
        rb[] stackOut_12_0 = null;
        long stackOut_7_0 = 0L;
        long stackOut_9_0 = 0L;
        int stackOut_9_1 = 0;
        long stackOut_8_0 = 0L;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var7 = wizardrun.field_H;
        try {
          L0: {
            if (!param1.a(169978736)) {
              stackOut_3_0 = new rb[]{};
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var8 = param1.a(false);
              L1: while (true) {
                if (var8.field_a != 0) {
                  if (var8.field_a != 2) {
                    L2: {
                      var12 = (int[]) var8.field_e;
                      var11 = var12;
                      var10 = var11;
                      var9 = var10;
                      var3 = var9;
                      var4 = new rb[var12.length >> 2];
                      if (param0) {
                        break L2;
                      } else {
                        field_d = null;
                        break L2;
                      }
                    }
                    var5 = 0;
                    L3: while (true) {
                      if (var4.length <= var5) {
                        stackOut_19_0 = (rb[]) var4;
                        stackIn_20_0 = stackOut_19_0;
                        break L0;
                      } else {
                        var6 = new rb();
                        var4[var5] = var6;
                        var6.field_g = var3[var5 << 2];
                        var6.field_h = var3[1 + (var5 << 2)];
                        var6.field_c = var3[(var5 << 2) + 2];
                        var6.field_f = var3[(var5 << 2) - -3];
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    stackOut_12_0 = new rb[]{};
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                } else {
                  L4: {
                    stackOut_7_0 = 10L;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (param0) {
                      stackOut_9_0 = stackIn_9_0;
                      stackOut_9_1 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      break L4;
                    } else {
                      stackOut_8_0 = stackIn_8_0;
                      stackOut_8_1 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      break L4;
                    }
                  }
                  tg.a(stackIn_10_0, stackIn_10_1 != 0);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("cd.E(").append(param0).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L5;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
        return stackIn_20_0;
    }

    final sk a(byte param0, int param1, sg param2) {
        sk var4 = null;
        RuntimeException var4_ref = null;
        Object stackIn_2_0 = null;
        sk stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        sk stackOut_3_0 = null;
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
            if (param0 == -46) {
              var4 = new sk();
              var4.field_w = param2;
              var4.field_o = (long)param1;
              var4.field_x = 3;
              var4.field_r = false;
              this.a(var4, -1);
              stackOut_3_0 = (sk) var4;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (sk) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4_ref;
            stackOut_5_1 = new StringBuilder().append("cd.J(").append(param0).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
          throw bd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    final sk a(byte param0, sg param1, byte[] param2, int param3) {
        sk var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        sk stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        sk stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            var5 = new sk();
            var5.field_o = (long)param3;
            var5.field_x = 2;
            var5.field_w = param1;
            var5.field_A = param2;
            var6 = -115 % ((param0 - -68) / 43);
            var5.field_r = false;
            this.a(var5, -1);
            stackOut_0_0 = (sk) var5;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5_ref;
            stackOut_2_1 = new StringBuilder().append("cd.F(").append(param0).append(44);
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
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param3 + 41);
        }
        return stackIn_1_0;
    }

    final sk a(int param0, int param1, sg param2) {
        sk var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        sk var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        sk stackIn_9_0 = null;
        sk stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        sk stackOut_8_0 = null;
        sk stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var8 = wizardrun.field_H;
        try {
          L0: {
            var4 = new sk();
            var4.field_x = 1;
            var5 = (Object) (Object) ((cd) this).field_f;
            synchronized (var5) {
              L1: {
                var6 = (sk) (Object) ((cd) this).field_f.a(param1 ^ param1);
                L2: while (true) {
                  if (var6 == null) {
                    break L1;
                  } else {
                    L3: {
                      if (~var6.field_o != ~(long)param0) {
                        break L3;
                      } else {
                        if (var6.field_w != param2) {
                          break L3;
                        } else {
                          if (2 == var6.field_x) {
                            var4.field_s = false;
                            var4.field_A = var6.field_A;
                            stackOut_8_0 = (sk) var4;
                            stackIn_9_0 = stackOut_8_0;
                            return stackIn_9_0;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    var6 = (sk) (Object) ((cd) this).field_f.d(123);
                    continue L2;
                  }
                }
              }
            }
            var4.field_A = param2.a(true, param0);
            var4.field_s = false;
            var4.field_r = true;
            stackOut_15_0 = (sk) var4;
            stackIn_16_0 = stackOut_15_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4_ref;
            stackOut_17_1 = new StringBuilder().append("cd.H(").append(param0).append(44).append(param1).append(44);
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
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_16_0;
    }

    private final void a(sk param0, int param1) {
        synchronized (((cd) this).field_f) {
            ((cd) this).field_f.a((rk) (Object) param0, 14);
            ((cd) this).field_b = ((cd) this).field_b + 1;
            ((Object) (Object) ((cd) this).field_f).notifyAll();
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        field_d = null;
        field_a = null;
    }

    public final void run() {
        try {
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            sk var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var5 = wizardrun.field_H;
            L0: while (true) {
              if (((cd) this).field_g) {
                return;
              } else {
                var2 = (Object) (Object) ((cd) this).field_f;
                synchronized (var2) {
                  L1: {
                    var7 = (sk) (Object) ((cd) this).field_f.b(46);
                    if (var7 == null) {
                      {
                        L2: {
                          ((Object) (Object) ((cd) this).field_f).wait();
                          break L2;
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    } else {
                      ((cd) this).field_b = ((cd) this).field_b - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    }
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  continue L0;
                } else {
                  try {
                    L4: {
                      L5: {
                        if (var7.field_x == 2) {
                          boolean discarded$1 = var7.field_w.a(var7.field_A, (int)var7.field_o, 0, var7.field_A.length);
                          var7.field_s = false;
                          break L5;
                        } else {
                          if (3 == var7.field_x) {
                            var7.field_A = var7.field_w.a(true, (int)var7.field_o);
                            var7.field_s = false;
                            break L5;
                          } else {
                            var7.field_s = false;
                            break L5;
                          }
                        }
                      }
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L6: {
                      var2_ref = (Exception) (Object) decompiledCaughtException;
                      var6 = null;
                      rg.a((Throwable) (Object) var2_ref, (String) null, -562);
                      var7.field_s = false;
                      break L6;
                    }
                  }
                  continue L0;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    cd(vh param0) {
        jh var2 = null;
        ((cd) this).field_f = new th();
        ((cd) this).field_g = false;
        ((cd) this).field_b = 0;
        try {
            var2 = param0.a((byte) -98, (Runnable) this, 5);
            while (var2.field_a == 0) {
                tg.a(10L, false);
            }
            if (var2.field_a == 2) {
                throw new RuntimeException();
            }
            ((cd) this).field_i = (Thread) var2.field_e;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "cd.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_d = "Log in / Create account";
        field_h = "You get extra lives for collecting points.";
    }
}
