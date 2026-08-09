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
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_4_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_17_0 = 0;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            var7 = Sumoblitz.field_L ? 1 : 0;
            try {
              L0: {
                if (rq.field_d) {
                  stackIn_4_0 = 1;
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
                        if (var4.length <= var5) {
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          L3: {
                            var6 = var4[var5].indexOf('=');
                            if (-1 < (var6 ^ -1)) {
                              break L3;
                            } else {
                              if (!var4[var5].substring(0, var6).trim().equals(var2)) {
                                break L3;
                              } else {
                                stackIn_10_0 = 1;
                                decompiledRegionSelector0 = 1;
                                break L1;
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
                      var2_ref = decompiledCaughtException;
                      decompiledRegionSelector0 = 0;
                      break L4;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    L5: {
                      if (param1.getParameter("tuhstatbut") == null) {
                        stackIn_17_0 = 0;
                        break L5;
                      } else {
                        stackIn_17_0 = 1;
                        break L5;
                      }
                    }
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_20_0 = (RuntimeException) (var2_ref2);

                stackIn_20_1 = new StringBuilder().append("lm.B(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "null";
                  break L6;
                } else {
                  stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "{...}";
                  break L6;
                }
              }
              throw qo.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_4_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_17_0 != 0;
              } else {
                return stackIn_10_0 != 0;
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
