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
            throw bd.a((Throwable) ((Object) runtimeException), "cd.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        RuntimeException runtimeException = null;
        va var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              wl.a("", param0, (byte) -98);
              ga.a(param0, (byte) -72);
              if (param1 == -113) {
                break L1;
              } else {
                var3 = (va) null;
                cd.a(-24, (va) null, 100, -92, -33);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("cd.C(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void a(byte param0) {
        try {
            if (param0 <= 58) {
                return;
            }
            this.field_g = true;
            synchronized (this.field_f) {
                this.field_f.notifyAll();
            }
            try {
                this.field_i.join();
            } catch (InterruptedException interruptedException) {
            }
            this.field_i = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0) {
        try {
            rb[] discarded$1 = null;
            IOException var1 = null;
            int var1_int = 0;
            vh var2 = null;
            va var3 = null;
            int stackIn_15_0 = 0;
            int stackIn_26_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_34_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_14_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_25_0 = 0;
            int stackOut_33_0 = 0;
            L0: {
              if (param0 == -18067) {
                break L0;
              } else {
                var2 = (vh) null;
                discarded$1 = cd.a(true, (vh) null);
                break L0;
              }
            }
            if (-5 < (ii.field_f.field_k ^ -1)) {
              try {
                L1: {
                  L2: {
                    if (wc.field_k != 0) {
                      break L2;
                    } else {
                      hb.field_k = vk.field_p.a(aa.field_hb, nf.field_b, (byte) -20);
                      wc.field_k = wc.field_k + 1;
                      break L2;
                    }
                  }
                  L3: {
                    if (1 != wc.field_k) {
                      break L3;
                    } else {
                      if ((hb.field_k.field_a ^ -1) != -3) {
                        if (-2 == (hb.field_k.field_a ^ -1)) {
                          wc.field_k = wc.field_k + 1;
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        stackOut_14_0 = mh.a((byte) -121, -1);
                        stackIn_15_0 = stackOut_14_0;
                        decompiledRegionSelector0 = 0;
                        break L1;
                      }
                    }
                  }
                  L4: {
                    if ((wc.field_k ^ -1) != -3) {
                      break L4;
                    } else {
                      si.field_q = new hi((java.net.Socket) (hb.field_k.field_e), vk.field_p);
                      var3 = new va(13);
                      cd.a(ej.field_d, var3, 20443, fg.field_c, he.field_q);
                      var3.b((byte) 11, 15);
                      var3.f(pg.field_j, 613003928);
                      si.field_q.a(13, var3.field_k, 1, 0);
                      wc.field_k = wc.field_k + 1;
                      la.field_g = d.a((byte) 109) + 30000L;
                      break L4;
                    }
                  }
                  L5: {
                    if (-4 == (wc.field_k ^ -1)) {
                      if ((si.field_q.c((byte) 89) ^ -1) < -1) {
                        var1_int = si.field_q.a((byte) 19);
                        if (-1 == (var1_int ^ -1)) {
                          wc.field_k = wc.field_k + 1;
                          break L5;
                        } else {
                          stackOut_28_0 = mh.a((byte) 85, var1_int);
                          stackIn_29_0 = stackOut_28_0;
                          decompiledRegionSelector0 = 2;
                          break L1;
                        }
                      } else {
                        if (la.field_g >= d.a((byte) 127)) {
                          break L5;
                        } else {
                          stackOut_25_0 = mh.a((byte) 122, -2);
                          stackIn_26_0 = stackOut_25_0;
                          decompiledRegionSelector0 = 1;
                          break L1;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                  if (wc.field_k == 4) {
                    ii.field_f.a(gi.field_b, si.field_q, param0 ^ -18153);
                    wc.field_k = 0;
                    hb.field_k = null;
                    si.field_q = null;
                    stackOut_33_0 = 0;
                    stackIn_34_0 = stackOut_33_0;
                    decompiledRegionSelector0 = 3;
                    break L1;
                  } else {
                    return -1;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return mh.a((byte) 87, -3);
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_15_0;
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return stackIn_26_0;
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return stackIn_29_0;
                  } else {
                    return stackIn_34_0;
                  }
                }
              }
            } else {
              if (-1 == ii.field_f.field_n) {
                return 3;
              } else {
                if (1 != (ii.field_f.field_n ^ -1)) {
                  return 1;
                } else {
                  return 4;
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
        int decompiledRegionSelector0 = 0;
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
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var8 = param1.a(false);
              L1: while (true) {
                if (var8.field_a != 0) {
                  if (var8.field_a != 2) {
                    L2: {
                      var10 = (int[]) (var8.field_e);
                      var9 = var10;
                      var3 = var9;
                      var4 = new rb[var10.length >> -1849711422];
                      if (param0) {
                        break L2;
                      } else {
                        field_d = (String) null;
                        break L2;
                      }
                    }
                    var5 = 0;
                    L3: while (true) {
                      if (var4.length <= var5) {
                        stackOut_19_0 = (rb[]) (var4);
                        stackIn_20_0 = stackOut_19_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var6 = new rb();
                        var4[var5] = var6;
                        var6.field_g = var3[var5 << -1263765886];
                        var6.field_h = var3[1 + (var5 << 1927111682)];
                        var6.field_c = var3[(var5 << 1196843522) + 2];
                        var6.field_f = var3[(var5 << -280611070) - -3];
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    stackOut_12_0 = new rb[]{};
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
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
            stackOut_21_0 = (RuntimeException) (var2);
            stackOut_21_1 = new StringBuilder().append("cd.E(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L5;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_20_0;
          }
        }
    }

    final sk a(byte param0, int param1, sg param2) {
        sk var4 = null;
        RuntimeException var4_ref = null;
        sk stackIn_2_0 = null;
        sk stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        sk stackOut_3_0 = null;
        sk stackOut_1_0 = null;
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
              stackOut_3_0 = (sk) (var4);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (sk) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4_ref);
            stackOut_5_1 = new StringBuilder().append("cd.J(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
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
            stackOut_0_0 = (sk) (var5);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var5_ref);
            stackOut_2_1 = new StringBuilder().append("cd.F(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ')');
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
            var5 = this.field_f;
            synchronized (var5) {
              L1: {
                var6 = (sk) ((Object) this.field_f.a(param1 ^ param1));
                L2: while (true) {
                  if (var6 == null) {
                    break L1;
                  } else {
                    L3: {
                      if ((var6.field_o ^ -1L) != ((long)param0 ^ -1L)) {
                        break L3;
                      } else {
                        if (var6.field_w != param2) {
                          break L3;
                        } else {
                          if (2 == var6.field_x) {
                            var4.field_s = false;
                            var4.field_A = var6.field_A;
                            stackOut_8_0 = (sk) (var4);
                            stackIn_9_0 = stackOut_8_0;
                            return stackIn_9_0;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    var6 = (sk) ((Object) this.field_f.d(123));
                    continue L2;
                  }
                }
              }
            }
            var4.field_A = param2.a(true, param0);
            var4.field_s = false;
            var4.field_r = true;
            stackOut_15_0 = (sk) (var4);
            stackIn_16_0 = stackOut_15_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var4_ref);
            stackOut_17_1 = new StringBuilder().append("cd.H(").append(param0).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        return stackIn_16_0;
    }

    private final void a(sk param0, int param1) {
        sk discarded$0 = null;
        synchronized (this.field_f) {
            this.field_f.a(param0, 14);
            this.field_b = this.field_b + 1;
            this.field_f.notifyAll();
            if (param1 != -1) {
                sg var5 = (sg) null;
                discarded$0 = this.a(80, 53, (sg) null);
            }
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            field_c = 7;
            field_h = null;
            field_d = null;
            field_a = null;
            return;
        }
        field_h = null;
        field_d = null;
        field_a = null;
    }

    public final void run() {
        try {
            boolean discarded$1 = false;
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            String var6 = null;
            sk var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var5 = wizardrun.field_H;
            L0: while (true) {
              if (this.field_g) {
                return;
              } else {
                var2 = this.field_f;
                synchronized (var2) {
                  L1: {
                    var7 = (sk) ((Object) this.field_f.b(46));
                    if (var7 == null) {
                      try {
                        L2: {
                          this.field_f.wait();
                          break L2;
                        }
                      } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L3: {
                          interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                          break L3;
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    } else {
                      this.field_b = this.field_b - 1;
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
                          discarded$1 = var7.field_w.a(var7.field_A, (int)var7.field_o, 0, var7.field_A.length);
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
                      var6 = (String) null;
                      rg.a((Throwable) ((Object) var2_ref), (String) null, -562);
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
        this.field_f = new th();
        this.field_g = false;
        this.field_b = 0;
        try {
            var2 = param0.a((byte) -98, (Runnable) (this), 5);
            while (var2.field_a == 0) {
                tg.a(10L, false);
            }
            if (-3 == (var2.field_a ^ -1)) {
                throw new RuntimeException();
            }
            this.field_i = (Thread) (var2.field_e);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "cd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_d = "Log in / Create account";
        field_h = "You get extra lives for collecting points.";
    }
}
