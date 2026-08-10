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
        if (param0 != 1) {
          wd.a(-30, false, false);
          field_a = null;
          field_e = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_e = null;
          field_b = null;
          return;
        }
    }

    final static String a(java.applet.Applet param0, byte param1, String param2) {
        try {
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_9_0 = null;
            Object stackIn_14_0 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            StringBuilder stackIn_20_1 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            var7 = client.field_A ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var3 = (String) (nc.a(true, "getcookies", param0));
                      var4 = ji.a(';', (byte) 66, var3);
                      if (param1 == -1) {
                        break L2;
                      } else {
                        field_e = (String) null;
                        break L2;
                      }
                    }
                    var5 = 0;
                    L3: while (true) {
                      if (var4.length <= var5) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L4: {
                          var6 = var4[var5].indexOf('=');
                          if (0 > var6) {
                            break L4;
                          } else {
                            if (var4[var5].substring(0, var6).trim().equals(param2)) {
                              stackIn_9_0 = var4[var5].substring(var6 + 1).trim();
                              decompiledRegionSelector0 = 1;
                              break L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var3_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L5;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  stackIn_14_0 = null;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_17_0 = (RuntimeException) (var3_ref2);

                stackIn_17_1 = new StringBuilder().append("wd.C(");

                if (param0 == null) {
                  stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L6;
                } else {
                  stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L6;
                }
              }
              L7: {


                stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "null";
                  break L7;
                } else {
                  stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "{...}";
                  break L7;
                }
              }
              throw dh.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return (String) ((Object) stackIn_14_0);
            } else {
              return stackIn_9_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ke a(int param0, boolean param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        ke var6 = new ke(2);
        ke var7 = var6;
        if (!param2) {
            var7.a(new ec(17), param0 + 10);
            var4 = a.field_t.a(ji.field_c);
            var5 = a.field_t.a(ik.field_g);
            if (var5 > var4) {
                var4 = var5;
            }
            var5 = a.field_t.a(k.field_h);
            if (!(var4 >= var5)) {
                var4 = var5;
            }
            var5 = a.field_t.a(wj.field_Kb);
            if (!(var5 <= var4)) {
                var4 = var5;
            }
            var5 = a.field_t.a(sc.field_h);
            if (var5 > var4) {
                var4 = var5;
            }
            var5 = a.field_t.a(rc.field_g);
            if (!(var4 >= var5)) {
                var4 = var5;
            }
            var5 = a.field_t.a(ig.field_Xb);
            if (var4 < var5) {
                var4 = var5;
            }
            var5 = a.field_t.a(di.field_E);
            if (!(var5 <= var4)) {
                var4 = var5;
            }
            var7.field_f[-1 + var6.field_b.field_l].field_n = 46 + var4;
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
