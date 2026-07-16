/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class in {
    static int[] field_b;
    static String[] field_a;

    final static void a(int param0, boolean param1, String param2, int param3, int param4, int param5, int param6, vh param7, boolean param8, int param9, int param10, long param11, int param12, int param13) {
        try {
            IOException var15 = null;
            int stackIn_5_0 = 0;
            int stackIn_8_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_6_0 = 0;
            L0: {
              kj.field_d = new df(param5);
              wa.field_d = new df(param12);
              tp.field_i = param3;
              sf.field_a = param13;
              if (param10 == 0) {
                break L0;
              } else {
                in.a(116, false, (String) null, -116, -96, -98, 5, (vh) null, false, -9, 28, 96L, 103, -78);
                break L0;
              }
            }
            L1: {
              ao.field_d = param0;
              vg.field_j = param4;
              ea.field_t = param9;
              rj.field_w = param6;
              if (!param8) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              ql.field_t = stackIn_5_0 != 0;
              if (!param1) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            ao.field_b = stackIn_8_0 != 0;
            u.field_t = param7;
            ih.field_b = param2;
            ul.field_f = param11;
            if (null == u.field_t.field_c) {
              return;
            } else {
              try {
                L3: {
                  jl.field_W = new o(u.field_t.field_c, 64, 0);
                  break L3;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var15 = (IOException) (Object) decompiledCaughtException;
                throw new RuntimeException(var15.toString());
              }
              return;
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
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
        field_a = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
