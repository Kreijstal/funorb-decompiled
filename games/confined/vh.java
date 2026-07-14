/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    private int field_f;
    private rk field_g;
    private rk field_c;
    static pf[] field_e;
    private int field_d;
    private rk[] field_b;
    static hb field_a;

    public static void b(boolean param0) {
        field_e = null;
        if (param0) {
            vh.b(false);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final void a(rk param0, int param1, long param2) {
        rk var5 = null;
        if (!(null == param0.field_a)) {
            param0.a(true);
        }
        if (param1 != 11) {
            vh.b(false);
            var5 = ((vh) this).field_b[(int)((long)(((vh) this).field_d - 1) & param2)];
            param0.field_h = var5;
            param0.field_a = var5.field_a;
            param0.field_a.field_h = param0;
            param0.field_h.field_a = param0;
            param0.field_i = param2;
            return;
        }
        var5 = ((vh) this).field_b[(int)((long)(((vh) this).field_d - 1) & param2)];
        param0.field_h = var5;
        param0.field_a = var5.field_a;
        param0.field_a.field_h = param0;
        param0.field_h.field_a = param0;
        param0.field_i = param2;
    }

    final static void b(int param0) {
        if (param0 == -4749) {
          if ((rk.field_e ^ -1) == -11) {
            ec.a((byte) 126);
            rk.field_e = 11;
            mk.field_o = true;
            return;
          } else {
            if (ja.c((byte) -126)) {
              mk.field_o = true;
              return;
            } else {
              ec.a((byte) 126);
              rk.field_e = 11;
              mk.field_o = true;
              return;
            }
          }
        } else {
          field_e = null;
          if ((rk.field_e ^ -1) != -11) {
            if (!ja.c((byte) -126)) {
              ec.a((byte) 126);
              rk.field_e = 11;
              mk.field_o = true;
              return;
            } else {
              mk.field_o = true;
              return;
            }
          } else {
            ec.a((byte) 126);
            rk.field_e = 11;
            mk.field_o = true;
            return;
          }
        }
    }

    final rk a(int param0) {
        int var3 = 0;
        rk var4 = null;
        rk var5 = null;
        rk var9 = null;
        rk var12 = null;
        var3 = Confined.field_J ? 1 : 0;
        if (param0 >= 66) {
          if (0 < ((vh) this).field_f) {
            if (((vh) this).field_b[((vh) this).field_f - 1] != ((vh) this).field_c) {
              var12 = ((vh) this).field_c;
              ((vh) this).field_c = var12.field_h;
              return var12;
            } else {
              L0: while (true) {
                if (((vh) this).field_f < ((vh) this).field_d) {
                  ((vh) this).field_f = ((vh) this).field_f + 1;
                  var4 = ((vh) this).field_b[((vh) this).field_f].field_h;
                  var9 = var4;
                  if (var4 != ((vh) this).field_b[-1 + ((vh) this).field_f]) {
                    ((vh) this).field_c = var9.field_h;
                    return var9;
                  } else {
                    continue L0;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            L1: while (true) {
              if (((vh) this).field_f < ((vh) this).field_d) {
                ((vh) this).field_f = ((vh) this).field_f + 1;
                var4 = ((vh) this).field_b[((vh) this).field_f].field_h;
                var5 = var4;
                if (var4 != ((vh) this).field_b[-1 + ((vh) this).field_f]) {
                  ((vh) this).field_c = var5.field_h;
                  return var5;
                } else {
                  continue L1;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final rk a(int param0, long param1) {
        rk var4 = null;
        rk var5 = null;
        int var6 = 0;
        var6 = Confined.field_J ? 1 : 0;
        var4 = ((vh) this).field_b[(int)((long)(-1 + ((vh) this).field_d) & param1)];
        ((vh) this).field_g = var4.field_h;
        if (param0 != 1) {
          ((vh) this).field_f = -115;
          L0: while (true) {
            if (((vh) this).field_g == var4) {
              ((vh) this).field_g = null;
              return null;
            } else {
              if ((((vh) this).field_g.field_i ^ -1L) == (param1 ^ -1L)) {
                var5 = ((vh) this).field_g;
                ((vh) this).field_g = ((vh) this).field_g.field_h;
                return var5;
              } else {
                ((vh) this).field_g = ((vh) this).field_g.field_h;
                continue L0;
              }
            }
          }
        } else {
          L1: while (true) {
            if (((vh) this).field_g == var4) {
              ((vh) this).field_g = null;
              return null;
            } else {
              if ((((vh) this).field_g.field_i ^ -1L) == (param1 ^ -1L)) {
                var5 = ((vh) this).field_g;
                ((vh) this).field_g = ((vh) this).field_g.field_h;
                return var5;
              } else {
                ((vh) this).field_g = ((vh) this).field_g.field_h;
                continue L1;
              }
            }
          }
        }
    }

    final rk a(boolean param0) {
        ((vh) this).field_f = 0;
        if (!param0) {
            vh.b(-33);
            return ((vh) this).a(110);
        }
        return ((vh) this).a(110);
    }

    final static int a(int param0, int param1) {
        param1 = param1 & 8191;
        if (param0 != 21872) {
            int discarded$4 = vh.a(-94, 118);
            if (-4097 >= param1) {
                return -6145 <= param1 ? -vj.field_e[8192 - param1] : -vj.field_e[-4096 + param1];
            }
            return 2048 <= param1 ? vj.field_e[4096 - param1] : vj.field_e[param1];
        }
        if (-4097 >= param1) {
            return -6145 <= param1 ? -vj.field_e[8192 - param1] : -vj.field_e[-4096 + param1];
        }
        return 2048 <= param1 ? vj.field_e[4096 - param1] : vj.field_e[param1];
    }

    vh(int param0) {
        int var2 = 0;
        rk var3 = null;
        ((vh) this).field_f = 0;
        ((vh) this).field_d = param0;
        ((vh) this).field_b = new rk[param0];
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            var3 = new rk();
            ((vh) this).field_b[var2] = new rk();
            var3.field_a = var3;
            var3.field_h = var3;
            var2++;
            continue L0;
          } else {
          }
        }
    }

    static {
    }
}
