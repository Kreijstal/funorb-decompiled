/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc extends kd {
    static long field_i;
    static String field_m;
    static int field_k;
    int[] field_h;
    static int field_l;
    int field_j;

    final static void a(boolean param0, int param1) {
        qa.field_c.a((byte) 121, param0);
        if (param1 != 0) {
          field_m = (String) null;
        }
    }

    final static mb b(boolean param0, int param1) {
        mb var2 = null;
        if (param1 > 82) {
          var2 = new mb(true);
          var2.field_b = param0 ? true : false;
          return var2;
        }
        return (mb) null;
    }

    public static void a(int param0) {
        field_m = null;
        if (param0 != 29407) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          mc.a(-53, (java.applet.Applet) null);
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = param1.getParameter("username");
          if (param0 >= -115) {
            mc.a(false, 109);
          }
          if (var2 != null) {
            var3 = (CharSequence) ((Object) var2);
            if (fd.a((byte) -58, var3) != 0L) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("mc.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private mc() throws Throwable {
        throw new Error();
    }

    static {
        field_m = "You have <%0> unread messages!";
        field_l = 0;
    }
}
