/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ak extends jb {
    int field_g;
    boolean field_n;
    int[][] field_l;
    long[][] field_k;
    String[][] field_i;
    static db field_f;
    int field_j;
    int field_h;
    static int field_m;

    public static void a() {
        field_f = null;
    }

    final static void a(int param0, byte param1) {
        try {
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == oi.field_c) {
                break L0;
              } else {
                L1: {
                  if (param0 < 0) {
                    break L1;
                  } else {
                    if (ek.field_h == gj.field_k) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if (tp.field_f.field_f != 0) {
                    break L2;
                  } else {
                    if (~(10000L + mp.field_p) > ~lo.a((byte) -118)) {
                      tp.field_f.d(8, param0);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (tp.field_f.field_f <= 0) {
                    break L3;
                  } else {
                    {
                      L4: {
                        oi.field_c.a(0, 92, tp.field_f.field_h, tp.field_f.field_f);
                        mp.field_p = lo.a((byte) 90);
                        break L4;
                      }
                    }
                    tp.field_f.field_f = 0;
                    break L3;
                  }
                }
                return;
              }
            }
            tp.field_f.field_f = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ak() {
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        kh.f(param1, param2 - -10, 79, 4, 0);
        kh.f(param1 - -1, param2 + 9, 77, 6, 0);
        kh.f(param1 - -1, 10 + param2, 77, 4, param4);
        oc.a(af.field_c, 26, param2, param3 + param1, 15, -123);
    }

    static {
    }
}
