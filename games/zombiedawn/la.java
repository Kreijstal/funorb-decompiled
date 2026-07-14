/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends java.awt.Canvas implements java.awt.event.FocusListener {
    java.awt.Frame field_e;
    volatile boolean field_a;
    static int[] field_b;
    static vn[] field_c;
    static uh field_d;

    public static void c(int param0) {
        if (param0 < 39) {
            Object var2 = null;
            oi discarded$0 = la.a((dj) null, 13, (dj) null, (byte) 28, -8);
            field_c = null;
            field_b = null;
            field_d = null;
            return;
        }
        field_c = null;
        field_b = null;
        field_d = null;
    }

    final static void a(int param0) {
        int var2 = 0;
        u var3 = null;
        int var4 = ZombieDawn.field_J;
        u[] var5 = ij.field_L;
        u[] var1 = var5;
        if (param0 < 17) {
            la.a((byte) 114);
            for (var2 = 0; var2 < var5.length; var2++) {
                var3 = var5[var2];
                var3.c(-23);
            }
            return;
        }
        for (var2 = 0; var2 < var5.length; var2++) {
            var3 = var5[var2];
            var3.c(-23);
        }
    }

    final void a(ec param0, byte param1) {
        jb.a(113, ((la) this).field_e, param0);
        if (param1 <= 112) {
            Object var4 = null;
            ((la) this).paint((java.awt.Graphics) null);
        }
    }

    final static int b(int param0) {
        if (param0 != 0) {
            field_d = null;
            return ae.field_a;
        }
        return ae.field_a;
    }

    public final void update(java.awt.Graphics param0) {
    }

    la() {
    }

    final static void a(byte param0) {
        try {
            Exception var1 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (param0 >= 57) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        field_b = null;
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (null != ce.field_t) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        fj.field_g.field_j = fj.field_g.field_j + 24;
                        return;
                    }
                    case 4: {
                        try {
                            ce.field_t.a(0, 0L);
                            ce.field_t.a(122, fj.field_g.field_h, fj.field_g.field_j, 24);
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        fj.field_g.field_j = fj.field_g.field_j + 24;
                        return;
                    }
                    case 6: {
                        var1 = (Exception) (Object) caughtException;
                        fj.field_g.field_j = fj.field_g.field_j + 24;
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((la) this).field_a = true;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static oi a(dj param0, int param1, dj param2, byte param3, int param4) {
        if (!ph.a(param4, 31043, param1, param2)) {
            return null;
        }
        if (param3 > -96) {
            return null;
        }
        return kk.a(-16491, param0.a((byte) 51, param4, param1));
    }

    final static vk a(String param0, byte param1) {
        int var2 = 0;
        String var3 = null;
        String var4 = null;
        vk var5 = null;
        if (param0 == null) {
          return qd.field_b;
        } else {
          if (param0.length() != 0) {
            var2 = param0.indexOf('@');
            if (var2 == -1) {
              return bg.field_l;
            } else {
              var3 = param0.substring(0, var2);
              var4 = param0.substring(var2 - -1);
              var5 = be.a(var3, (byte) -65);
              if (var5 == null) {
                if (param1 <= -57) {
                  return of.a(var4, 8947848);
                } else {
                  field_d = null;
                  return of.a(var4, 8947848);
                }
              } else {
                return var5;
              }
            }
          } else {
            return qd.field_b;
          }
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    static {
    }
}
