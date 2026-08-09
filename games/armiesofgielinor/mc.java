/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc implements lv {
    static je field_f;
    static ru field_a;
    private int field_b;
    private ha field_e;
    static co[] field_d;
    static String field_c;

    public final String a(int param0) {
        if (param0 >= -122) {
            mc.d(18);
        }
        return "Defeat: Total Unit Loss";
    }

    public final boolean b(int param0) {
        if (param0 != 0) {
            this.c(118);
            return false;
        }
        return false;
    }

    public static void d(int param0) {
        field_c = null;
        if (param0 <= 114) {
            return;
        }
        field_d = null;
        field_f = null;
        field_a = null;
    }

    mc(int param0, ha param1) {
        try {
            this.field_b = param0;
            this.field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "mc.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean c(int param0) {
        int var2;
        int var4;
        at var3;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= this.field_e.field_W) {
            L1: {
              if (this.field_e.field_K != null) {
                break L1;
              } else {
                if (this.field_e.b(this.field_b, (byte) -26)) {
                  return false;
                } else {
                  break L1;
                }
              }
            }
            if (param0 <= -121) {
              return true;
            } else {
              this.a(62);
              return true;
            }
          } else {
            L2: {
              if (null == this.field_e.field_K) {
                break L2;
              } else {
                if (var2 == this.field_b) {
                  break L2;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
            if (this.field_e.c(this.field_b, -16985, var2)) {
              var3 = this.field_e.f(var2, 0);
              if (var3 != null) {
                if (var3.b(false) > 0) {
                  return false;
                } else {
                  var2++;
                  continue L0;
                }
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    static {
        field_c = "Heavy stone armour that protects a unit from all damage for a certain number of attacks, but slows down or immobilises the unit.";
    }
}
