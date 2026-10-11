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
        if (param0 == 73) {
          field_e = null;
          field_f = null;
          return;
        }
        field_b = (int[]) null;
        field_e = null;
        field_f = null;
    }

    final static void a(int param0, int param1, int param2, tf param3, int param4, int param5, int param6, int param7, byte param8) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var9_intLifetime1;
        int var10Lifetime1;
        try {
          var9_int = -param5 + (param3.field_D + param4) + param6;
          var10 = param2 + param6 + param4 + param3.field_D;
          var11 = (param3.field_E >> 1) + param3.field_y + param7;
          t.d(var9_int, 0, var10, param0 + var11);
          param3.b(param4 - 1, -1 + param7, param1);
          param3.b(param4 - 1, 1 + param7, param1);
          t.b(wi.field_f);
          t.d(1 + var9_int, 0, var10 + 1, var11 + param0);
          param3.b(1 + param4, param7 - 1, param1);
          param3.b(1 + param4, param7 + 1, param1);
          t.b(wi.field_f);
          var10Lifetime1 = param3.field_D + (param3.field_F + param4 - param6 - param5);
          var9_intLifetime1 = -param2 + (param4 + param3.field_D) + param3.field_F - param6;
          t.d(var9_intLifetime1, -param0 + var11, var10Lifetime1, 480);
          param3.b(param4 - 1, param7 - 1, param1);
          param3.b(-1 + param4, 1 + param7, param1);
          t.b(wi.field_f);
          if (param8 > -81) {
            field_e = (int[]) null;
          }
          t.d(1 + var9_intLifetime1, -param0 + var11, 1 + var10Lifetime1, 480);
          param3.b(1 + param4, -1 + param7, param1);
          param3.b(param4 + 1, 1 + param7, param1);
          t.b(wi.field_f);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "uf.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_b = new int[4];
        field_f = "Enter name of player to delete from list";
        field_d = 0;
        field_c = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
