/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jd {
    static boolean field_a;
    static String field_b;
    static String field_c;

    abstract void a(int param0, byte[] param1);

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            if (param1 > -113) {
                return;
            }
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                param0.getAppletContext().showDocument(ai.a(var2, (byte) -114, param0), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract byte[] a(int param0);

    final static void a(byte param0, boolean param1, boolean param2) {
        Object var4 = null;
        if (param0 >= -11) {
          field_a = false;
          var4 = null;
          hn.a(param1, (String) null, 65, param2);
          return;
        } else {
          var4 = null;
          hn.a(param1, (String) null, 65, param2);
          return;
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_c = null;
        int var1 = -52 / ((-36 - param0) / 47);
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        int stackIn_14_0 = 0;
        int stackOut_12_0 = 0;
        var3 = dj.a(param1 + 6381, param2);
        if (param1 == -6270) {
          if (0 == (param0.indexOf(param2) ^ -1)) {
            if (param0.indexOf(var3) == -1) {
              if (!param0.startsWith(param2)) {
                if (!param0.startsWith(var3)) {
                  if (!param0.endsWith(param2)) {
                    if (param0.endsWith(var3)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_12_0 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    return stackIn_14_0 != 0;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You need to play <%0> more rated games to unlock this option.";
        field_c = "Reject <%0> from this game";
    }
}
