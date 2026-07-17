/*
 * Decompiled by CFR-JS 0.4.0.
 */
class o extends ca {
    static int field_j;
    o field_f;
    o field_g;
    long field_h;
    static String field_i;

    final static void d(int param0) {
        bm.field_d.n(7920);
        if (!(na.field_c != null)) {
            na.field_c = new ve(bm.field_d, bm.field_a);
        }
        bm.field_d.b((byte) 74, (pj) (Object) na.field_c);
    }

    public static void a(byte param0) {
        field_i = null;
        int var1 = 1;
    }

    final void c(int param0) {
        Object var3 = null;
        if (((o) this).field_g != null) {
          ((o) this).field_g.field_f = ((o) this).field_f;
          ((o) this).field_f.field_g = ((o) this).field_g;
          ((o) this).field_f = null;
          if (param0 != -1) {
            var3 = null;
            o.a(5, (byte) -99, (java.applet.Applet) null, (String[]) null, 44, -56);
            ((o) this).field_g = null;
            return;
          } else {
            ((o) this).field_g = null;
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        te.field_O = 0;
        kk.field_S = param3;
        bk.field_e = param0;
        if (b.a((byte) 112, kk.field_S)) {
          L0: {
            var4 = 0;
            if (kk.field_S == 7) {
              var4 = -1;
              break L0;
            } else {
              break L0;
            }
          }
          nc.field_cb[kk.field_S].a((byte) -108, var4, param2);
          if (kk.field_S == 7) {
            vk.a(0, param2);
            if (param1 != 2) {
              field_j = -61;
              return;
            } else {
              return;
            }
          } else {
            if (param1 == 2) {
              return;
            } else {
              field_j = -61;
              return;
            }
          }
        } else {
          if (param1 == 2) {
            return;
          } else {
            field_j = -61;
            return;
          }
        }
    }

    final static void a(int param0, byte param1, java.applet.Applet param2, String[] param3, int param4, int param5) {
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              lf.field_c = param2.getParameter("overxgames");
              if (lf.field_c != null) {
                break L1;
              } else {
                lf.field_c = "0";
                break L1;
              }
            }
            L2: {
              pl.field_a = param2.getParameter("overxachievements");
              if (pl.field_a == null) {
                pl.field_a = "0";
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var6 = param2.getParameter("currency");
              if (var6 == null) {
                ml.field_j = 2;
                break L3;
              } else {
                if (!tk.a(10, (CharSequence) (Object) var6)) {
                  ml.field_j = 2;
                  break L3;
                } else {
                  ml.field_j = th.a(103, (CharSequence) (Object) var6);
                  break L3;
                }
              }
            }
            hd.field_t = param0;
            var7 = -51 / ((param1 - 18) / 56);
            pl.field_d = param5;
            uh.field_a = param4;
            il.field_e = new hj[param3.length];
            var8 = 0;
            L4: while (true) {
              if (param3.length <= var8) {
                tb.field_c = param3;
                break L0;
              } else {
                il.field_e[var8] = new hj(317, 34);
                var8++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var6_ref;
            stackOut_16_1 = new StringBuilder().append("o.GA(").append(param0).append(44).append(param1).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    protected o() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
