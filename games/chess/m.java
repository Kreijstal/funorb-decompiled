/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    static fn[] field_e;
    static int field_d;
    static bn field_a;
    static int field_b;
    static String field_c;

    final static boolean a(int param0) {
        String discarded$2 = null;
        java.applet.Applet var2 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 <= -40) {
            break L0;
          } else {
            var2 = (java.applet.Applet) null;
            discarded$2 = m.a((java.applet.Applet) null, (byte) 61);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == lj.field_a) {
              break L2;
            } else {
              if (!tb.field_f.a((byte) -121)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static String a(java.applet.Applet param0, byte param1) {
        try {
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_3_0 = null;
            String stackIn_10_0 = null;
            String stackIn_17_0 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            String stackOut_9_0 = null;
            String stackOut_2_0 = null;
            String stackOut_16_0 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            var8 = Chess.field_G;
            try {
              L0: {
                try {
                  L1: {
                    var9 = param0.getParameter("cookieprefix");
                    var3 = var9 + "settings";
                    var4 = (String) (u.a(true, "getcookies", param0));
                    if (param1 == 87) {
                      var5 = gl.a((byte) -118, ';', var4);
                      var6 = 0;
                      L2: while (true) {
                        if (var6 >= var5.length) {
                          decompiledRegionSelector0 = 1;
                          break L1;
                        } else {
                          L3: {
                            var7 = var5[var6].indexOf('=');
                            if (var7 < 0) {
                              break L3;
                            } else {
                              if (var5[var6].substring(0, var7).trim().equals(var3)) {
                                stackOut_9_0 = var5[var6].substring(1 + var7).trim();
                                stackIn_10_0 = stackOut_9_0;
                                decompiledRegionSelector0 = 2;
                                break L1;
                              } else {
                                break L3;
                              }
                            }
                          }
                          var6++;
                          continue L2;
                        }
                      }
                    } else {
                      stackOut_2_0 = (String) null;
                      stackIn_3_0 = stackOut_2_0;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2 = decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 1;
                  break L0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    if (wg.field_p != null) {
                      stackOut_16_0 = wg.field_p;
                      stackIn_17_0 = stackOut_16_0;
                      decompiledRegionSelector1 = 0;
                      break L0;
                    } else {
                      return param0.getParameter("settings");
                    }
                  } else {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_18_0 = (RuntimeException) (var2_ref);
                stackOut_18_1 = new StringBuilder().append("m.C(");
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                if (param0 == null) {
                  stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackOut_20_2 = "null";
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  stackIn_21_2 = stackOut_20_2;
                  break L5;
                } else {
                  stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackOut_19_2 = "{...}";
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  stackIn_21_2 = stackOut_19_2;
                  break L5;
                }
              }
              throw fk.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_17_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_3_0;
              } else {
                return stackIn_10_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            field_a = (bn) null;
        }
        field_c = null;
        field_e = null;
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        dc var4 = null;
        pa var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_a = (bn) null;
                break L1;
              }
            }
            var4 = (dc) ((Object) fa.field_j.g(param1 + -18110));
            L2: while (true) {
              if (var4 == null) {
                var5 = (pa) ((Object) ve.field_Nb.g(param1 ^ -18110));
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    ri.a(param1 + -1281, var5, param0);
                    var5 = (pa) ((Object) ve.field_Nb.a((byte) -111));
                    continue L3;
                  }
                }
              } else {
                bh.a(var4, (byte) 46, param0);
                var4 = (dc) ((Object) fa.field_j.a((byte) -92));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var2), "m.B(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_c = "Please wait...";
    }
}
