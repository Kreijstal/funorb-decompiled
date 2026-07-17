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
        khb stackIn_6_0 = null;
        khb stackIn_12_0 = null;
        khb stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        khb stackOut_5_0 = null;
        khb stackOut_14_0 = null;
        khb stackOut_11_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var2 = ro.a("jagex-last-login-method", param0 ^ 19227, param1);
              if (param0 == 19314) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            if (var2 == null) {
              stackOut_5_0 = dua.field_p;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            } else {
              var3 = pl.c((byte) 123);
              var4 = 0;
              L2: while (true) {
                if (var3.length <= var4) {
                  stackOut_14_0 = dua.field_p;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5.a(0, var2)) {
                    stackOut_11_0 = (khb) var5;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var2_ref;
            stackOut_16_1 = new StringBuilder().append("gib.D(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_15_0;
    }

    final static void a(int param0, int param1) {
        asa.field_c = 1000000000L / (long)param1;
        int var2 = 38 % ((param0 - -37) / 54);
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
