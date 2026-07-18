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
        field_mb = null;
    }

    final static void n(int param0) {
        int var1_int = 0;
        kg var4 = null;
        kg var5 = null;
        kg var6 = null;
        kg var7 = null;
        int var3 = CrazyCrystals.field_B;
        try {
            uh.field_n = false;
            r.field_m = true;
            go.field_i = false;
            q.field_a = new vh[3];
            for (var1_int = 0; var1_int < 3; var1_int++) {
                q.field_a[var1_int] = new vh();
            }
            var4 = kg.a(wm.field_a, 100, 0);
            var4.f(-1);
            ck.field_db = new am(var4);
            var5 = kg.a(fb.field_c, 100, 0);
            var5.f(-1);
            vk.field_N = new am(var5);
            var6 = kg.a(pe.field_h, 100, 0);
            var6.f(-1);
            fp.field_c = new am(var6);
            var7 = kg.a(nj.field_c, 100, 0);
            var7.f(-1);
            aa.field_a = new am(var7);
            nh.field_F = je.field_j;
            sb.field_F = b.field_a;
            fl.field_g = fp.field_a;
            int var2 = 0;
            sm.field_e = we.field_h;
            ll.a(-84, true, true);
            ld.field_y = 0;
            ue.field_c = true;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "sa.T(" + -26 + ')');
        }
    }

    sa(ol param0, dc param1) {
        super(param0, mo.field_m, vn.field_i, false, false);
        try {
            ((sa) this).field_pb = param1;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "sa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, boolean param1, si param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        jd var5 = null;
        int var6 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              ((sa) this).field_sb = true;
              if (param2.field_b) {
                var4_ref = td.field_a;
                break L1;
              } else {
                if (null == param2.field_d) {
                  var4_ref = param2.field_h;
                  if (param2.field_g != 248) {
                    break L1;
                  } else {
                    L2: {
                      if (!param1) {
                        ge.a((byte) -62);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    ((sa) this).field_ob = true;
                    var4_ref = on.field_c;
                    break L1;
                  }
                } else {
                  var4_ref = db.field_f;
                  if (((sa) this).field_pb != null) {
                    ((sa) this).field_pb.a(param0 ^ -21);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            var5 = new jd((na) this, mo.field_m, var4_ref);
            if (param0 == -1) {
              L3: {
                L4: {
                  if (param2.field_b) {
                    if (!param2.field_f) {
                      pc discarded$2 = var5.a(go.field_j, (bi) this, 39);
                      break L4;
                    } else {
                      ((sa) this).a((qm) (Object) new ph((sa) this), (byte) -50);
                      return;
                    }
                  } else {
                    L5: {
                      if (((sa) this).field_ob) {
                        pc discarded$3 = var5.a(go.field_j, (bi) this, 117);
                        break L5;
                      } else {
                        if (param2.field_g != 5) {
                          var5.a(cf.field_h, (byte) -124, -1);
                          break L5;
                        } else {
                          var5.a(ng.field_i, (byte) -124, 11);
                          var5.a(dn.field_c, (byte) -124, 17);
                          break L5;
                        }
                      }
                    }
                    if (param2.field_g != 3) {
                      if (6 == param2.field_g) {
                        var5.a(sb.field_C, (byte) -124, 9);
                        break L4;
                      } else {
                        ((sa) this).a((qm) (Object) var5, (byte) -50);
                        break L3;
                      }
                    } else {
                      var5.a(ik.field_f, (byte) -124, 7);
                      break L4;
                    }
                  }
                }
                ((sa) this).a((qm) (Object) var5, (byte) -50);
                break L3;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var4;
            stackOut_31_1 = new StringBuilder().append("sa.U(").append(param0).append(',').append(param1).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L6;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L6;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ')');
        }
    }

    public final void a(byte param0, int param1, int param2, int param3, pc param4) {
        if (!(!((sa) this).field_ob)) {
            vk.a(-40, true, false);
            return;
        }
        try {
            ro.g(108);
            ((sa) this).i((byte) -121);
            int var6_int = 62 / ((param0 - 83) / 36);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "sa.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_rb = "Click";
    }
}
