/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg {
    static String field_b;
    static String field_e;
    static String field_d;
    static String field_f;
    static qm field_g;
    static boolean field_c;
    static sk field_a;

    final static boolean a(java.applet.Applet param0, byte param1) {
        try {
            String var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_4_0 = 0;
            int stackIn_13_0 = 0;
            int stackIn_20_0 = 0;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            String stackIn_24_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2_ref2 = null;
            var7 = client.field_A ? 1 : 0;
            try {
              L0: {
                if (vf.field_a) {
                  stackIn_4_0 = 1;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  try {
                    L1: {
                      L2: {
                        var2 = "tuhstatbut";
                        var3 = (String) (nc.a(true, "getcookies", param0));
                        var4 = ji.a(';', (byte) 66, var3);
                        if (param1 < -55) {
                          break L2;
                        } else {
                          rg.a(-124);
                          break L2;
                        }
                      }
                      var5 = 0;
                      L3: while (true) {
                        L4: {
                          if (var5 >= var4.length) {
                            break L4;
                          } else {
                            var6 = var4[var5].indexOf('=');
                            stackIn_20_0 = var6;

                            if (var7 != 0) {
                              decompiledRegionSelector0 = 1;
                              break L1;
                            } else {
                              L5: {
                                if (stackIn_20_0 < 0) {
                                  break L5;
                                } else {
                                  if (!var4[var5].substring(0, var6).trim().equals(var2)) {
                                    break L5;
                                  } else {
                                    stackIn_13_0 = 1;
                                    decompiledRegionSelector0 = 2;
                                    break L1;
                                  }
                                }
                              }
                              var5++;
                              if (var7 == 0) {
                                continue L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        decompiledRegionSelector0 = 0;
                        break L1;
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L6: {
                      var2_ref2 = decompiledCaughtException;
                      decompiledRegionSelector0 = 0;
                      break L6;
                    }
                  }
                  L7: {
                    if (decompiledRegionSelector0 == 0) {
                      if (null == param0.getParameter("tuhstatbut")) {
                        stackIn_20_0 = 0;
                        break L7;
                      } else {
                        stackIn_20_0 = 1;
                        break L7;
                      }
                    } else {
                      if (decompiledRegionSelector0 == 1) {
                        break L7;
                      } else {
                        decompiledRegionSelector1 = 2;
                        break L0;
                      }
                    }
                  }
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_23_0 = (RuntimeException) (var2_ref);

                stackIn_23_1 = new StringBuilder().append("rg.B(");

                if (param0 == null) {
                  stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackIn_24_2 = "null";
                  break L8;
                } else {
                  stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackIn_24_2 = "{...}";
                  break L8;
                }
              }
              throw dh.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_4_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_20_0 != 0;
              } else {
                return stackIn_13_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_e = null;
        field_g = null;
        field_a = null;
        int var1 = 36 / ((-41 - param0) / 35);
        field_f = null;
    }

    static {
        field_b = "Offline";
        field_e = "Player names can be up to 12 letters, numbers and underscores";
        field_f = "Can you unlock the Master Challenge by reaching Stage<nbsp>4 of Stamina Mode?";
        field_d = "Please try again in a few minutes.";
        field_g = new qm(10, 2, 2, 0);
        field_c = true;
    }
}
