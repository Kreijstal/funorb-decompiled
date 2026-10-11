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
        field_e = (int[][]) null;
        field_b = null;
        if (param0 != 16478) {
          field_f = -83;
        }
        field_c = null;
    }

    final static void a(long param0, ab param1, int param2, int param3, boolean param4, int param5, int param6, int param7, int param8, int param9, String param10, int param11, int param12, boolean param13) {
        try {
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            ig.field_a = new th(param8);
            ed.field_q = new th(param11);
            bk.field_a = param12;
            qb.field_c = param4;
            ua.field_a = param5;
            vl.field_a = param1;
            fa.field_a = param0;
            ol.field_n = param10;
            bl.field_b = param6;
            ig.field_b = param7;
            mg.field_y = param2;
            hl.field_F = param13;
            nj.field_a = param9;
            if (vl.field_a.field_w != null) {
              try {
                kf.field_y = new be(vl.field_a.field_w, 64, 0);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var15 = (IOException) (Object) decompiledCaughtException;
                throw new RuntimeException(var15.toString());
              }
            }
            if (param3 != 0) {
              sb.b(-85);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = var15_ref;
            stackIn_15_1 = new StringBuilder().append("sb.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');
            if (param10 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw ld.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_a = new long[256];
        field_c = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_b = "to return to the normal view.";
        for (var2 = 0; var2 < 256; var2++) {
          var0 = (long)var2;
          for (var3 = 0; 8 > var3; var3++) {
            if ((1L & var0) == 1L) {
              var0 = -3932672073523589310L ^ var0 >>> 1;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_a[var2] = var0;
        }
        field_d = 9;
        field_e = new int[][]{new int[]{13}, new int[]{11, 12}, new int[]{11, 12, 13}, new int[]{8, 11, 12, 5}, new int[]{9, 13, 6, 7, 10}, new int[]{9, 13, 6, 7, 10, 15}, new int[]{11, 12, 6, 13, 9, 10, 7}, new int[]{2, 11, 12, 6, 9, 10, 7, 15}, new int[]{2, 12, 11, 9, 13, 6, 7, 10, 15}, new int[]{8, 11, 12, 5, 6, 13, 9, 10, 7, 15}, new int[]{0, 1, 2, 3, 4, 5, 12, 11, 8, 9, 6}, new int[]{1, 2, 3, 5, 12, 11, 8, 9, 13, 6, 7, 10}, new int[]{1, 2, 3, 5, 12, 11, 8, 9, 13, 6, 7, 10, 15}, new int[]{0, 1, 2, 3, 4, 5, 12, 11, 8, 9, 13, 6, 7, 10}, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15}};
    }
}
