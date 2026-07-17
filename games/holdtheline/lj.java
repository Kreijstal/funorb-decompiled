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
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              gf.a();
              if (param4 < 0) {
                break L1;
              } else {
                field_f = -105;
                break L1;
              }
            }
            gf.a(param3, 0, param3.length);
            gf.c();
            L2: while (true) {
              if (!gf.d()) {
                break L0;
              } else {
                tc.c(gf.field_g - -param2, gf.field_a - -param5, gf.field_b - gf.field_g, param0, param1);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var6;
            stackOut_7_1 = new StringBuilder().append("lj.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static void a(byte param0) {
        we var1 = null;
        L0: {
          var1 = (we) (Object) fl.field_i.a((byte) 74);
          if (var1 == null) {
            var1 = new we();
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 > -100) {
          field_f = 101;
          var1.a(tc.field_i, tc.field_d, tc.field_b, tc.field_e, -1, tc.field_c, tc.field_a, tc.field_j);
          ug.field_g.a((byte) -84, (hl) (Object) var1);
          return;
        } else {
          var1.a(tc.field_i, tc.field_d, tc.field_b, tc.field_e, -1, tc.field_c, tc.field_a, tc.field_j);
          ug.field_g.a((byte) -84, (hl) (Object) var1);
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        if (param0 != -29208) {
          field_e = null;
          field_c = null;
          field_e = null;
          return;
        } else {
          field_c = null;
          field_e = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_e = "Type your email address again to make sure it's correct";
        field_d = "Save Progress?";
        field_c = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
