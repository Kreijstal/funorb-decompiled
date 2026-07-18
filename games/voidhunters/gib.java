/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gib {
    static String[] field_b;
    static int field_a;
    static String field_c;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
    }

    gib(int param0) {
    }

    final static void a(byte param0) {
        L0: {
          klb.field_r.g((byte) -17);
          if (null == vqa.field_i) {
            vqa.field_i = new goa(klb.field_r, hab.field_j);
            break L0;
          } else {
            break L0;
          }
        }
        klb.field_r.a(false, (shb) (Object) vqa.field_i);
        if (param0 >= -32) {
          field_c = null;
          return;
        } else {
          return;
        }
    }

    final static khb a(int param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        khb[] var3 = null;
        int var4 = 0;
        khb var5 = null;
        int var6 = 0;
        khb stackIn_4_0 = null;
        khb stackIn_10_0 = null;
        khb stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        khb stackOut_3_0 = null;
        khb stackOut_12_0 = null;
        khb stackOut_9_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            var2 = ro.a("jagex-last-login-method", 105, param1);
            if (var2 == null) {
              stackOut_3_0 = dua.field_p;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var3 = pl.c((byte) 123);
              var4 = 0;
              L1: while (true) {
                if (var3.length <= var4) {
                  stackOut_12_0 = dua.field_p;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5.a(0, var2)) {
                    stackOut_9_0 = (khb) var5;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2_ref;
            stackOut_14_1 = new StringBuilder().append("gib.D(").append(19314).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    final static void a(int param0, int param1) {
        asa.field_c = 20000000L;
        int var2 = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_c = "Who can join";
        field_a = 15;
    }
}
