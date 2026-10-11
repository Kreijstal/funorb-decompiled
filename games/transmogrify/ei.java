/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei {
    static String[] field_a;

    public static void a(byte param0) {
        field_a = null;
        if (param0 >= -50) {
          am var2 = (am) null;
          ei.a(true, -72, (am) null);
        }
    }

    final static void a(boolean param0, int param1, am param2) {
        int var5 = 0;
        hj stackIn_3_0 = null;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var6 = 0;
        hj var7 = null;
        hj var8 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          var7 = ff.field_D;
          var8 = var7;
          stackIn_3_0 = var8;
          stackIn_4_1 = !(param0);
          ((hj) (Object) stackIn_3_0).a(stackIn_4_1, param1);
          var8.field_h = var8.field_h + 1;
          var4 = var8.field_h;
          var8.f(6389, 1);
          var8.c(param2.field_p, -159688920);
          var8.c(param2.field_j, -159688920);
          var8.c(param2.field_i, -159688920);
          var8.a(-117, param2.field_g);
          if (!param0) {
            field_a = (String[]) null;
          }
          var8.a(-124, param2.field_k);
          var8.a(-119, param2.field_h);
          var8.a(-119, param2.field_l);
          var8.f(6389, param2.field_m.length);
          for (var5 = 0; var5 < param2.field_m.length; var5++) {
            var7.a(-117, param2.field_m[var5]);
          }
          var8.d(var4, -1323322296);
          var8.a((byte) -42, var8.field_h - var4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ei.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_a = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
