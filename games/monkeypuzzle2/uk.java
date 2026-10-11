/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends wj {
    static le field_n;
    static String field_p;
    static int field_q;
    static int field_r;
    static String[] field_o;

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            field_q = -107;
          }
          if (this.a(param1, 3917) != ol.field_h) {
            return ue.field_E;
          }
          stackIn_5_0 = ba.field_d;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("uk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final na a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        na stackIn_2_0 = null;
        int stackIn_6_0 = 0;
        na stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 3917) {
            stackIn_2_0 = (na) null;
            return stackIn_2_0;
          }
          stackIn_6_0 = (sb.a(28079, param0) != null) ? 0 : 1;
          var3_int = stackIn_6_0;
          if (var3_int != 0) {
            return wj.field_i;
          }
          stackIn_9_0 = ol.field_h;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("uk.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean f(int param0) {
        if (param0 != 20) {
          field_p = (String) null;
        }
        return cf.field_b == ed.field_c ? true : false;
    }

    uk(rj param0) {
        super(param0);
    }

    public static void e(int param0) {
        field_o = null;
        int var1 = 93 % ((param0 + 19) / 59);
        field_n = null;
        field_p = null;
    }

    final static void a(int param0, byte param1, le param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param1 < 118) {
          return;
        }
        try {
          var3_int = param0 * 16 / 50;
          for (var4 = 0; var4 < 300; var4++) {
            if (!(var3_int <= sc.field_h[var4])) {
              var5 = var4 / 20;
              var6 = 32 * (var4 - var5 * 20);
              var5 = var5 * 32;
              ge.h(var6, var5, var6 + 32, 32 + var5);
              param2.a(0, 0);
            }
          }
          ge.b();
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "uk.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_o = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_r = -2147483648;
    }
}
