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
        if (param0 != 15) {
            gib.a(100, 43);
        }
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
        klb.field_r.a(false, vqa.field_i);
        if (param0 >= -32) {
          field_c = (String) null;
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
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var2 = ro.a("jagex-last-login-method", param0 ^ 19227, param1);
              if (param0 == 19314) {
                break L1;
              } else {
                field_b = (String[]) null;
                break L1;
              }
            }
            if (var2 == null) {
              stackIn_6_0 = dua.field_p;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3 = pl.c((byte) 123);
              var4 = 0;
              L2: while (true) {
                if (var3.length <= var4) {
                  stackIn_15_0 = dua.field_p;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5.a(0, var2)) {
                    stackIn_12_0 = (khb) (var5);
                    decompiledRegionSelector0 = 1;
                    break L0;
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
            stackIn_18_0 = (RuntimeException) (var2_ref);

            stackIn_18_1 = new StringBuilder().append("gib.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    final static void a(int param0, int param1) {
        asa.field_c = 1000000000L / (long)param1;
        int var2 = 38 % ((param0 - -37) / 54);
    }

    static {
        field_b = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_c = "Who can join";
        field_a = 15;
    }
}
