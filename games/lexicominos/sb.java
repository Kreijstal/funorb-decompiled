/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sb {
    private static long[] field_a;
    static String field_b;
    static String[] field_c;
    static int field_f;
    static int[][] field_e;
    static int field_d;

    final static void a(int param0) {
        wj.c(-6399);
        ca.field_k = true;
        dl.field_g = true;
        ug.field_A.h(0);
        if (param0 >= -121) {
            return;
        }
        m.a(eh.field_c, -121, false);
    }

    public static void b(int param0) {
        field_a = null;
        field_e = null;
        field_b = null;
        if (param0 != 16478) {
            field_f = -83;
        }
        field_c = null;
    }

    final static void a(long param0, ab param1, int param2, int param3, boolean param4, int param5, int param6, int param7, int param8, int param9, String param10, int param11, int param12, boolean param13) {
        try {
            ig.field_a = new th(param8);
            ed.field_q = new th(param11);
            bk.field_a = param12;
            qb.field_c = param4 ? true : false;
            ua.field_a = param5;
            vl.field_a = param1;
            fa.field_a = param0;
            ol.field_n = param10;
            bl.field_b = param6;
            ig.field_b = param7;
            mg.field_y = param2;
            hl.field_F = param13 ? true : false;
            nj.field_a = param9;
            if (vl.field_a.field_w != null) {
                try {
                    kf.field_y = new be(vl.field_a.field_w, 64, 0);
                } catch (IOException iOException) {
                    throw new RuntimeException(iOException.toString());
                }
            }
            if (param3 != 0) {
                sb.b(-85);
            }
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
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_a = new long[256];
        field_c = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_b = "to return to the normal view.";
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            field_d = 9;
            field_e = new int[][]{new int[1], new int[2], new int[3], new int[4], new int[5], new int[6], new int[7], new int[8], new int[9], new int[10], new int[11], new int[12], new int[13], new int[14], new int[15]};
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (8 <= var3) {
                field_a[var2] = var0;
                var2++;
                continue L0;
              } else {
                if ((1L & var0) == 1L) {
                  var0 = -3932672073523589310L ^ var0 >>> -647699583;
                  var3++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
