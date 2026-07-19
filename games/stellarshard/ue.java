/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ue {
    static int field_a;
    static oj field_c;
    static int field_b;
    static int field_d;
    static hc field_e;

    public static void b(byte param0) {
        if (param0 >= -69) {
            return;
        }
        field_e = null;
        field_c = null;
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static void a(byte param0) {
        CharSequence var2 = null;
        CharSequence var3 = null;
        if (param0 > -119) {
          field_c = (oj) null;
          wf.field_b = ae.field_N.e((byte) 95);
          var2 = (CharSequence) ((Object) wf.field_b);
          wb.field_b = nh.a(var2, false);
          return;
        } else {
          wf.field_b = ae.field_N.e((byte) 95);
          var3 = (CharSequence) ((Object) wf.field_b);
          wb.field_b = nh.a(var3, false);
          return;
        }
    }

    final static void a(byte param0, int param1) {
        try {
            IOException iOException = null;
            int var2 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == ob.field_b) {
                break L0;
              } else {
                L1: {
                  if ((param1 ^ -1) > -1) {
                    break L1;
                  } else {
                    if (sl.field_d == la.field_O) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if (pg.field_fb.field_k != 0) {
                    break L2;
                  } else {
                    if (ih.a((byte) -98) > 10000L + t.field_d) {
                      pg.field_fb.f(param1, 950);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  var2 = 97 % ((-22 - param0) / 57);
                  if (0 < pg.field_fb.field_k) {
                    try {
                      L4: {
                        ob.field_b.a(pg.field_fb.field_r, 0, 113, pg.field_fb.field_k);
                        t.field_d = ih.a((byte) -98);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        oj.c(-2290);
                        break L5;
                      }
                    }
                    pg.field_fb.field_k = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return;
              }
            }
            pg.field_fb.field_k = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_c = new oj();
    }
}
