/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk implements Runnable {
    static String field_b;
    private al field_d;
    static int field_f;
    private Thread field_g;
    int field_e;
    static wb field_c;
    private boolean field_a;

    final el a(gi param0, int param1, int param2) {
        el var4 = new el();
        var4.field_o = (long)param2;
        var4.field_u = false;
        var4.field_C = param1;
        var4.field_B = param0;
        this.a(-52, var4);
        return var4;
    }

    final static void a(int param0) {
        if (param0 != 3) {
            field_f = 37;
            rh.a(4, (byte) -72);
            return;
        }
        rh.a(4, (byte) -72);
    }

    final el a(gi param0, int param1, int param2, byte[] param3) {
        el var5 = new el();
        var5.field_C = 2;
        var5.field_u = false;
        var5.field_B = param0;
        var5.field_D = param3;
        var5.field_o = (long)param2;
        this.a(-113, var5);
        int var6 = -24 / ((param1 - -50) / 51);
        return var5;
    }

    final void a(byte param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        int var2_int = 0;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        ((rk) this).field_a = true;
        var2 = (Object) (Object) ((rk) this).field_d;
        synchronized (var2) {
          L0: {
            ((Object) (Object) ((rk) this).field_d).notifyAll();
            break L0;
          }
        }
        try {
          L1: {
            ((rk) this).field_g.join();
            var2_int = -7 % ((param0 - -18) / 47);
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L2;
          }
        }
        ((rk) this).field_g = null;
    }

    private final void a(int param0, el param1) {
        Object var3 = null;
        Throwable var4 = null;
        Object var5 = null;
        Throwable decompiledCaughtException = null;
        var3 = (Object) (Object) ((rk) this).field_d;
        synchronized (var3) {
          L0: {
            L1: {
              if (param0 <= -10) {
                break L1;
              } else {
                var5 = null;
                el discarded$3 = ((rk) this).a((gi) null, 8, 126);
                break L1;
              }
            }
            ((rk) this).field_d.a((byte) 127, (ah) (Object) param1);
            ((rk) this).field_e = ((rk) this).field_e + 1;
            ((Object) (Object) ((rk) this).field_d).notifyAll();
            break L0;
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_b = null;
        field_c = null;
    }

    final el a(gi param0, byte param1, int param2) {
        el var4 = null;
        Object var5 = null;
        el var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        el stackIn_10_0 = null;
        Throwable decompiledCaughtException = null;
        el stackOut_9_0 = null;
        var8 = stellarshard.field_B;
        var4 = new el();
        var4.field_C = 1;
        var5 = (Object) (Object) ((rk) this).field_d;
        synchronized (var5) {
          L0: {
            L1: {
              if (param1 >= 30) {
                break L1;
              } else {
                ((rk) this).field_a = true;
                break L1;
              }
            }
            var6 = (el) (Object) ((rk) this).field_d.a(false);
            L2: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L3: {
                  if ((var6.field_o ^ -1L) != ((long)param2 ^ -1L)) {
                    break L3;
                  } else {
                    if (var6.field_B != param0) {
                      break L3;
                    } else {
                      if ((var6.field_C ^ -1) == -3) {
                        var4.field_D = var6.field_D;
                        var4.field_w = false;
                        stackOut_9_0 = (el) var4;
                        stackIn_10_0 = stackOut_9_0;
                        return stackIn_10_0;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var6 = (el) (Object) ((rk) this).field_d.a(-97);
                continue L2;
              }
            }
          }
        }
        var4.field_D = param0.a(true, param2);
        var4.field_u = true;
        var4.field_w = false;
        return var4;
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            el var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            var5 = stellarshard.field_B;
            L0: while (true) {
              if (((rk) this).field_a) {
                return;
              } else {
                var2 = (Object) (Object) ((rk) this).field_d;
                synchronized (var2) {
                  L1: {
                    var7 = (el) (Object) ((rk) this).field_d.a((byte) 92);
                    if (var7 == null) {
                      try {
                        L2: {
                          ((Object) (Object) ((rk) this).field_d).wait();
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
                      ((rk) this).field_e = ((rk) this).field_e - 1;
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
                        if (-3 != (var7.field_C ^ -1)) {
                          if (3 != var7.field_C) {
                            decompiledRegionSelector1 = 1;
                            break L4;
                          } else {
                            var7.field_D = var7.field_B.a(true, (int)var7.field_o);
                            var7.field_w = false;
                            break L5;
                          }
                        } else {
                          boolean discarded$1 = var7.field_B.a(var7.field_D, var7.field_D.length, 5, (int)var7.field_o);
                          var7.field_w = false;
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
                      qe.a(60, (String) null, (Throwable) (Object) var2_ref);
                      decompiledRegionSelector1 = 1;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    continue L0;
                  } else {
                    var7.field_w = false;
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

    rk(ej param0) {
        ((rk) this).field_d = new al();
        ((rk) this).field_e = 0;
        ((rk) this).field_a = false;
        re var2 = param0.a((Runnable) this, 5, 0);
        while (0 == var2.field_f) {
            jj.a((byte) -124, 10L);
        }
        if (-3 == (var2.field_f ^ -1)) {
            throw new RuntimeException();
        }
        ((rk) this).field_g = (Thread) var2.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Start Game";
        field_c = new wb();
    }
}
