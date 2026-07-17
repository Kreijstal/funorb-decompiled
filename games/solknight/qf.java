/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qf {
    static String field_f;
    static ad field_a;
    static String field_g;
    static long field_b;
    static long[] field_c;
    static int[] field_d;
    static int[] field_e;

    public static void a() {
        field_g = null;
        field_e = null;
        field_c = null;
        field_d = null;
        field_a = null;
        field_f = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == lf.field_d) {
                break L0;
              } else {
                L1: {
                  if (0 > param1) {
                    break L1;
                  } else {
                    if (ef.field_e == jj.field_Y) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if (param0 != id.field_c.field_m) {
                    break L2;
                  } else {
                    if (je.a(1) > gf.field_Y - -10000L) {
                      id.field_c.e(param1, -2147483648);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (id.field_c.field_m > 0) {
                    {
                      L4: {
                        lf.field_d.a(-28748, 0, id.field_c.field_m, id.field_c.field_l);
                        gf.field_Y = je.a(1);
                        break L4;
                      }
                    }
                    id.field_c.field_m = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return;
              }
            }
            id.field_c.field_m = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Names cannot start or end with space or underscore";
        field_g = "Please wait...";
        field_c = new long[32];
    }
}
