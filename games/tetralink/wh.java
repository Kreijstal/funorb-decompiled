/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    static int field_k;
    static String field_j;
    static hl field_l;
    private in[] field_d;
    static int field_i;
    float field_f;
    String field_e;
    static double field_c;
    private int field_h;
    static String field_a;
    private int field_b;
    private int field_g;

    public static void a(boolean param0) {
        field_j = null;
        field_l = null;
        field_a = null;
        if (param0) {
            wh.a(true);
        }
    }

    final boolean a(int param0) {
        int var3 = 0;
        in var4 = null;
        var3 = TetraLink.field_J;
        L0: while (true) {
          if (((wh) this).field_b <= ((wh) this).field_h) {
            if (param0 != -1210) {
              field_i = 124;
              return true;
            } else {
              return true;
            }
          } else {
            var4 = ((wh) this).field_d[((wh) this).field_h];
            if (!var4.field_b.c(124)) {
              this.a(-1, 0, var4);
              return false;
            } else {
              L1: {
                if (-1 < (var4.field_f ^ -1)) {
                  break L1;
                } else {
                  if (!var4.field_b.d(var4.field_f, 0)) {
                    this.a(-1, var4.field_b.e(-11337, var4.field_f), var4);
                    return false;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (null == var4.field_a) {
                  break L2;
                } else {
                  if (var4.field_b.a(var4.field_a, (byte) -98)) {
                    break L2;
                  } else {
                    this.a(param0 ^ 1209, var4.field_b.a(var4.field_a, true), var4);
                    return false;
                  }
                }
              }
              L3: {
                if (-1 >= (var4.field_f ^ -1)) {
                  break L3;
                } else {
                  if (null != var4.field_a) {
                    break L3;
                  } else {
                    if (var4.field_e == null) {
                      break L3;
                    } else {
                      if (!var4.field_b.a(false)) {
                        this.a(-1, var4.field_b.b(param0 ^ -21414), var4);
                        return false;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              ((wh) this).field_h = ((wh) this).field_h + 1;
              continue L0;
            }
          }
        }
    }

    private final void a(int param0, int param1, in param2) {
        float var4 = 0.0f;
        Object var5 = null;
        if (param0 == -1) {
          var4 = (float)param1 / 100.0f + (float)(((wh) this).field_h + 1);
          ((wh) this).field_f = var4 * (float)((wh) this).field_g / (float)(((wh) this).field_b + 1);
          if (param1 == 0) {
            ((wh) this).field_e = param2.field_h;
            return;
          } else {
            ((wh) this).field_e = param2.field_e + " - " + param1 + "%";
            return;
          }
        } else {
          var5 = null;
          this.a(-72, 55, (in) null);
          var4 = (float)param1 / 100.0f + (float)(((wh) this).field_h + 1);
          ((wh) this).field_f = var4 * (float)((wh) this).field_g / (float)(((wh) this).field_b + 1);
          if (param1 == 0) {
            ((wh) this).field_e = param2.field_h;
            return;
          } else {
            ((wh) this).field_e = param2.field_e + " - " + param1 + "%";
            return;
          }
        }
    }

    private wh() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Please check if address is correct";
        field_a = "2D";
        field_i = -1;
    }
}
