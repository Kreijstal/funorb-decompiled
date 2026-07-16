/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ih {
    private java.util.zip.Inflater field_c;
    static oi field_b;
    static int field_a;
    static String field_d;

    final void a(byte[] param0, ng param1, int param2) {
        try {
            Exception exception = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (-32 != (param1.field_h[param1.field_f] ^ -1)) {
                break L0;
              } else {
                if (-117 == param1.field_h[1 + param1.field_f]) {
                  L1: {
                    if (null != ((ih) this).field_c) {
                      break L1;
                    } else {
                      ((ih) this).field_c = new java.util.zip.Inflater(true);
                      break L1;
                    }
                  }
                  try {
                    L2: {
                      ((ih) this).field_c.setInput(param1.field_h, 10 + param1.field_f, -param1.field_f + -18 + param1.field_h.length);
                      int discarded$2 = ((ih) this).field_c.inflate(param0);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    exception = (Exception) (Object) decompiledCaughtException;
                    ((ih) this).field_c.reset();
                    throw new RuntimeException("");
                  }
                  if (param2 != -19515) {
                    return;
                  } else {
                    ((ih) this).field_c.reset();
                    return;
                  }
                } else {
                  break L0;
                }
              }
            }
            throw new RuntimeException("");
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public ih() {
        this(-1, 1000000, 1000000);
    }

    final static void a(byte param0) {
        uo.field_i = new dc();
        jm.field_d.a((qm) (Object) uo.field_i, (byte) -50);
        if (param0 != 63) {
            field_d = null;
        }
    }

    private ih(int param0, int param1, int param2) {
    }

    public static void a(int param0) {
        if (param0 <= 39) {
            ih.a((byte) -111);
            field_b = null;
            field_d = null;
            return;
        }
        field_b = null;
        field_d = null;
    }

    final static void a(byte param0, int param1, String param2, int param3) {
        if (-97 > (param1 ^ -1)) {
          gi.field_n.a();
          kh.a();
          go.field_l.a(param2, 0, 20, 16760896, -1);
          dk.field_o.a(param0 ^ -6963);
          gi.field_n.c(538, param3 + -20, 24576 / param1, 25);
          if (param0 == -20) {
            return;
          } else {
            field_b = null;
            return;
          }
        } else {
          go.field_l.a(param2, 538, param3, 16760896, -1);
          if (param0 == -20) {
            return;
          } else {
            field_b = null;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new oi();
        field_d = "Orb points: ";
        field_a = 50;
    }
}
