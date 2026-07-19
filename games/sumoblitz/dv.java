/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dv implements mh {
    private ld field_a;
    static boolean field_b;
    static String field_c;

    public final void a(pk param0, int param1, int param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        Object var8 = null;
        String var9 = null;
        int var10 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 5592405) {
                break L1;
              } else {
                field_b = true;
                break L1;
              }
            }
            L2: {
              var6_int = param0.field_r + param4;
              var7 = param1 - -param0.field_v;
              nn.a(param0.field_p, var6_int, param0.field_q, (byte) -84, var7);
              if (!param0.d(-1)) {
                break L2;
              } else {
                pp.a(var7 + 2, param0.field_q + -4, -13181, var6_int + 2, -4 + param0.field_p);
                break L2;
              }
            }
            L3: {
              lk.d(var6_int, var7, -2 + param0.field_q + var6_int, param0.field_p + var7);
              var8 = this.field_a.field_B.a(-72);
              if (var8 != null) {
                var9 = var8.toString();
                this.field_a.field_G.b(var9, var6_int + 2, (this.field_a.field_G.field_s + param0.field_p >> -681277599) + (var7 + -1), 10000536, -1);
                if (!this.field_a.d(-1)) {
                  break L3;
                } else {
                  if (!var9.startsWith(this.field_a.field_L)) {
                    break L3;
                  } else {
                    var10 = this.field_a.field_G.a(this.field_a.field_L);
                    lk.b(var6_int - -2, var7 - -2, var10, param0.field_p + -4, 2188450, 100);
                    break L3;
                  }
                }
              } else {
                break L3;
              }
            }
            lk.d();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var6);
            stackOut_11_1 = new StringBuilder().append("dv.A(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static ne[] a(boolean param0) {
        ne[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (param0) {
          var1 = new ne[rl.field_n];
          var2 = 0;
          L0: while (true) {
            if (var2 < rl.field_n) {
              var1[var2] = new ne(vf.field_d, li.field_u, er.field_h[var2], av.field_C[var2], vg.field_k[var2], we.field_B[var2], ag.field_d[var2], iv.field_l);
              var2++;
              if (var3 != 0) {
                return var1;
              } else {
                continue L0;
              }
            } else {
              tl.a((byte) -68);
              return var1;
            }
          }
        } else {
          field_b = false;
          var1 = new ne[rl.field_n];
          var2 = 0;
          L1: while (true) {
            if (var2 < rl.field_n) {
              var1[var2] = new ne(vf.field_d, li.field_u, er.field_h[var2], av.field_C[var2], vg.field_k[var2], we.field_B[var2], ag.field_d[var2], iv.field_l);
              var2++;
              if (var3 != 0) {
                return var1;
              } else {
                continue L1;
              }
            } else {
              tl.a((byte) -68);
              return var1;
            }
          }
        }
    }

    dv(ld param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "dv.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        String discarded$0 = null;
        field_c = null;
        if (param0 != 59) {
            java.applet.Applet var2 = (java.applet.Applet) null;
            discarded$0 = dv.a(-92, (java.applet.Applet) null);
        }
    }

    final static String a(int param0, java.applet.Applet param1) {
        try {
            RuntimeException var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            int stackIn_4_0 = 0;
            String stackIn_8_0 = null;
            int stackIn_13_0 = 0;
            String stackIn_15_0 = null;
            String stackIn_19_0 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_3_0 = 0;
            String stackOut_7_0 = null;
            int stackOut_12_0 = 0;
            String stackOut_18_0 = null;
            String stackOut_14_0 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            var8 = Sumoblitz.field_L ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    var9 = param1.getParameter("cookieprefix");
                    var3 = var9 + "settings";
                    var4 = (String) (tw.a(param1, 109, "getcookies"));
                    var5 = cn.a(';', var4, -27224);
                    var6 = 0;
                    L2: while (true) {
                      L3: {
                        if (var5.length <= var6) {
                          break L3;
                        } else {
                          var7 = var5[var6].indexOf('=');
                          stackOut_3_0 = var7;
                          stackIn_13_0 = stackOut_3_0;
                          stackIn_4_0 = stackOut_3_0;
                          if (var8 != 0) {
                            decompiledRegionSelector0 = 1;
                            break L1;
                          } else {
                            L4: {
                              if (stackIn_4_0 < 0) {
                                break L4;
                              } else {
                                if (var5[var6].substring(0, var7).trim().equals(var3)) {
                                  stackOut_7_0 = var5[var6].substring(1 + var7).trim();
                                  stackIn_8_0 = stackOut_7_0;
                                  decompiledRegionSelector0 = 2;
                                  break L1;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var6++;
                            if (var8 == 0) {
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
                    var2_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L5;
                  }
                }
                L6: {
                  if (decompiledRegionSelector0 == 0) {
                    stackOut_12_0 = param0;
                    stackIn_13_0 = stackOut_12_0;
                    break L6;
                  } else {
                    if (decompiledRegionSelector0 == 1) {
                      break L6;
                    } else {
                      decompiledRegionSelector1 = 2;
                      break L0;
                    }
                  }
                }
                if (stackIn_13_0 <= -2) {
                  if (bf.field_d != null) {
                    stackOut_18_0 = bf.field_d;
                    stackIn_19_0 = stackOut_18_0;
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    return param1.getParameter("settings");
                  }
                } else {
                  stackOut_14_0 = (String) null;
                  stackIn_15_0 = stackOut_14_0;
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_20_0 = (RuntimeException) (var2);
                stackOut_20_1 = new StringBuilder().append("dv.C(").append(param0).append(',');
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                if (param1 == null) {
                  stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackOut_22_2 = "null";
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  stackIn_23_2 = stackOut_22_2;
                  break L7;
                } else {
                  stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackOut_21_2 = "{...}";
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_23_2 = stackOut_21_2;
                  break L7;
                }
              }
              throw qo.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_19_0;
              } else {
                return stackIn_8_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
