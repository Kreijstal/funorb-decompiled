/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb extends pu {
    static ee[] field_l;
    static sna field_n;
    static String[] field_m;

    public static void b(int param0) {
        field_l = null;
        if (param0 != 2630) {
          field_n = (sna) null;
        }
        field_n = null;
        field_m = null;
    }

    final static void a(int param0, int param1, kv param2, int param3, int param4, int param5, int param6, int param7) {
        int var16 = 0;
        int var17 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var18 = 0;
        int var19 = 0;
        kv var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var29 = null;
        int[] var30 = null;
        var19 = BachelorFridge.field_y;
        try {
          if (param0 < dg.field_f) {
            param5 = param5 - (-param0 + dg.field_f);
            param0 = dg.field_f;
          }
          if (dg.field_h < param5 + param0) {
            param5 = dg.field_h - param0;
          }
          if (param4 < dg.field_j) {
            param3 = param3 - (dg.field_j - param4);
            param4 = dg.field_j;
          }
          if (dg.field_k < param3 + param4) {
            param3 = -param4 + dg.field_k;
          }
          if (param5 > 0 &&
            param3 > 0) {
            var21 = param2.a();
            var30 = dg.field_e;
            var10 = dg.field_i;
            var11 = dg.field_c;
            var29 = new int[4];
            dg.a(var29);
            param2.b();
            if (param7 <= 71) {
              return;
            }
            dg.c(var29[0], var29[1], var29[2], var29[3]);
            var13 = param0 + param2.field_q * param4;
            var14 = param2.field_q - param5;
            var25 = var21.field_v;
            var22 = var25;
            var15 = var22;
            for (var16 = param4; var16 < param4 + param3; var16++) {
              for (var17 = param0; var17 < param0 + param5; var17++) {
                var18 = var25[var13];
                if (0 != var18 && (var17 > 0 &&
                  var15[-1 + var13] == 0 ||
                  var16 > 0 &&
                  var15[-param2.field_q + var13] == 0 ||
                  var17 < param2.field_q - 1 &&
                  var15[1 + var13] == 0 ||
                  !(var16 >= -1 + param2.field_p) &&
                  var15[param2.field_q + var13] == 0)) {
                  dg.b(var17, var16, param1, param6);
                }
                var13++;
              }
              var13 = var13 + var14;
            }
            var21.e(-param2.field_t, -param2.field_u);
            dg.a(var30, var10, var11);
            dg.b(var29);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_43_0 = var8;
          stackIn_43_1 = new StringBuilder().append("sb.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    static {
        field_m = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
