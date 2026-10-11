/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class in {
    static int[] field_b;
    static String[] field_a;

    final static void a(int param0, boolean param1, String param2, int param3, int param4, int param5, int param6, vh param7, boolean param8, int param9, int param10, long param11, int param12, int param13) {
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
            kj.field_d = new df(param5);
            wa.field_d = new df(param12);
            tp.field_i = param3;
            sf.field_a = param13;
            if (param10 != 0) {
              in.a(116, false, (String) null, -116, -96, -98, 5, (vh) null, false, -9, 28, 96L, 103, -78);
            }
            ao.field_d = param0;
            vg.field_j = param4;
            ea.field_t = param9;
            rj.field_w = param6;
            ql.field_t = param8;
            ao.field_b = param1;
            u.field_t = param7;
            ih.field_b = param2;
            ul.field_f = param11;
            if (null == u.field_t.field_c) {
              return;
            }
            try {
              jl.field_W = new o(u.field_t.field_c, 64, 0);
              return;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var15 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var15.toString());
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = var15_ref;
            stackIn_15_1 = new StringBuilder().append("in.B(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            if (param7 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw rb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(')').toString());
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
