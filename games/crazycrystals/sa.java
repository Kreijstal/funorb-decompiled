/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends na implements vd {
    static dl[] field_qb;
    static lb field_lb;
    private boolean field_ob;
    static am field_mb;
    private dc field_pb;
    static String field_rb;
    static ko field_nb;
    private boolean field_sb;

    final boolean g(byte param0) {
        si var2 = null;
        if (((sa) this).field_C) {
            if (!((sa) this).field_sb) {
                var2 = jd.f((byte) 93);
                if (!(var2 == null)) {
                    this.a(-1, false, var2);
                }
            }
        }
        if (param0 != 8) {
            Object var3 = null;
            this.a(-88, true, (si) null);
        }
        return super.g((byte) 8);
    }

    final void o(int param0) {
        if (param0 < 85) {
            Object var3 = null;
            ((sa) this).a((byte) -11, -96, 75, -54, (pc) null);
        }
        this.a(-1, true, me.a(on.field_c, 20, 248));
    }

    public static void d(boolean param0) {
        field_nb = null;
        field_qb = null;
        field_rb = null;
        field_lb = null;
        if (param0) {
            field_mb = null;
        }
        field_mb = null;
    }

    final static void n(int param0) {
        int var1 = 0;
        int var3 = CrazyCrystals.field_B;
        uh.field_n = false;
        r.field_m = true;
        go.field_i = false;
        q.field_a = new vh[3];
        for (var1 = 0; var1 < 3; var1++) {
            q.field_a[var1] = new vh();
        }
        kg var4 = kg.a(wm.field_a, 100, 0);
        var4.f(-1);
        ck.field_db = new am(var4);
        kg var5 = kg.a(fb.field_c, 100, 0);
        var5.f(-1);
        vk.field_N = new am(var5);
        kg var6 = kg.a(pe.field_h, 100, 0);
        var6.f(-1);
        fp.field_c = new am(var6);
        kg var7 = kg.a(nj.field_c, 100, 0);
        var7.f(-1);
        aa.field_a = new am(var7);
        nh.field_F = je.field_j;
        sb.field_F = b.field_a;
        fl.field_g = fp.field_a;
        int var2 = 110 % ((param0 - 27) / 50);
        sm.field_e = we.field_h;
        ll.a(-84, true, true);
        ld.field_y = 0;
        ue.field_c = true;
    }

    sa(ol param0, dc param1) {
        super(param0, mo.field_m, vn.field_i, false, false);
        ((sa) this).field_pb = param1;
    }

    private final void a(int param0, boolean param1, si param2) {
        String var4 = null;
        jd var5 = null;
        int var6 = 0;
        L0: {
          var6 = CrazyCrystals.field_B;
          ((sa) this).field_sb = true;
          if (param2.field_b) {
            var4 = td.field_a;
            break L0;
          } else {
            if (null == param2.field_d) {
              var4 = param2.field_h;
              if (-249 != (param2.field_g ^ -1)) {
                break L0;
              } else {
                L1: {
                  if (!param1) {
                    ge.a((byte) -62);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((sa) this).field_ob = true;
                var4 = on.field_c;
                break L0;
              }
            } else {
              var4 = db.field_f;
              if (((sa) this).field_pb != null) {
                ((sa) this).field_pb.a(param0 ^ -21);
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        var5 = new jd((na) this, mo.field_m, var4);
        if (param0 == -1) {
          L2: {
            L3: {
              if (param2.field_b) {
                if (!param2.field_f) {
                  pc discarded$2 = var5.a(go.field_j, (bi) this, 39);
                  break L3;
                } else {
                  ((sa) this).a((qm) (Object) new ph((sa) this), (byte) -50);
                  return;
                }
              } else {
                L4: {
                  if (((sa) this).field_ob) {
                    pc discarded$3 = var5.a(go.field_j, (bi) this, 117);
                    break L4;
                  } else {
                    if (-6 != (param2.field_g ^ -1)) {
                      var5.a(cf.field_h, (byte) -124, -1);
                      break L4;
                    } else {
                      var5.a(ng.field_i, (byte) -124, 11);
                      var5.a(dn.field_c, (byte) -124, 17);
                      break L4;
                    }
                  }
                }
                if (param2.field_g != 3) {
                  if (6 == param2.field_g) {
                    var5.a(sb.field_C, (byte) -124, 9);
                    break L3;
                  } else {
                    ((sa) this).a((qm) (Object) var5, (byte) -50);
                    break L2;
                  }
                } else {
                  var5.a(ik.field_f, (byte) -124, 7);
                  ((sa) this).a((qm) (Object) var5, (byte) -50);
                  break L2;
                }
              }
            }
            ((sa) this).a((qm) (Object) var5, (byte) -50);
            break L2;
          }
          return;
        } else {
          return;
        }
    }

    public final void a(byte param0, int param1, int param2, int param3, pc param4) {
        if (!(!((sa) this).field_ob)) {
            vk.a(-40, true, false);
            return;
        }
        ro.g(108);
        ((sa) this).i((byte) -121);
        int var6 = 62 / ((param0 - 83) / 36);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_rb = "Click";
    }
}
