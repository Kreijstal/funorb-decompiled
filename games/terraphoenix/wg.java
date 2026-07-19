/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg {
    String field_e;
    private bb[] field_d;
    private int field_a;
    private int field_j;
    static rh field_b;
    static String field_k;
    float field_c;
    private int field_i;
    static ci field_f;
    static ci[] field_l;
    static String field_g;
    static String[] field_h;

    private final void a(int param0, bb param1, int param2) {
        float var4_float = 0.0f;
        try {
            if (param2 < 105) {
                field_k = (String) null;
            }
            var4_float = (float)param0 / 100.0f + (float)(this.field_a - -1);
            if (param0 != 0) {
                this.field_e = param1.field_b + " - " + param0 + "%";
            } else {
                this.field_e = param1.field_c;
            }
            this.field_c = (float)this.field_j * var4_float / (float)(1 + this.field_i);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "wg.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(int param0) {
        int var3 = 0;
        bb var4 = null;
        var3 = Terraphoenix.field_V;
        L0: while (true) {
          if (this.field_a >= this.field_i) {
            if (param0 != 0) {
              return false;
            } else {
              return true;
            }
          } else {
            var4 = this.field_d[this.field_a];
            if (!var4.field_a.a(0)) {
              this.a(0, var4, param0 ^ 111);
              return false;
            } else {
              L1: {
                if (-1 < (var4.field_e ^ -1)) {
                  break L1;
                } else {
                  if (var4.field_a.e(var4.field_e, 4)) {
                    break L1;
                  } else {
                    this.a(var4.field_a.a((byte) 107, var4.field_e), var4, param0 ^ 127);
                    return false;
                  }
                }
              }
              L2: {
                if (var4.field_g == null) {
                  break L2;
                } else {
                  if (!var4.field_a.a(-3, var4.field_g)) {
                    this.a(var4.field_a.b(99, var4.field_g), var4, param0 + 107);
                    return false;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (0 <= var4.field_e) {
                  break L3;
                } else {
                  if (null != var4.field_g) {
                    break L3;
                  } else {
                    if (null == var4.field_b) {
                      break L3;
                    } else {
                      if (!var4.field_a.b((byte) -128)) {
                        this.a(var4.field_a.a((byte) 127), var4, param0 ^ 124);
                        return false;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              this.field_a = this.field_a + 1;
              continue L0;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_g = null;
        field_l = null;
        if (param0 != 113) {
            return;
        }
        field_b = null;
        field_f = null;
        field_h = null;
    }

    private wg() throws Throwable {
        throw new Error();
    }

    static {
        field_k = "Left click to move to destination";
        field_b = new rh(15, 0, 1, 0);
        field_g = "Select grenades";
    }
}
