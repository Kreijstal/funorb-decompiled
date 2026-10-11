/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb {
    static int field_a;
    static String field_c;
    static bi[][] field_d;
    static int[] field_b;

    final static boolean a(char param0, int param1) {
        int var2;
        var2 = 101 / ((param1 - 30) / 59);
        if (param0 < 32) {
          if (param0 >= 160 &&
            param0 <= 255) {
            return true;
          }
          if (param0 != 8364 &&
            param0 != 338 &&
            param0 != 8212 &&
            param0 != 339 &&
            376 != param0) {
            return false;
          }
          return true;
        }
        if (param0 <= 126) {
          return true;
        }
        if (param0 >= 160) {
          if (param0 <= 255) {
            return true;
          }
          if (param0 != 8364 &&
            param0 != 338 &&
            param0 != 8212 &&
            param0 != 339 &&
            376 != param0) {
            return false;
          }
          return true;
        }
        if (param0 == 8364) {
          return true;
        }
        if (param0 == 338) {
          return true;
        }
        if (param0 == 8212) {
          return true;
        }
        if (param0 != 339 &&
          376 != param0) {
          return false;
        }
        return true;
    }

    public static void a(byte param0) {
        field_d = (bi[][]) null;
        if (param0 > 99) {
          field_b = null;
          field_c = null;
          return;
        }
        nb.a('￿', 111);
        field_b = null;
        field_c = null;
    }

    final static void a(int param0) {
        String var1 = null;
        String var1Lifetime1;
        if (!el.field_b) {
          throw new IllegalStateException();
        }
        if (null == ji.field_G) {
          var1 = w.l(param0 ^ param0);
          no.field_e = new ri(var1, (String) null, true, false, false);
          le.field_e.a(true, ae.field_f);
          ae.field_f.b(no.field_e, param0 - 18);
          ae.field_f.n(param0 + 7363);
          return;
        }
        ji.field_G.i((byte) -104);
        var1Lifetime1 = w.l(param0 ^ param0);
        no.field_e = new ri(var1Lifetime1, (String) null, true, false, false);
        le.field_e.a(true, ae.field_f);
        ae.field_f.b(no.field_e, param0 - 18);
        ae.field_f.n(param0 + 7363);
    }

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 94) {
            nb.a((byte) -57);
          }
          stackIn_3_0 = ek.field_D.a(true, param0, "");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("nb.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_c = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_b = new int[8192];
    }
}
