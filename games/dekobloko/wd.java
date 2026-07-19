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
        field_a = null;
        field_e = null;
        field_b = null;
    }

    final static String a(java.applet.Applet param0, byte param1, String param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_7_0 = null;
            Object stackIn_12_0 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            String stackOut_6_0 = null;
            Object stackOut_11_0 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            var7 = client.field_A ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    var3 = (String) (nc.a(true, "getcookies", param0));
                    var4 = ji.a(';', (byte) 66, var3);
                    var5 = 0;
                    L2: while (true) {
                      if (~var4.length >= ~var5) {
                        break L1;
                      } else {
                        L3: {
                          var6 = var4[var5].indexOf('=');
                          if (0 > var6) {
                            break L3;
                          } else {
                            if (var4[var5].substring(0, var6).trim().equals(param2)) {
                              stackOut_6_0 = var4[var5].substring(var6 + 1).trim();
                              stackIn_7_0 = stackOut_6_0;
                              return stackIn_7_0;
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
                stackOut_11_0 = null;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_13_0 = (RuntimeException) (var3_ref2);
                stackOut_13_1 = new StringBuilder().append("wd.C(");
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param0 == null) {
                  stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L5;
                } else {
                  stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L5;
                }
              }
              L6: {
                stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(-1).append(',');
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param2 == null) {
                  stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L6;
                } else {
                  stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L6;
                }
              }
              throw dh.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
            }
            return (String) ((Object) stackIn_12_0);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ke a(int param0, boolean param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        ke var6 = null;
        ke var7 = null;
        L0: {
          var6 = new ke(2);
          var7 = var6;
          if (param2) {
            break L0;
          } else {
            L1: {
              var7.a(new ec(17), param0 + 10);
              var4 = a.field_t.a(ji.field_c);
              var5 = a.field_t.a(ik.field_g);
              if (var5 <= var4) {
                break L1;
              } else {
                var4 = var5;
                break L1;
              }
            }
            L2: {
              var5 = a.field_t.a(k.field_h);
              if (~var4 > ~var5) {
                var4 = var5;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var5 = a.field_t.a(wj.field_Kb);
              if (var5 > var4) {
                var4 = var5;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var5 = a.field_t.a(sc.field_h);
              if (~var5 >= ~var4) {
                break L4;
              } else {
                var4 = var5;
                break L4;
              }
            }
            L5: {
              var5 = a.field_t.a(rc.field_g);
              if (~var4 > ~var5) {
                var4 = var5;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var5 = a.field_t.a(ig.field_Xb);
              if (~var4 <= ~var5) {
                break L6;
              } else {
                var4 = var5;
                break L6;
              }
            }
            L7: {
              var5 = a.field_t.a(di.field_E);
              if (var5 > var4) {
                var4 = var5;
                break L7;
              } else {
                break L7;
              }
            }
            var7.field_f[-1 + var6.field_b.field_l].field_n = 46 + var4;
            break L0;
          }
        }
        var7.a(new ec(18, om.field_b, a.field_t), 104);
        var7.a(-1, param1, -129);
        var7.a(param0, 320, false, -117, 28);
        return var7;
    }

    static {
        field_a = "You appear to be telling someone your password - please don't!";
        field_d = false;
        field_b = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_e = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
