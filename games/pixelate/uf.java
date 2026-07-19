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
        if (param0 != 73) {
          field_b = (int[]) null;
          field_e = null;
          field_f = null;
          return;
        } else {
          field_e = null;
          field_f = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, tf param3, int param4, int param5, int param6, int param7, byte param8) {
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var9_int = -param5 + (param3.field_D + param4) + param6;
              var10 = param2 + param6 + param4 + param3.field_D;
              var11 = (param3.field_E >> 1059774497) + param3.field_y + param7;
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
              if (param8 <= -81) {
                break L1;
              } else {
                field_e = (int[]) null;
                break L1;
              }
            }
            t.d(1 + var9_int, -param0 + var11, 1 + var10, 480);
            param3.b(1 + param4, -1 + param7, param1);
            param3.b(param4 - -1, 1 + param7, param1);
            t.b(wi.field_f);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var9);
            stackOut_4_1 = new StringBuilder().append("uf.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_b = new int[4];
        field_f = "Enter name of player to delete from list";
        field_d = 0;
        field_c = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
