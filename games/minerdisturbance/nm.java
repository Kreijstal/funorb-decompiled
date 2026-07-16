/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm implements Runnable {
    static int[] field_g;
    static volatile int field_a;
    private wa field_d;
    static String[] field_f;
    private Thread field_h;
    static String field_c;
    int field_b;
    static int field_e;
    private boolean field_i;

    final static void a(int param0) {
        Object var2 = null;
        if (param0 != -6145) {
          var2 = null;
          boolean discarded$2 = nm.a(-93, (int[]) null, 25);
          oj.a(4, param0 ^ -6148);
          return;
        } else {
          oj.a(4, param0 ^ -6148);
          return;
        }
    }

    final void a(byte param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        ((nm) this).field_i = true;
        var2 = (Object) (Object) ((nm) this).field_d;
        synchronized (var2) {
          L0: {
            ((Object) (Object) ((nm) this).field_d).notifyAll();
            break L0;
          }
        }
        try {
          L1: {
            ((nm) this).field_h.join();
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L2;
          }
        }
        if (param0 != -32) {
          field_e = 86;
          ((nm) this).field_h = null;
          return;
        } else {
          ((nm) this).field_h = null;
          return;
        }
    }

    final static boolean a(int param0, int[] param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param2 != -827843803) {
          L0: {
            field_a = 88;
            if (-1 == (param1[param0 >> -827843803] & 1 << (param0 & 31))) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-1 == (param1[param0 >> -827843803] & 1 << (param0 & 31))) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            vl var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            var5 = MinerDisturbance.field_ab;
            L0: while (true) {
              if (((nm) this).field_i) {
                return;
              } else {
                var2 = (Object) (Object) ((nm) this).field_d;
                synchronized (var2) {
                  L1: {
                    var7 = (vl) (Object) ((nm) this).field_d.c(8192);
                    if (var7 == null) {
                      try {
                        L2: {
                          ((Object) (Object) ((nm) this).field_d).wait();
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
                      ((nm) this).field_b = ((nm) this).field_b - 1;
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
                        if (-3 != (var7.field_H ^ -1)) {
                          if (-4 != (var7.field_H ^ -1)) {
                            decompiledRegionSelector1 = 1;
                            break L4;
                          } else {
                            var7.field_F = var7.field_D.a(255, (int)var7.field_p);
                            var7.field_C = false;
                            break L5;
                          }
                        } else {
                          boolean discarded$1 = var7.field_D.a(var7.field_F.length, var7.field_F, (byte) 104, (int)var7.field_p);
                          var7.field_C = false;
                          break L5;
                        }
                      }
                      decompiledRegionSelector1 = 0;
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L6: {
                      var2_ref = (Exception) (Object) decompiledCaughtException;
                      var6 = null;
                      di.a((Throwable) (Object) var2_ref, 1, (String) null);
                      decompiledRegionSelector1 = 1;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    continue L0;
                  } else {
                    var7.field_C = false;
                    continue L0;
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var2 = 40 / ((-81 - param1) / 45);
        param0 = param0 & 8191;
        if (param0 < 4096) {
          L0: {
            if (2048 > param0) {
              stackOut_7_0 = ta.field_g[param0];
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = ta.field_g[-param0 + 4096];
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (-6145 < (param0 ^ -1)) {
              stackOut_3_0 = -ta.field_g[param0 - 4096];
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = -ta.field_g[8192 + -param0];
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final vl a(int param0, boolean param1, uh param2) {
        vl var4 = new vl();
        var4.field_p = (long)param0;
        var4.field_H = 3;
        var4.field_v = param1 ? true : false;
        var4.field_D = param2;
        this.a(var4, 109);
        return var4;
    }

    public static void a(boolean param0) {
        field_g = null;
        field_f = null;
        field_c = null;
        if (param0) {
            nm.a(80);
        }
    }

    final vl a(byte param0, int param1, uh param2) {
        vl var4 = null;
        Object var5 = null;
        vl var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int var9 = 0;
        vl stackIn_8_0 = null;
        Throwable decompiledCaughtException = null;
        vl stackOut_7_0 = null;
        var9 = MinerDisturbance.field_ab;
        var4 = new vl();
        var4.field_H = 1;
        var5 = (Object) (Object) ((nm) this).field_d;
        synchronized (var5) {
          L0: {
            var7 = 31 / ((-10 - param0) / 39);
            var6 = (vl) (Object) ((nm) this).field_d.a(-98);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if ((var6.field_p ^ -1L) != ((long)param1 ^ -1L)) {
                    break L2;
                  } else {
                    if (var6.field_D != param2) {
                      break L2;
                    } else {
                      if (var6.field_H == 2) {
                        var4.field_C = false;
                        var4.field_F = var6.field_F;
                        stackOut_7_0 = (vl) var4;
                        stackIn_8_0 = stackOut_7_0;
                        return stackIn_8_0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var6 = (vl) (Object) ((nm) this).field_d.d(-77);
                continue L1;
              }
            }
          }
        }
        var4.field_F = param2.a(255, param1);
        var4.field_C = false;
        var4.field_v = true;
        return var4;
    }

    final vl a(uh param0, boolean param1, byte[] param2, int param3) {
        vl var5 = new vl();
        var5.field_p = (long)param3;
        var5.field_D = param0;
        var5.field_F = param2;
        var5.field_v = param1 ? true : false;
        var5.field_H = 2;
        this.a(var5, 114);
        return var5;
    }

    private final void a(vl param0, int param1) {
        Object var3 = null;
        int var4 = 0;
        Throwable var5 = null;
        Throwable decompiledCaughtException = null;
        var3 = (Object) (Object) ((nm) this).field_d;
        synchronized (var3) {
          L0: {
            ((nm) this).field_d.a((al) (Object) param0, false);
            ((nm) this).field_b = ((nm) this).field_b + 1;
            var4 = 119 % ((param1 - 46) / 62);
            ((Object) (Object) ((nm) this).field_d).notifyAll();
            break L0;
          }
        }
    }

    nm(vf param0) {
        ((nm) this).field_d = new wa();
        ((nm) this).field_b = 0;
        ((nm) this).field_i = false;
        ia var2 = param0.a((Runnable) this, (byte) 58, 5);
        while (0 == var2.field_c) {
            gf.a(10L, -10309);
        }
        if ((var2.field_c ^ -1) == -3) {
            throw new RuntimeException();
        }
        ((nm) this).field_h = (Thread) var2.field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new int[6];
        field_f = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_a = -1;
        field_c = "Get Rich or Die Tryin'";
    }
}
