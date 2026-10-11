/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ri {
    static String[] field_b;
    static ue field_c;
    static int[] field_a;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != -15552) {
          return;
        }
        field_b = null;
    }

    final static ue a(boolean param0, boolean param1, int param2, int param3, boolean param4, boolean param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          t var8 = null;
          ue stackIn_11_0 = null;
          ue stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            var6 = null;
            if (ij.field_f.field_e != null) {
              ne.field_l = new td(ij.field_f.field_e, 5200, 0);
              ij.field_f.field_e = null;
              var6 = new uf(255, ne.field_l, new td(ij.field_f.field_t, 12000, 0), 2097152);
            }
            var7 = null;
            if (null != ne.field_l) {
              if (fe.field_J == null) {
                fe.field_J = new td[ij.field_f.field_q.length];
              }
              if (fe.field_J[param3] == null) {
                fe.field_J[param3] = new td(ij.field_f.field_q[param3], 12000, 0);
                ij.field_f.field_q[param3] = null;
              }
              var7 = new uf(param3, ne.field_l, fe.field_J[param3], 2097152);
            }
            if (!param0) {
              stackIn_11_0 = (ue) null;
              return stackIn_11_0;
            }
            var8 = bl.field_b.a(param4, -72, (uf) (var7), param3, (uf) (var6));
            if (param1) {
              var8.a(-126);
            }
            stackIn_15_0 = new ue(var8, param5, param2);
            return stackIn_15_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(((IOException) (var6)).toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(int param0) {
        CharSequence var3 = null;
        we.field_i = se.field_p.a(-104);
        if (param0 == 12000) {
          var3 = (CharSequence) ((Object) we.field_i);
          ba.field_e = ni.a(param0 - 11877, var3);
          return;
        }
        field_b = (String[]) null;
        CharSequence var2 = (CharSequence) ((Object) we.field_i);
        ba.field_e = ni.a(param0 - 11877, var2);
    }

    static {
        field_a = new int[8192];
    }
}
