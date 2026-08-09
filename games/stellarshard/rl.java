/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    static int field_a;
    static String[] field_c;
    static int field_b;

    final static void a(int param0, ka param1, java.math.BigInteger param2, java.math.BigInteger param3, byte[] param4, int param5, int param6) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        var10 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              var7_int = rj.a((byte) -12, param5);
              if (null == wb.field_a) {
                wb.field_a = new java.security.SecureRandom();
                break L1;
              } else {
                break L1;
              }
            }
            var13 = new int[4];
            var12 = var13;
            var8 = var12;
            var9 = 0;
            L2: while (true) {
              if (4 <= var9) {
                L3: {
                  L4: {
                    if (null == a.field_b) {
                      break L4;
                    } else {
                      if (a.field_b.field_r.length < var7_int) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  a.field_b = new ka(var7_int);
                  break L3;
                }
                a.field_b.field_k = 0;
                a.field_b.a(param5, param6, (byte) -13, param4);
                if (param0 == -13791) {
                  L5: {
                    L6: {
                      a.field_b.a(var7_int, -18920);
                      a.field_b.a((byte) 12, var13);
                      if (null == kl.field_r) {
                        break L6;
                      } else {
                        if (kl.field_r.field_r.length < 100) {
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                    kl.field_r = new ka(100);
                    break L5;
                  }
                  kl.field_r.field_k = 0;
                  kl.field_r.a(false, 10);
                  var11 = 0;
                  var9 = var11;
                  L7: while (true) {
                    if (-5 >= (var11 ^ -1)) {
                      kl.field_r.c(param5, param0 + 13664);
                      kl.field_r.a(false, param2, param3);
                      param1.a(kl.field_r.field_k, 0, (byte) -13, kl.field_r.field_r);
                      param1.a(a.field_b.field_k, 0, (byte) -13, a.field_b.field_r);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      kl.field_r.b(0, var13[var11]);
                      var11++;
                      continue L7;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var8[var9] = wb.field_a.nextInt();
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var7);

            stackIn_24_1 = new StringBuilder().append("rl.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param3 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L10;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param4 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L11;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L11;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_25_0), stackIn_34_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(java.awt.Canvas param0, int param1, boolean param2) {
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        var4 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (param1 < (rk.field_f ^ -1)) {
                L2: {
                  var3_int = 0;
                  if (!of.field_F) {
                    break L2;
                  } else {
                    of.field_F = false;
                    var3_int = 1;
                    break L2;
                  }
                }
                ph.a(cd.h(-1064120735), 2, qf.field_a, ia.l(50), var3_int != 0);
                break L1;
              } else {
                if (gh.b((byte) 105)) {
                  if (eg.field_d == 0) {
                    vc.a((byte) -121, param2, false);
                    pd.a(param0, 0, 0, (byte) -24);
                    break L1;
                  } else {
                    i.a(param0, param1 + -101);
                    break L1;
                  }
                } else {
                  ti.d();
                  n.a(240, (byte) -41, 320);
                  pd.a(param0, 0, 0, (byte) -80);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("rl.E(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
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
            String var3 = null;
            java.net.URL var4 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            try {
              L0: {
                try {
                  L1: {
                    var4 = param0.getCodeBase();
                    var3 = lk.a(param0, var4, 118).getFile();
                    sh.a(new Object[]{"home", var3 + "home.ws"}, false, "updatelinks", param0);
                    sh.a(new Object[]{"gamelist", var3 + "togamelist.ws"}, false, "updatelinks", param0);
                    sh.a(new Object[]{"serverlist", var3 + "toserverlist.ws"}, false, "updatelinks", param0);
                    sh.a(new Object[]{"options", var3 + "options.ws"}, false, "updatelinks", param0);
                    sh.a(new Object[]{"terms", var3 + "terms.ws"}, false, "updatelinks", param0);
                    sh.a(new Object[]{"privacy", var3 + "privacy.ws"}, false, "updatelinks", param0);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2 = decompiledCaughtException;
                    break L2;
                  }
                }
                L3: {
                  if (param1 == 15) {
                    break L3;
                  } else {
                    field_a = -78;
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref);

                stackIn_8_1 = new StringBuilder().append("rl.A(");

                if (param0 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L4;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L4;
                }
              }
              throw ma.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(CharSequence param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = stellarshard.field_B;
        try {
          L0: {
            var2_int = param0.length();
            var3 = 0;
            if (param1 > 54) {
              var4 = 0;
              L1: while (true) {
                if (var4 >= var2_int) {
                  stackIn_8_0 = var3;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3 = (var3 << -1114951931) + -var3 - -bf.a(-8250, param0.charAt(var4));
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 65;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("rl.B(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    static {
        field_c = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_a = 2;
    }
}
