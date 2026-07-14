/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends wf {
    static long field_i;
    static char[] field_e;
    static int[] field_g;
    static boolean field_h;
    static gk field_f;

    private te() throws Throwable {
        throw new Error();
    }

    final static cp a(byte[] param0, int param1) {
        cp var2 = null;
        if (param0 != null) {
          var2 = new cp(param0, lh.field_a, lg.field_j, ji.field_b, ee.field_e, ud.field_e, fk.field_a);
          if (param1 > -75) {
            return (cp) null;
          } else {
            kf.f(1);
            return var2;
          }
        } else {
          return null;
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = AceOfSkies.field_G ? 1 : 0;
        io.field_c.a(0);
        var1 = 0;
        L0: while (true) {
          if (32 <= var1) {
            if (param0 < 31) {
              field_e = (char[]) null;
              var1 = 0;
              L1: while (true) {
                if (32 <= var1) {
                  eu.field_g = 0;
                  return;
                } else {
                  ob.field_c[var1] = 0L;
                  var1++;
                  continue L1;
                }
              }
            } else {
              var1 = 0;
              L2: while (true) {
                if (32 <= var1) {
                  eu.field_g = 0;
                  return;
                } else {
                  ob.field_c[var1] = 0L;
                  var1++;
                  continue L2;
                }
              }
            }
          } else {
            pn.field_b[var1] = 0L;
            var1++;
            continue L0;
          }
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        field_f = null;
        if (param0) {
            return;
        }
        field_g = null;
    }

    final static void a(int param0, int param1) {
        try {
            int var2 = 0;
            Throwable var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var2 = 112 % ((param1 - 8) / 34);
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            Object discarded$1 = fe.a("resizing", -15201, new Object[1], bm.m(110));
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        var3 = caughtException;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
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

    final static void b(boolean param0) {
        if (param0) {
          if (null != ft.field_l) {
            ft.field_l.a(1);
            ft.field_l = null;
            return;
          } else {
            return;
          }
        } else {
          field_i = -60L;
          if (null == ft.field_l) {
            return;
          } else {
            ft.field_l.a(1);
            ft.field_l = null;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
