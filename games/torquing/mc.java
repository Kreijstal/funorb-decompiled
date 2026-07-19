/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc extends q {
    static int field_l;
    static k field_k;
    nj field_j;
    static double field_m;

    final static void c(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var1_int = u.field_v[0];
              var2 = 1;
              if (param0 == 1559487076) {
                break L1;
              } else {
                field_l = -52;
                break L1;
              }
            }
            L2: while (true) {
              if (var2 >= u.field_v.length) {
                break L0;
              } else {
                var3 = u.field_v[var2];
                dk.a(mn.field_bb, var2 << 1559487076, mn.field_bb, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "mc.B(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_k = null;
        if (param0 == 5) {
            return;
        }
        mc.a(-58);
    }

    final static void a(byte param0, int param1, bm param2) {
        df var3 = null;
        try {
            if (param0 != 85) {
                mc.a(95);
            }
            var3 = wa.field_d;
            var3.f(-71, param1);
            var3.b(90, 5);
            var3.b(90, 0);
            var3.a(param2.field_s, 93);
            var3.b(90, param2.field_q);
            var3.b(90, param2.field_o);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "mc.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean b(int param0) {
        if (param0 <= 115) {
            field_k = (k) null;
            return mc.a(2126, ip.a(9));
        }
        return mc.a(2126, ip.a(9));
    }

    private final static boolean a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_4_0 = 0;
            int stackIn_7_0 = 0;
            int stackIn_13_0 = 0;
            int stackIn_20_0 = 0;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            String stackIn_24_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_3_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_19_0 = 0;
            int stackOut_18_0 = 0;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            var7 = Torquing.field_u;
            try {
              L0: {
                if (sb.field_p) {
                  stackOut_3_0 = 1;
                  stackIn_4_0 = stackOut_3_0;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  try {
                    L1: {
                      var2 = "tuhstatbut";
                      if (param0 == 2126) {
                        var3 = (String) (hp.a(param1, (byte) -85, "getcookies"));
                        var4 = kc.a(';', var3, 0);
                        var5 = 0;
                        L2: while (true) {
                          if (var4.length <= var5) {
                            decompiledRegionSelector0 = 1;
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
                                  stackOut_12_0 = 1;
                                  stackIn_13_0 = stackOut_12_0;
                                  decompiledRegionSelector0 = 2;
                                  break L1;
                                }
                              }
                            }
                            var5++;
                            continue L2;
                          }
                        }
                      } else {
                        stackOut_6_0 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        decompiledRegionSelector0 = 0;
                        break L1;
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      var2_ref = decompiledCaughtException;
                      decompiledRegionSelector0 = 1;
                      break L4;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  } else {
                    if (decompiledRegionSelector0 == 1) {
                      L5: {
                        if (null == param1.getParameter("tuhstatbut")) {
                          stackOut_19_0 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          break L5;
                        } else {
                          stackOut_18_0 = 1;
                          stackIn_20_0 = stackOut_18_0;
                          break L5;
                        }
                      }
                      decompiledRegionSelector1 = 1;
                      break L0;
                    } else {
                      decompiledRegionSelector1 = 3;
                      break L0;
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_21_0 = (RuntimeException) (var2_ref2);
                stackOut_21_1 = new StringBuilder().append("mc.C(").append(param0).append(',');
                stackIn_23_0 = stackOut_21_0;
                stackIn_23_1 = stackOut_21_1;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                if (param1 == null) {
                  stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackOut_23_2 = "null";
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  stackIn_24_2 = stackOut_23_2;
                  break L6;
                } else {
                  stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackOut_22_2 = "{...}";
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_24_1 = stackOut_22_1;
                  stackIn_24_2 = stackOut_22_2;
                  break L6;
                }
              }
              throw rb.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_4_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_20_0 != 0;
              } else {
                if (decompiledRegionSelector1 == 2) {
                  return stackIn_7_0 != 0;
                } else {
                  return stackIn_13_0 != 0;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    mc(nj param0) {
        try {
            this.field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "mc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = new k(7, 0, 1, 1);
    }
}
