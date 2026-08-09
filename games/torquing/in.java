/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class in {
    static int[] field_b;
    static String[] field_a;

    final static void a(int param0, boolean param1, String param2, int param3, int param4, int param5, int param6, vh param7, boolean param8, int param9, int param10, long param11, int param12, int param13) {
        try {
            int stackIn_5_0 = 0;
            int stackIn_8_0 = 0;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            StringBuilder stackIn_18_1 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            IOException var15 = null;
            RuntimeException var15_ref = null;
            try {
              L0: {
                L1: {
                  kj.field_d = new df(param5);
                  wa.field_d = new df(param12);
                  tp.field_i = param3;
                  sf.field_a = param13;
                  if (param10 == 0) {
                    break L1;
                  } else {
                    in.a(116, false, (String) null, -116, -96, -98, 5, (vh) null, false, -9, 28, 96L, 103, -78);
                    break L1;
                  }
                }
                L2: {
                  ao.field_d = param0;
                  vg.field_j = param4;
                  ea.field_t = param9;
                  rj.field_w = param6;
                  if (!param8) {
                    stackIn_5_0 = 0;
                    break L2;
                  } else {
                    stackIn_5_0 = 1;
                    break L2;
                  }
                }
                L3: {
                  ql.field_t = stackIn_5_0 != 0;
                  if (!param1) {
                    stackIn_8_0 = 0;
                    break L3;
                  } else {
                    stackIn_8_0 = 1;
                    break L3;
                  }
                }
                ao.field_b = stackIn_8_0 != 0;
                u.field_t = param7;
                ih.field_b = param2;
                ul.field_f = param11;
                if (null == u.field_t.field_c) {
                  break L0;
                } else {
                  try {
                    L4: {
                      jl.field_W = new o(u.field_t.field_c, 64, 0);
                      break L4;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var15 = (IOException) (Object) decompiledCaughtException;
                    throw new RuntimeException(var15.toString());
                  }
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_15_0 = (RuntimeException) (var15_ref);

                stackIn_15_1 = new StringBuilder().append("in.B(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L5;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

                if (param7 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L6;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L6;
                }
              }
              throw rb.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 != -28) {
            field_a = (String[]) null;
        }
    }

    static {
        field_b = new int[8192];
        field_a = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
