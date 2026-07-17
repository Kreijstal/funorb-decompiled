/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uf extends IOException {
    static String field_f;
    static int[] field_b;
    static int field_g;
    static String[] field_c;
    static int field_d;
    static int field_a;
    static int[] field_e;

    uf(String param0) {
        super(param0);
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        field_e = null;
        field_f = null;
    }

    final static void a(int param0, int param1, int param2, tf param3, int param4, int param5, int param6, int param7, byte param8) {
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var9_int = -param5 + (param3.field_D + param4) + param6;
            var10 = param2 + param6 + param4 + param3.field_D;
            var11 = (param3.field_E >> 1) + param3.field_y + param7;
            t.d(var9_int, 0, var10, param0 + var11);
            param3.b(param4 - 1, -1 + param7, param1);
            param3.b(param4 + -1, 1 + param7, param1);
            t.b(wi.field_f);
            t.d(1 + var9_int, 0, var10 + 1, var11 - -param0);
            param3.b(1 + param4, param7 - 1, param1);
            param3.b(1 + param4, param7 + 1, param1);
            t.b(wi.field_f);
            var10 = param3.field_D + (param3.field_F + param4 - param6 + -param5);
            var9_int = -param2 + (param4 + param3.field_D) - -param3.field_F + -param6;
            t.d(var9_int, -param0 + var11, var10, 480);
            param3.b(param4 - 1, param7 + -1, param1);
            param3.b(-1 + param4, 1 + param7, param1);
            t.b(wi.field_f);
            t.d(1 + var9_int, -param0 + var11, 1 + var10, 480);
            param3.b(1 + param4, -1 + param7, param1);
            param3.b(param4 - -1, 1 + param7, param1);
            t.b(wi.field_f);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var9;
            stackOut_2_1 = new StringBuilder().append("uf.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + -113 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[4];
        field_f = "Enter name of player to delete from list";
        field_d = 0;
        field_c = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
