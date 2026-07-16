/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln extends fa {
    static boolean field_q;
    static int field_n;
    static String field_l;
    static String[][] field_m;
    static int field_p;
    static String field_k;
    pp field_o;

    final static String a(java.applet.Applet param0, byte param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_9_0 = null;
            Throwable decompiledCaughtException = null;
            String stackOut_8_0 = null;
            var8 = Pixelate.field_H ? 1 : 0;
            try {
              L0: {
                L1: {
                  var9 = param0.getParameter("cookieprefix");
                  var3 = var9 + "settings";
                  if (param1 == -85) {
                    break L1;
                  } else {
                    ln.a(122);
                    break L1;
                  }
                }
                var4 = (String) cq.a("getcookies", (byte) -43, param0);
                var5 = dd.a(var4, (byte) -37, ';');
                var6 = 0;
                L2: while (true) {
                  if (var6 >= var5.length) {
                    break L0;
                  } else {
                    L3: {
                      var7 = var5[var6].indexOf('=');
                      if (-1 < (var7 ^ -1)) {
                        break L3;
                      } else {
                        if (var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                          stackOut_8_0 = var5[var6].substring(var7 - -1).trim();
                          stackIn_9_0 = stackOut_8_0;
                          return stackIn_9_0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var6++;
                    continue L2;
                  }
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L4: {
                var2 = decompiledCaughtException;
                break L4;
              }
            }
            if (jp.field_c != null) {
              return jp.field_c;
            } else {
              return param0.getParameter("settings");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_m = null;
        if (param0 != -113) {
            field_m = null;
        }
        field_l = null;
        field_k = null;
    }

    ln(int param0) {
        ((ln) this).field_o = pp.a(pg.field_f[param0], 100, ci.field_m[param0]);
        cm discarded$0 = mn.a(-21317, ((ln) this).field_o);
    }

    final static void a(int param0) {
        if (param0 <= 11) {
            return;
        }
        if (!(null != ib.field_f)) {
            return;
        }
        pf.a((java.awt.Canvas) (Object) ib.field_f, 0);
        ib.field_f.a(6511, mc.field_k);
        ib.field_f = null;
        if (!(vh.field_c == null)) {
            vh.field_c.b(-101);
        }
        ec.field_u.requestFocus();
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        L0: {
          var9 = Pixelate.field_H ? 1 : 0;
          if (param6 == 100) {
            break L0;
          } else {
            field_k = null;
            break L0;
          }
        }
        L1: {
          if (param1 <= param3) {
            if (param3 >= param4) {
              if (param1 >= param4) {
                cn.a(param2, param1, param3, param5, param7, t.field_k, false, param0, param4);
                break L1;
              } else {
                cn.a(param0, param4, param3, param5, param7, t.field_k, false, param2, param1);
                break L1;
              }
            } else {
              cn.a(param7, param3, param4, param5, param0, t.field_k, false, param2, param1);
              break L1;
            }
          } else {
            if (param4 <= param1) {
              if (param4 <= param3) {
                cn.a(param7, param3, param1, param5, param2, t.field_k, false, param0, param4);
                break L1;
              } else {
                cn.a(param0, param4, param1, param5, param2, t.field_k, false, param7, param3);
                break L1;
              }
            } else {
              cn.a(param2, param1, param4, param5, param0, t.field_k, false, param7, param3);
              break L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = true;
        field_l = "No options available";
        field_k = "Members";
        field_p = 0;
    }
}
