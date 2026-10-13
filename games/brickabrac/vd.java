/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vd {
    static int[] field_b;
    static String field_d;
    static boolean field_e;
    static mo field_a;
    static int field_c;
    static ArchiveFetchClient field_f;

    final static boolean a(int param0, int param1) {
        try {
          int var2_int = 0;
          IOException var2 = null;
          Throwable decompiledCaughtException = null;
          if (param0 != 20) {
            vd.a(-79);
          }
          if (param1 <= jl.field_e.position) {
            return true;
          }
          if (null == eq.field_g) {
            return false;
          }
          try {
            var2_int = eq.field_g.available(10434);
            if (0 >= var2_int) {
              if (var2_int < 0) {
                hn.a((byte) 123);
                return false;
              }
              if (MembershipBenefitsScreen.f(param0 - 6812) <= 30000L) {
                return false;
              }
              hn.a((byte) 123);
              return false;
            }
            if (var2_int > param1 - jl.field_e.position) {
              var2_int = -jl.field_e.position + param1;
            }
            eq.field_g.readFully(param0 + 25806, jl.field_e.data, var2_int, jl.field_e.position);
            oj.field_t = ue.a(false);
            jl.field_e.position = jl.field_e.position + var2_int;
            if (param1 > jl.field_e.position) {
              return false;
            }
            jl.field_e.position = 0;
            return true;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            hn.a((byte) 111);
            return false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        mm.h(-29448);
        if (param0 >= -126) {
          field_a = (mo) null;
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_a = null;
        if (!param0) {
          return;
        }
        field_b = null;
        field_d = null;
    }

    static {
        field_e = true;
        field_c = 20;
        field_b = new int[8192];
    }
}
