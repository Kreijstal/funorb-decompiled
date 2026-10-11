/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh extends wf {
    byte[] field_k;
    int field_j;
    static int field_l;
    static tf field_g;
    static int field_h;
    static sd field_m;
    static boolean field_i;

    final static void d(int param0) {
        cf var1 = (cf) (mh.field_e.a((byte) -95));
        if (var1 == null) {
          pc.a(1);
          return;
        }
        hj var2 = nf.field_l;
        var2.c((byte) -126);
        if (param0 == 0) {
          var2.c((byte) -108);
          var2.c((byte) -105);
          var2.c((byte) -119);
          var1.c(param0 + 5);
          return;
        }
        gh.e(38);
        var2.c((byte) -108);
        var2.c((byte) -105);
        var2.c((byte) -119);
        var1.c(param0 + 5);
    }

    public static void e(int param0) {
        if (param0 < 10) {
          field_i = true;
          field_m = null;
          field_g = null;
          return;
        }
        field_m = null;
        field_g = null;
    }

    private gh() throws Throwable {
        throw new Error();
    }

    final static void a(java.applet.Applet param0, byte param1) {
        RuntimeException runtimeException = null;
        String var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = param0.getParameter("username");
          if (var2 != null) {
            var3 = (CharSequence) ((Object) var2);
            if (uk.b(114, var3) != 0L) {
              if (param1 != -112) {
                gh.e(-50);
              }
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("gh.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_l = -17;
        field_g = new tf(10, 2, 2, 0);
        field_i = false;
    }
}
