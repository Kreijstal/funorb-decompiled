/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    static int field_a;

    final static void a(int param0, byte param1) {
        int var3 = 0;
        he var4 = null;
        sa var5 = null;
        var3 = Bounce.field_N;
        var4 = (he) (Object) of.field_b.a((byte) -105);
        if (param1 == -29) {
          L0: while (true) {
            if (var4 == null) {
              var5 = (sa) (Object) jl.field_f.a((byte) -58);
              L1: while (true) {
                if (var5 != null) {
                  ha.a(-17765, var5, param0);
                  var5 = (sa) (Object) jl.field_f.d((byte) -29);
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              mi.a(param0, -115, var4);
              var4 = (he) (Object) of.field_b.d((byte) -18);
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, String param1, boolean param2, boolean param3) {
        ig.a(-92);
        q.field_N.k(-20281);
        if (param0 != 4) {
          field_a = 22;
          vk.field_c = new ci(gi.field_b, (String) null, fe.field_g, param3, param2);
          ed.field_c = new ec(q.field_N, (lk) (Object) vk.field_c);
          q.field_N.b((lk) (Object) ed.field_c, false);
          return;
        } else {
          vk.field_c = new ci(gi.field_b, (String) null, fe.field_g, param3, param2);
          ed.field_c = new ec(q.field_N, (lk) (Object) vk.field_c);
          q.field_N.b((lk) (Object) ed.field_c, false);
          return;
        }
    }

    final static String a(boolean param0, CharSequence[] param1) {
        if (!param0) {
            return null;
        }
        return lh.a(-121, param1.length, param1, 0);
    }

    final static o a(gk param0, gk param1, byte param2, int param3, int param4) {
        int var5 = 0;
        var5 = -80 % ((51 - param2) / 48);
        if (!c.a(param0, false, param4, param3)) {
          return null;
        } else {
          return gi.a(param1.b(-127, param3, param4), 41);
        }
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4 = 0;
        var4 = 0;
        if (!param1) {
          if (param2 != 4) {
            L0: {
              field_a = 22;
              if (param0) {
                var4 += 2;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (param3) {
                var4++;
                break L1;
              } else {
                break L1;
              }
            }
            return vg.field_a[var4];
          } else {
            L2: {
              if (param0) {
                var4 += 2;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param3) {
                var4++;
                break L3;
              } else {
                break L3;
              }
            }
            return vg.field_a[var4];
          }
        } else {
          var4 += 4;
          if (param2 == 4) {
            L4: {
              if (param0) {
                var4 += 2;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param3) {
                var4++;
                break L5;
              } else {
                break L5;
              }
            }
            return vg.field_a[var4];
          } else {
            L6: {
              field_a = 22;
              if (param0) {
                var4 += 2;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (param3) {
                var4++;
                break L7;
              } else {
                break L7;
              }
            }
            return vg.field_a[var4];
          }
        }
    }

    final static void a(int param0, int param1, String param2, int param3, int param4, int param5, si param6, int param7, int param8) {
        bd.field_l = param2;
        a.field_a = param4;
        if (param3 != 0) {
          return;
        } else {
          vc.field_G = param6;
          mf.field_e = param0;
          fi.field_c = param5;
          pe.field_c = param1;
          uj.field_s = param7;
          fk.field_d = param8;
          tb.field_p = (v) (Object) new tb();
          hb.field_F = new vi(param6);
          ih.field_Q = new oj(tb.field_p, hb.field_F);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
