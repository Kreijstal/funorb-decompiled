/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk implements Runnable {
    static String[] field_d;
    private va field_c;
    static String field_a;
    private Thread field_b;
    private boolean field_e;
    int field_f;

    public static void b(int param0) {
        if (param0 != -4) {
            return;
        }
        field_a = null;
        field_d = null;
    }

    final void a(int param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        ((kk) this).field_e = true;
        var2 = (Object) (Object) ((kk) this).field_c;
        synchronized (var2) {
          L0: {
            L1: {
              ((Object) (Object) ((kk) this).field_c).notifyAll();
              if (param0 == -24580) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            break L0;
          }
        }
        try {
          L2: {
            ((kk) this).field_b.join();
            break L2;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L3;
          }
        }
        ((kk) this).field_b = null;
    }

    final cm a(jg param0, int param1, int param2) {
        cm var4 = null;
        Object var5 = null;
        cm var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        cm stackIn_10_0 = null;
        Throwable decompiledCaughtException = null;
        cm stackOut_9_0 = null;
        L0: {
          var8 = EscapeVector.field_A;
          if (param1 > 33) {
            break L0;
          } else {
            ((kk) this).field_f = 88;
            break L0;
          }
        }
        var4 = new cm();
        var4.field_z = 1;
        var5 = (Object) (Object) ((kk) this).field_c;
        synchronized (var5) {
          L1: {
            var6 = (cm) (Object) ((kk) this).field_c.a(0);
            L2: while (true) {
              if (var6 == null) {
                break L1;
              } else {
                L3: {
                  if ((long)param2 != var6.field_p) {
                    break L3;
                  } else {
                    if (param0 != var6.field_x) {
                      break L3;
                    } else {
                      if ((var6.field_z ^ -1) == -3) {
                        var4.field_u = false;
                        var4.field_y = var6.field_y;
                        stackOut_9_0 = (cm) var4;
                        stackIn_10_0 = stackOut_9_0;
                        return stackIn_10_0;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var6 = (cm) (Object) ((kk) this).field_c.a((byte) 116);
                continue L2;
              }
            }
          }
        }
        var4.field_y = param0.a(param2, 26296);
        var4.field_r = true;
        var4.field_u = false;
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
            cm var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            var5 = EscapeVector.field_A;
            L0: while (true) {
              if (((kk) this).field_e) {
                return;
              } else {
                var2 = (Object) (Object) ((kk) this).field_c;
                synchronized (var2) {
                  L1: {
                    var7 = (cm) (Object) ((kk) this).field_c.b((byte) -75);
                    if (var7 == null) {
                      try {
                        L2: {
                          ((Object) (Object) ((kk) this).field_c).wait();
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
                      ((kk) this).field_f = ((kk) this).field_f - 1;
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
                        if (var7.field_z == 2) {
                          boolean discarded$1 = var7.field_x.a((byte) 18, (int)var7.field_p, var7.field_y.length, var7.field_y);
                          var7.field_u = false;
                          break L5;
                        } else {
                          if ((var7.field_z ^ -1) != -4) {
                            decompiledRegionSelector1 = 0;
                            break L4;
                          } else {
                            var7.field_y = var7.field_x.a((int)var7.field_p, 26296);
                            var7.field_u = false;
                            break L5;
                          }
                        }
                      }
                      decompiledRegionSelector1 = 1;
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L6: {
                      var2_ref = (Exception) (Object) decompiledCaughtException;
                      var6 = null;
                      pf.a(false, (String) null, (Throwable) (Object) var2_ref);
                      decompiledRegionSelector1 = 0;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    var7.field_u = false;
                    continue L0;
                  } else {
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

    final cm a(byte[] param0, int param1, int param2, jg param3) {
        cm var5 = new cm();
        var5.field_y = param0;
        var5.field_x = param3;
        var5.field_p = (long)param1;
        var5.field_r = false;
        var5.field_z = param2;
        this.a(-3, var5);
        return var5;
    }

    private final void a(int param0, cm param1) {
        Object var3 = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        var3 = (Object) (Object) ((kk) this).field_c;
        synchronized (var3) {
          L0: {
            L1: {
              ((kk) this).field_c.a(-1, (fl) (Object) param1);
              ((kk) this).field_f = ((kk) this).field_f + 1;
              if (param0 == -3) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            ((Object) (Object) ((kk) this).field_c).notifyAll();
            break L0;
          }
        }
    }

    final cm a(byte param0, jg param1, int param2) {
        cm var4 = null;
        var4 = new cm();
        var4.field_r = false;
        var4.field_z = 3;
        var4.field_p = (long)param2;
        var4.field_x = param1;
        this.a(-3, var4);
        if (param0 > -42) {
          ((kk) this).field_e = true;
          return var4;
        } else {
          return var4;
        }
    }

    kk(lk param0) {
        ((kk) this).field_c = new va();
        ((kk) this).field_e = false;
        ((kk) this).field_f = 0;
        la var2 = param0.a(true, 5, (Runnable) this);
        while ((var2.field_f ^ -1) == -1) {
            en.a((byte) 121, 10L);
        }
        if (-3 == (var2.field_f ^ -1)) {
            throw new RuntimeException();
        }
        ((kk) this).field_b = (Thread) var2.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_a = "This password is part of your Player Name, and would be easy to guess";
    }
}
