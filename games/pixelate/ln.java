/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln extends fa {
    static boolean field_q;
    static int field_n;
    static String field_l;
    static String[][] field_m;
    static int field_p;
    static String field_k;
    pp field_o;

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
            String stackIn_9_0 = null;
            String stackIn_16_0 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            String stackOut_8_0 = null;
            String stackOut_15_0 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            var8 = Pixelate.field_H ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var9 = param0.getParameter("cookieprefix");
                      var3 = var9 + "settings";
                      if (param1 == -85) {
                        break L2;
                      } else {
                        ln.a(122);
                        break L2;
                      }
                    }
                    var4 = (String) (cq.a("getcookies", (byte) -43, param0));
                    var5 = dd.a(var4, (byte) -37, ';');
                    var6 = 0;
                    L3: while (true) {
                      if (var6 >= var5.length) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L4: {
                          var7 = var5[var6].indexOf('=');
                          if (-1 < (var7 ^ -1)) {
                            break L4;
                          } else {
                            if (var5[var6].substring(0, var7).trim().equals(var3)) {
                              stackOut_8_0 = var5[var6].substring(var7 - -1).trim();
                              stackIn_9_0 = stackOut_8_0;
                              decompiledRegionSelector0 = 1;
                              break L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var6++;
                        continue L3;
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var2 = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L5;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  if (jp.field_c != null) {
                    stackOut_15_0 = jp.field_c;
                    stackIn_16_0 = stackOut_15_0;
                    decompiledRegionSelector1 = 0;
                    break L0;
                  } else {
                    return param0.getParameter("settings");
                  }
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_17_0 = (RuntimeException) (var2_ref);
                stackOut_17_1 = new StringBuilder().append("ln.D(");
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (param0 == null) {
                  stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackOut_19_2 = "null";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L6;
                } else {
                  stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackOut_18_2 = "{...}";
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  break L6;
                }
              }
              throw aa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_16_0;
            } else {
              return stackIn_9_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_m = (String[][]) null;
        if (param0 != -113) {
            field_m = (String[][]) null;
        }
        field_l = null;
        field_k = null;
    }

    ln(int param0) {
        this.field_o = pp.a(pg.field_f[param0], 100, ci.field_m[param0]);
        cm discarded$0 = mn.a(-21317, this.field_o);
    }

    final static void a(int param0) {
        if (param0 <= 11) {
            return;
        }
        if (!(null != ib.field_f)) {
            return;
        }
        pf.a(ib.field_f, 0);
        ib.field_f.a(6511, mc.field_k);
        ib.field_f = null;
        if (!(vh.field_c == null)) {
            vh.field_c.b(-101);
        }
        ec.field_u.requestFocus();
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        L0: {
          var9 = Pixelate.field_H ? 1 : 0;
          if (param6 == 100) {
            break L0;
          } else {
            field_k = (String) null;
            break L0;
          }
        }
        L1: {
          if (param1 <= param3) {
            if (param3 >= param4) {
              if (param1 >= param4) {
                cn.a(param2, param1, param3, param5, param7, t.field_k, false, param0, param4);
                break L1;
              } else {
                cn.a(param0, param4, param3, param5, param7, t.field_k, false, param2, param1);
                break L1;
              }
            } else {
              cn.a(param7, param3, param4, param5, param0, t.field_k, false, param2, param1);
              break L1;
            }
          } else {
            if (param4 <= param1) {
              if (param4 <= param3) {
                cn.a(param7, param3, param1, param5, param2, t.field_k, false, param0, param4);
                break L1;
              } else {
                cn.a(param0, param4, param1, param5, param2, t.field_k, false, param7, param3);
                break L1;
              }
            } else {
              cn.a(param2, param1, param4, param5, param0, t.field_k, false, param7, param3);
              break L1;
            }
          }
        }
    }

    static {
        field_q = true;
        field_l = "No options available";
        field_k = "Members";
        field_p = 0;
    }
}
