/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc extends q {
    static int field_l;
    static k field_k;
    nj field_j;
    static double field_m;

    final static void c(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Torquing.field_u;
        var1 = u.field_v[0];
        var2 = 1;
        if (param0 != 1559487076) {
          field_l = -52;
          L0: while (true) {
            if (var2 < u.field_v.length) {
              var3 = u.field_v[var2];
              dk.a(mn.field_bb, var2 << 1559487076, mn.field_bb, var1, var3);
              var1 = var1 + var3;
              var2++;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            if (var2 < u.field_v.length) {
              var3 = u.field_v[var2];
              dk.a(mn.field_bb, var2 << 1559487076, mn.field_bb, var1, var3);
              var1 = var1 + var3;
              var2++;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        field_k = null;
        if (param0 == 5) {
            return;
        }
        mc.a(-58);
    }

    final static void a(byte param0, int param1, bm param2) {
        df var3 = null;
        if (param0 != 85) {
            mc.a(95);
            var3 = wa.field_d;
            var3.f(-71, param1);
            var3.b(90, 5);
            var3.b(90, 0);
            var3.a(param2.field_s, 93);
            var3.b(90, param2.field_q);
            var3.b(90, param2.field_o);
            return;
        }
        var3 = wa.field_d;
        var3.f(-71, param1);
        var3.b(90, 5);
        var3.b(90, 0);
        var3.a(param2.field_s, 93);
        var3.b(90, param2.field_q);
        var3.b(90, param2.field_o);
    }

    final static boolean b(int param0) {
        if (param0 <= 115) {
            field_k = null;
            return mc.a(2126, ip.a(9));
        }
        return mc.a(2126, ip.a(9));
    }

    private final static boolean a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_5_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_18_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_17_0 = 0;
            int stackOut_16_0 = 0;
            var7 = Torquing.field_u;
            if (sb.field_p) {
              return true;
            } else {
              try {
                L0: {
                  var2 = "tuhstatbut";
                  if (param0 == 2126) {
                    var3 = (String) hp.a(param1, (byte) -85, "getcookies");
                    var4 = kc.a(';', var3, 0);
                    var5 = 0;
                    L1: while (true) {
                      if (var4.length <= var5) {
                        break L0;
                      } else {
                        L2: {
                          var6 = var4[var5].indexOf('=');
                          if (-1 < (var6 ^ -1)) {
                            break L2;
                          } else {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                              break L2;
                            } else {
                              stackOut_10_0 = 1;
                              stackIn_11_0 = stackOut_10_0;
                              return stackIn_11_0 != 0;
                            }
                          }
                        }
                        var5++;
                        continue L1;
                      }
                    }
                  } else {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    return stackIn_5_0 != 0;
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var2_ref = decompiledCaughtException;
                  break L3;
                }
              }
              L4: {
                if (null == param1.getParameter("tuhstatbut")) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L4;
                } else {
                  stackOut_16_0 = 1;
                  stackIn_18_0 = stackOut_16_0;
                  break L4;
                }
              }
              return stackIn_18_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    mc(nj param0) {
        ((mc) this).field_j = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new k(7, 0, 1, 1);
    }
}
