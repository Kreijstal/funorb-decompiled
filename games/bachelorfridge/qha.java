/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qha {
    private ap[] field_f;
    private int field_g;
    static int[] field_c;
    String field_d;
    float field_b;
    private int field_e;
    private int field_a;
    static String field_h;

    public static void a(int param0) {
        if (param0 < 123) {
            return;
        }
        field_c = null;
        field_h = null;
    }

    private final void a(ap param0, int param1, int param2) {
        float var4 = 0.0f;
        var4 = (float)(((qha) this).field_a - param1) + (float)param2 / 100.0f;
        ((qha) this).field_b = (float)((qha) this).field_e * var4 / (float)(((qha) this).field_g + 1);
        if (param2 != 0) {
          ((qha) this).field_d = param0.field_b + " - " + param2 + "%";
          return;
        } else {
          ((qha) this).field_d = param0.field_a;
          return;
        }
    }

    final static void a(int param0, vr param1) {
        Object var3 = null;
        wha.field_a = param1;
        vj.field_p = wfa.a("logo", param1, "minimal", (byte) -86);
        if (param0 < 114) {
          var3 = null;
          qha.a(-41, (vr) null);
          em.field_S = wfa.a("loading", param1, "minimal", (byte) -74);
          ml.field_a = ch.a(param1, -1, "minimal", "fridgedoor2d");
          ada.field_p = ch.a(param1, -1, "minimal", "fridge_left");
          return;
        } else {
          em.field_S = wfa.a("loading", param1, "minimal", (byte) -74);
          ml.field_a = ch.a(param1, -1, "minimal", "fridgedoor2d");
          ada.field_p = ch.a(param1, -1, "minimal", "fridge_left");
          return;
        }
    }

    private qha() throws Throwable {
        throw new Error();
    }

    final boolean a(byte param0) {
        ap var2 = null;
        int var3 = 0;
        ap var4 = null;
        var3 = BachelorFridge.field_y;
        L0: while (true) {
          if (((qha) this).field_g <= ((qha) this).field_a) {
            if (param0 != 49) {
              field_h = null;
              return true;
            } else {
              return true;
            }
          } else {
            var4 = ((qha) this).field_f[((qha) this).field_a];
            var2 = var4;
            if (var4.field_e.a(0)) {
              L1: {
                if (-1 < (var4.field_d ^ -1)) {
                  break L1;
                } else {
                  if (var4.field_e.c(var4.field_d, -734)) {
                    break L1;
                  } else {
                    this.a(var2, -1, var4.field_e.b(var4.field_d, (byte) -87));
                    return false;
                  }
                }
              }
              L2: {
                if (null == var4.field_f) {
                  break L2;
                } else {
                  if (!var4.field_e.a(var4.field_f, 20637)) {
                    this.a(var2, -1, var4.field_e.a(0, var4.field_f));
                    return false;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (-1 >= (var4.field_d ^ -1)) {
                  break L3;
                } else {
                  if (var4.field_f != null) {
                    break L3;
                  } else {
                    if (var4.field_b == null) {
                      break L3;
                    } else {
                      if (var4.field_e.b((byte) 111)) {
                        break L3;
                      } else {
                        this.a(var2, -1, var4.field_e.a(true));
                        return false;
                      }
                    }
                  }
                }
              }
              ((qha) this).field_a = ((qha) this).field_a + 1;
              continue L0;
            } else {
              this.a(var4, -1, 0);
              return false;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Create your own free Jagex account";
    }
}
