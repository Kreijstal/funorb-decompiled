/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    static vf field_c;
    static int field_d;
    static int field_e;
    static int[] field_f;
    static String field_a;
    static String field_b;

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_b = null;
        if (param0 != 0) {
            return;
        }
        field_c = null;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        L0: {
          var26 = Torquing.field_u;
          var6 = 0;
          var7 = param5;
          var8 = param2 * param2;
          var9 = param5 * param5;
          var10 = var9 << 747253889;
          var11 = var8 << 1232801121;
          var12 = param5 << 1015189633;
          var13 = var8 * (1 - var12) + var10;
          var14 = -((-1 + var12) * var11) + var9;
          var15 = var8 << 754288802;
          var16 = var9 << -301934078;
          var17 = ((var6 << 640877281) + 3) * var10;
          var18 = var11 * ((var7 << 1959717441) - 3);
          var21 = -103 % ((82 - param3) / 34);
          var19 = var16 * (1 + var6);
          if (j.field_q > param4) {
            break L0;
          } else {
            if (param4 > qk.field_p) {
              break L0;
            } else {
              var22 = ln.a(qg.field_z, kn.field_e, param2 + param1, 88);
              var23 = ln.a(qg.field_z, kn.field_e, param1 + -param2, 89);
              di.a(var23, (byte) -91, param0, qd.field_a[param4], var22);
              break L0;
            }
          }
        }
        var20 = (var7 + -1) * var15;
        L1: while (true) {
          if (-1 > (var7 ^ -1)) {
            L2: {
              if (var13 < 0) {
                L3: while (true) {
                  if (0 <= var13) {
                    break L2;
                  } else {
                    var14 = var14 + var19;
                    var13 = var13 + var17;
                    var17 = var17 + var16;
                    var19 = var19 + var16;
                    var6++;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            L4: {
              if ((var14 ^ -1) > -1) {
                var14 = var14 + var19;
                var13 = var13 + var17;
                var17 = var17 + var16;
                var6++;
                var19 = var19 + var16;
                break L4;
              } else {
                break L4;
              }
            }
            var13 = var13 + -var20;
            var14 = var14 + -var18;
            var7--;
            var18 = var18 - var15;
            var20 = var20 - var15;
            var22 = param4 - var7;
            var23 = var7 + param4;
            if (j.field_q > var23) {
              continue L1;
            } else {
              if (qk.field_p < var22) {
                continue L1;
              } else {
                L5: {
                  var24 = ln.a(qg.field_z, kn.field_e, var6 + param1, 112);
                  var25 = ln.a(qg.field_z, kn.field_e, -var6 + param1, 94);
                  if (j.field_q > var22) {
                    break L5;
                  } else {
                    di.a(var25, (byte) -91, param0, qd.field_a[var22], var24);
                    break L5;
                  }
                }
                if (qk.field_p < var23) {
                  continue L1;
                } else {
                  di.a(var25, (byte) 86, param0, qd.field_a[var23], var24);
                  continue L1;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final static void a(boolean param0, String param1, java.applet.Applet param2, int param3) {
        try {
            java.net.MalformedURLException var4 = null;
            Object var5 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (vh.field_i.startsWith("win")) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (fq.a(param1, 0)) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return;
                    }
                    case 5: {
                        try {
                            param2.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
                            if (param3 == 3) {
                                statePc = 9;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var5 = null;
                            a.a(false, (String) null, (java.applet.Applet) null, -43);
                            return;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        var4 = (java.net.MalformedURLException) (Object) caughtException;
                        nn.a("MGR1: " + param1, (Throwable) null, param3 ^ -9959);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
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
        field_f = new int[128];
        field_b = "Email (Login):";
        field_a = "Unfortunately you are not eligible to create an account.";
    }
}
