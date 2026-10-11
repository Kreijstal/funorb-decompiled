/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    static byte[][] field_a;

    final static void a(int param0, int param1, int param2) {
        faa var3 = dpa.field_p;
        var3.h(24335, param2);
        var3.c(0, 3);
        var3.c(0, 9);
        var3.a(param0, true);
        if (param1 == -1) {
          return;
        }
        String var4 = (String) null;
        sh.a((String) null, (String) null, (String) null, -75);
    }

    final static String a(String param0, String param1, String param2, int param3) {
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        int var4Lifetime1;
        if (param3 != 0) {
          sh.a((byte) -13);
        } else {
          var4 = param2.indexOf(param1);
          while (-1 != var4) {
            param2 = param2.substring(0, var4) + param0 + param2.substring(param1.length() + var4);
            var4 = param2.indexOf(param1, var4 + param0.length());
          }
          return param2;
        }
        var4Lifetime1 = param2.indexOf(param1);
        while (-1 != var4Lifetime1) {
          param2 = param2.substring(0, var4Lifetime1) + param0 + param2.substring(param1.length() + var4Lifetime1);
          var4Lifetime1 = param2.indexOf(param1, var4Lifetime1 + param0.length());
        }
        return param2;
    }

    final static void a(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        pd var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        var2 = VoidHunters.field_G;
        try {
          if (param0 != 20824) {
            field_a = (byte[][]) null;
          }
          if (null == rb.field_c) {
            return;
          }
          var1 = (pd) (rb.field_c.d(0));
          while (var1 != null) {
            fieldTemp$0 = var1.field_d;
            var1.field_d = var1.field_d - 1;
            if (fieldTemp$0 == 0) {
              var1.b(param0 ^ -24158);
            }
            var1 = (pd) (rb.field_c.a((byte) 12));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1_ref), "sh.D(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 < 43) {
          return;
        }
        field_a = (byte[][]) null;
    }

    static {
    }
}
