/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends ela {
    static String field_o;
    static dk[] field_p;
    static String field_s;
    static int field_q;
    static byte[] field_t;
    static boolean field_r;

    jf(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static iu a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        iu var6 = new iu(param2, param2);
        iu var3 = var6;
        int var4Lifetime1;
        if (param1 > 36) {
          for (var4 = 0; var3.field_r.length > var4; var4++) {
            var6.field_r[var4] = param0;
          }
          return var3;
        }
        jf.a(44, 69, 69);
        for (var4Lifetime1 = 0; var3.field_r.length > var4Lifetime1; var4Lifetime1++) {
          var6.field_r[var4Lifetime1] = param0;
        }
        return var3;
    }

    public static void a(byte param0) {
        if (param0 != 2) {
          return;
        }
        field_t = null;
        field_p = null;
        field_o = null;
        field_s = null;
    }

    final bfa a(bfa[] param0, int param1) {
        RuntimeException var3 = null;
        bfa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            field_p = (dk[]) null;
          }
          stackIn_3_0 = new bfa(sra.a((String) (param0[0].field_d), 85));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jf.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_o = "You are invited to <%0>'s game.";
        field_s = "Accept draw";
        field_t = new byte[]{(byte)4, (byte)2};
    }
}
