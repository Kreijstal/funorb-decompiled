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
            IOException iOException = null;
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
                    if ((10000L + p.field_a ^ -1L) > (ji.b(param1 ^ -123) ^ -1L)) {
                      uk.field_b.i(param0, 120);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (param1 > (uk.field_b.field_i ^ -1)) {
                    try {
                      L4: {
                        p.field_d.a((byte) 30, uk.field_b.field_j, 0, uk.field_b.field_i);
                        p.field_a = ji.b(-61);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        th.a(114);
                        break L5;
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

    final static int a(byte param0) {
        int var1 = 0;
        ed.field_b.b(0);
        var1 = -118 / ((param0 - 30) / 59);
        if (kg.field_h.e(255)) {
          return 0;
        } else {
          return d.d((byte) -123);
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != -21000) {
            return;
        }
        field_a = null;
        field_e = null;
        field_d = null;
    }

    static {
        field_b = true;
        field_a = "Player Name: ";
        field_f = "Creating your account";
    }
}
