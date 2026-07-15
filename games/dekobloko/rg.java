/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg {
    static String field_b;
    static String field_e;
    static String field_d;
    static String field_f;
    static qm field_g;
    static boolean field_c;
    static sk field_a;

    final static boolean a(java.applet.Applet param0, byte param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_10_0 = 0;
            int stackIn_17_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_9_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_15_0 = 0;
            var7 = client.field_A ? 1 : 0;
            if (vf.field_a) {
              return true;
            } else {
              try {
                L0: {
                  L1: {
                    var2 = "tuhstatbut";
                    var3 = (String) nc.a(true, "getcookies", param0);
                    var4 = ji.a(';', (byte) 66, var3);
                    if (param1 < -55) {
                      break L1;
                    } else {
                      rg.a(-124);
                      break L1;
                    }
                  }
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var4.length) {
                      break L0;
                    } else {
                      L3: {
                        var6 = var4[var5].indexOf('=');
                        if (var6 < 0) {
                          break L3;
                        } else {
                          if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                            break L3;
                          } else {
                            stackOut_9_0 = 1;
                            stackIn_10_0 = stackOut_9_0;
                            return stackIn_10_0 != 0;
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
                  var2_ref = decompiledCaughtException;
                  break L4;
                }
              }
              L5: {
                if (null == param0.getParameter("tuhstatbut")) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L5;
                } else {
                  stackOut_15_0 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  break L5;
                }
              }
              return stackIn_17_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_e = null;
        field_g = null;
        field_a = null;
        int var1 = 36 / ((-41 - param0) / 35);
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Offline";
        field_e = "Player names can be up to 12 letters, numbers and underscores";
        field_f = "Can you unlock the Master Challenge by reaching Stage<nbsp>4 of Stamina Mode?";
        field_d = "Please try again in a few minutes.";
        field_g = new qm(10, 2, 2, 0);
        field_c = true;
    }
}
