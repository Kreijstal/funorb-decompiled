/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb implements Runnable {
    static ff field_c;
    private o field_h;
    static ot[] field_i;
    int field_e;
    private Thread field_a;
    private boolean field_f;
    static int field_b;
    static int field_d;
    static String[] field_g;

    private final void a(hi param0, boolean param1) {
        Object var3 = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        var3 = (Object) (Object) ((eb) this).field_h;
        synchronized (var3) {
          L0: {
            ((eb) this).field_h.a(127, (am) (Object) param0);
            ((eb) this).field_e = ((eb) this).field_e + 1;
            ((Object) (Object) ((eb) this).field_h).notifyAll();
            break L0;
          }
        }
        if (param1) {
          field_b = -100;
          return;
        } else {
          return;
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
            hi var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var5 = Kickabout.field_G;
            L0: while (true) {
              if (((eb) this).field_f) {
                return;
              } else {
                var2 = (Object) (Object) ((eb) this).field_h;
                synchronized (var2) {
                  L1: {
                    var7 = (hi) (Object) ((eb) this).field_h.b((byte) 3);
                    if (var7 == null) {
                      try {
                        L2: {
                          ((Object) (Object) ((eb) this).field_h).wait();
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
                      ((eb) this).field_e = ((eb) this).field_e - 1;
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
                        if (2 == var7.field_t) {
                          boolean discarded$1 = var7.field_v.a((byte) 66, (int)var7.field_l, var7.field_u.length, var7.field_u);
                          var7.field_p = false;
                          break L5;
                        } else {
                          if (3 == var7.field_t) {
                            var7.field_u = var7.field_v.a((int)var7.field_l, 65280);
                            var7.field_p = false;
                            break L5;
                          } else {
                            var7.field_p = false;
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
                      bd.a((String) null, (Throwable) (Object) var2_ref, 1);
                      var7.field_p = false;
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

    final hi a(int param0, int param1, qh param2) {
        hi var4 = null;
        var4 = new hi();
        if (param0 != 8947) {
          return null;
        } else {
          var4.field_q = false;
          var4.field_v = param2;
          var4.field_t = 3;
          var4.field_l = (long)param1;
          this.a(var4, false);
          return var4;
        }
    }

    final hi a(int param0, qh param1, int param2) {
        hi var4 = null;
        Object var5 = null;
        hi var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        hi stackIn_9_0 = null;
        Throwable decompiledCaughtException = null;
        hi stackOut_8_0 = null;
        var8 = Kickabout.field_G;
        var4 = new hi();
        var4.field_t = 1;
        var5 = (Object) (Object) ((eb) this).field_h;
        synchronized (var5) {
          L0: {
            L1: {
              if (param0 == -913) {
                break L1;
              } else {
                ((eb) this).b(-77);
                break L1;
              }
            }
            var6 = (hi) (Object) ((eb) this).field_h.a(-125);
            L2: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L3: {
                  if (var6.field_l != (long)param2) {
                    break L3;
                  } else {
                    if (var6.field_v != param1) {
                      break L3;
                    } else {
                      if ((var6.field_t ^ -1) != -3) {
                        break L3;
                      } else {
                        var4.field_p = false;
                        var4.field_u = var6.field_u;
                        stackOut_8_0 = (hi) var4;
                        stackIn_9_0 = stackOut_8_0;
                        return stackIn_9_0;
                      }
                    }
                  }
                }
                var6 = (hi) (Object) ((eb) this).field_h.b(0);
                continue L2;
              }
            }
          }
        }
        var4.field_u = param1.a(param2, param0 + 66193);
        var4.field_q = true;
        var4.field_p = false;
        return var4;
    }

    final void b(int param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        ((eb) this).field_f = true;
        var2 = (Object) (Object) ((eb) this).field_h;
        synchronized (var2) {
          L0: {
            L1: {
              if (param0 > 107) {
                break L1;
              } else {
                ((eb) this).field_f = false;
                break L1;
              }
            }
            ((Object) (Object) ((eb) this).field_h).notifyAll();
            break L0;
          }
        }
        try {
          L2: {
            ((eb) this).field_a.join();
            break L2;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L3;
          }
        }
        ((eb) this).field_a = null;
    }

    public static void a(int param0) {
        field_i = null;
        field_c = null;
        field_g = null;
        if (param0 != 2) {
            field_b = 17;
        }
    }

    final hi a(int param0, qh param1, byte[] param2, byte param3) {
        hi var5 = null;
        if (param3 <= 1) {
          return null;
        } else {
          var5 = new hi();
          var5.field_l = (long)param0;
          var5.field_q = false;
          var5.field_u = param2;
          var5.field_v = param1;
          var5.field_t = 2;
          this.a(var5, false);
          return var5;
        }
    }

    eb(bu param0) {
        ((eb) this).field_h = new o();
        ((eb) this).field_e = 0;
        ((eb) this).field_f = false;
        wu var2 = param0.a(5, (byte) 121, (Runnable) this);
        while (-1 == (var2.field_a ^ -1)) {
            aj.a(10L, 1);
        }
        if (2 == var2.field_a) {
            throw new RuntimeException();
        }
        ((eb) this).field_a = (Thread) var2.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new ff(0, 2, 2, 1);
    }
}
