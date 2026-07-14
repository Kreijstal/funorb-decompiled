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
        if (param0 != -1) {
            return;
        }
        bm.field_d.b((byte) 74, (pj) (Object) na.field_c);
    }

    public static void a(byte param0) {
        field_i = null;
        int var1 = 107 % ((param0 - 8) / 51);
    }

    final void c(int param0) {
        if (((o) this).field_g == null) {
            return;
        }
        ((o) this).field_g.field_f = ((o) this).field_f;
        ((o) this).field_f.field_g = ((o) this).field_g;
        ((o) this).field_f = null;
        if (param0 != -1) {
            Object var3 = null;
            o.a(5, (byte) -99, (java.applet.Applet) null, (String[]) null, 44, -56);
            ((o) this).field_g = null;
            return;
        }
        ((o) this).field_g = null;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        te.field_O = 0;
        kk.field_S = param3;
        bk.field_e = param0;
        if (!b.a((byte) 112, kk.field_S)) {
            if (param1 == 2) {
                return;
            }
            field_j = -61;
            return;
        }
        int var4 = 0;
        if (!((kk.field_S ^ -1) != -8)) {
            var4 = -1;
        }
        nc.field_cb[kk.field_S].a((byte) -108, var4, param2);
        if ((kk.field_S ^ -1) != -8) {
            if (param1 == 2) {
                return;
            }
            field_j = -61;
            return;
        }
        vk.a(0, param2);
        if (param1 != 2) {
            field_j = -61;
            return;
        }
    }

    final static void a(int param0, byte param1, java.applet.Applet param2, String[] param3, int param4, int param5) {
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = OrbDefence.field_D ? 1 : 0;
        lf.field_c = param2.getParameter("overxgames");
        if (lf.field_c != null) {
          L0: {
            pl.field_a = param2.getParameter("overxachievements");
            if (pl.field_a == null) {
              pl.field_a = "0";
              break L0;
            } else {
              break L0;
            }
          }
          var6 = param2.getParameter("currency");
          if (var6 == null) {
            ml.field_j = 2;
            hd.field_t = param0;
            var7 = -51 / ((param1 - 18) / 56);
            pl.field_d = param5;
            uh.field_a = param4;
            il.field_e = new hj[param3.length];
            var8 = 0;
            L1: while (true) {
              if (param3.length <= var8) {
                tb.field_c = param3;
                return;
              } else {
                il.field_e[var8] = new hj(317, 34);
                var8++;
                continue L1;
              }
            }
          } else {
            if (!tk.a(10, (CharSequence) (Object) var6)) {
              ml.field_j = 2;
              hd.field_t = param0;
              var7 = -51 / ((param1 - 18) / 56);
              pl.field_d = param5;
              uh.field_a = param4;
              il.field_e = new hj[param3.length];
              var8 = 0;
              L2: while (true) {
                if (param3.length <= var8) {
                  tb.field_c = param3;
                  return;
                } else {
                  il.field_e[var8] = new hj(317, 34);
                  var8++;
                  continue L2;
                }
              }
            } else {
              ml.field_j = th.a(103, (CharSequence) (Object) var6);
              hd.field_t = param0;
              var7 = -51 / ((param1 - 18) / 56);
              pl.field_d = param5;
              uh.field_a = param4;
              il.field_e = new hj[param3.length];
              var8 = 0;
              L3: while (true) {
                if (param3.length <= var8) {
                  tb.field_c = param3;
                  return;
                } else {
                  il.field_e[var8] = new hj(317, 34);
                  var8++;
                  continue L3;
                }
              }
            }
          }
        } else {
          L4: {
            lf.field_c = "0";
            pl.field_a = param2.getParameter("overxachievements");
            if (pl.field_a == null) {
              pl.field_a = "0";
              break L4;
            } else {
              break L4;
            }
          }
          var6 = param2.getParameter("currency");
          if (var6 == null) {
            ml.field_j = 2;
            hd.field_t = param0;
            var7 = -51 / ((param1 - 18) / 56);
            pl.field_d = param5;
            uh.field_a = param4;
            il.field_e = new hj[param3.length];
            var8 = 0;
            L5: while (true) {
              if (param3.length <= var8) {
                tb.field_c = param3;
                return;
              } else {
                il.field_e[var8] = new hj(317, 34);
                var8++;
                continue L5;
              }
            }
          } else {
            if (!tk.a(10, (CharSequence) (Object) var6)) {
              ml.field_j = 2;
              hd.field_t = param0;
              var7 = -51 / ((param1 - 18) / 56);
              pl.field_d = param5;
              uh.field_a = param4;
              il.field_e = new hj[param3.length];
              var8 = 0;
              L6: while (true) {
                if (param3.length <= var8) {
                  tb.field_c = param3;
                  return;
                } else {
                  il.field_e[var8] = new hj(317, 34);
                  var8++;
                  continue L6;
                }
              }
            } else {
              ml.field_j = th.a(103, (CharSequence) (Object) var6);
              hd.field_t = param0;
              var7 = -51 / ((param1 - 18) / 56);
              pl.field_d = param5;
              uh.field_a = param4;
              il.field_e = new hj[param3.length];
              var8 = 0;
              L7: while (true) {
                if (param3.length <= var8) {
                  tb.field_c = param3;
                  return;
                } else {
                  il.field_e[var8] = new hj(317, 34);
                  var8++;
                  continue L7;
                }
              }
            }
          }
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
