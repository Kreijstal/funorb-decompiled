/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc {
    static String field_b;
    static String field_a;
    static int field_c;

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              L2: {
                if (0 >= param1) {
                  break L2;
                } else {
                  if (128 > param1) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param1 < 160) {
                  break L3;
                } else {
                  if (255 >= param1) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param0 == -112) {
                  break L4;
                } else {
                  field_b = (String) null;
                  break L4;
                }
              }
              if (param1 != 0) {
                var6 = lf.field_e;
                var2 = var6;
                var3 = 0;
                L5: while (true) {
                  if (var6.length <= var3) {
                    stackIn_21_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var4 = var6[var3];
                    if (var4 == param1) {
                      stackIn_18_0 = 1;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var3++;
                      continue L5;
                    }
                  }
                }
              } else {
                return false;
              }
            }
            stackIn_8_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "tc.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0 != 0;
          } else {
            return stackIn_21_0 != 0;
          }
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        if (!param0) {
            tc.a(false);
        }
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            StringBuilder stackIn_14_1 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var3 = null;
            RuntimeException var3_ref = null;
            String var4 = null;
            String var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            try {
              L0: {
                sd.field_z = param1;
                try {
                  L1: {
                    L2: {
                      var7 = param2.getParameter("cookieprefix");
                      var5 = var7;
                      var5 = var7;
                      var4 = param2.getParameter("cookiehost");
                      var5 = var4;
                      var5 = var4;
                      var8 = var7 + "settings=" + param1 + "; version=1; path=/; domain=" + var4;
                      var5 = var8;
                      var5 = var8;
                      if (param1.length() == 0) {
                        var5 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                        break L2;
                      } else {
                        var5 = var8 + "; Expires=" + md.a((byte) -58, oa.a(-12520) - -94608000000L) + "; Max-Age=" + 94608000L;
                        break L2;
                      }
                    }
                    var6 = -93 % ((-64 - param0) / 61);
                    wk.a(param2, "document.cookie=\"" + var5 + "\"", (byte) -92);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3 = decompiledCaughtException;
                    break L3;
                  }
                }
                oj.a(param2, 20000000);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var3_ref);

                stackIn_11_1 = new StringBuilder().append("tc.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L4;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

                if (param2 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L5;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L5;
                }
              }
              throw t.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = null;
        field_b = "Quit";
    }
}
