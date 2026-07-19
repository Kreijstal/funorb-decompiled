/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm {
    private cr field_b;
    static ts field_a;

    final void a(int param0) {
        if (null == this.field_b) {
          if (param0 != -1) {
            field_a = (ts) null;
            return;
          } else {
            return;
          }
        } else {
          this.field_b.b(param0 + 12002);
          if (param0 == -1) {
            return;
          } else {
            field_a = (ts) null;
            return;
          }
        }
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 != 6) {
            field_a = (ts) null;
        }
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            RuntimeException var2_ref = null;
            Throwable var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_4_0 = 0;
            int stackIn_8_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_18_0 = 0;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_3_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_17_0 = 0;
            int stackOut_16_0 = 0;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
            var7 = Sumoblitz.field_L ? 1 : 0;
            try {
              L0: {
                if (rq.field_d) {
                  stackOut_3_0 = 1;
                  stackIn_4_0 = stackOut_3_0;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  try {
                    L1: {
                      var2 = "tuhstatbut";
                      var3 = (String) (tw.a(param1, 116, "getcookies"));
                      var4 = cn.a((char)param0, var3, -27224);
                      var5 = 0;
                      L2: while (true) {
                        L3: {
                          if (var4.length <= var5) {
                            break L3;
                          } else {
                            var6 = var4[var5].indexOf('=');
                            stackOut_7_0 = -1;
                            stackIn_18_0 = stackOut_7_0;
                            stackIn_8_0 = stackOut_7_0;
                            if (var7 != 0) {
                              decompiledRegionSelector0 = 1;
                              break L1;
                            } else {
                              L4: {
                                if (stackIn_8_0 < (var6 ^ -1)) {
                                  break L4;
                                } else {
                                  if (!var4[var5].substring(0, var6).trim().equals(var2)) {
                                    break L4;
                                  } else {
                                    stackOut_10_0 = 1;
                                    stackIn_11_0 = stackOut_10_0;
                                    decompiledRegionSelector0 = 2;
                                    break L1;
                                  }
                                }
                              }
                              var5++;
                              if (var7 == 0) {
                                continue L2;
                              } else {
                                break L3;
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
                    L5: {
                      var2_ref2 = decompiledCaughtException;
                      decompiledRegionSelector0 = 0;
                      break L5;
                    }
                  }
                  L6: {
                    if (decompiledRegionSelector0 == 0) {
                      if (param1.getParameter("tuhstatbut") == null) {
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        break L6;
                      } else {
                        stackOut_16_0 = 1;
                        stackIn_18_0 = stackOut_16_0;
                        break L6;
                      }
                    } else {
                      if (decompiledRegionSelector0 == 1) {
                        break L6;
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
              L7: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_19_0 = (RuntimeException) (var2_ref);
                stackOut_19_1 = new StringBuilder().append("lm.B(").append(param0).append(',');
                stackIn_21_0 = stackOut_19_0;
                stackIn_21_1 = stackOut_19_1;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                if (param1 == null) {
                  stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackOut_21_2 = "null";
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  stackIn_22_2 = stackOut_21_2;
                  break L7;
                } else {
                  stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackOut_20_2 = "{...}";
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  stackIn_22_2 = stackOut_20_2;
                  break L7;
                }
              }
              throw qo.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_4_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_18_0 != 0;
              } else {
                return stackIn_11_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    lm(boolean param0) {
    }

    static {
        field_a = new ts(6, 0, 4, 2);
    }
}
