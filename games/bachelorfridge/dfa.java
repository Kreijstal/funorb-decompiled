/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dfa {
    static int field_b;
    static int[] field_c;
    boolean field_a;

    final static void a(int param0, int param1, int param2, int param3, byte[] param4, int param5, sna param6, sna param7, int param8, sna param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = BachelorFridge.field_y;
        ge.field_F = -1L;
        mja.field_s = param4;
        kb.field_j = param5;
        ld.field_q = param4.length;
        fia.field_r = new byte[(7 + kb.field_j) / 8];
        ce.field_y = false;
        rv.field_n = null;
        pw.field_w = null;
        var10 = 0;
        var11 = param3;
        L0: while (true) {
          if (mja.field_s.length <= var11) {
            var10 = (7 + var10) / 8;
            sca.field_c = new byte[var10];
            if (param9.field_z != null) {
              L1: {
                aa.field_l = param9.field_z;
                aa.field_l.d(99);
                iga.field_c = new wma(param2);
                wk.field_a = -1;
                ui.field_q = -1;
                hja.field_i = 0;
                hc.field_J = 0;
                if (null != param7.field_z) {
                  break L1;
                } else {
                  param7.field_z = new eaa();
                  break L1;
                }
              }
              uma.field_M = param7.field_z;
              uma.field_M.d(param3 + 91);
              ola.field_g = new wma(param8);
              if (null == param6.field_z) {
                param6.field_z = new eaa();
                bia.field_g = param6.field_z;
                bia.field_g.d(param3 + 92);
                wi.field_i = new wma(param1);
                wda.field_a = 0L;
                kla.field_x = param0;
                return;
              } else {
                bia.field_g = param6.field_z;
                bia.field_g.d(param3 + 92);
                wi.field_i = new wma(param1);
                wda.field_a = 0L;
                kla.field_x = param0;
                return;
              }
            } else {
              param9.field_z = new eaa();
              aa.field_l = param9.field_z;
              aa.field_l.d(99);
              iga.field_c = new wma(param2);
              wk.field_a = -1;
              ui.field_q = -1;
              hja.field_i = 0;
              hc.field_J = 0;
              if (null == param7.field_z) {
                param7.field_z = new eaa();
                uma.field_M = param7.field_z;
                uma.field_M.d(param3 + 91);
                ola.field_g = new wma(param8);
                if (null != param6.field_z) {
                  bia.field_g = param6.field_z;
                  bia.field_g.d(param3 + 92);
                  wi.field_i = new wma(param1);
                  wda.field_a = 0L;
                  kla.field_x = param0;
                  return;
                } else {
                  param6.field_z = new eaa();
                  bia.field_g = param6.field_z;
                  bia.field_g.d(param3 + 92);
                  wi.field_i = new wma(param1);
                  wda.field_a = 0L;
                  kla.field_x = param0;
                  return;
                }
              } else {
                uma.field_M = param7.field_z;
                uma.field_M.d(param3 + 91);
                ola.field_g = new wma(param8);
                if (null == param6.field_z) {
                  param6.field_z = new eaa();
                  bia.field_g = param6.field_z;
                  bia.field_g.d(param3 + 92);
                  wi.field_i = new wma(param1);
                  wda.field_a = 0L;
                  kla.field_x = param0;
                  return;
                } else {
                  bia.field_g = param6.field_z;
                  bia.field_g.d(param3 + 92);
                  wi.field_i = new wma(param1);
                  wda.field_a = 0L;
                  kla.field_x = param0;
                  return;
                }
              }
            }
          } else {
            var10 = var10 + (255 & mja.field_s[var11]);
            var11++;
            continue L0;
          }
        }
    }

    final void a(int param0, boolean param1) {
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        if (0 != hp.field_c) {
          hp.field_c = 0;
          kj.b((byte) -88);
          if (param0 != 8) {
            ((dfa) this).field_a = true;
            return;
          } else {
            return;
          }
        } else {
          if (!hs.a(false, nga.field_i)) {
            lg.a(true, 0, param1);
            if (param0 == 8) {
              return;
            } else {
              ((dfa) this).field_a = true;
              return;
            }
          } else {
            lg.a(true, 8, param1);
            if (param0 == 8) {
              return;
            } else {
              ((dfa) this).field_a = true;
              return;
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[4];
    }
}
