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
        } else {
          param1.b(-1947079288, 17);
          param1.b(-1947079288, param4);
          param1.b(-1947079288, param3);
          param1.b((byte) 11, param0);
          return;
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        wl.a("", param0, (byte) -98);
        ga.a(param0, (byte) -72);
        if (param1 != -113) {
            Object var3 = null;
            cd.a(-24, (va) null, 100, -92, -33);
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
            Object var2 = null;
            va var3 = null;
            int stackIn_14_0 = 0;
            int stackIn_25_0 = 0;
            int stackIn_28_0 = 0;
            int stackIn_33_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_27_0 = 0;
            int stackOut_24_0 = 0;
            int stackOut_32_0 = 0;
            L0: {
              if (param0 == -18067) {
                break L0;
              } else {
                var2 = null;
                rb[] discarded$1 = cd.a(true, (vh) null);
                break L0;
              }
            }
            if (-5 < (ii.field_f.field_k ^ -1)) {
              try {
                L1: {
                  L2: {
                    if ((wc.field_k ^ -1) != -1) {
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
                        stackOut_13_0 = mh.a((byte) -121, -1);
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0;
                      }
                    }
                  }
                  L4: {
                    if ((wc.field_k ^ -1) != -3) {
                      break L4;
                    } else {
                      si.field_q = new hi((java.net.Socket) hb.field_k.field_e, vk.field_p);
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
                          stackOut_27_0 = mh.a((byte) 85, var1_int);
                          stackIn_28_0 = stackOut_27_0;
                          return stackIn_28_0;
                        }
                      } else {
                        if (la.field_g >= d.a((byte) 127)) {
                          break L5;
                        } else {
                          stackOut_24_0 = mh.a((byte) 122, -2);
                          stackIn_25_0 = stackOut_24_0;
                          return stackIn_25_0;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                  if (wc.field_k == 4) {
                    ii.field_f.a(gi.field_b, (Object) (Object) si.field_q, param0 ^ -18153);
                    wc.field_k = 0;
                    hb.field_k = null;
                    si.field_q = null;
                    stackOut_32_0 = 0;
                    stackIn_33_0 = stackOut_32_0;
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
              return stackIn_33_0;
            } else {
              if (-1 == ii.field_f.field_n) {
                return 3;
              } else {
                if (1 == (ii.field_f.field_n ^ -1)) {
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
        long stackIn_6_0 = 0L;
        long stackIn_7_0 = 0L;
        long stackIn_8_0 = 0L;
        int stackIn_8_1 = 0;
        long stackOut_5_0 = 0L;
        long stackOut_7_0 = 0L;
        int stackOut_7_1 = 0;
        long stackOut_6_0 = 0L;
        int stackOut_6_1 = 0;
        var7 = wizardrun.field_H;
        if (!param1.a(169978736)) {
          return new rb[]{};
        } else {
          var8 = param1.a(false);
          L0: while (true) {
            if (var8.field_a != 0) {
              if (var8.field_a != 2) {
                var12 = (int[]) var8.field_e;
                var11 = var12;
                var10 = var11;
                var9 = var10;
                var3 = var9;
                var4 = new rb[var12.length >> -1849711422];
                if (!param0) {
                  field_d = null;
                  var5 = 0;
                  L1: while (true) {
                    if (var4.length <= var5) {
                      return var4;
                    } else {
                      var6 = new rb();
                      var4[var5] = var6;
                      var6.field_g = var3[var5 << -1263765886];
                      var6.field_h = var3[1 + (var5 << 1927111682)];
                      var6.field_c = var3[(var5 << 1196843522) + 2];
                      var6.field_f = var3[(var5 << -280611070) - -3];
                      var5++;
                      continue L1;
                    }
                  }
                } else {
                  var5 = 0;
                  L2: while (true) {
                    if (var4.length <= var5) {
                      return var4;
                    } else {
                      var6 = new rb();
                      var4[var5] = var6;
                      var6.field_g = var3[var5 << -1263765886];
                      var6.field_h = var3[1 + (var5 << 1927111682)];
                      var6.field_c = var3[(var5 << 1196843522) + 2];
                      var6.field_f = var3[(var5 << -280611070) - -3];
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                return new rb[]{};
              }
            } else {
              L3: {
                stackOut_5_0 = 10L;
                stackIn_7_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (param0) {
                  stackOut_7_0 = stackIn_7_0;
                  stackOut_7_1 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  break L3;
                } else {
                  stackOut_6_0 = stackIn_6_0;
                  stackOut_6_1 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  break L3;
                }
              }
              tg.a(stackIn_8_0, stackIn_8_1 != 0);
              continue L0;
            }
          }
        }
    }

    final sk a(byte param0, int param1, sg param2) {
        sk var4 = null;
        if (param0 != -46) {
          return null;
        } else {
          var4 = new sk();
          var4.field_w = param2;
          var4.field_o = (long)param1;
          var4.field_x = 3;
          var4.field_r = false;
          this.a(var4, -1);
          return var4;
        }
    }

    final sk a(byte param0, sg param1, byte[] param2, int param3) {
        sk var5 = new sk();
        var5.field_o = (long)param3;
        var5.field_x = 2;
        var5.field_w = param1;
        var5.field_A = param2;
        int var6 = -115 % ((param0 - -68) / 43);
        var5.field_r = false;
        this.a(var5, -1);
        return var5;
    }

    final sk a(int param0, int param1, sg param2) {
        sk var4 = null;
        Object var5 = null;
        sk var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        sk stackIn_8_0 = null;
        Throwable decompiledCaughtException = null;
        sk stackOut_7_0 = null;
        var8 = wizardrun.field_H;
        var4 = new sk();
        var4.field_x = 1;
        var5 = (Object) (Object) ((cd) this).field_f;
        synchronized (var5) {
          L0: {
            var6 = (sk) (Object) ((cd) this).field_f.a(param1 ^ param1);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if ((var6.field_o ^ -1L) != ((long)param0 ^ -1L)) {
                    break L2;
                  } else {
                    if (var6.field_w != param2) {
                      break L2;
                    } else {
                      if (2 == var6.field_x) {
                        var4.field_s = false;
                        var4.field_A = var6.field_A;
                        stackOut_7_0 = (sk) var4;
                        stackIn_8_0 = stackOut_7_0;
                        return stackIn_8_0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var6 = (sk) (Object) ((cd) this).field_f.d(123);
                continue L1;
              }
            }
          }
        }
        var4.field_A = param2.a(true, param0);
        var4.field_s = false;
        var4.field_r = true;
        return var4;
    }

    private final void a(sk param0, int param1) {
        Object var3 = null;
        Throwable var4 = null;
        Object var5 = null;
        Throwable decompiledCaughtException = null;
        var3 = (Object) (Object) ((cd) this).field_f;
        synchronized (var3) {
          L0: {
            L1: {
              ((cd) this).field_f.a((rk) (Object) param0, 14);
              ((cd) this).field_b = ((cd) this).field_b + 1;
              ((Object) (Object) ((cd) this).field_f).notifyAll();
              if (param1 == -1) {
                break L1;
              } else {
                var5 = null;
                sk discarded$3 = ((cd) this).a(80, 53, (sg) null);
                break L1;
              }
            }
            break L0;
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
            InterruptedException interruptedException = null;
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
                      try {
                        L2: {
                          ((Object) (Object) ((cd) this).field_f).wait();
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
        ((cd) this).field_f = new th();
        ((cd) this).field_g = false;
        ((cd) this).field_b = 0;
        jh var2 = param0.a((byte) -98, (Runnable) this, 5);
        while (var2.field_a == 0) {
            tg.a(10L, false);
        }
        if (-3 == (var2.field_a ^ -1)) {
            throw new RuntimeException();
        }
        ((cd) this).field_i = (Thread) var2.field_e;
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
