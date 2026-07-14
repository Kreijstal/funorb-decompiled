/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends ac implements ae {
    static String[] field_nb;
    private oa field_ob;
    static pm field_kb;
    static rf field_sb;
    static java.lang.reflect.Method field_rb;
    static String field_jb;
    static gk[] field_qb;
    static java.math.BigInteger field_ib;
    static String field_pb;
    static int[] field_lb;
    static String[] field_mb;

    final static void m(int param0) {
        qf.field_e = new ol(an.field_a, od.field_g, hg.field_e, bd.field_f, (gh) (Object) ol.field_Tb, qb.field_K);
        if (param0 != -6) {
            boolean discarded$0 = jd.a('{', -67);
        }
    }

    private final void c(boolean param0) {
        if (!param0) {
            field_lb = null;
            if (!(((jd) this).field_Q)) {
                return;
            }
            ((jd) this).field_Q = false;
            return;
        }
        if (!(((jd) this).field_Q)) {
            return;
        }
        ((jd) this).field_Q = false;
    }

    jd(ka param0, hm param1) {
        super(param0, 200, 150);
        Object var5 = null;
        lh var6 = null;
        String var7 = null;
        lh var8 = null;
        String var9 = null;
        lh var10 = null;
        String var11 = null;
        lh var12 = null;
        String var13 = null;
        lh var14 = null;
        var5 = null;
        if (param1 == ra.field_a) {
          var13 = r.field_p;
          var14 = new lh(var13, (tn) null);
          var14.field_o = 0;
          var14.field_z = 50;
          var14.field_E = 80;
          var14.field_x = ((jd) this).field_x;
          var14.field_p = (qk) (Object) new cn(rc.field_m, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((jd) this).a(var14, -107);
          ((jd) this).field_ob = this.a((tn) this, jf.field_cb, 104);
        } else {
          if (wh.field_b == param1) {
            var9 = ff.field_gb;
            ((jd) this).field_E = ((jd) this).field_E + 10;
            if (ph.b(12412)) {
              ((jd) this).field_E = ((jd) this).field_E + 20;
              var11 = tm.field_a;
              var12 = new lh(var11, (tn) null);
              var12.field_o = 0;
              var12.field_z = 50;
              var12.field_E = 80;
              var12.field_x = ((jd) this).field_x;
              var12.field_p = (qk) (Object) new cn(rc.field_m, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((jd) this).a(var12, -107);
              ((jd) this).field_ob = this.a((tn) this, jf.field_cb, 104);
            } else {
              var10 = new lh(var9, (tn) null);
              var10.field_o = 0;
              var10.field_z = 50;
              var10.field_E = 80;
              var10.field_x = ((jd) this).field_x;
              var10.field_p = (qk) (Object) new cn(rc.field_m, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((jd) this).a(var10, -107);
              ((jd) this).field_ob = this.a((tn) this, jf.field_cb, 104);
            }
          } else {
            if (im.field_a == param1) {
              ((jd) this).field_E = ((jd) this).field_E + 30;
              var7 = sl.field_q;
              var8 = new lh(var7, (tn) null);
              var8.field_o = 0;
              var8.field_z = 50;
              var8.field_E = 80;
              var8.field_x = ((jd) this).field_x;
              var8.field_p = (qk) (Object) new cn(rc.field_m, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((jd) this).a(var8, -107);
              ((jd) this).field_ob = this.a((tn) this, jf.field_cb, 104);
            } else {
              var6 = new lh((String) var5, (tn) null);
              var6.field_o = 0;
              var6.field_z = 50;
              var6.field_E = 80;
              var6.field_x = ((jd) this).field_x;
              var6.field_p = (qk) (Object) new cn(rc.field_m, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((jd) this).a(var6, -107);
              ((jd) this).field_ob = this.a((tn) this, jf.field_cb, 104);
            }
          }
        }
    }

    private final oa a(tn param0, String param1, int param2) {
        oa var4 = null;
        int var5 = 0;
        var4 = new oa(param1, param0);
        var4.field_p = (qk) (Object) new kh();
        var5 = ((jd) this).field_E + -6;
        ((jd) this).field_E = ((jd) this).field_E + 38;
        var4.a(15, (byte) -127, var5, -14 + (((jd) this).field_x + -16), 30);
        ((jd) this).a((lh) (Object) var4, -113);
        if (param2 < 86) {
          this.c(true);
          ((jd) this).e((byte) 82);
          return var4;
        } else {
          ((jd) this).e((byte) 82);
          return var4;
        }
    }

    public final void a(int param0, byte param1, int param2, oa param3, int param4) {
        int var6 = -73 / ((param1 - -85) / 36);
        if (!(param3 != ((jd) this).field_ob)) {
            this.c(true);
        }
    }

    final static boolean a(char param0, int param1) {
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        if (param1 == -33) {
          if (param0 != 160) {
            if (param0 != 32) {
              if (param0 != 95) {
                if (param0 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                return stackIn_9_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static String a(CharSequence param0, boolean param1, int param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = SteelSentinels.field_G;
        if (param0 == null) {
          return lk.field_Y;
        } else {
          var3 = param0.length();
          if ((var3 ^ -1) <= -2) {
            if (-13 <= (var3 ^ -1)) {
              var4 = ui.a(1, param0);
              if (var4 == null) {
                return lk.field_Y;
              } else {
                if (var4.length() >= 1) {
                  L0: {
                    if (jd.a(var4.charAt(0), -33)) {
                      break L0;
                    } else {
                      if (jd.a(var4.charAt(var4.length() + -1), -33)) {
                        break L0;
                      } else {
                        var5 = 0;
                        if (param2 >= 81) {
                          var6 = 0;
                          L1: while (true) {
                            if (param0.length() <= var6) {
                              if (0 < var5) {
                                return ad.field_g;
                              } else {
                                return null;
                              }
                            } else {
                              L2: {
                                var7 = param0.charAt(var6);
                                if (!jd.a((char) var7, -33)) {
                                  var5 = 0;
                                  break L2;
                                } else {
                                  var5++;
                                  break L2;
                                }
                              }
                              if (-3 < (var5 ^ -1)) {
                                var6++;
                                var6++;
                                continue L1;
                              } else {
                                if (!param1) {
                                  return jb.field_Q;
                                } else {
                                  var6++;
                                  continue L1;
                                }
                              }
                            }
                          }
                        } else {
                          return null;
                        }
                      }
                    }
                  }
                  return ad.field_g;
                } else {
                  return lk.field_Y;
                }
              }
            } else {
              return lk.field_Y;
            }
          } else {
            return lk.field_Y;
          }
        }
    }

    public static void l(int param0) {
        field_pb = null;
        field_kb = null;
        field_sb = null;
        field_lb = null;
        field_qb = null;
        field_ib = null;
        field_rb = null;
        field_jb = null;
        field_mb = null;
        field_nb = null;
        if (param0 != 0) {
            Object var2 = null;
            String discarded$0 = jd.a((CharSequence) null, true, -55);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_nb = new String[]{"Fusion<nbsp>reaver", "EMP<nbsp>laceration", "Hammer<nbsp>strike"};
        field_sb = new rf();
        field_pb = "Options";
        field_lb = new int[8192];
        field_jb = "Save favourite";
        field_ib = new java.math.BigInteger("65537");
        field_mb = new String[]{"DESTINY!", "ROSEBUD!", "NOT YET!", "IS THIS ALL THERE IS?", "I THIRST!", "WHY?", "IT IS ALL TRUE!"};
    }
}
