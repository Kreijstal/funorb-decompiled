/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gp extends ps {
    private String field_f;
    static int[] field_g;
    private String field_h;
    static int field_i;

    final kj a(byte param0) {
        if (param0 > -77) {
            Object var3 = null;
            ((gp) this).a((iw) null, -96);
        }
        return qq.field_K;
    }

    public static void c(int param0) {
        int var1 = -123 % ((param0 - -53) / 59);
        field_g = null;
    }

    final static void b(byte param0) {
        ag var1 = null;
        int var2 = Kickabout.field_G;
        cb.field_d.d();
        if (param0 != -28) {
            gp.c(-80);
        }
        pg.field_d.d();
        ri.field_r = ri.field_r - 1;
        if (ri.field_r == 0) {
            ri.field_r = 200;
            var1 = (ag) (Object) ps.field_a.g(param0 + 24037);
            while (var1 != null) {
                if (!(var1.field_k.e((byte) -113))) {
                    var1.c((byte) -109);
                }
                var1 = (ag) (Object) ps.field_a.c(param0 ^ -59);
            }
            if (!(null == qd.field_c)) {
                var1 = (ag) (Object) qd.field_c.g(24009);
                while (var1 != null) {
                    if (!(var1.field_k.e((byte) -113))) {
                        var1.c((byte) -109);
                    }
                    var1 = (ag) (Object) qd.field_c.c(33);
                }
            }
        }
    }

    final static void a(boolean param0, byte param1) {
        g.field_a.a(97, param0);
        ib var2 = la.field_a;
        if (param1 >= -27) {
            gp.b((byte) 111);
        }
        if (!(var2 == null)) {
            var2.a(g.field_a.field_T, g.field_a.field_F, (byte) -120);
        }
    }

    final static ld a(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        var7 = Kickabout.field_G;
        var3 = -34 % ((param0 - 38) / 57);
        var2 = param1.length();
        if (0 == var2) {
          return ld.field_b;
        } else {
          if (-65 > (var2 ^ -1)) {
            return st.field_j;
          } else {
            if (param1.charAt(0) == 34) {
              if (param1.charAt(-1 + var2) != 34) {
                return lm.field_F;
              } else {
                var4 = 0;
                var5 = 1;
                L0: while (true) {
                  if (var5 < -1 + var2) {
                    var6 = param1.charAt(var5);
                    if (var6 != 92) {
                      L1: {
                        if (var6 != 34) {
                          break L1;
                        } else {
                          if (var4 != 0) {
                            break L1;
                          } else {
                            return lm.field_F;
                          }
                        }
                      }
                      var4 = 0;
                      var5++;
                      continue L0;
                    } else {
                      L2: {
                        if (var4 != 0) {
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          break L2;
                        } else {
                          stackOut_16_0 = 1;
                          stackIn_18_0 = stackOut_16_0;
                          break L2;
                        }
                      }
                      var4 = stackIn_18_0;
                      var5++;
                      continue L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              var4 = 0;
              var5 = 0;
              L3: while (true) {
                if (var2 > var5) {
                  var6 = param1.charAt(var5);
                  if (var6 != 46) {
                    if ((ua.field_i.indexOf(var6) ^ -1) == 0) {
                      return lm.field_F;
                    } else {
                      var4 = 0;
                      var5++;
                      continue L3;
                    }
                  } else {
                    L4: {
                      if (var5 == 0) {
                        break L4;
                      } else {
                        if (var5 == var2 + -1) {
                          break L4;
                        } else {
                          if (var4 != 0) {
                            break L4;
                          } else {
                            var4 = 1;
                            var5++;
                            continue L3;
                          }
                        }
                      }
                    }
                    return lm.field_F;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        }
    }

    final static boolean a(byte param0, String param1, boolean param2, String param3, ae param4, int param5, String param6) {
        if (!(wk.field_f == vj.field_a)) {
            return false;
        }
        jn var8 = new jn(wd.field_l, param4);
        wd.field_l.a((fd) (Object) var8, false);
        if (wq.c((byte) 59)) {
            var8.t(17);
        } else {
            kl.field_a = null;
            n.field_c = param2 ? true : false;
            tn.field_b = param5;
            wn.field_i = param6;
            wk.field_f = nr.field_f;
            ld.field_a = param1;
            qr.field_f = param3;
        }
        if (param0 < 98) {
            field_g = null;
            return true;
        }
        return true;
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, String param5) {
        ml var9 = or.field_d;
        ml var6 = var9;
        var9.b(param3, (byte) 104);
        var9.field_n = var9.field_n + 1;
        int var8 = 39 / ((param1 - 14) / 61);
        int var7 = var9.field_n;
        var9.a(113, param2);
        if (!(-3 != (param2 ^ -1))) {
            var9.a(14190, param4);
        }
        if (param5 == null) {
            var9.g(-1207444472, param0);
        } else {
            int discarded$0 = cu.a((byte) 104, param5, (iw) (Object) var9);
        }
        var9.c(62, -var7 + var9.field_n);
    }

    final void a(iw param0, int param1) {
        param0.a(((gp) this).field_f, (byte) -126);
        if (param1 != 17053) {
            return;
        }
        param0.a((byte) 124, ((gp) this).field_h);
    }

    final static int a(up param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        fn var5 = null;
        int var6 = Kickabout.field_G;
        int var2 = 0;
        if (param1 != -576054046) {
            field_i = 81;
        }
        for (var3 = 0; param0.field_h.length > var3; var3++) {
            var2 = var2 + (pa.field_g[param0.field_h[var3]].field_e >> 2068671521);
        }
        var3 = p.a(param1 + 576054974, param0);
        if (15 <= var3) {
            var2 = (452 * ((var3 + -15) * (var3 + -15)) >> 52760709) + 10;
            for (var4 = 0; param0.field_h.length > var4; var4++) {
                var5 = pa.field_g[param0.field_h[var4]];
                var2 = var2 + fn.field_g[var5.field_k];
                var2 = var2 + (var5.field_e >> -576054046);
            }
        }
        return var2;
    }

    gp(String param0, String param1) {
        ((gp) this).field_h = param1;
        ((gp) this).field_f = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new int[8192];
    }
}
