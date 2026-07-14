/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    private int field_i;
    String field_e;
    static boolean field_d;
    static char field_h;
    private wa[] field_f;
    private int field_a;
    float field_g;
    private int field_c;
    static nf field_b;

    final void a(boolean param0, String param1, String param2, mi param3, String param4) {
        if (param0) {
          ((ad) this).field_a = 77;
          this.a(param4, param2, -1, -7057, param3, param1);
          return;
        } else {
          this.a(param4, param2, -1, -7057, param3, param1);
          return;
        }
    }

    private final void a(wa param0, boolean param1, int param2) {
        float var4 = 0.0f;
        var4 = (float)param2 / 100.0f + (float)(1 + ((ad) this).field_c);
        ((ad) this).field_g = var4 * (float)((ad) this).field_a / (float)(1 + ((ad) this).field_i);
        if (param1) {
          if (param2 != 0) {
            ((ad) this).field_e = param0.field_c + " - " + param2 + "%";
            return;
          } else {
            ((ad) this).field_e = param0.field_a;
            return;
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 >= -2) {
            ad.a((byte) -25);
        }
    }

    final void a(byte param0, mi param1, String param2, String param3) {
        this.a((String) null, param3, -1, param0 ^ 7061, param1, param2);
        if (param0 != -6) {
            Object var6 = null;
            this.a((String) null, (String) null, -81, 87, (mi) null, (String) null);
        }
    }

    private final void a(String param0, String param1, int param2, int param3, mi param4, String param5) {
        wa[] var7 = null;
        wa var7_ref = null;
        wa var8 = null;
        wa[] var9 = null;
        wa var10 = null;
        L0: {
          if (((ad) this).field_f.length > ((ad) this).field_i) {
            break L0;
          } else {
            var9 = new wa[2 * ((ad) this).field_i];
            var7 = var9;
            lj.a((Object[]) (Object) ((ad) this).field_f, 0, (Object[]) (Object) var9, 0, ((ad) this).field_i);
            ((ad) this).field_f = var9;
            break L0;
          }
        }
        var8 = new wa();
        var10 = var8;
        var7_ref = var10;
        var10.field_a = param5;
        var10.field_b = param0;
        var10.field_f = param2;
        if (param3 != -7057) {
          ((ad) this).field_g = -0.6586758494377136f;
          var10.field_e = param4;
          var10.field_c = param1;
          ((ad) this).field_i = ((ad) this).field_i + 1;
          ((ad) this).field_f[((ad) this).field_i] = var8;
          return;
        } else {
          var10.field_e = param4;
          var10.field_c = param1;
          ((ad) this).field_i = ((ad) this).field_i + 1;
          ((ad) this).field_f[((ad) this).field_i] = var8;
          return;
        }
    }

    final boolean a(int param0) {
        wa var2 = null;
        int var3 = 0;
        wa var4 = null;
        var3 = Confined.field_J ? 1 : 0;
        L0: while (true) {
          if (((ad) this).field_c >= ((ad) this).field_i) {
            if (param0 != -1) {
              return false;
            } else {
              return true;
            }
          } else {
            var4 = ((ad) this).field_f[((ad) this).field_c];
            var2 = var4;
            if (!var4.field_e.b(param0 + 1)) {
              this.a(var4, true, 0);
              return false;
            } else {
              L1: {
                if ((var4.field_f ^ -1) > -1) {
                  break L1;
                } else {
                  if (var4.field_e.a(var4.field_f, 0)) {
                    break L1;
                  } else {
                    this.a(var2, true, var4.field_e.b(var4.field_f, -72));
                    return false;
                  }
                }
              }
              L2: {
                if (var4.field_b == null) {
                  break L2;
                } else {
                  if (var4.field_e.a(var4.field_b, param0 ^ -1)) {
                    break L2;
                  } else {
                    this.a(var2, true, var4.field_e.b(-8087, var4.field_b));
                    return false;
                  }
                }
              }
              L3: {
                if (-1 >= (var4.field_f ^ -1)) {
                  break L3;
                } else {
                  if (var4.field_b != null) {
                    break L3;
                  } else {
                    if (var4.field_c == null) {
                      break L3;
                    } else {
                      if (!var4.field_e.a(25057)) {
                        this.a(var2, true, var4.field_e.c(param0 + -123));
                        return false;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              ((ad) this).field_c = ((ad) this).field_c + 1;
              continue L0;
            }
          }
        }
    }

    ad(int param0) {
        ((ad) this).field_f = new wa[16];
        ((ad) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
    }
}
