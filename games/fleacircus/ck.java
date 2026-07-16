/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck extends r {
    static String field_p;
    private tl field_n;
    static int field_o;
    private boolean field_r;
    private String field_s;
    static String field_q;

    final String a(byte param0, String param1) {
        if (((ck) this).field_n.a(160, param1) == ml.field_K) {
            return ((ck) this).field_n.a((byte) -27, param1);
        }
        int var3 = 21 % ((param0 - 24) / 46);
        if (((ck) this).a(160, param1) == ml.field_K) {
            return aj.field_r;
        }
        return ha.field_j;
    }

    public static void c(byte param0) {
        field_p = null;
        field_q = null;
        if (param0 != 2) {
            ck.c((byte) 106);
        }
    }

    ck(c param0, c param1) {
        super(param0);
        ((ck) this).field_r = false;
        ((ck) this).field_s = "";
        ((ck) this).field_n = new tl(param0, param1);
    }

    final wd a(int param0, String param1) {
        ve var3 = null;
        if (((ck) this).field_n.a((int) (char)param0, param1) == ml.field_K) {
            return ml.field_K;
        }
        if (!(param1.equals((Object) (Object) ((ck) this).field_s))) {
            var3 = aj.a(param1, -1);
            if (!var3.a(param0 + -282)) {
                return w.field_e;
            }
            ((ck) this).field_s = param1;
            ((ck) this).field_r = var3.b(param0 ^ 28033);
        }
        return !((ck) this).field_r ? ml.field_K : hm.field_b;
    }

    final static String a(int param0, String param1, java.applet.Applet param2) {
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
            var7 = fleas.field_A ? 1 : 0;
            try {
              L0: {
                L1: {
                  var3 = (String) eb.a("getcookies", param2, -250);
                  var4 = m.a(';', 121, var3);
                  if (param0 == -5174) {
                    break L1;
                  } else {
                    ck.c((byte) 90);
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
                      if (0 > var6) {
                        break L3;
                      } else {
                        if (var4[var5].substring(0, var6).trim().equals((Object) (Object) param1)) {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Email: ";
        field_p = "Accept";
    }
}
