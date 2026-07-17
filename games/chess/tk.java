/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tk {
    static bn field_i;
    static String field_c;
    static nk field_h;
    static String field_f;
    static int field_b;
    static lh field_a;
    static ci field_d;
    static um field_g;
    static int field_e;

    final static void b(int param0, int param1) {
        qf.field_c = 0;
        pj.field_f = new int[3];
        int var2 = -38;
        ik.field_i = new ld[3000];
        fh.field_b = 200;
    }

    final boolean a(byte param0) {
        if (param0 <= -63) {
          if ((Object) (Object) dl.field_j != this) {
            if (this != (Object) (Object) gi.field_d) {
              if ((Object) (Object) ik.field_e == this) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static void a() {
        if (!(null == mh.field_d)) {
            mh.field_d.c();
        }
        if (!(null == kn.field_F)) {
            kn.field_F.c();
        }
    }

    public static void b() {
        field_h = null;
        field_f = null;
        field_c = null;
        field_g = null;
        field_a = null;
        field_i = null;
        field_d = null;
    }

    final static boolean a(int param0, int param1) {
        try {
            if (!(param1 > field_h.field_l)) {
                return true;
            }
            if (null == lj.field_a) {
                return false;
            }
            int var3 = 64 / ((param0 - -77) / 42);
            int var2_int = lj.field_a.c(0);
            if (0 < var2_int) {
                if (!(param1 - field_h.field_l >= var2_int)) {
                    var2_int = param1 - field_h.field_l;
                }
                lj.field_a.a(field_h.field_o, var2_int, (byte) -87, field_h.field_l);
                ml.field_d = ud.a(2);
                field_h.field_l = field_h.field_l + var2_int;
                if (param1 > field_h.field_l) {
                    return false;
                }
                field_h.field_l = 0;
                return true;
            }
            {
                if (0 <= var2_int) {
                    if (ea.i((byte) -128) <= 30000L) {
                        return false;
                    }
                }
                si.d(65280);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Player Name: ";
        field_f = "Rating";
    }
}
