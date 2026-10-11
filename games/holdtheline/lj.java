/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj {
    static ij[] field_a;
    static int field_b;
    static int field_f;
    static String field_e;
    static String field_d;
    static String[] field_c;

    final static void a(int param0, int param1, int param2, int[] param3, byte param4, int param5) {
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = HoldTheLine.field_D;
        try {
          gf.a();
          if (param4 >= 0) {
            field_f = -105;
          }
          gf.a(param3, 0, param3.length);
          gf.c();
          while (gf.d()) {
            tc.c(gf.field_g + param2, gf.field_a + param5, gf.field_b - gf.field_g, param0, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("lj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(byte param0) {
        we var1 = (we) (fl.field_i.a((byte) 74));
        if (var1 == null) {
          var1 = new we();
        }
        if (param0 <= -100) {
          var1.a(tc.field_i, tc.field_d, tc.field_b, tc.field_e, -1, tc.field_c, tc.field_a, tc.field_j);
          ug.field_g.a((byte) -84, var1);
          return;
        }
        field_f = 101;
        var1.a(tc.field_i, tc.field_d, tc.field_b, tc.field_e, -1, tc.field_c, tc.field_a, tc.field_j);
        ug.field_g.a((byte) -84, var1);
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        if (param0 == -29208) {
          field_c = null;
          field_e = null;
          return;
        }
        field_e = (String) null;
        field_c = null;
        field_e = null;
    }

    static {
        field_b = 0;
        field_e = "Type your email address again to make sure it's correct";
        field_d = "Save Progress?";
        field_c = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
