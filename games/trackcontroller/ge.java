/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge extends td implements jg, m {
    private og field_C;
    static boolean field_D;
    private rh field_E;
    static int field_G;
    private el field_F;

    private final String j(int param0) {
        if (param0 != 11844) {
            Object var3 = null;
            boolean discarded$0 = ge.a((int[]) null, true);
        }
        return "</col></u>";
    }

    public final void a(el param0, int param1, int param2, int param3) {
        int var6 = 0;
        Object var7 = null;
        L0: {
          var6 = TrackController.field_F ? 1 : 0;
          if (param1 == 0) {
            ue.a("terms.ws", false);
            break L0;
          } else {
            if (1 != param1) {
              if ((param1 ^ -1) == -3) {
                ue.a("conduct.ws", false);
                break L0;
              } else {
                break L0;
              }
            } else {
              ue.a("privacy.ws", false);
              break L0;
            }
          }
        }
        L1: {
          if (param3 == 1) {
            break L1;
          } else {
            var7 = null;
            boolean discarded$1 = ge.a((int[]) null, false);
            break L1;
          }
        }
    }

    ge(og param0) {
        super(0, 0, 288, 0, (t) null);
        ((ge) this).field_C = param0;
        ((ge) this).field_E = new rh(hd.field_m, (tg) null);
        ((ge) this).field_E.field_y = (t) (Object) new dc();
        String var7 = dh.a((byte) -81, new String[2], qd.field_b);
        int var3 = 20;
        ic var4 = new ic(gk.field_c, 0, 0, 0, 0, 16777215, -1, 3, 0, gk.field_c.field_G, -1, 2147483647, true);
        ((ge) this).field_F = new el(var7, (t) (Object) var4);
        ((ge) this).field_F.field_n = "";
        ((ge) this).field_F.a((byte) 58, bb.field_a, 0);
        ((ge) this).field_F.a((byte) 80, bb.field_a, 1);
        ((ge) this).field_F.field_l = (tg) this;
        ((ge) this).field_F.field_x = -40 + ((ge) this).field_x;
        ((ge) this).field_F.a(var3, (byte) -44, ((ge) this).field_x + -40, 26);
        var3 = var3 + (((ge) this).field_F.field_u + 15);
        ((ge) this).a(false, (al) (Object) ((ge) this).field_F);
        int var5 = 4;
        int var6 = 200;
        ((ge) this).field_E.a(40, -3050, var3, var6, 300 + -var6 >> -1072783327);
        ((ge) this).field_E.field_l = (tg) this;
        ((ge) this).a(false, (al) (Object) ((ge) this).field_E);
        ((ge) this).a(55 + var3 + var5, -3050, 0, 300, 0);
    }

    private final String k(int param0) {
        if (param0 != 0) {
            return null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    final boolean a(byte param0, char param1, al param2, int param3) {
        int var5 = 82 / ((param0 - 17) / 51);
        if (super.a((byte) -75, param1, param2, param3)) {
            return true;
        }
        if (param3 == 98) {
            return ((ge) this).a(param2, 121);
        }
        if (99 == param3) {
            return ((ge) this).a(param2, true);
        }
        return false;
    }

    public final void a(rh param0, int param1, int param2, int param3, int param4) {
        if (param0 == ((ge) this).field_E) {
            nh.a((byte) -97);
            ((ge) this).field_C.t(20252);
        }
        if (param4 != -27322) {
            Object var7 = null;
            ((ge) this).a((el) null, -97, -102, 71);
        }
    }

    final static boolean a(int[] param0, boolean param1) {
        long var2 = 0L;
        wa var4_ref_wa = null;
        int var4 = 0;
        int var5_int = 0;
        wa var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = TrackController.field_F ? 1 : 0;
        if (jc.field_a != ka.field_b) {
          return false;
        } else {
          L0: {
            var2 = qg.a(param1);
            if (s.field_b == -1) {
              break L0;
            } else {
              if (-1 <= vd.field_K) {
                break L0;
              } else {
                var4_ref_wa = (wa) (Object) cg.field_f.b(2);
                if (var4_ref_wa == null) {
                  break L0;
                } else {
                  if (var4_ref_wa.field_l >= var2) {
                    break L0;
                  } else {
                    var4_ref_wa.a(-60);
                    hd.field_o = var4_ref_wa.field_m.length;
                    ne.field_a.field_k = 0;
                    var5_int = 0;
                    L1: while (true) {
                      if (hd.field_o <= var5_int) {
                        o.field_a = u.field_o;
                        u.field_o = mc.field_L;
                        mc.field_L = uk.field_c;
                        uk.field_c = var4_ref_wa.field_i;
                        return true;
                      } else {
                        ne.field_a.field_j[var5_int] = var4_ref_wa.field_m[var5_int];
                        var5_int++;
                        continue L1;
                      }
                    }
                  }
                }
              }
            }
          }
          L2: while (true) {
            L3: {
              if (-1 < (vd.field_K ^ -1)) {
                ne.field_a.field_k = 0;
                if (!hf.a(1, false)) {
                  return false;
                } else {
                  vd.field_K = ne.field_a.e(false);
                  ne.field_a.field_k = 0;
                  hd.field_o = param0[vd.field_K];
                  break L3;
                }
              } else {
                break L3;
              }
            }
            if (fh.a(520)) {
              if (-1 != (s.field_b ^ -1)) {
                L4: {
                  var4 = s.field_b;
                  if (0.0 == w.field_U) {
                    break L4;
                  } else {
                    var4 = (int)((double)var4 + ta.field_c.nextGaussian() * w.field_U);
                    if ((var4 ^ -1) <= -1) {
                      break L4;
                    } else {
                      var4 = 0;
                      break L4;
                    }
                  }
                }
                var5 = new wa((long)var4 + var2, vd.field_K, new byte[hd.field_o]);
                var6 = 0;
                L5: while (true) {
                  if (var6 >= hd.field_o) {
                    cg.field_f.a((byte) -110, (fc) (Object) var5);
                    vd.field_K = -1;
                    continue L2;
                  } else {
                    var5.field_m[var6] = ne.field_a.field_j[var6];
                    var6++;
                    continue L5;
                  }
                }
              } else {
                o.field_a = u.field_o;
                u.field_o = mc.field_L;
                mc.field_L = uk.field_c;
                uk.field_c = vd.field_K;
                vd.field_K = -1;
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = true;
    }
}
