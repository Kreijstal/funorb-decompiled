/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends rqa {
    static volatile int field_q;
    static String field_o;
    static String field_p;

    final static void a(int param0) {
        int var4 = VoidHunters.field_G;
        if (param0 != -19689) {
            Object var5 = null;
            am.a((byte[]) null, (llb) null, -17, -59, (llb) null, false, 76, 14, -115, (llb) null);
        }
        int[] var6 = bs.field_b;
        int[] var1 = var6;
        int var2 = 0;
        int var3 = var6.length;
        while (var3 > var2) {
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4) {
        if (param0 > -107) {
            field_q = -69;
        }
        if (li.field_i) {
            // ifeq L58
            rj.a(og.field_r, param4, param1, param2, param3);
        } else {
            sa.a(param4, param1, param2, param3 & 16777215, param3 >>> 1259093784);
        }
    }

    final static void a(byte[] param0, llb param1, int param2, int param3, llb param4, boolean param5, int param6, int param7, int param8, llb param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = VoidHunters.field_G;
        wqa.field_a = -1L;
        vu.field_zb = param0;
        sea.field_o = param6;
        ocb.field_l = param0.length;
        lqa.field_o = null;
        ii.field_h = false;
        ohb.field_o = null;
        ce.field_o = new byte[(7 + sea.field_o) / 8];
        var10 = 0;
        var11 = 0;
        L0: while (true) {
          if (var11 >= vu.field_zb.length) {
            L1: {
              var10 = (var10 + 7) / 8;
              nkb.field_p = new byte[var10];
              if (param9.field_lb == null) {
                param9.field_lb = new ij();
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              cta.field_q = param9.field_lb;
              cta.field_q.e(109);
              oha.field_o = new pr(param3);
              cla.field_b = -1;
              qea.field_p = 0;
              paa.field_q = 0;
              tg.field_q = -1;
              if (null == param4.field_lb) {
                param4.field_lb = new ij();
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              kja.field_E = param4.field_lb;
              kja.field_E.e(118);
              ks.field_r = new pr(param8);
              if (null == param1.field_lb) {
                param1.field_lb = new ij();
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              mea.field_e = param1.field_lb;
              mea.field_e.e(93);
              icb.field_p = new pr(param2);
              ktb.field_p = param7;
              if (param5) {
                break L4;
              } else {
                field_p = null;
                break L4;
              }
            }
            qga.field_a = 0L;
            return;
          } else {
            var10 = var10 + (vu.field_zb[var11] & 255);
            var11++;
            continue L0;
          }
        }
    }

    am(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(int param0) {
        field_p = null;
        field_o = null;
        if (param0 != -1) {
            field_p = null;
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            am.e(28);
        }
        return new nc((Object) (Object) frb.a(136, 77));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Your ignore list is full. Max of 100 hit.";
        field_p = "Loading fonts";
        field_q = 0;
    }
}
