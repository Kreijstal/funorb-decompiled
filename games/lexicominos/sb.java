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
            IOException var15 = null;
            RuntimeException var15_ref = null;
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_4_0 = 0;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            try {
              L0: {
                L1: {
                  ig.field_a = new th(param8);
                  ed.field_q = new th(param11);
                  bk.field_a = param12;
                  if (!param4) {
                    stackOut_2_0 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    break L1;
                  } else {
                    stackOut_1_0 = 1;
                    stackIn_3_0 = stackOut_1_0;
                    break L1;
                  }
                }
                L2: {
                  qb.field_c = stackIn_3_0 != 0;
                  ua.field_a = param5;
                  vl.field_a = param1;
                  fa.field_a = param0;
                  ol.field_n = param10;
                  bl.field_b = param6;
                  ig.field_b = param7;
                  mg.field_y = param2;
                  if (!param13) {
                    stackOut_5_0 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
                L3: {
                  hl.field_F = stackIn_6_0 != 0;
                  nj.field_a = param9;
                  if (vl.field_a.field_w == null) {
                    break L3;
                  } else {
                    try {
                      L4: {
                        kf.field_y = new be(vl.field_a.field_w, 64, 0);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var15 = (IOException) (Object) decompiledCaughtException;
                      throw new RuntimeException(var15.toString());
                    }
                    break L3;
                  }
                }
                L5: {
                  if (param3 == 0) {
                    break L5;
                  } else {
                    sb.b(-85);
                    break L5;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_13_0 = (RuntimeException) (var15_ref);
                stackOut_13_1 = new StringBuilder().append("sb.B(").append(param0).append(',');
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param1 == null) {
                  stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L6;
                } else {
                  stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L6;
                }
              }
              L7: {
                stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param10 == null) {
                  stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L7;
                } else {
                  stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L7;
                }
              }
              throw ld.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param11 + ',' + param12 + ',' + param13 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit: {
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
                field_e = new int[][]{new int[]{13}, new int[]{11, 12}, new int[]{11, 12, 13}, new int[]{8, 11, 12, 5}, new int[]{9, 13, 6, 7, 10}, new int[]{9, 13, 6, 7, 10, 15}, new int[]{11, 12, 6, 13, 9, 10, 7}, new int[]{2, 11, 12, 6, 9, 10, 7, 15}, new int[]{2, 12, 11, 9, 13, 6, 7, 10, 15}, new int[]{8, 11, 12, 5, 6, 13, 9, 10, 7, 15}, new int[]{0, 1, 2, 3, 4, 5, 12, 11, 8, 9, 6}, new int[]{1, 2, 3, 5, 12, 11, 8, 9, 13, 6, 7, 10}, new int[]{1, 2, 3, 5, 12, 11, 8, 9, 13, 6, 7, 10, 15}, new int[]{0, 1, 2, 3, 4, 5, 12, 11, 8, 9, 13, 6, 7, 10}, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15}};
                break $cfr$clinit;
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
}
