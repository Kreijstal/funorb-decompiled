/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dv implements mh {
    private ld field_a;
    static boolean field_b;
    static String field_c;

    public final void a(pk param0, int param1, int param2, boolean param3, int param4) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Object var8 = null;
        String var9 = null;
        int var10 = 0;
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
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("dv.A(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static ne[] a(boolean param0) {
        int var2 = 0;
        int var3 = Sumoblitz.field_L ? 1 : 0;
        if (!param0) {
            field_b = false;
        }
        ne[] var1 = new ne[rl.field_n];
        for (var2 = 0; var2 < rl.field_n; var2++) {
            var1[var2] = new ne(vf.field_d, li.field_u, er.field_h[var2], av.field_C[var2], vg.field_k[var2], we.field_B[var2], ag.field_d[var2], iv.field_l);
        }
        tl.a((byte) -68);
        return var1;
    }

    dv(ld param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "dv.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 59) {
            java.applet.Applet var2 = (java.applet.Applet) null;
            dv.a(-92, (java.applet.Applet) null);
        }
    }

    final static String a(int param0, java.applet.Applet param1) {
        try {
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_7_0 = null;
            String stackIn_13_0 = null;
            String stackIn_17_0 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
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
                      if (var5.length <= var6) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L3: {
                          var7 = var5[var6].indexOf('=');
                          if (var7 < 0) {
                            break L3;
                          } else {
                            if (var5[var6].substring(0, var7).trim().equals(var3)) {
                              stackIn_7_0 = var5[var6].substring(1 + var7).trim();
                              decompiledRegionSelector0 = 1;
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
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2 = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  if (param0 <= -2) {
                    if (bf.field_d != null) {
                      stackIn_17_0 = bf.field_d;
                      decompiledRegionSelector1 = 1;
                      break L0;
                    } else {
                      return param1.getParameter("settings");
                    }
                  } else {
                    stackIn_13_0 = (String) null;
                    decompiledRegionSelector1 = 0;
                    break L0;
                  }
                } else {
                  decompiledRegionSelector1 = 2;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_20_0 = (RuntimeException) (var2_ref);

                stackIn_20_1 = new StringBuilder().append("dv.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "null";
                  break L5;
                } else {
                  stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "{...}";
                  break L5;
                }
              }
              throw qo.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_17_0;
              } else {
                return stackIn_7_0;
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
