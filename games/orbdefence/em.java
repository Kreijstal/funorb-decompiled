/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em extends hi {
    static int[] field_s;
    private vi field_p;
    static int field_r;
    private vi field_n;
    static int field_o;
    static int field_q;

    final static void c(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = OrbDefence.field_D ? 1 : 0;
        var1 = ul.field_f;
        var2 = ul.field_l;
        var3 = -1 + var2 * var1;
        L0: while (true) {
          if ((var3 ^ -1) > -1) {
            li.field_a.d();
            if (param0 != 67) {
              return;
            } else {
              hm.a(cg.field_d.field_v, 3, param0 + -67, 3);
              cb.field_a.a(param0 ^ -101);
              li.field_a.e(0, 0, 640, 480, ef.field_k);
              return;
            }
          } else {
            L1: {
              var4 = ul.field_b[var3];
              var5 = 0;
              if ((var4 & 8388608 ^ -1) != -8388609) {
                break L1;
              } else {
                var5 = var5 | var4 & 8323072;
                break L1;
              }
            }
            L2: {
              if ((var4 & 32768) != 32768) {
                break L2;
              } else {
                var5 = var5 | var4 & 32512;
                break L2;
              }
            }
            L3: {
              if ((var4 & 128) != 128) {
                break L3;
              } else {
                var5 = var5 | 127 & var4;
                break L3;
              }
            }
            cg.field_d.field_v[var3] = var5 << -943490239;
            var3--;
            continue L0;
          }
        }
    }

    final static void b(byte param0) {
        if (!n.b(param0)) {
          if (!pc.field_cb) {
            L0: {
              if (null == oh.field_c) {
                oh.field_c = lg.a(4, false);
                break L0;
              } else {
                break L0;
              }
            }
            if (!oh.field_c.field_g) {
              return;
            } else {
              lb.field_g = lb.field_g | oh.field_c.field_i;
              dm.field_f = dm.field_f & (oh.field_c.field_i ^ -1);
              pc.field_cb = true;
              oh.field_c = null;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final qd a(String param0, byte param1) {
        if (param1 != -99) {
            return null;
        }
        String var3 = ((em) this).field_n.field_l.toLowerCase();
        String var4 = param0.toLowerCase();
        if (!(var4.length() != 0)) {
            return vh.field_h;
        }
        if (!(kk.a(var3, var4, -1))) {
            return vh.field_h;
        }
        if (!(!this.b(param0, (byte) -36))) {
            return vh.field_h;
        }
        return nc.field_bb;
    }

    public static void d(byte param0) {
        field_s = null;
        if (param0 != -15) {
            field_o = 125;
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        if ((hi.field_k ^ -1) == -12) {
          md.c(32);
          ih.a(tl.field_e, 0, q.field_b, mf.field_d);
          kg.a(0, (byte) -83, param0, param1);
          return;
        } else {
          ih.a(tl.field_e, 0, q.field_b, mf.field_d);
          kg.a(0, (byte) -83, param0, param1);
          return;
        }
    }

    em(vi param0, vi param1, vi param2) {
        super(param0);
        ((em) this).field_n = param1;
        ((em) this).field_p = param2;
    }

    private final boolean b(String param0, byte param1) {
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        var9 = ((em) this).field_p.field_l.toLowerCase();
        var4 = param0.toLowerCase();
        var5 = -2 % ((param1 - 37) / 51);
        if (-1 > var9.length()) {
          if (-1 < var4.length()) {
            var6 = var9.lastIndexOf("@");
            if ((var6 ^ -1) <= -1) {
              if (-1 + var9.length() > var6) {
                var7 = var9.substring(0, var6);
                var8 = var9.substring(var6 + 1);
                if ((var4.indexOf(var7) ^ -1) <= -1) {
                  return true;
                } else {
                  if ((var4.indexOf(var8) ^ -1) > -1) {
                    return false;
                  } else {
                    return true;
                  }
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

    final String a(int param0, String param1) {
        String var4 = null;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        var6 = ((em) this).field_n.field_l.toLowerCase();
        var4 = param1.toLowerCase();
        if (var4.length() != 0) {
          if (param0 == -11300) {
            var8 = var4;
            if (mm.a(var8, (byte) 51)) {
              return sg.field_F;
            } else {
              if (!md.a(-20767, var8)) {
                if (me.a(var8, (byte) -27)) {
                  return jc.field_n;
                } else {
                  if (this.b(param1, (byte) -99)) {
                    return pl.field_f;
                  } else {
                    if (0 < var6.length()) {
                      if (!df.a(var8, (byte) 126, var6)) {
                        if (vh.a(false, var6, var8)) {
                          return am.field_f;
                        } else {
                          if (l.a(122, var8, var6)) {
                            return mf.field_a;
                          } else {
                            return sg.field_F;
                          }
                        }
                      } else {
                        return mf.field_a;
                      }
                    } else {
                      return vc.field_b;
                    }
                  }
                }
              } else {
                return ec.field_H;
              }
            }
          } else {
            ((em) this).field_p = null;
            var7 = var4;
            if (mm.a(var7, (byte) 51)) {
              return sg.field_F;
            } else {
              if (!md.a(-20767, var7)) {
                if (me.a(var7, (byte) -27)) {
                  return jc.field_n;
                } else {
                  if (this.b(param1, (byte) -99)) {
                    return pl.field_f;
                  } else {
                    if (0 < var6.length()) {
                      if (!df.a(var7, (byte) 126, var6)) {
                        if (vh.a(false, var6, var7)) {
                          return am.field_f;
                        } else {
                          if (l.a(122, var7, var6)) {
                            return mf.field_a;
                          } else {
                            return sg.field_F;
                          }
                        }
                      } else {
                        return mf.field_a;
                      }
                    } else {
                      return vc.field_b;
                    }
                  }
                }
              } else {
                return ec.field_H;
              }
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_r = 0;
        field_s = new int[256];
        for (var0 = 0; -257 < (var0 ^ -1); var0++) {
            field_s[var0] = 256 * (var0 / 3) + (1 * (var0 / 2) + var0 * 65536);
        }
    }
}
