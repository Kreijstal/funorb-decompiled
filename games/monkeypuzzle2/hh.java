/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh extends wj {
    static int[] field_r;
    static String field_p;
    private String field_q;
    private boolean field_s;
    static gb[] field_n;
    static gg field_u;
    static String field_t;
    static volatile boolean field_o;

    final static void f(int param0) {
        ub.field_a = lc.field_f;
        lc.field_f = false;
        sl.b(true);
        oa.j(-118);
        oi.c(106);
        if (param0 != 8500) {
          hh.c(true);
          eb.m(param0 + -8377);
          return;
        } else {
          eb.m(param0 + -8377);
          return;
        }
    }

    final na a(String param0, int param1) {
        cj var3 = null;
        CharSequence var4 = null;
        na stackIn_7_0 = null;
        na stackIn_14_0 = null;
        na stackIn_21_0 = null;
        na stackIn_28_0 = null;
        na stackOut_27_0 = null;
        na stackOut_26_0 = null;
        na stackOut_20_0 = null;
        na stackOut_19_0 = null;
        na stackOut_13_0 = null;
        na stackOut_12_0 = null;
        na stackOut_6_0 = null;
        na stackOut_5_0 = null;
        var4 = (CharSequence) (Object) param0;
        if (q.a(var4, false)) {
          if (param1 == 3917) {
            if (!param0.equals((Object) (Object) ((hh) this).field_q)) {
              var3 = we.b(param0, -84);
              if (var3 != null) {
                if (null != var3.field_h) {
                  return f.field_g;
                } else {
                  L0: {
                    ((hh) this).field_q = param0;
                    ((hh) this).field_s = var3.field_b;
                    if (((hh) this).field_s) {
                      stackOut_27_0 = wj.field_i;
                      stackIn_28_0 = stackOut_27_0;
                      break L0;
                    } else {
                      stackOut_26_0 = ol.field_h;
                      stackIn_28_0 = stackOut_26_0;
                      break L0;
                    }
                  }
                  return stackIn_28_0;
                }
              } else {
                return f.field_g;
              }
            } else {
              L1: {
                if (((hh) this).field_s) {
                  stackOut_20_0 = wj.field_i;
                  stackIn_21_0 = stackOut_20_0;
                  break L1;
                } else {
                  stackOut_19_0 = ol.field_h;
                  stackIn_21_0 = stackOut_19_0;
                  break L1;
                }
              }
              return stackIn_21_0;
            }
          } else {
            hh.f(-23);
            if (!param0.equals((Object) (Object) ((hh) this).field_q)) {
              var3 = we.b(param0, -84);
              if (var3 != null) {
                if (null != var3.field_h) {
                  return f.field_g;
                } else {
                  L2: {
                    ((hh) this).field_q = param0;
                    ((hh) this).field_s = var3.field_b;
                    if (((hh) this).field_s) {
                      stackOut_13_0 = wj.field_i;
                      stackIn_14_0 = stackOut_13_0;
                      break L2;
                    } else {
                      stackOut_12_0 = ol.field_h;
                      stackIn_14_0 = stackOut_12_0;
                      break L2;
                    }
                  }
                  return stackIn_14_0;
                }
              } else {
                return f.field_g;
              }
            } else {
              L3: {
                if (((hh) this).field_s) {
                  stackOut_6_0 = wj.field_i;
                  stackIn_7_0 = stackOut_6_0;
                  break L3;
                } else {
                  stackOut_5_0 = ol.field_h;
                  stackIn_7_0 = stackOut_5_0;
                  break L3;
                }
              }
              return stackIn_7_0;
            }
          }
        } else {
          return ol.field_h;
        }
    }

    hh(rj param0) {
        super(param0);
        ((hh) this).field_s = false;
    }

    final static int a(byte param0, String param1, boolean param2) {
        int var3 = -38 / ((param0 - -45) / 58);
        if (param2) {
            return sl.field_o.a(param1);
        }
        return fe.field_a.a(param1);
    }

    public static void e(int param0) {
        field_u = null;
        field_n = null;
        field_p = null;
        field_t = null;
        field_r = null;
        if (param0 != -17202) {
            hh.c(true);
        }
    }

    final void f(byte param0) {
        ((hh) this).field_q = null;
        if (param0 > -51) {
            field_p = null;
        }
    }

    final String a(int param0, String param1) {
        String var3 = null;
        cj var4 = null;
        Object var5 = null;
        CharSequence var6 = null;
        var6 = (CharSequence) (Object) param1;
        var3 = pi.a((byte) 122, var6);
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if (param1.equals((Object) (Object) ((hh) this).field_q)) {
              break L0;
            } else {
              var4 = we.b(param1, -75);
              if (var4 != null) {
                if (var4.field_h == null) {
                  ((hh) this).field_s = var4.field_b;
                  ((hh) this).field_q = param1;
                  break L0;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          }
          if (param0 == 1) {
            if (!((hh) this).field_s) {
              return me.field_l;
            } else {
              return ub.field_c;
            }
          } else {
            var5 = null;
            int discarded$5 = hh.a((byte) 87, (String) null, false);
            if (!((hh) this).field_s) {
              return me.field_l;
            } else {
              return ub.field_c;
            }
          }
        }
    }

    final static void c(boolean param0) {
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        hb var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        vl var12 = null;
        hb var13 = null;
        k var14 = null;
        int[] var15 = null;
        Object var16 = null;
        k var16_ref = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        var16 = null;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        var13 = MonkeyPuzzle2.field_D;
        var2 = var13.a((byte) 114);
        if (param0) {
          if (0 == var2) {
            var11 = cj.a((byte) 108);
            var19 = var11;
            var18 = var19;
            var17 = var18;
            var15 = var17;
            var3 = var15;
            var10 = var11;
            var4 = var10;
            var5 = var13;
            var6 = ((gk) (Object) var5).a((byte) 114);
            var7 = 0;
            L0: while (true) {
              if (var6 <= var7) {
                var16_ref = (k) (Object) cj.field_a.a((byte) -117);
                if (var16_ref == null) {
                  gk.a(-1);
                  return;
                } else {
                  var16_ref.field_e = var19[0];
                  var16_ref.field_h = var3;
                  var16_ref.field_j = true;
                  var16_ref.c(-19822);
                  return;
                }
              } else {
                var10[var7] = ((gk) (Object) var5).e(-127);
                var7++;
                continue L0;
              }
            }
          } else {
            if (var2 == 1) {
              var12 = (vl) (Object) ob.field_s.a((byte) -117);
              if (var12 == null) {
                gk.a(-1);
                return;
              } else {
                var12.c(-19822);
                return;
              }
            } else {
              if ((var2 ^ -1) == -3) {
                var14 = (k) (Object) cj.field_a.a((byte) -117);
                if (var14 == null) {
                  gk.a(-1);
                  return;
                } else {
                  var14.field_h = cj.a((byte) 120);
                  var14.field_e = var14.field_h[0];
                  var14.field_j = true;
                  var14.c(-19822);
                  return;
                }
              } else {
                kk.a("A1: " + bh.a((byte) -31), (byte) 101, (Throwable) null);
                gk.a(-1);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Error connecting to server. Please try using a different server.";
        field_r = new int[20];
        field_t = "Achievements";
        field_o = true;
        field_n = new gb[32];
    }
}
