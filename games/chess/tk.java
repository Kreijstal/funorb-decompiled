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
    static ResourceArchive field_g;
    static int field_e;

    final static void b(int param0, int param1) {
        qf.field_c = 0;
        GzipInflater.field_f = new int[3];
        int var2 = -114 / ((param1 + 25) / 36);
        ik.field_i = new ld[param0 * 15];
        fh.field_b = param0;
    }

    final boolean a(byte param0) {
        if (param0 > -63) {
          return false;
        }
        if (dl.field_j == this) {
          return true;
        }
        if (this == gi.field_d) {
          return true;
        }
        if (ik.field_e != this) {
          return false;
        }
        return true;
    }

    final static void a(int param0) {
        if (param0 == -2919) {
          if (null != mh.field_d) {
            mh.field_d.c();
          }
          if (null != kn.field_F) {
            kn.field_F.c();
          }
          return;
        }
        field_e = 41;
        if (null != mh.field_d) {
          mh.field_d.c();
        }
        if (null != kn.field_F) {
          kn.field_F.c();
        }
    }

    public static void b(byte param0) {
        if (param0 == 77) {
          field_h = null;
          field_f = null;
          field_c = null;
          field_g = null;
          field_a = null;
          field_i = null;
          field_d = null;
          return;
        }
        tk.a(-49);
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
          if (!(param1 > field_h.position)) {
            return true;
          }
          if (null == ArchiveIndex.field_a) {
            return false;
          }
          int var3 = 64 / ((param0 + 77) / 42);
          int var2_int = ArchiveIndex.field_a.c(0);
          if (0 < var2_int) {
            if (!(param1 - field_h.position >= var2_int)) {
              var2_int = param1 - field_h.position;
            }
            ArchiveIndex.field_a.a(field_h.data, var2_int, (byte) -87, field_h.position);
            ml.field_d = ud.a(2);
            field_h.position = field_h.position + var2_int;
            if (param1 > field_h.position) {
              return false;
            }
            field_h.position = 0;
            return true;
          }
          try {
            if (false) throw (IOException) null;
            if (0 <= var2_int &&
              ea.i((byte) -128) <= 30000L) {
              return false;
            }
            si.d(65280);
          } catch (IOException iOException) {
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
        field_c = "Player Name: ";
        field_f = "Rating";
    }
}
