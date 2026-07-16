/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co implements Runnable {
    static String field_d;
    private gb field_e;
    private Thread field_b;
    int field_a;
    private boolean field_c;

    final lb a(int param0, int param1, pb param2) {
        lb var4 = null;
        Object var5 = null;
        lb var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        lb stackIn_8_0 = null;
        Throwable decompiledCaughtException = null;
        lb stackOut_7_0 = null;
        var8 = Torquing.field_u;
        var4 = new lb();
        var4.field_B = 1;
        var5 = (Object) (Object) ((co) this).field_e;
        synchronized (var5) {
          L0: {
            var6 = (lb) (Object) ((co) this).field_e.a((byte) -85);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (((long)param0 ^ -1L) != (var6.field_l ^ -1L)) {
                    break L2;
                  } else {
                    if (var6.field_x != param2) {
                      break L2;
                    } else {
                      if ((var6.field_B ^ -1) == -3) {
                        var4.field_r = false;
                        var4.field_A = var6.field_A;
                        stackOut_7_0 = (lb) var4;
                        stackIn_8_0 = stackOut_7_0;
                        return stackIn_8_0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var6 = (lb) (Object) ((co) this).field_e.c(24542);
                continue L1;
              }
            }
          }
        }
        var4.field_A = param2.a(param0, (byte) 85);
        var4.field_w = true;
        if (param1 != 23538) {
          field_d = null;
          var4.field_r = false;
          return var4;
        } else {
          var4.field_r = false;
          return var4;
        }
    }

    private final void a(lb param0, int param1) {
        Object var3 = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        var3 = (Object) (Object) ((co) this).field_e;
        synchronized (var3) {
          L0: {
            L1: {
              if (param1 == 32) {
                break L1;
              } else {
                ((co) this).field_a = -127;
                break L1;
              }
            }
            ((co) this).field_e.a((byte) 118, (ta) (Object) param0);
            ((co) this).field_a = ((co) this).field_a + 1;
            ((Object) (Object) ((co) this).field_e).notifyAll();
            break L0;
          }
        }
    }

    final lb a(byte[] param0, int param1, pb param2, byte param3) {
        int var6 = 111 % ((param3 - -55) / 46);
        lb var5 = new lb();
        var5.field_x = param2;
        var5.field_w = false;
        var5.field_A = param0;
        var5.field_B = 2;
        var5.field_l = (long)param1;
        this.a(var5, 32);
        return var5;
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 2) {
            boolean discarded$0 = co.a(-15, 'y');
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
            lb var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            var5 = Torquing.field_u;
            L0: while (true) {
              if (((co) this).field_c) {
                return;
              } else {
                var2 = (Object) (Object) ((co) this).field_e;
                synchronized (var2) {
                  L1: {
                    var7 = (lb) (Object) ((co) this).field_e.a(127);
                    if (var7 == null) {
                      try {
                        L2: {
                          ((Object) (Object) ((co) this).field_e).wait();
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
                      ((co) this).field_a = ((co) this).field_a - 1;
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
                        if (var7.field_B != 2) {
                          if ((var7.field_B ^ -1) == -4) {
                            var7.field_A = var7.field_x.a((int)var7.field_l, (byte) 85);
                            decompiledRegionSelector1 = 1;
                            break L4;
                          } else {
                            var7.field_r = false;
                            break L5;
                          }
                        } else {
                          boolean discarded$1 = var7.field_x.a((int)var7.field_l, 10282, var7.field_A, var7.field_A.length);
                          var7.field_r = false;
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
                      nn.a((String) null, (Throwable) (Object) var2_ref, -9958);
                      decompiledRegionSelector1 = 1;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    continue L0;
                  } else {
                    var7.field_r = false;
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
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        ((co) this).field_c = true;
        var2 = (Object) (Object) ((co) this).field_e;
        synchronized (var2) {
          L0: {
            ((Object) (Object) ((co) this).field_e).notifyAll();
            break L0;
          }
        }
        try {
          L1: {
            ((co) this).field_b.join();
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L2;
          }
        }
        ((co) this).field_b = null;
        if (param0 != -95) {
          ((co) this).a((byte) -113);
          return;
        } else {
          return;
        }
    }

    final lb b(int param0, int param1, pb param2) {
        lb var4 = new lb();
        var4.field_x = param2;
        var4.field_l = (long)param0;
        var4.field_w = false;
        var4.field_B = param1;
        this.a(var4, 32);
        return var4;
    }

    final static boolean a(int param0, char param1) {
        int var2 = 0;
        if (!Character.isISOControl(param1)) {
          if (!wa.a(param1, (byte) 34)) {
            var2 = 70 % ((param0 - -46) / 59);
            if (param1 != 45) {
              if (param1 != 160) {
                if (32 != param1) {
                  if (param1 == 95) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    co(vh param0) {
        ((co) this).field_e = new gb();
        ((co) this).field_c = false;
        ((co) this).field_a = 0;
        rc var2 = param0.a((byte) -126, 5, (Runnable) this);
        while (var2.field_a == 0) {
            ub.a(1976, 10L);
        }
        if ((var2.field_a ^ -1) == -3) {
            throw new RuntimeException();
        }
        ((co) this).field_b = (Thread) var2.field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "(Including <%0>)";
    }
}
