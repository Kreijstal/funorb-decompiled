/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    static boolean field_g;
    static String field_f;
    static String[] field_c;
    static co field_e;
    static String field_d;
    static char[] field_b;
    static boolean field_a;

    final static void a(int param0) {
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        kj var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        cf var12 = null;
        hl var13 = null;
        kj var14 = null;
        hl var15 = null;
        L0: {
          var8 = SteelSentinels.field_G;
          var14 = rf.field_d;
          var2 = var14.f((byte) -117);
          if (-1 != (var2 ^ -1)) {
            if (1 != var2) {
              if (-3 != (var2 ^ -1)) {
                sj.a("A1: " + ci.a((byte) 94), -50, (Throwable) null);
                pm.m(121);
                break L0;
              } else {
                var15 = (hl) (Object) ic.field_D.e(13058);
                if (var15 == null) {
                  pm.m(param0 ^ 117);
                  return;
                } else {
                  var15.field_s = jg.a(true);
                  var15.field_t = true;
                  var15.b(4);
                  break L0;
                }
              }
            } else {
              var12 = (cf) (Object) jb.field_A.e(13058);
              if (var12 == null) {
                pm.m(-22);
                return;
              } else {
                var12.b(4);
                break L0;
              }
            }
          } else {
            var11 = jg.a(true);
            var3 = var11;
            var10 = var11;
            var4 = var10;
            var5 = var14;
            var6 = ((gi) (Object) var5).f((byte) -121);
            var7 = 0;
            L1: while (true) {
              if (var7 >= var6) {
                var13 = (hl) (Object) ic.field_D.e(param0 ^ 13058);
                if (var13 != null) {
                  var13.field_t = true;
                  var13.field_s = var3;
                  var13.b(4);
                  break L0;
                } else {
                  pm.m(-116);
                  return;
                }
              } else {
                var10[var7] = ((gi) (Object) var5).i(0);
                var7++;
                continue L1;
              }
            }
          }
        }
        L2: {
          if (param0 == 0) {
            break L2;
          } else {
            cd.a(-37);
            break L2;
          }
        }
    }

    final static String a(gi param0, int param1, byte param2) {
        int var3 = 0;
        int var4_int = 0;
        Exception var4 = null;
        byte[] var5 = null;
        String var6 = null;
        String stackIn_5_0 = null;
        String stackOut_4_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = 66 / ((51 - param2) / 49);
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = param0.b(false);
                        if (var4_int > param1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4_int = param1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var5 = new byte[var4_int];
                        param0.field_p = param0.field_p + ob.field_r.a(var5, var4_int, 4408131, 0, param0.field_t, param0.field_p);
                        var6 = ub.a((byte) 37, 0, var5, var4_int);
                        stackOut_4_0 = (String) var6;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0;
                }
                case 6: {
                    var4 = (Exception) (Object) caughtException;
                    return "Cabbage";
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        if (param0) {
            Object var2 = null;
            String discarded$0 = cd.a((gi) null, 20, (byte) -110);
        }
        field_e = null;
        field_d = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"Golem", "Slave", "Aquila", "Turtle", "Commando", "Hurricane", "Scorpion", "Crusher", "Bertha", "Orbital", "Valhalla", "Babel"};
        field_d = "to return to the normal view.";
        field_b = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_f = "Ask to join <%0>'s game";
    }
}
