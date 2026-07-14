/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ip extends kj {
    static kv[] field_f;
    private int field_g;

    ip(gj param0, int param1, int param2) {
        super(param0, param1, param2);
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        var4 = ((ip) this).field_g * (int)((double)param0 / 30.0);
        if (param1 != 0) {
          field_f = null;
          il.field_a.a((-((ip) this).field_g + 30 << 2054408705) + param2, var4, 128 + -(30 - ((ip) this).field_g << 1085892737), 64);
          return;
        } else {
          il.field_a.a((-((ip) this).field_g + 30 << 2054408705) + param2, var4, 128 + -(30 - ((ip) this).field_g << 1085892737), 64);
          return;
        }
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            ((ip) this).a(-90, true, -97);
        }
    }

    final static String a(String param0, byte param1, int param2) {
        int var4 = 0;
        pf var6 = null;
        pf var7 = null;
        CharSequence var8 = null;
        var8 = (CharSequence) (Object) param0;
        if (!wc.a(0, var8)) {
          return mk.field_f;
        } else {
          if (!wb.a((byte) 52, param0)) {
            if (2 == um.field_c) {
              if (!bna.a((byte) 5, param0)) {
                if (100 > bda.field_l) {
                  if (!gl.a(3, param0)) {
                    if (param1 != -80) {
                      ip.c((byte) 108);
                      var6 = sja.field_fb;
                      var6.c(param2, (byte) 107);
                      var6.field_g = var6.field_g + 1;
                      var4 = var6.field_g;
                      var6.d(2, 0);
                      var6.a((byte) -50, param0);
                      var6.b((byte) 105, var6.field_g - var4);
                      return null;
                    } else {
                      var7 = sja.field_fb;
                      var7.c(param2, (byte) 107);
                      var7.field_g = var7.field_g + 1;
                      var4 = var7.field_g;
                      var7.d(2, 0);
                      var7.a((byte) -50, param0);
                      var7.b((byte) 105, var7.field_g - var4);
                      return null;
                    }
                  } else {
                    return lga.a(true, new String[1], fja.field_b);
                  }
                } else {
                  return c.field_i;
                }
              } else {
                return lga.a(true, new String[1], nu.field_d);
              }
            } else {
              return bt.field_q;
            }
          } else {
            return cea.field_a;
          }
        }
    }

    public static void c(byte param0) {
        field_f = null;
        if (param0 != -36) {
            field_f = null;
        }
    }

    final boolean b(int param0) {
        L0: {
          if (0 == ((ip) this).field_g) {
            wf.a(69, (byte) -91);
            break L0;
          } else {
            break L0;
          }
        }
        ((ip) this).field_g = ((ip) this).field_g + 1;
        if (30 > ((ip) this).field_g + 1) {
          if (param0 <= 21) {
            ((ip) this).a(-86, -98, -122);
            return false;
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final static void a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        if (param0 == 22) {
          var2 = param1;
          if (var2 != -1) {
            if (-13 != var2) {
              if (-3 != var2) {
                if ((var2 ^ -1) == 1) {
                  ala.a(26219, pm.field_z);
                  tla.d(-80);
                  return;
                } else {
                  return;
                }
              } else {
                ala.a(26219, eda.field_i);
                return;
              }
            } else {
              ala.a(26219, jga.field_z);
              return;
            }
          } else {
            ala.a(26219, wc.field_p);
            return;
          }
        } else {
          ip.a((byte) 109, 122);
          var2 = param1;
          if (var2 != -1) {
            if (-13 != var2) {
              if (-3 != var2) {
                if ((var2 ^ -1) != 1) {
                  return;
                } else {
                  ala.a(26219, pm.field_z);
                  tla.d(-80);
                  return;
                }
              } else {
                ala.a(26219, eda.field_i);
                return;
              }
            } else {
              ala.a(26219, jga.field_z);
              return;
            }
          } else {
            ala.a(26219, wc.field_p);
            return;
          }
        }
    }

    static {
    }
}
