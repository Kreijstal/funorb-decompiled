/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec extends ln {
    static String field_n;
    static wb field_l;
    static int[] field_i;
    static boolean field_g;
    static am field_k;
    static oi field_h;
    static vc field_m;
    static dl[] field_j;

    final static void a(boolean param0, String param1, java.applet.Applet param2, byte param3) {
        try {
          java.net.MalformedURLException var4 = null;
          RuntimeException var4_ref = null;
          java.applet.Applet var5 = null;
          RuntimeException stackIn_10_0 = null;
          StringBuilder stackIn_10_1 = null;
          String stackIn_11_2 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (un.field_u.startsWith("win") &&
              re.a(false, param1)) {
              return;
            }
            try {
              param2.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
              if (param3 == -17) {
                return;
              }
              var5 = (java.applet.Applet) null;
              ec.a(true, (String) null, (java.applet.Applet) null, (byte) 126);
              return;
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              wp.a((Throwable) null, "MGR1: " + param1, 21862);
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = var4_ref;
            stackIn_10_1 = new StringBuilder().append("ec.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
            if (param2 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            throw dn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 == 4) {
          field_k = null;
          field_l = null;
          field_m = null;
          field_j = null;
          field_i = null;
          field_h = null;
          field_n = null;
          return;
        }
    }

    ec(String param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
    }

    final int a(int param0, byte param1) {
        int var3 = 111 / ((55 - param1) / 50);
        if (this.field_c <= 1) {
          return 0;
        }
        if (!q.field_a[param0].field_h) {
          return 1;
        }
        return 0;
    }

    static {
        field_i = new int[4];
        field_n = "Spider";
        field_l = new wb();
        field_h = new oi();
    }
}
