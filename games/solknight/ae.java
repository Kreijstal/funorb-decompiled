/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae implements Runnable {
    static java.awt.Color field_e;
    private hl field_d;
    private Thread field_c;
    int field_a;
    private boolean field_b;

    public static void b(int param0) {
        field_e = null;
        if (param0 == 3) {
            return;
        }
        field_e = null;
    }

    final md a(int param0, int param1, bi param2, byte[] param3) {
        md var5 = null;
        Object var6 = null;
        var5 = new md();
        var5.field_u = param3;
        var5.field_l = (long)param1;
        if (param0 < 45) {
          var6 = null;
          md discarded$2 = ((ae) this).a(113, 43, (bi) null, (byte[]) null);
          var5.field_w = 2;
          var5.field_r = false;
          var5.field_x = param2;
          this.a((byte) -87, var5);
          return var5;
        } else {
          var5.field_w = 2;
          var5.field_r = false;
          var5.field_x = param2;
          this.a((byte) -87, var5);
          return var5;
        }
    }

    final md a(bi param0, int param1, int param2) {
        md var4 = null;
        Object var5 = null;
        md var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        Object stackIn_3_0 = null;
        md stackIn_9_0 = null;
        Throwable decompiledCaughtException = null;
        md stackOut_8_0 = null;
        Object stackOut_2_0 = null;
        var8 = SolKnight.field_L ? 1 : 0;
        var4 = new md();
        var4.field_w = 1;
        var5 = (Object) (Object) ((ae) this).field_d;
        synchronized (var5) {
          L0: {
            var6 = (md) (Object) ((ae) this).field_d.d(125);
            if (param2 <= -100) {
              L1: while (true) {
                if (var6 == null) {
                  break L0;
                } else {
                  L2: {
                    if (((long)param1 ^ -1L) != (var6.field_l ^ -1L)) {
                      break L2;
                    } else {
                      if (param0 != var6.field_x) {
                        break L2;
                      } else {
                        if (-3 != (var6.field_w ^ -1)) {
                          break L2;
                        } else {
                          var4.field_u = var6.field_u;
                          var4.field_m = false;
                          stackOut_8_0 = (md) var4;
                          stackIn_9_0 = stackOut_8_0;
                          return stackIn_9_0;
                        }
                      }
                    }
                  }
                  var6 = (md) (Object) ((ae) this).field_d.b(-1);
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (md) (Object) stackIn_3_0;
            }
          }
        }
        var4.field_u = param0.a(-925871512, param1);
        var4.field_r = true;
        var4.field_m = false;
        return var4;
    }

    final void a(int param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        Object var4 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 == 5) {
            break L0;
          } else {
            var4 = null;
            this.a((byte) -127, (md) null);
            break L0;
          }
        }
        ((ae) this).field_b = true;
        var2 = (Object) (Object) ((ae) this).field_d;
        synchronized (var2) {
          L1: {
            ((Object) (Object) ((ae) this).field_d).notifyAll();
            break L1;
          }
        }
        try {
          L2: {
            ((ae) this).field_c.join();
            break L2;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L3;
          }
        }
        ((ae) this).field_c = null;
    }

    private final void a(byte param0, md param1) {
        Object var3 = null;
        Object var3_ref = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        var3_ref = (Object) (Object) ((ae) this).field_d;
        synchronized (var3_ref) {
          L0: {
            ((ae) this).field_d.a((ec) (Object) param1, 0);
            if (param0 < -79) {
              ((ae) this).field_a = ((ae) this).field_a + 1;
              ((Object) (Object) ((ae) this).field_d).notifyAll();
              break L0;
            } else {
              return;
            }
          }
        }
    }

    final md a(int param0, bi param1, int param2) {
        md var4 = null;
        var4 = new md();
        if (param0 > -56) {
          ((ae) this).run();
          var4.field_w = 3;
          var4.field_x = param1;
          var4.field_r = false;
          var4.field_l = (long)param2;
          this.a((byte) -94, var4);
          return var4;
        } else {
          var4.field_w = 3;
          var4.field_x = param1;
          var4.field_r = false;
          var4.field_l = (long)param2;
          this.a((byte) -94, var4);
          return var4;
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
            md var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var5 = SolKnight.field_L ? 1 : 0;
            L0: while (true) {
              if (!((ae) this).field_b) {
                var2 = (Object) (Object) ((ae) this).field_d;
                synchronized (var2) {
                  L1: {
                    var7 = (md) (Object) ((ae) this).field_d.c(0);
                    if (var7 == null) {
                      try {
                        L2: {
                          ((Object) (Object) ((ae) this).field_d).wait();
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
                      ((ae) this).field_a = ((ae) this).field_a - 1;
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
                        if (-3 == (var7.field_w ^ -1)) {
                          boolean discarded$1 = var7.field_x.a((byte) -46, (int)var7.field_l, var7.field_u, var7.field_u.length);
                          var7.field_m = false;
                          break L5;
                        } else {
                          if (3 == var7.field_w) {
                            var7.field_u = var7.field_x.a(-925871512, (int)var7.field_l);
                            var7.field_m = false;
                            break L5;
                          } else {
                            var7.field_m = false;
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
                      hi.a((Throwable) (Object) var2_ref, (String) null, 1);
                      var7.field_m = false;
                      break L6;
                    }
                  }
                  continue L0;
                }
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, da param1) {
        sl var2 = null;
        if (param0 != 26197) {
          field_e = null;
          sl.b(param1.a(param0 ^ 26193, "headers.packvorbis", ""));
          var2 = sl.a(param1, "jagex logo2.packvorbis", "");
          sh discarded$4 = var2.c();
          return;
        } else {
          sl.b(param1.a(param0 ^ 26193, "headers.packvorbis", ""));
          var2 = sl.a(param1, "jagex logo2.packvorbis", "");
          sh discarded$5 = var2.c();
          return;
        }
    }

    ae(dl param0) {
        ((ae) this).field_d = new hl();
        ((ae) this).field_b = false;
        ((ae) this).field_a = 0;
        nj var2 = param0.a(5, -51, (Runnable) this);
        while (var2.field_c == 0) {
            i.a((byte) 90, 10L);
        }
        if (2 == var2.field_c) {
            throw new RuntimeException();
        }
        ((ae) this).field_c = (Thread) var2.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new java.awt.Color(10040319);
    }
}
