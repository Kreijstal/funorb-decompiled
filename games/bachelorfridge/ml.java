/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    static ee field_a;

    final static void a(lu param0, int param1) {
        int var2_int = 0;
        try {
            gk.field_b = param0.e((byte) 93) << 1678217189;
            var2_int = param0.b(param1 + 14647551);
            fe.field_k = var2_int << 1157448146 & 1835008;
            gk.field_b = gk.field_b + (var2_int >> -402321309);
            fe.field_k = fe.field_k + (param0.e((byte) 117) << -773668830);
            var2_int = param0.b(param1 + 14647551);
            al.field_a = var2_int << 1932485007 & param1;
            fe.field_k = fe.field_k + (var2_int >> -130697146);
            al.field_a = al.field_a + (param0.b(param1 + 14647551) << 1920555303);
            var2_int = param0.b(16711935);
            al.field_a = al.field_a + (var2_int >> 691042625);
            kka.field_g = var2_int << 1006721904 & 65536;
            kka.field_g = kka.field_g + param0.e((byte) 65);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ml.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = -26 / ((-12 - param0) / 42);
        field_a = null;
    }

    final static boolean a(int param0, char param1) {
        if (param0 == -130697146) {
          if (param1 < 65) {
            if (97 <= param1) {
              if (122 < param1) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            if (90 < param1) {
              if (97 <= param1) {
                if (122 < param1) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          field_a = (ee) null;
          if (param1 >= 65) {
            if (90 < param1) {
              if (97 <= param1) {
                if (122 < param1) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (97 <= param1) {
              if (122 < param1) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    static {
    }
}
