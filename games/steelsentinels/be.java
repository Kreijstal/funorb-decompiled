/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be {
    static gh field_c;
    static int field_b;
    static String field_g;
    static int field_a;
    static wk[] field_f;
    static int field_e;
    static long field_d;

    final static void a(int param0) {
        int var2 = 0;
        c var3_ref_c = null;
        int var3 = 0;
        rh var4 = null;
        int var4_int = 0;
        Object var5 = null;
        byte[] var5_array = null;
        int var6 = 0;
        byte[] var8 = null;
        kj var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        var6 = SteelSentinels.field_G;
        var9 = rf.field_d;
        var2 = var9.f((byte) -70);
        if (param0 == -16786) {
          if (-1 != (var2 ^ -1)) {
            if ((var2 ^ -1) == -2) {
              var3 = var9.i(0);
              var4 = (rh) (Object) ol.field_Vb.e(13058);
              L0: while (true) {
                if (var4 == null) {
                  if (var4 == null) {
                    pm.m(param0 + 16882);
                    return;
                  } else {
                    var4.b(param0 ^ -16790);
                    return;
                  }
                } else {
                  if (var4.field_x != var3) {
                    var4 = (rh) (Object) ol.field_Vb.a((byte) -59);
                    continue L0;
                  } else {
                    if (var4 == null) {
                      pm.m(param0 + 16882);
                      return;
                    } else {
                      var4.b(param0 ^ -16790);
                      return;
                    }
                  }
                }
              }
            } else {
              sj.a("A1: " + ci.a((byte) 94), -126, (Throwable) null);
              pm.m(param0 ^ -16880);
              return;
            }
          } else {
            var3_ref_c = (c) (Object) fg.field_Ub.e(13058);
            if (var3_ref_c != null) {
              L1: {
                var4_int = var9.f((byte) -106);
                if (var4_int == 0) {
                  var5_array = null;
                  break L1;
                } else {
                  var13 = new byte[var4_int];
                  var12 = var13;
                  var11 = var12;
                  var10 = var11;
                  var8 = var10;
                  var5_array = var8;
                  var9.a(0, var13, 28, var4_int);
                  break L1;
                }
              }
              var9.field_p = var9.field_p + 4;
              if (!var9.a((byte) -32)) {
                pm.m(param0 ^ 16871);
                return;
              } else {
                var3_ref_c.field_q = true;
                var3_ref_c.field_t = var5_array;
                var3_ref_c.b(4);
                return;
              }
            } else {
              pm.m(111);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static u a(cm param0, cm param1, byte param2, String param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        var5 = param0.a(param4, 34);
        if (param2 >= -44) {
          return null;
        } else {
          var6 = param0.a(var5, -32759, param3);
          return lj.a(param1, var6, -56, param0, var5);
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_g = null;
        field_f = null;
        if (param0 != -34) {
            field_e = 65;
        }
    }

    final static void a(boolean param0, byte param1, String param2, java.applet.Applet param3) {
        try {
            java.net.MalformedURLException malformedURLException = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (pn.field_w.startsWith("win")) {
                            statePc = 2;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (!hj.a(-9062, param2)) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            param3.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        malformedURLException = (java.net.MalformedURLException) (Object) caughtException;
                        sj.a("MGR1: " + param2, -85, (Throwable) null);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        if (param1 <= 0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        return;
                    }
                    case 9: {
                        field_g = null;
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
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
        field_g = "This option cannot be combined with the current '<%0>' setting.";
    }
}
