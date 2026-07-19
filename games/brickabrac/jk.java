/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk extends ki {
    static String field_v;
    static int[] field_r;
    static jp field_t;
    static tj field_w;
    static gb[] field_s;
    static jp field_u;

    final boolean b(byte param0) {
        if (param0 <= -91) {
          if (wm.field_b != null) {
            if (null != hk.field_Q) {
              if (null != n.field_c) {
                if (null != pk.field_a) {
                  if (go.field_d != null) {
                    if (null == sn.field_t) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          field_r = (int[]) null;
          if (wm.field_b != null) {
            if (null != hk.field_Q) {
              if (null != n.field_c) {
                if (null != pk.field_a) {
                  if (go.field_d != null) {
                    if (null == sn.field_t) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
          if (!i.field_m.a("water", -28138)) {
            return false;
          } else {
            go.field_d = pl.a("water", "water_rays", (byte) 116, i.field_m);
            wm.field_b = pl.a("water", "water_near", (byte) 105, i.field_m);
            hk.field_Q = pl.a("water", "water_mid", (byte) 109, i.field_m);
            n.field_c = pl.a("water", "water_far", (byte) -121, i.field_m);
            pk.field_a = pl.a("water", "water_small", (byte) 112, i.field_m);
            sn.field_t = pl.a("water", "water_character", (byte) -43, i.field_m);
            vj.field_b = new jp(n.field_c.field_x, n.field_c.field_z);
            fc.a(-49, vj.field_b);
            n.field_c.g(0, 0);
            sc.b(-81);
            to.field_e = jh.a(0, wm.field_b);
            qj.field_l = jh.a(0, hk.field_Q);
            jg.field_a = jh.a(0, n.field_c);
            ig.field_P = jh.a(0, vj.field_b);
            uo.field_d = new jp(go.field_d.field_x / 2, go.field_d.field_z);
            fc.a(-83, uo.field_d);
            go.field_d.a(0, 0, go.field_d.field_x / 2, go.field_d.field_z);
            sc.b(-114);
            pl.a(n.field_c, 0);
            pl.a(vj.field_b, 0);
            pl.a(jg.field_a, 0);
            pl.a(ig.field_P, 0);
            pl.a(go.field_d, 0);
            pl.a(uo.field_d, 0);
            return true;
          }
        } else {
          return true;
        }
    }

    final jp c(byte param0) {
        if (param0 >= -74) {
            field_t = (jp) null;
            return sn.field_t;
        }
        return sn.field_t;
    }

    jk(int param0, String param1, String param2, int param3) {
        super(param0, param1, param2, param3);
    }

    final static void a(int param0, byte param1) {
        pi var2 = null;
        int var3 = 0;
        var2 = k.field_h;
        var2.e(param1 ^ -13319, param0);
        var2.field_l = var2.field_l + 1;
        var3 = var2.field_l;
        var2.a(6, 2);
        var2.a(rh.field_d, param1 + -99, 0, rh.field_d.length);
        var2.a(-125, bb.field_e);
        var2.a(param1 ^ -12, mf.field_c);
        if (param1 != 98) {
          jk.d((byte) 3);
          var2.a(lj.field_p, -1, 0, lj.field_p.length);
          var2.d((byte) 126, -var3 + var2.field_l);
          return;
        } else {
          var2.a(lj.field_p, -1, 0, lj.field_p.length);
          var2.d((byte) 126, -var3 + var2.field_l);
          return;
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        pb var8 = null;
        pb var9 = null;
        if (param1 <= -84) {
          if (this.b((byte) -95)) {
            L0: {
              var9 = kd.a(this.field_m, param3, (byte) 106);
              if (!var9.a((byte) -84, param3, this.field_m)) {
                hh.a(jg.field_a, -13, 2, var9, -8562, param3, ig.field_P);
                var9.a(this.field_m, param3, (byte) 78);
                break L0;
              } else {
                break L0;
              }
            }
            il.a(param4, to.field_e, var9.field_p, 2, 2, qj.field_l, -13, param3, param0, param2, uo.field_d, 306);
            return;
          } else {
            lb.g(param2, param0, 306, 480, um.field_u[param3], 928072);
            return;
          }
        } else {
          this.a((byte) -90, 97, -35, 25);
          if (this.b((byte) -95)) {
            L1: {
              var8 = kd.a(this.field_m, param3, (byte) 106);
              if (!var8.a((byte) -84, param3, this.field_m)) {
                hh.a(jg.field_a, -13, 2, var8, -8562, param3, ig.field_P);
                var8.a(this.field_m, param3, (byte) 78);
                break L1;
              } else {
                break L1;
              }
            }
            il.a(param4, to.field_e, var8.field_p, 2, 2, qj.field_l, -13, param3, param0, param2, uo.field_d, 306);
            return;
          } else {
            lb.g(param2, param0, 306, 480, um.field_u[param3], 928072);
            return;
          }
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        pb var7 = null;
        pb var8 = null;
        if (param0) {
          if (this.b((byte) -112)) {
            L0: {
              var8 = ge.a(this.field_m, param3, -20777);
              if (!var8.a((byte) -84, param3, this.field_m)) {
                hh.a(n.field_c, 0, 1, var8, -8562, param3, vj.field_b);
                var8.a(this.field_m, param3, (byte) 78);
                break L0;
              } else {
                break L0;
              }
            }
            il.a(param1, wm.field_b, var8.field_p, 1, 2, hk.field_Q, 0, param3, param2, param4, go.field_d, 640);
            return;
          } else {
            lb.g(param4, param2, 640, 480, um.field_u[param3], 928072);
            return;
          }
        } else {
          field_w = (tj) null;
          if (this.b((byte) -112)) {
            L1: {
              var7 = ge.a(this.field_m, param3, -20777);
              if (!var7.a((byte) -84, param3, this.field_m)) {
                hh.a(n.field_c, 0, 1, var7, -8562, param3, vj.field_b);
                var7.a(this.field_m, param3, (byte) 78);
                break L1;
              } else {
                break L1;
              }
            }
            il.a(param1, wm.field_b, var7.field_p, 1, 2, hk.field_Q, 0, param3, param2, param4, go.field_d, 640);
            return;
          } else {
            lb.g(param4, param2, 640, 480, um.field_u[param3], 928072);
            return;
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        if (param1 > -1) {
          lb.g(param2, param3, 153, 238, um.field_u[param1], 928072);
          if (!this.b((byte) -98)) {
            var5 = 14 / ((param0 - -28) / 43);
            return;
          } else {
            pk.field_a.c(param2, param3);
            var5 = 14 / ((param0 - -28) / 43);
            return;
          }
        } else {
          lb.g(param2, param3, 153, 238, 16777215, 11184810);
          if (!this.b((byte) -98)) {
            var5 = 14 / ((param0 - -28) / 43);
            return;
          } else {
            pk.field_a.c(param2, param3);
            var5 = 14 / ((param0 - -28) / 43);
            return;
          }
        }
    }

    public static void d(byte param0) {
        field_u = null;
        field_v = null;
        if (param0 != -46) {
          field_r = (int[]) null;
          field_r = null;
          field_t = null;
          field_w = null;
          field_s = null;
          return;
        } else {
          field_r = null;
          field_t = null;
          field_w = null;
          field_s = null;
          return;
        }
    }

    static {
        field_r = new int[8192];
        field_v = "New Game";
    }
}
