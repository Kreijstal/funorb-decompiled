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
            Object var5 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (!un.field_u.startsWith("win")) {
                break L0;
              } else {
                if (!re.a(false, param1)) {
                  break L0;
                } else {
                  return;
                }
              }
            }
            try {
              L1: {
                param2.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
                if (param3 == -17) {
                  break L1;
                } else {
                  var5 = null;
                  ec.a(true, (String) null, (java.applet.Applet) null, (byte) 126);
                  return;
                }
              }
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                wp.a((Throwable) null, "MGR1: " + param1, 21862);
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 != 4) {
          return;
        } else {
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
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        var3 = 111 / ((55 - param1) / 50);
        if (((ec) this).field_c > 1) {
          if (q.field_a[param0].field_h) {
            return 0;
          } else {
            return 1;
          }
        } else {
          stackOut_1_0 = 0;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new int[4];
        field_n = "Spider";
        field_l = new wb();
        field_h = new oi();
    }
}
