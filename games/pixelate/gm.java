/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm implements Runnable {
    private nj field_b;
    static el field_f;
    static ak field_a;
    private Thread field_d;
    private boolean field_e;
    int field_c;

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            cg var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            var5 = Pixelate.field_H ? 1 : 0;
            L0: while (true) {
              if (((gm) this).field_e) {
                return;
              } else {
                var2 = (Object) (Object) ((gm) this).field_b;
                synchronized (var2) {
                  L1: {
                    var7 = (cg) (Object) ((gm) this).field_b.a((byte) 80);
                    if (var7 != null) {
                      ((gm) this).field_c = ((gm) this).field_c - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      try {
                        L2: {
                          ((Object) (Object) ((gm) this).field_b).wait();
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
                    }
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  continue L0;
                } else {
                  try {
                    L4: {
                      L5: {
                        if (2 != var7.field_C) {
                          if ((var7.field_C ^ -1) != -4) {
                            decompiledRegionSelector1 = 1;
                            break L4;
                          } else {
                            var7.field_D = var7.field_G.a(111, (int)var7.field_q);
                            var7.field_v = false;
                            break L5;
                          }
                        } else {
                          boolean discarded$1 = var7.field_G.a(var7.field_D.length, var7.field_D, false, (int)var7.field_q);
                          var7.field_v = false;
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
                      jo.a(1, (String) null, (Throwable) (Object) var2_ref);
                      decompiledRegionSelector1 = 1;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    continue L0;
                  } else {
                    var7.field_v = false;
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

    final void a(byte param0) {
        InterruptedException interruptedException = null;
        int var2 = 0;
        Object var3 = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        var2 = 62 % ((param0 - 18) / 56);
        ((gm) this).field_e = true;
        var3 = (Object) (Object) ((gm) this).field_b;
        synchronized (var3) {
          L0: {
            ((Object) (Object) ((gm) this).field_b).notifyAll();
            break L0;
          }
        }
        try {
          L1: {
            ((gm) this).field_d.join();
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L2;
          }
        }
        ((gm) this).field_d = null;
    }

    private final void a(byte param0, cg param1) {
        Object var3 = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        var3 = (Object) (Object) ((gm) this).field_b;
        synchronized (var3) {
          L0: {
            L1: {
              if (param0 >= 63) {
                break L1;
              } else {
                ((gm) this).run();
                break L1;
              }
            }
            ((gm) this).field_b.a(-115, (lm) (Object) param1);
            ((gm) this).field_c = ((gm) this).field_c + 1;
            ((Object) (Object) ((gm) this).field_b).notifyAll();
            break L0;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -1) {
            field_f = null;
            field_f = null;
            return;
        }
        field_f = null;
    }

    final cg a(int param0, rn param1, int param2) {
        cg var4 = null;
        Object var5 = null;
        cg var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        cg stackIn_7_0 = null;
        Throwable decompiledCaughtException = null;
        cg stackOut_6_0 = null;
        var8 = Pixelate.field_H ? 1 : 0;
        var4 = new cg();
        var4.field_C = 1;
        var5 = (Object) (Object) ((gm) this).field_b;
        synchronized (var5) {
          L0: {
            var6 = (cg) (Object) ((gm) this).field_b.c(72);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if ((var6.field_q ^ -1L) != ((long)param0 ^ -1L)) {
                    break L2;
                  } else {
                    if (param1 != var6.field_G) {
                      break L2;
                    } else {
                      if (2 != var6.field_C) {
                        break L2;
                      } else {
                        var4.field_D = var6.field_D;
                        var4.field_v = false;
                        stackOut_6_0 = (cg) var4;
                        stackIn_7_0 = stackOut_6_0;
                        return stackIn_7_0;
                      }
                    }
                  }
                }
                var6 = (cg) (Object) ((gm) this).field_b.a(65151);
                continue L1;
              }
            }
          }
        }
        if (param2 < 53) {
          field_f = null;
          var4.field_D = param1.a(126, param0);
          var4.field_t = true;
          var4.field_v = false;
          return var4;
        } else {
          var4.field_D = param1.a(126, param0);
          var4.field_t = true;
          var4.field_v = false;
          return var4;
        }
    }

    final cg a(int param0, int param1, rn param2) {
        cg var4 = new cg();
        var4.field_q = (long)param0;
        var4.field_G = param2;
        var4.field_t = false;
        var4.field_C = param1;
        this.a((byte) 72, var4);
        return var4;
    }

    final cg a(int param0, int param1, rn param2, byte[] param3) {
        cg var5 = null;
        var5 = new cg();
        var5.field_C = 2;
        if (param1 < 38) {
          ((gm) this).field_d = null;
          var5.field_G = param2;
          var5.field_D = param3;
          var5.field_t = false;
          var5.field_q = (long)param0;
          this.a((byte) 90, var5);
          return var5;
        } else {
          var5.field_G = param2;
          var5.field_D = param3;
          var5.field_t = false;
          var5.field_q = (long)param0;
          this.a((byte) 90, var5);
          return var5;
        }
    }

    gm(cb param0) {
        ((gm) this).field_b = new nj();
        ((gm) this).field_c = 0;
        ((gm) this).field_e = false;
        ei var2 = param0.a(5, (Runnable) this, (byte) -123);
        while (-1 == (var2.field_b ^ -1)) {
            vg.a(10L, (byte) 23);
        }
        if (2 == var2.field_b) {
            throw new RuntimeException();
        }
        ((gm) this).field_d = (Thread) var2.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new el();
    }
}
