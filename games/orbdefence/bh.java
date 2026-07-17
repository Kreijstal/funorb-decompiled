/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bh {
    static boolean field_b;
    static String field_a;
    static String field_f;
    static String field_e;
    static ki field_d;
    static int field_c;

    final static void a(int param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            L0: {
              if (p.field_d == null) {
                break L0;
              } else {
                L1: {
                  if (0 > param0) {
                    break L1;
                  } else {
                    if (da.field_r != dh.field_bb) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (uk.field_b.field_i != 0) {
                    break L2;
                  } else {
                    if (~(10000L + p.field_a) > ~ji.b(122)) {
                      uk.field_b.i(param0, 120);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (uk.field_b.field_i > 0) {
                    {
                      L4: {
                        p.field_d.a((byte) 30, uk.field_b.field_j, 0, uk.field_b.field_i);
                        p.field_a = ji.b(-61);
                        break L4;
                      }
                    }
                    uk.field_b.field_i = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return;
              }
            }
            uk.field_b.field_i = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a() {
        ed.field_b.b(0);
        int var1 = -118;
        if (kg.field_h.e(255)) {
            return 0;
        }
        int discarded$0 = -123;
        return d.d();
    }

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_e = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = true;
        field_a = "Player Name: ";
        field_f = "Creating your account";
    }
}
