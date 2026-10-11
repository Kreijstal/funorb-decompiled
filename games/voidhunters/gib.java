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
        klb.field_r.g((byte) -17);
        if (null == vqa.field_i) {
          vqa.field_i = new goa(klb.field_r, hab.field_j);
        }
        klb.field_r.a(false, vqa.field_i);
        if (param0 < -32) {
          return;
        }
        field_c = (String) null;
    }

    final static khb a(int param0, java.applet.Applet param1) {
        int var4 = 0;
        String var2 = null;
        RuntimeException var2_ref = null;
        khb[] var3 = null;
        khb var5 = null;
        int var6 = 0;
        khb stackIn_6_0 = null;
        khb stackIn_12_0 = null;
        khb stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = VoidHunters.field_G;
        try {
          var2 = ro.a("jagex-last-login-method", param0 ^ 19227, param1);
          if (param0 != 19314) {
            field_b = (String[]) null;
          }
          if (var2 == null) {
            stackIn_6_0 = dua.field_p;
            return stackIn_6_0;
          }
          var3 = pl.c((byte) 123);
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5.a(0, var2)) {
              stackIn_12_0 = var5;
              return stackIn_12_0;
            }
          }
          stackIn_15_0 = dua.field_p;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_18_0 = var2_ref;
          stackIn_18_1 = new StringBuilder().append("gib.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        asa.field_c = 1000000000L / (long)param1;
        int var2 = 38 % ((param0 + 37) / 54);
    }

    static {
        field_b = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_c = "Who can join";
        field_a = 15;
    }
}
