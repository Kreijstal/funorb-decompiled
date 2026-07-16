/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj implements Runnable {
    static oe field_a;
    private cd field_e;
    int field_b;
    private Thread field_d;
    private boolean field_c;

    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        rh var4_ref_rh = null;
        Object var5 = null;
        int var6 = 0;
        pf var8 = null;
        w var9 = null;
        byte[] var13 = null;
        var6 = Main.field_T;
        if (param0 <= -122) {
          var9 = rd.field_j;
          var2 = var9.f(-128);
          if (var2 == 0) {
            var8 = (pf) (Object) ua.field_G.a((byte) 74);
            if (var8 != null) {
              L0: {
                var4 = var9.f(24);
                if (var4 != 0) {
                  var13 = new byte[var4];
                  var9.a(121, var13, 0, var4);
                  break L0;
                } else {
                  var5 = null;
                  break L0;
                }
              }
              var9.field_i = var9.field_i + 4;
              if (!var9.e(-1)) {
                mc.a((byte) -125);
                return;
              } else {
                var8.c(96);
                return;
              }
            } else {
              mc.a((byte) -128);
              return;
            }
          } else {
            if ((var2 ^ -1) == -2) {
              var3 = var9.e((byte) 124);
              var4_ref_rh = (rh) (Object) de.field_e.a((byte) 74);
              L1: while (true) {
                if (var4_ref_rh == null) {
                  if (var4_ref_rh == null) {
                    mc.a((byte) -128);
                    return;
                  } else {
                    var4_ref_rh.c(122);
                    return;
                  }
                } else {
                  if (var4_ref_rh.field_i != var3) {
                    var4_ref_rh = (rh) (Object) de.field_e.b((byte) -120);
                    continue L1;
                  } else {
                    if (var4_ref_rh == null) {
                      mc.a((byte) -128);
                      return;
                    } else {
                      var4_ref_rh.c(122);
                      return;
                    }
                  }
                }
              }
            } else {
              k.a((Throwable) null, (byte) 41, "A1: " + aj.a((byte) 92));
              mc.a((byte) -126);
              return;
            }
          }
        } else {
          return;
        }
    }

    final ab a(int param0, int param1, hc param2) {
        ab var4 = null;
        var4 = new ab();
        var4.field_o = false;
        var4.field_s = 3;
        var4.field_j = (long)param0;
        var4.field_v = param2;
        this.a(0, var4);
        if (param1 != -3) {
          ((gj) this).field_d = null;
          return var4;
        } else {
          return var4;
        }
    }

    final void b(int param0) {
        Object var2 = null;
        InterruptedException var2_ref = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        ((gj) this).field_c = true;
        var2 = (Object) (Object) ((gj) this).field_e;
        synchronized (var2) {
          L0: {
            ((Object) (Object) ((gj) this).field_e).notifyAll();
            break L0;
          }
        }
        try {
          L1: {
            ((gj) this).field_d.join();
            if (param0 >= 72) {
              break L1;
            } else {
              ((gj) this).field_d = null;
              ((gj) this).field_d = null;
              return;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
            break L2;
          }
        }
        ((gj) this).field_d = null;
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            ab var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            var5 = Main.field_T;
            L0: while (true) {
              if (((gj) this).field_c) {
                return;
              } else {
                var2 = (Object) (Object) ((gj) this).field_e;
                synchronized (var2) {
                  L1: {
                    var7 = (ab) (Object) ((gj) this).field_e.a(30);
                    if (var7 == null) {
                      try {
                        L2: {
                          ((Object) (Object) ((gj) this).field_e).wait();
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
                      ((gj) this).field_b = ((gj) this).field_b - 1;
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
                        if (2 != var7.field_s) {
                          if (var7.field_s != 3) {
                            decompiledRegionSelector1 = 1;
                            break L4;
                          } else {
                            var7.field_r = var7.field_v.a((byte) 19, (int)var7.field_j);
                            var7.field_n = false;
                            break L5;
                          }
                        } else {
                          boolean discarded$1 = var7.field_v.a(var7.field_r, 111, var7.field_r.length, (int)var7.field_j);
                          var7.field_n = false;
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
                      k.a((Throwable) (Object) var2_ref, (byte) 119, (String) null);
                      decompiledRegionSelector1 = 1;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    continue L0;
                  } else {
                    var7.field_n = false;
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

    final ab a(hc param0, byte[] param1, int param2, int param3) {
        ab var5 = null;
        var5 = new ab();
        var5.field_j = (long)param2;
        if (param3 != -23167) {
          ((gj) this).field_e = null;
          var5.field_r = param1;
          var5.field_v = param0;
          var5.field_s = 2;
          var5.field_o = false;
          this.a(0, var5);
          return var5;
        } else {
          var5.field_r = param1;
          var5.field_v = param0;
          var5.field_s = 2;
          var5.field_o = false;
          this.a(0, var5);
          return var5;
        }
    }

    private final void a(int param0, ab param1) {
        Object var3 = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        var3 = (Object) (Object) ((gj) this).field_e;
        synchronized (var3) {
          L0: {
            L1: {
              ((gj) this).field_e.a((byte) -108, (he) (Object) param1);
              if (param0 == 0) {
                break L1;
              } else {
                ((gj) this).field_d = null;
                break L1;
              }
            }
            ((gj) this).field_b = ((gj) this).field_b + 1;
            ((Object) (Object) ((gj) this).field_e).notifyAll();
            break L0;
          }
        }
    }

    final ab a(int param0, hc param1, int param2) {
        ab var4 = null;
        Object var5 = null;
        ab var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        ab stackIn_7_0 = null;
        Throwable decompiledCaughtException = null;
        ab stackOut_6_0 = null;
        var8 = Main.field_T;
        var4 = new ab();
        var4.field_s = param0;
        var5 = (Object) (Object) ((gj) this).field_e;
        synchronized (var5) {
          L0: {
            var6 = (ab) (Object) ((gj) this).field_e.c((byte) -114);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if ((var6.field_j ^ -1L) != ((long)param2 ^ -1L)) {
                    break L2;
                  } else {
                    if (param1 != var6.field_v) {
                      break L2;
                    } else {
                      if (var6.field_s != 2) {
                        break L2;
                      } else {
                        var4.field_n = false;
                        var4.field_r = var6.field_r;
                        stackOut_6_0 = (ab) var4;
                        stackIn_7_0 = stackOut_6_0;
                        return stackIn_7_0;
                      }
                    }
                  }
                }
                var6 = (ab) (Object) ((gj) this).field_e.b((byte) -122);
                continue L1;
              }
            }
          }
        }
        var4.field_r = param1.a((byte) 19, param2);
        var4.field_o = true;
        var4.field_n = false;
        return var4;
    }

    public static void a(byte param0) {
        if (param0 != 14) {
            field_a = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    gj(le param0) {
        ((gj) this).field_e = new cd();
        ((gj) this).field_b = 0;
        ((gj) this).field_c = false;
        vi var2 = param0.a(0, 5, (Runnable) this);
        while (0 == var2.field_a) {
            wk.a((byte) -112, 10L);
        }
        if (-3 == (var2.field_a ^ -1)) {
            throw new RuntimeException();
        }
        ((gj) this).field_d = (Thread) var2.field_e;
    }

    static {
    }
}
