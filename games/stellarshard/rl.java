/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    static int field_a;
    static String[] field_c;
    static int field_b;

    final static void a(int param0, ka param1, java.math.BigInteger param2, java.math.BigInteger param3, byte[] param4, int param5, int param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = stellarshard.field_B;
          var7 = rj.a((byte) -12, param5);
          if (null == wb.field_a) {
            wb.field_a = new java.security.SecureRandom();
            break L0;
          } else {
            break L0;
          }
        }
        var15 = new int[4];
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var8 = var12;
        var9 = 0;
        L1: while (true) {
          if (4 <= var9) {
            L2: {
              L3: {
                if (null == a.field_b) {
                  break L3;
                } else {
                  if (a.field_b.field_r.length < var7) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              a.field_b = new ka(var7);
              break L2;
            }
            a.field_b.field_k = 0;
            a.field_b.a(param5, param6, (byte) -13, param4);
            if (param0 == -13791) {
              L4: {
                L5: {
                  a.field_b.a(var7, -18920);
                  a.field_b.a((byte) 12, var15);
                  if (null == kl.field_r) {
                    break L5;
                  } else {
                    if (kl.field_r.field_r.length < 100) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
                kl.field_r = new ka(100);
                break L4;
              }
              kl.field_r.field_k = 0;
              kl.field_r.a(false, 10);
              var11 = 0;
              var9 = var11;
              L6: while (true) {
                if (-5 >= (var11 ^ -1)) {
                  kl.field_r.c(param5, param0 + 13664);
                  kl.field_r.a(false, param2, param3);
                  param1.a(kl.field_r.field_k, 0, (byte) -13, kl.field_r.field_r);
                  param1.a(a.field_b.field_k, 0, (byte) -13, a.field_b.field_r);
                  return;
                } else {
                  kl.field_r.b(0, var15[var11]);
                  var11++;
                  continue L6;
                }
              }
            } else {
              return;
            }
          } else {
            var8[var9] = wb.field_a.nextInt();
            var9++;
            continue L1;
          }
        }
    }

    final static void a(java.awt.Canvas param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = stellarshard.field_B;
          if (param1 < (rk.field_f ^ -1)) {
            L1: {
              var3 = 0;
              if (!of.field_F) {
                break L1;
              } else {
                of.field_F = false;
                var3 = 1;
                break L1;
              }
            }
            ph.a(cd.h(-1064120735), 2, qf.field_a, ia.l(50), var3 != 0);
            break L0;
          } else {
            if (gh.b((byte) 105)) {
              if (eg.field_d == 0) {
                vc.a((byte) -121, param2, false);
                pd.a(param0, 0, 0, (byte) -24);
                break L0;
              } else {
                i.a(param0, param1 + -101);
                break L0;
              }
            } else {
              ti.d();
              n.a(240, (byte) -41, 320);
              pd.a(param0, 0, 0, (byte) -80);
              break L0;
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != -84) {
            field_a = 111;
        }
        field_c = null;
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            java.net.URL var4 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var4 = param0.getCodeBase();
                            var3 = lk.a(param0, var4, 118).getFile();
                            Object discarded$12 = sh.a(new Object[2], false, "updatelinks", param0);
                            Object discarded$13 = sh.a(new Object[2], false, "updatelinks", param0);
                            Object discarded$14 = sh.a(new Object[2], false, "updatelinks", param0);
                            Object discarded$15 = sh.a(new Object[2], false, "updatelinks", param0);
                            Object discarded$16 = sh.a(new Object[2], false, "updatelinks", param0);
                            Object discarded$17 = sh.a(new Object[2], false, "updatelinks", param0);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 2;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        var2 = caughtException;
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        if (param1 == 15) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        field_a = -78;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
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

    final static int a(CharSequence param0, byte param1) {
        int var4 = 0;
        int var5 = stellarshard.field_B;
        int var2 = param0.length();
        int var3 = 0;
        if (param1 <= 54) {
            return 65;
        }
        for (var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << -1114951931) + -var3 - -bf.a(-8250, param0.charAt(var4));
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_a = 2;
    }
}
