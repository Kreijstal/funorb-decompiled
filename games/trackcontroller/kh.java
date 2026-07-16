/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    private boolean field_c;
    static il[] field_e;
    static String field_a;
    private String field_d;
    static String field_b;

    final static qj a(boolean param0, int param1, int param2, kk param3) {
        Object var5 = null;
        if (!param0) {
          if (!sk.a(param2, param3, 1, param1)) {
            return null;
          } else {
            return ec.a(0);
          }
        } else {
          var5 = null;
          String discarded$4 = kh.a((String) null, 123, (java.applet.Applet) null);
          if (!sk.a(param2, param3, 1, param1)) {
            return null;
          } else {
            return ec.a(0);
          }
        }
    }

    final static String a(String param0, int param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_9_0 = null;
            Throwable decompiledCaughtException = null;
            String stackOut_8_0 = null;
            var7 = TrackController.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (param1 > 55) {
                    break L1;
                  } else {
                    field_a = null;
                    break L1;
                  }
                }
                var3 = (String) sj.a((byte) -92, "getcookies", param2);
                var4 = te.a(var3, ';', (byte) -98);
                var5 = 0;
                L2: while (true) {
                  if (var4.length <= var5) {
                    break L0;
                  } else {
                    L3: {
                      var6 = var4[var5].indexOf('=');
                      if (var6 < 0) {
                        break L3;
                      } else {
                        if (var4[var5].substring(0, var6).trim().equals((Object) (Object) param0)) {
                          stackOut_8_0 = var4[var5].substring(1 + var6).trim();
                          stackIn_9_0 = stackOut_8_0;
                          return stackIn_9_0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L4: {
                var3_ref = decompiledCaughtException;
                break L4;
              }
            }
            return null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    kh(String param0) {
        this(param0, false);
    }

    final static ck a(kk param0, String param1, kk param2, String param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        if (param4 != 1) {
          field_b = null;
          var5 = param2.a(true, param3);
          var6 = param2.a(param1, var5, -1);
          return pb.a(var5, var6, param2, param0, (byte) 126);
        } else {
          var5 = param2.a(true, param3);
          var6 = param2.a(param1, var5, -1);
          return pb.a(var5, var6, param2, param0, (byte) 126);
        }
    }

    final String b(int param0) {
        if (param0 >= -73) {
            return null;
        }
        return ((kh) this).field_d;
    }

    public static void c(int param0) {
        field_a = null;
        if (param0 != 61) {
            return;
        }
        field_b = null;
        field_e = null;
    }

    final boolean a(int param0) {
        if (param0 > -35) {
            Object var3 = null;
            String discarded$0 = kh.a((String) null, 73, (java.applet.Applet) null);
            return ((kh) this).field_c;
        }
        return ((kh) this).field_c;
    }

    kh(String param0, boolean param1) {
        ((kh) this).field_d = param0;
        if (((kh) this).field_d == null) {
            ((kh) this).field_d = "";
        }
        ((kh) this).field_c = param1 ? true : false;
        if (((kh) this).field_d.length() == 0) {
            ((kh) this).field_c = false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Passwords can only contain letters and numbers";
        field_b = "Play the game without logging in just yet";
    }
}
