/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on {
    static String field_a;
    static String field_c;
    static int field_b;

    final static void a(int param0) {
        dl var1 = null;
        dl var2 = null;
        int var3 = 0;
        int var4 = CrazyCrystals.field_B;
        try {
            var1 = new dl(540, 140);
            em.a((byte) 38, var1);
            nb.b();
            kh.a();
            sn.field_c = 0;
            ja.d((byte) -67);
            var2 = var1.d();
            var3 = 0;
            if (param0 > -66) {
                on.a((byte) -56);
            }
            while ((var3 ^ -1) > -16) {
                var2.g(-2, -2, 16777215);
                kh.c(4, 4, 0, 0, 540, 140);
                var3++;
            }
            eq.field_k.a();
            var1.b(0, 0);
            lg.a(1);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "on.A(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 >= -84) {
            on.a((byte) -80);
        }
        field_c = null;
        field_a = null;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            int var2_int = 0;
            java.net.URL var3 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2 = null;
            RuntimeException var2_ref = null;
            try {
              L0: {
                try {
                  L1: {
                    var2_int = 10 % ((-8 - param0) / 55);
                    var3 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
                    param1.getAppletContext().showDocument(gh.a(param1, var3, (byte) 67), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2 = (Exception) (Object) decompiledCaughtException;
                    var2.printStackTrace();
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_6_0 = (RuntimeException) (var2_ref);

                stackIn_6_1 = new StringBuilder().append("on.B(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "null";
                  break L3;
                } else {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "{...}";
                  break L3;
                }
              }
              throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = "Names cannot start or end with space or underscore";
        field_b = 4;
        field_c = "Unfortunately you are not eligible to create an account.";
    }
}
