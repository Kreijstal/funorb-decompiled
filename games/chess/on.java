/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on implements Runnable {
    static int field_d;
    static int field_h;
    private ad field_g;
    static int field_e;
    private Thread field_b;
    private boolean field_f;
    static boolean field_a;
    int field_c;

    final tc a(gd param0, int param1, byte param2) {
        tc var4 = new tc();
        var4.field_l = (long)param1;
        var4.field_B = 3;
        int var5 = -122 % ((1 - param2) / 39);
        var4.field_x = param0;
        var4.field_u = false;
        this.a((byte) -54, var4);
        return var4;
    }

    private final void a(byte param0, tc param1) {
        Object var3 = null;
        Throwable var4 = null;
        Object var5 = null;
        Throwable decompiledCaughtException = null;
        var3 = (Object) (Object) ((on) this).field_g;
        synchronized (var3) {
          L0: {
            L1: {
              if (param0 == -54) {
                break L1;
              } else {
                var5 = null;
                tc discarded$3 = ((on) this).a((byte[]) null, -10, 42, (gd) null);
                break L1;
              }
            }
            ((on) this).field_g.a(0, (l) (Object) param1);
            ((on) this).field_c = ((on) this).field_c + 1;
            ((Object) (Object) ((on) this).field_g).notifyAll();
            break L0;
          }
        }
    }

    final static String a(int param0, String param1) {
        int var2 = 0;
        if (param0 != -11307) {
            field_d = -9;
            var2 = hg.a(sb.field_rb, false, sk.field_t);
            if (!(-2 != (var2 ^ -1))) {
                param1 = "<img=0>" + param1;
            }
            if (-3 == (var2 ^ -1)) {
                param1 = "<img=1>" + param1;
            }
            return param1;
        }
        var2 = hg.a(sb.field_rb, false, sk.field_t);
        if (!(-2 != (var2 ^ -1))) {
            param1 = "<img=0>" + param1;
        }
        if (-3 == (var2 ^ -1)) {
            param1 = "<img=1>" + param1;
        }
        return param1;
    }

    final tc a(byte param0, int param1, gd param2) {
        tc var4 = null;
        Object var5 = null;
        tc var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        tc stackIn_7_0 = null;
        Throwable decompiledCaughtException = null;
        tc stackOut_6_0 = null;
        var8 = Chess.field_G;
        var4 = new tc();
        var4.field_B = 1;
        var5 = (Object) (Object) ((on) this).field_g;
        synchronized (var5) {
          L0: {
            var6 = (tc) (Object) ((on) this).field_g.b(-22585);
            L1: while (true) {
              if (var6 == null) {
                L2: {
                  if (param0 <= -47) {
                    break L2;
                  } else {
                    field_a = true;
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  if (var6.field_l != (long)param1) {
                    break L3;
                  } else {
                    if (param2 != var6.field_x) {
                      break L3;
                    } else {
                      if (-3 != (var6.field_B ^ -1)) {
                        break L3;
                      } else {
                        var4.field_s = false;
                        var4.field_v = var6.field_v;
                        stackOut_6_0 = (tc) var4;
                        stackIn_7_0 = stackOut_6_0;
                        return stackIn_7_0;
                      }
                    }
                  }
                }
                var6 = (tc) (Object) ((on) this).field_g.b((byte) -113);
                continue L1;
              }
            }
          }
        }
        var4.field_v = param2.a(param1, 111);
        var4.field_s = false;
        var4.field_u = true;
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
            tc var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            var5 = Chess.field_G;
            L0: while (true) {
              if (((on) this).field_f) {
                return;
              } else {
                var2 = (Object) (Object) ((on) this).field_g;
                synchronized (var2) {
                  L1: {
                    var7 = (tc) (Object) ((on) this).field_g.a((byte) -75);
                    if (var7 == null) {
                      try {
                        L2: {
                          ((Object) (Object) ((on) this).field_g).wait();
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
                      ((on) this).field_c = ((on) this).field_c - 1;
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
                        if (2 == var7.field_B) {
                          boolean discarded$1 = var7.field_x.a((int)var7.field_l, var7.field_v, (byte) 59, var7.field_v.length);
                          var7.field_s = false;
                          break L5;
                        } else {
                          if (-4 != (var7.field_B ^ -1)) {
                            decompiledRegionSelector1 = 0;
                            break L4;
                          } else {
                            var7.field_v = var7.field_x.a((int)var7.field_l, 111);
                            var7.field_s = false;
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
                      fg.a((Throwable) (Object) var2_ref, (byte) -77, (String) null);
                      decompiledRegionSelector1 = 0;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    var7.field_s = false;
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

    final void a(int param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          ((on) this).field_f = true;
          if (param0 == 3) {
            break L0;
          } else {
            field_d = -102;
            break L0;
          }
        }
        var2 = (Object) (Object) ((on) this).field_g;
        synchronized (var2) {
          L1: {
            ((Object) (Object) ((on) this).field_g).notifyAll();
            break L1;
          }
        }
        try {
          L2: {
            ((on) this).field_b.join();
            break L2;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L3;
          }
        }
        ((on) this).field_b = null;
    }

    final tc a(byte[] param0, int param1, int param2, gd param3) {
        tc var5 = new tc();
        var5.field_u = false;
        var5.field_l = (long)param1;
        var5.field_B = param2;
        var5.field_x = param3;
        var5.field_v = param0;
        this.a((byte) -54, var5);
        return var5;
    }

    on(jk param0) {
        ((on) this).field_g = new ad();
        ((on) this).field_f = false;
        ((on) this).field_c = 0;
        nl var2 = param0.a(5, true, (Runnable) this);
        while (var2.field_f == 0) {
            bc.a(10L, (byte) -109);
        }
        if (var2.field_f == 2) {
            throw new RuntimeException();
        }
        ((on) this).field_b = (Thread) var2.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0;
        field_d = 2;
    }
}
