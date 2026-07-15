/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    static ud field_c;
    static String field_a;
    static boolean field_d;
    static String field_b;
    static String field_e;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 1) {
          ke discarded$2 = wd.a(-30, false, false);
          field_a = null;
          field_e = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_e = null;
          field_b = null;
          return;
        }
    }

    final static String a(java.applet.Applet param0, byte param1, String param2) {
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
            var7 = client.field_A ? 1 : 0;
            try {
              L0: {
                L1: {
                  var3 = (String) nc.a(true, "getcookies", param0);
                  var4 = ji.a(';', (byte) 66, var3);
                  if (param1 == -1) {
                    break L1;
                  } else {
                    field_e = null;
                    break L1;
                  }
                }
                var5 = 0;
                L2: while (true) {
                  if (var4.length <= var5) {
                    break L0;
                  } else {
                    L3: {
                      var6 = var4[var5].indexOf('=');
                      if (0 > var6) {
                        break L3;
                      } else {
                        if (var4[var5].substring(0, var6).trim().equals((Object) (Object) param2)) {
                          stackOut_8_0 = var4[var5].substring(var6 + 1).trim();
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

    final static ke a(int param0, boolean param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        ke var6 = new ke(2);
        ke var7 = var6;
        if (!param2) {
            var7.a(new ec(17), param0 + 10);
            var4 = a.field_t.a(ji.field_c);
            var5 = a.field_t.a(ik.field_g);
            if (var5 > var4) {
                var4 = var5;
            }
            var5 = a.field_t.a(k.field_h);
            if (!(var4 >= var5)) {
                var4 = var5;
            }
            var5 = a.field_t.a(wj.field_Kb);
            if (!(var5 <= var4)) {
                var4 = var5;
            }
            var5 = a.field_t.a(sc.field_h);
            if (var5 > var4) {
                var4 = var5;
            }
            var5 = a.field_t.a(rc.field_g);
            if (!(var4 >= var5)) {
                var4 = var5;
            }
            var5 = a.field_t.a(ig.field_Xb);
            if (var4 < var5) {
                var4 = var5;
            }
            var5 = a.field_t.a(di.field_E);
            if (!(var5 <= var4)) {
                var4 = var5;
            }
            var7.field_f[-1 + var6.field_b.field_l].field_n = 46 + var4;
        }
        var7.a(new ec(18, om.field_b, (mm) (Object) a.field_t), 104);
        var7.a(-1, param1, -129);
        var7.a(param0, 320, false, -117, 28);
        return var7;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You appear to be telling someone your password - please don't!";
        field_d = false;
        field_b = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_e = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
