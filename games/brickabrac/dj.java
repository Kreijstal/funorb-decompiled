/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dj {
    static int field_d;
    static String field_h;
    static jp[] field_f;
    static jp field_e;
    static jp field_a;
    static int field_g;
    static bn field_c;
    static int field_b;

    final int a(long param0, byte param1) {
        long var4 = 0L;
        var4 = this.d((byte) 107);
        if (var4 <= 0L) {
          if (param1 != -71) {
            return 106;
          } else {
            return this.a(15, param0);
          }
        } else {
          wj.a(-124, var4);
          if (param1 != -71) {
            return 106;
          } else {
            return this.a(15, param0);
          }
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (!(0 != param0)) {
            return 0;
        }
        if (0 < param0) {
            var2 = 1;
            if (param0 > 65535) {
                param0 = param0 >> 16;
                var2 += 16;
            }
            if ((param0 ^ -1) < -256) {
                param0 = param0 >> 8;
                var2 += 8;
            }
            if (!(15 >= param0)) {
                var2 += 4;
                param0 = param0 >> 4;
            }
            if (!(-4 <= (param0 ^ -1))) {
                var2 += 2;
                param0 = param0 >> 2;
            }
            if (!(1 >= param0)) {
                var2++;
                param0 = param0 >> 1;
            }
            return var2;
        }
        var2 = 2;
        if ((param0 ^ -1) > 65535) {
            var2 += 16;
            param0 = param0 >> 16;
        }
        if (!(param0 >= -256)) {
            param0 = param0 >> 8;
            var2 += 8;
        }
        if (param1 < (param0 ^ -1)) {
            param0 = param0 >> 4;
            var2 += 4;
        }
        if (!(-4 <= param0)) {
            var2 += 2;
            param0 = param0 >> 2;
        }
        if (1 < (param0 ^ -1)) {
            var2++;
            param0 = param0 >> 1;
        }
        return var2;
    }

    abstract void a(int param0);

    final static boolean c(byte param0) {
        int var1 = 15 % ((81 - param0) / 36);
        hk.field_R = true;
        cg.field_i = 15000L + ue.a(false);
        return -12 == (i.field_j ^ -1) ? true : false;
    }

    public static void a(byte param0) {
        field_a = null;
        field_f = null;
        field_c = null;
        field_h = null;
        field_e = null;
        int var1 = 25 % ((param0 - -34) / 58);
    }

    abstract long d(byte param0);

    abstract int a(int param0, long param1);

    final static String a(boolean param0, java.applet.Applet param1) {
        try {
            String discarded$2 = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            java.applet.Applet var9 = null;
            String var10 = null;
            String stackIn_8_0 = null;
            String stackIn_15_0 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            String stackOut_7_0 = null;
            String stackOut_14_0 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            var8 = BrickABrac.field_J ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var10 = param1.getParameter("cookieprefix");
                      if (param0) {
                        break L2;
                      } else {
                        var9 = (java.applet.Applet) null;
                        discarded$2 = dj.a(true, (java.applet.Applet) null);
                        break L2;
                      }
                    }
                    var3 = var10 + "settings";
                    var4 = (String) (ne.a("getcookies", -125, param1));
                    var5 = qb.a((byte) 123, var4, ';');
                    var6 = 0;
                    L3: while (true) {
                      if (var5.length <= var6) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L4: {
                          var7 = var5[var6].indexOf('=');
                          if (0 > var7) {
                            break L4;
                          } else {
                            if (!var5[var6].substring(0, var7).trim().equals(var3)) {
                              break L4;
                            } else {
                              stackOut_7_0 = var5[var6].substring(1 + var7).trim();
                              stackIn_8_0 = stackOut_7_0;
                              decompiledRegionSelector0 = 1;
                              break L1;
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
                  if (wp.field_d != null) {
                    stackOut_14_0 = wp.field_d;
                    stackIn_15_0 = stackOut_14_0;
                    decompiledRegionSelector1 = 0;
                    break L0;
                  } else {
                    return param1.getParameter("settings");
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
                stackOut_16_0 = (RuntimeException) (var2_ref);
                stackOut_16_1 = new StringBuilder().append("dj.G(").append(param0).append(',');
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param1 == null) {
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
              throw qb.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_15_0;
            } else {
              return stackIn_8_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(byte param0) {
        kd.field_d = new String[rg.field_a];
        kd.field_d[18] = ta.field_c;
        kd.field_d[4] = fd.field_a;
        kd.field_d[16] = oj.field_o;
        kd.field_d[21] = br.field_Rb;
        kd.field_d[5] = k.field_i;
        kd.field_d[15] = tk.field_i;
        kd.field_d[9] = sh.field_b;
        kd.field_d[6] = pg.field_i;
        kd.field_d[20] = c.field_n;
        kd.field_d[7] = nk.field_i;
        kd.field_d[17] = pb.field_l;
        kd.field_d[19] = tq.field_g;
        kd.field_d[param0] = ed.field_a;
        kd.field_d[11] = bl.field_I;
    }

    static {
        field_h = "Player names can be up to 12 letters, numbers and underscores";
    }
}
