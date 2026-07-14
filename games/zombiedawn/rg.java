/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg extends pa {
    static ra field_J;
    static int field_H;
    static String field_L;
    static int field_I;
    static String field_K;
    static int field_E;
    static int field_F;

    final static void a(String param0, int param1, String param2) {
        if (param1 >= -10) {
            field_F = 94;
            r.a(param2, 126, false, param0);
            return;
        }
        r.a(param2, 126, false, param0);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param3 == 0) {
          L0: {
            if (param1 != 0) {
              break L0;
            } else {
              if (null != ((rg) this).field_h) {
                ((rg) this).field_h.a(16777215, true, param0, (ga) this, param2);
                break L0;
              } else {
                if (((rg) this).field_i != 0) {
                  if (((rg) this).field_n == 0) {
                    return;
                  } else {
                    se.field_j.a(((rg) this).field_k + param2, ((rg) this).field_k + (param2 + ((rg) this).field_i), (byte) -75, param0 - -((rg) this).field_j, ((rg) this).field_n + (((rg) this).field_j + param0));
                    ((rg) this).field_z.a(param0 - -((rg) this).field_j, param1, param2 - -((rg) this).field_k, 0);
                    se.field_j.b(3);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          if (((rg) this).field_i != 0) {
            if (((rg) this).field_n == 0) {
              return;
            } else {
              se.field_j.a(((rg) this).field_k + param2, ((rg) this).field_k + (param2 + ((rg) this).field_i), (byte) -75, param0 - -((rg) this).field_j, ((rg) this).field_n + (((rg) this).field_j + param0));
              ((rg) this).field_z.a(param0 - -((rg) this).field_j, param1, param2 - -((rg) this).field_k, 0);
              se.field_j.b(3);
              return;
            }
          } else {
            return;
          }
        } else {
          field_E = -66;
          if (param1 == 0) {
            L1: {
              if (null != ((rg) this).field_h) {
                ((rg) this).field_h.a(16777215, true, param0, (ga) this, param2);
                break L1;
              } else {
                break L1;
              }
            }
            if (((rg) this).field_i != 0) {
              if (((rg) this).field_n != 0) {
                se.field_j.a(((rg) this).field_k + param2, ((rg) this).field_k + (param2 + ((rg) this).field_i), (byte) -75, param0 - -((rg) this).field_j, ((rg) this).field_n + (((rg) this).field_j + param0));
                ((rg) this).field_z.a(param0 - -((rg) this).field_j, param1, param2 - -((rg) this).field_k, 0);
                se.field_j.b(3);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            if (((rg) this).field_i != 0) {
              if (((rg) this).field_n == 0) {
                return;
              } else {
                se.field_j.a(((rg) this).field_k + param2, ((rg) this).field_k + (param2 + ((rg) this).field_i), (byte) -75, param0 - -((rg) this).field_j, ((rg) this).field_n + (((rg) this).field_j + param0));
                ((rg) this).field_z.a(param0 - -((rg) this).field_j, param1, param2 - -((rg) this).field_k, 0);
                se.field_j.b(3);
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    rg(int param0, int param1, int param2, int param3, io param4, ga param5) {
        super(param0, param1, param2, param3, param4, (sk) null);
        ((rg) this).field_z = param5;
    }

    public static void g(int param0) {
        if (param0 != 13885) {
          rg.g(109);
          field_J = null;
          field_K = null;
          field_L = null;
          return;
        } else {
          field_J = null;
          field_K = null;
          field_L = null;
          return;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ga param6) {
        if (param1 == 1) {
          if (((rg) this).b(param3, 21224, param2, param4, param0)) {
            if (!super.a(param0, 1, param2, param3, param4, param5, param6)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_H = 43;
          if (((rg) this).b(param3, 21224, param2, param4, param0)) {
            if (!super.a(param0, 1, param2, param3, param4, param5, param6)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void b(boolean param0) {
        ((rg) this).field_z.a(param0);
    }

    final static void a(oi param0, boolean param1) {
        int var2 = 0;
        vn var3 = null;
        if (hm.field_E != null) {
          var2 = param0.field_I - -param0.field_x;
          if (param1) {
            field_H = 9;
            var3 = new vn(var2, var2);
            var3.a();
            hm.field_E.d(0, 0, var2, var2);
            cn.field_f.b(44);
            hm.field_E = var3;
            return;
          } else {
            var3 = new vn(var2, var2);
            var3.a();
            hm.field_E.d(0, 0, var2, var2);
            cn.field_f.b(44);
            hm.field_E = var3;
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "Left-click or 'ESC': Skip cutscene";
        field_H = 4;
        field_J = new ra();
        field_I = 0;
        field_K = "DETONATE";
        field_F = -1;
    }
}
