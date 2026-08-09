/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa {
    static int field_e;
    static String field_a;
    static String field_d;
    static String field_b;
    static String field_g;
    static um field_c;
    static id field_f;

    final static void a(byte param0, String param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            StringBuilder stackIn_15_1 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            try {
              L0: {
                qn.field_R = param1;
                try {
                  L1: {
                    var3 = param2.getParameter("cookieprefix");
                    var5 = var3;
                    var5 = var3;
                    var4 = param2.getParameter("cookiehost");
                    var5 = var4;
                    var5 = var4;
                    var5 = var3 + "session=" + param1 + "; version=1; path=/; domain=" + var4;
                    if (param0 > 10) {
                      L2: {
                        if (param1.length() != 0) {
                          break L2;
                        } else {
                          var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                          break L2;
                        }
                      }
                      u.a((byte) -81, "document.cookie=\"" + var5 + "\"", param2);
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L3;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  od.a(false, param2);
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_12_0 = (RuntimeException) (var3_ref2);

                stackIn_12_1 = new StringBuilder().append("qa.A(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "null";
                  break L4;
                } else {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

                if (param2 == null) {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L5;
                } else {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L5;
                }
              }
              throw fk.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_d = null;
        field_f = null;
        field_c = null;
        if (param0 != -1) {
          field_a = (String) null;
          field_b = null;
          field_a = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          return;
        }
    }

    static {
        field_a = "Enter multiplayer lobby";
        field_g = "Withdraw request to join <%0>'s game";
        field_b = "Music: ";
        field_d = "Accept rematch";
    }
}
