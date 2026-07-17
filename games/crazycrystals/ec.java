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
            Object var5 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            try {
              L0: {
                L1: {
                  if (!un.field_u.startsWith("win")) {
                    break L1;
                  } else {
                    if (!re.a(false, param1)) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
                try {
                  L2: {
                    param2.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
                    if (param3 == -17) {
                      break L2;
                    } else {
                      var5 = null;
                      ec.a(true, (String) null, (java.applet.Applet) null, (byte) 126);
                      return;
                    }
                  }
                } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                  int discarded$2 = 21862;
                  wp.a((Throwable) null, "MGR1: " + param1);
                  return;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_8_0 = (RuntimeException) var4_ref;
                stackOut_8_1 = new StringBuilder().append("ec.B(").append(param0).append(44);
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                if (param1 == null) {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "null";
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  break L3;
                } else {
                  stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                  stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                  stackOut_9_2 = "{...}";
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_11_2 = stackOut_9_2;
                  break L3;
                }
              }
              L4: {
                stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param2 == null) {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L4;
                } else {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "{...}";
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L4;
                }
              }
              throw dn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 41);
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
