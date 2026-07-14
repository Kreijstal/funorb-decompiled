/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn extends ob implements vb {
    private ag field_V;
    static String field_kb;
    static le field_ob;
    static String field_lb;
    static String field_pb;
    static vn field_mb;
    static String field_nb;
    static String field_jb;

    final static void a(int param0, int param1) {
        fd.field_d = 1000000000L / (long)param1;
        if (param0 != 16) {
            field_nb = null;
        }
    }

    final static int k(byte param0) {
        if (param0 != -14) {
            return -111;
        }
        return hd.field_b + ((on.field_h << -1331160988) - -(ra.field_m << 222225474));
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        if (!param0) {
          L0: {
            qn.a(-13, -64, -6, 93, true, 96, 127);
            if (((qn) this).field_V == param4) {
              this.g(109);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((qn) this).field_V == param4) {
              this.g(109);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    private final ag a(wc param0, String param1, byte param2) {
        ag var4 = null;
        int var5 = 0;
        var4 = new ag(param1, param0);
        var4.field_r = (pf) (Object) new mm();
        var5 = ((qn) this).field_k - 6;
        ((qn) this).field_k = ((qn) this).field_k + 38;
        var4.a(30, var5, -14 + (((qn) this).field_v + -16), 15, -128);
        if (param2 <= 1) {
          return null;
        } else {
          ((qn) this).c(-110, (qm) (Object) var4);
          ((qn) this).e((byte) 86);
          return var4;
        }
    }

    final static void a(int param0, eg param1, eg param2) {
        bb.field_a = param2;
        an.field_o = param1;
        if (param0 != -24539) {
            boolean discarded$0 = qn.a(-80, (byte) 86);
        }
    }

    final static void i(int param0) {
        tf var1 = null;
        int var2 = 0;
        var2 = ArcanistsMulti.field_G ? 1 : 0;
        rc.field_m = 0;
        ie.field_Nb = null;
        pc.field_b = 0;
        vd.field_d.c(-124);
        oo.field_B.c(-124);
        var1 = ie.field_Qb.f(-118);
        L0: while (true) {
          if (var1 == null) {
            if (param0 >= 30) {
              var1 = uc.field_c.f(-63);
              L1: while (true) {
                if (var1 == null) {
                  jb.field_t = 0;
                  return;
                } else {
                  var1.a((byte) 88);
                  var1 = uc.field_c.a(-1);
                  continue L1;
                }
              }
            } else {
              field_ob = null;
              var1 = uc.field_c.f(-63);
              L2: while (true) {
                if (var1 == null) {
                  jb.field_t = 0;
                  return;
                } else {
                  var1.a((byte) 88);
                  var1 = uc.field_c.a(-1);
                  continue L2;
                }
              }
            }
          } else {
            var1.a((byte) 88);
            var1 = ie.field_Qb.a(-1);
            continue L0;
          }
        }
    }

    private final void g(int param0) {
        if (param0 < 33) {
            return;
        }
        if (!((qn) this).field_G) {
            return;
        }
        ((qn) this).field_G = false;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        String var7 = null;
        Object var8 = null;
        L0: {
          if (nj.field_c != 2) {
            var7 = vk.field_v;
            break L0;
          } else {
            var7 = ji.field_e;
            break L0;
          }
        }
        if (param1 > -50) {
          var8 = null;
          qn.a(10, (eg) null, (eg) null);
          uf.a(param5, param2, param6, param4, -7361, var7, param3, param0);
          return;
        } else {
          uf.a(param5, param2, param6, param4, -7361, var7, param3, param0);
          return;
        }
    }

    final static boolean a(int param0, byte param1) {
        int stackIn_13_0 = 0;
        int stackOut_11_0 = 0;
        if (param1 < -6) {
          if (-3 != (param0 ^ -1)) {
            if (param0 != 3) {
              if (4 != param0) {
                if (param0 != 1) {
                  if (param0 != 14) {
                    if (-6 == (param0 ^ -1)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_11_0 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    return stackIn_13_0 != 0;
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
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    public static void h(int param0) {
        if (param0 != 1) {
          int discarded$2 = qn.k((byte) 17);
          field_nb = null;
          field_lb = null;
          field_jb = null;
          field_ob = null;
          field_mb = null;
          field_pb = null;
          field_kb = null;
          return;
        } else {
          field_nb = null;
          field_lb = null;
          field_jb = null;
          field_ob = null;
          field_mb = null;
          field_pb = null;
          field_kb = null;
          return;
        }
    }

    qn(h param0, ih param1) {
        super(param0, 200, 150);
        String var5 = null;
        qm var6 = null;
        String var7 = null;
        qm var8 = null;
        Object var9 = null;
        qm var10 = null;
        String var11 = null;
        qm var12 = null;
        String var13 = null;
        qm var14 = null;
        var9 = null;
        if (oo.field_C == param1) {
          var13 = wi.field_j;
          var14 = new qm(var13, (wc) null);
          var14.field_v = ((qn) this).field_v;
          var14.field_j = 50;
          var14.field_k = 80;
          var14.field_n = 0;
          var14.field_r = (pf) (Object) new jm(vc.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((qn) this).c(-86, var14);
          ((qn) this).field_V = this.a((wc) this, dd.field_e, (byte) 113);
        } else {
          if (param1 != vi.field_C) {
            if (param1 == bh.field_c) {
              ((qn) this).field_k = ((qn) this).field_k + 30;
              var11 = fl.field_d;
              var12 = new qm(var11, (wc) null);
              var12.field_v = ((qn) this).field_v;
              var12.field_j = 50;
              var12.field_k = 80;
              var12.field_n = 0;
              var12.field_r = (pf) (Object) new jm(vc.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((qn) this).c(-86, var12);
              ((qn) this).field_V = this.a((wc) this, dd.field_e, (byte) 113);
            } else {
              var10 = new qm((String) var9, (wc) null);
              var10.field_v = ((qn) this).field_v;
              var10.field_j = 50;
              var10.field_k = 80;
              var10.field_n = 0;
              var10.field_r = (pf) (Object) new jm(vc.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((qn) this).c(-86, var10);
              ((qn) this).field_V = this.a((wc) this, dd.field_e, (byte) 113);
            }
          } else {
            ((qn) this).field_k = ((qn) this).field_k + 10;
            var5 = ki.field_w;
            if (ne.b(-22768)) {
              ((qn) this).field_k = ((qn) this).field_k + 20;
              var7 = ch.field_f;
              var8 = new qm(var7, (wc) null);
              var8.field_v = ((qn) this).field_v;
              var8.field_j = 50;
              var8.field_k = 80;
              var8.field_n = 0;
              var8.field_r = (pf) (Object) new jm(vc.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((qn) this).c(-86, var8);
              ((qn) this).field_V = this.a((wc) this, dd.field_e, (byte) 113);
            } else {
              var6 = new qm(var5, (wc) null);
              var6.field_v = ((qn) this).field_v;
              var6.field_j = 50;
              var6.field_k = 80;
              var6.field_n = 0;
              var6.field_r = (pf) (Object) new jm(vc.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((qn) this).c(-86, var6);
              ((qn) this).field_V = this.a((wc) this, dd.field_e, (byte) 113);
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_kb = "Unit cannot use this ability after being damaged";
        field_lb = "Continue";
        field_pb = "Join";
        field_mb = new vn();
        field_nb = "Report abuse";
        field_jb = "With spells like this, you just need to click on the location you wish the effect to be centred on and the spell will be activated. Try clicking on a target.";
    }
}
