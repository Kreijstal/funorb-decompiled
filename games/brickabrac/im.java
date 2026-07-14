/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class im {
    private java.util.zip.Inflater field_b;
    static jp[] field_a;
    static boolean field_g;
    static mh field_d;
    static int field_e;
    static jp[][] field_f;
    static String[] field_c;

    private im(int param0, int param1, int param2) {
    }

    public im() {
        this(-1, 1000000, 1000000);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        if (param5 >= -51) {
          im.a(39, -27, -77, 50, -59, (byte) -97, -42);
          hb.a(param6, param3, param4, 2, 196, param2, param0, 76, param1);
          return;
        } else {
          hb.a(param6, param3, param4, 2, 196, param2, param0, 76, param1);
          return;
        }
    }

    final static void a(int param0, String param1, boolean param2, int param3, int param4, int param5, int param6, int param7, tg param8, byte param9, boolean param10, long param11, int param12, int param13) {
        try {
            IOException var15 = null;
            int stackIn_3_0 = 0;
            int stackIn_8_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0;
            int stackOut_1_0;
            int stackOut_7_0;
            int stackOut_6_0;
            L0: {
              jl.field_e = new pi(param4);
              k.field_h = new pi(param5);
              fe.field_ob = param6;
              tq.field_h = param1;
              lh.field_s = param8;
              ko.field_e = param0;
              if (!param2) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L0;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L0;
              }
            }
            L1: {
              qb.field_u = stackIn_3_0 != 0;
              rp.field_x = param7;
              if (param9 > 121) {
                break L1;
              } else {
                im.b(47);
                break L1;
              }
            }
            L2: {
              dl.field_b = param13;
              pj.field_a = param12;
              if (!param10) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            ec.field_O = stackIn_8_0 != 0;
            ud.field_E = param11;
            pe.field_r = param3;
            if (null == lh.field_s.field_k) {
              var15 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var15.toString());
            } else {
              try {
                go.field_a = new jg(lh.field_s.field_k, 64, 0);
              } catch (java.io.IOException decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_c = null;
        if (param0 != -32) {
            return;
        }
        field_d = null;
        field_a = null;
    }

    final static void b(int param0) {
        pp.field_a = ga.field_i;
        if (param0 != -8) {
            im.a(42);
        }
    }

    final void a(byte[] param0, int param1, wq param2) {
        try {
            Exception exception = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (-32 != (param2.field_k[param2.field_l] ^ -1)) {
                break L0;
              } else {
                if (-117 == param2.field_k[param2.field_l - -1]) {
                  L1: {
                    if (((im) this).field_b != null) {
                      break L1;
                    } else {
                      ((im) this).field_b = new java.util.zip.Inflater(true);
                      break L1;
                    }
                  }
                  L2: {
                    if (param1 == -20555) {
                      break L2;
                    } else {
                      im.b(-99);
                      break L2;
                    }
                  }
                  try {
                    ((im) this).field_b.setInput(param2.field_k, param2.field_l + 10, param2.field_k.length + (-8 + -param2.field_l) + -10);
                    int discarded$2 = ((im) this).field_b.inflate(param0);
                  } catch (java.lang.Exception decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                  }
                  exception = (Exception) (Object) decompiledCaughtException;
                  ((im) this).field_b.reset();
                  throw new RuntimeException("");
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = false;
    }
}
