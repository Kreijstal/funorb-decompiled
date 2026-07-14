/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd {
    private bh field_e;
    static boolean field_g;
    private int field_f;
    private int field_c;
    static wd field_a;
    private ek field_b;
    static int field_d;

    final static int a(boolean param0) {
        if (!param0) {
            return 73;
        }
        return 1;
    }

    final void a(Object param0, int param1, long param2) {
        this.a((byte) 121, param0, param2, param1);
    }

    final Object a(long param0, int param1) {
        int var5 = 0;
        Object var6 = null;
        ej var7 = null;
        mi var8 = null;
        var5 = -27 % ((param1 - -2) / 51);
        var8 = (mi) (Object) ((gd) this).field_b.a(param0, 1);
        if (var8 != null) {
          var6 = var8.d((byte) 100);
          if (var6 == null) {
            var8.b(4);
            var8.a(-6242);
            ((gd) this).field_f = ((gd) this).field_f + var8.field_p;
            return null;
          } else {
            L0: {
              if (var8.e(1)) {
                var7 = new ej(var6, var8.field_p);
                ((gd) this).field_b.a(var8.field_b, -1, (rf) (Object) var7);
                ((gd) this).field_e.a((uh) (Object) var7, 25184);
                ((mi) (Object) var7).field_j = 0L;
                var8.b(4);
                var8.a(-6242);
                break L0;
              } else {
                ((gd) this).field_e.a((uh) (Object) var8, 25184);
                var8.field_j = 0L;
                break L0;
              }
            }
            return var6;
          }
        } else {
          return null;
        }
    }

    final static void a(int param0) {
        try {
            Exception var1 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null != mf.field_c) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        se.field_p.field_g = se.field_p.field_g + param0;
                        return;
                    }
                    case 2: {
                        try {
                            mf.field_c.a(0L, 0);
                            mf.field_c.a(se.field_p.field_g, 24, false, se.field_p.field_f);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 4;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        se.field_p.field_g = se.field_p.field_g + param0;
                        return;
                    }
                    case 4: {
                        var1 = (Exception) (Object) caughtException;
                        se.field_p.field_g = se.field_p.field_g + param0;
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

    private final void a(byte param0, Object param1, long param2, int param3) {
        ej var6 = null;
        int var7 = 0;
        mi var8 = null;
        mi var10 = null;
        var7 = StarCannon.field_A;
        if (((gd) this).field_c < param3) {
          throw new IllegalStateException();
        } else {
          this.b(param2, -31649);
          if (param0 >= 113) {
            ((gd) this).field_f = ((gd) this).field_f - param3;
            L0: while (true) {
              if (((gd) this).field_f >= 0) {
                var6 = new ej(param1, param3);
                ((gd) this).field_b.a(param2, -1, (rf) (Object) var6);
                ((gd) this).field_e.a((uh) (Object) var6, 25184);
                ((mi) (Object) var6).field_j = 0L;
                return;
              } else {
                var10 = (mi) (Object) ((gd) this).field_e.b(-57);
                this.a((byte) 23, var10);
                continue L0;
              }
            }
          } else {
            ((gd) this).field_c = 73;
            ((gd) this).field_f = ((gd) this).field_f - param3;
            L1: while (true) {
              if (((gd) this).field_f >= 0) {
                var6 = new ej(param1, param3);
                ((gd) this).field_b.a(param2, -1, (rf) (Object) var6);
                ((gd) this).field_e.a((uh) (Object) var6, 25184);
                ((mi) (Object) var6).field_j = 0L;
                return;
              } else {
                var8 = (mi) (Object) ((gd) this).field_e.b(-57);
                this.a((byte) 23, var8);
                continue L1;
              }
            }
          }
        }
    }

    private gd() throws Throwable {
        throw new Error();
    }

    private final void b(long param0, int param1) {
        mi var4 = null;
        var4 = (mi) (Object) ((gd) this).field_b.a(param0, 1);
        if (param1 != -31649) {
          int discarded$2 = gd.a(false);
          this.a((byte) 23, var4);
          return;
        } else {
          this.a((byte) 23, var4);
          return;
        }
    }

    private final void a(byte param0, mi param1) {
        if (param0 == 23) {
          if (param1 != null) {
            param1.b(param0 + -19);
            param1.a(-6242);
            ((gd) this).field_f = ((gd) this).field_f + param1.field_p;
            return;
          } else {
            return;
          }
        } else {
          this.a((byte) 101, (Object) null, -29L, -99);
          if (param1 == null) {
            return;
          } else {
            param1.b(param0 + -19);
            param1.a(-6242);
            ((gd) this).field_f = ((gd) this).field_f + param1.field_p;
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 <= 82) {
            gd.a(87);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = true;
    }
}
