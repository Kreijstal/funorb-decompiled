/*
 * Decompiled by CFR-JS 0.4.0.
 */
class he extends qb {
    he field_i;
    static float field_g;
    long field_j;
    he field_h;

    final static String a(int param0, java.applet.Applet param1, String param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            Object stackIn_3_0 = null;
            String stackIn_9_0 = null;
            Throwable decompiledCaughtException = null;
            String stackOut_8_0 = null;
            Object stackOut_2_0 = null;
            var7 = Main.field_T;
            try {
              L0: {
                var3 = (String) vh.a("getcookies", param0 + 12798, param1);
                if (param0 == -24949) {
                  var4 = rh.a(';', var3, -85);
                  var5 = 0;
                  L1: while (true) {
                    if (var5 >= var4.length) {
                      break L0;
                    } else {
                      L2: {
                        var6 = var4[var5].indexOf('=');
                        if (var6 < 0) {
                          break L2;
                        } else {
                          if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) param2)) {
                            break L2;
                          } else {
                            stackOut_8_0 = var4[var5].substring(var6 - -1).trim();
                            stackIn_9_0 = stackOut_8_0;
                            return stackIn_9_0;
                          }
                        }
                      }
                      var5++;
                      continue L1;
                    }
                  }
                } else {
                  stackOut_2_0 = null;
                  stackIn_3_0 = stackOut_2_0;
                  return (String) (Object) stackIn_3_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var3_ref = decompiledCaughtException;
                break L3;
              }
            }
            return null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected he() {
    }

    final static void a(int param0, String param1) {
        pk.field_a = param1;
        gh.a(12, 31888);
        if (param0 != 0) {
            field_g = -1.2815539836883545f;
        }
    }

    final static Boolean a(int param0) {
        if (param0 != 59) {
            return null;
        }
        Boolean var1 = ni.field_f;
        ni.field_f = null;
        return var1;
    }

    final void d(int param0) {
        if (null == ((he) this).field_i) {
            return;
        }
        ((he) this).field_i.field_h = ((he) this).field_h;
        ((he) this).field_h.field_i = ((he) this).field_i;
        ((he) this).field_h = null;
        if (param0 != 12) {
            ((he) this).field_i = null;
        }
        ((he) this).field_i = null;
    }

    static {
    }
}
