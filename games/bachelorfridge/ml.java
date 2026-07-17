/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    static ee field_a;

    final static void a(lu param0, int param1) {
        int var2_int = 0;
        try {
            gk.field_b = param0.e((byte) 93) << 5;
            var2_int = param0.b(16711935);
            fe.field_k = var2_int << 18 & 1835008;
            gk.field_b = gk.field_b + (var2_int >> 3);
            fe.field_k = fe.field_k + (param0.e((byte) 117) << 2);
            var2_int = param0.b(16711935);
            al.field_a = var2_int << 15 & 2064384;
            fe.field_k = fe.field_k + (var2_int >> 6);
            al.field_a = al.field_a + (param0.b(16711935) << 7);
            var2_int = param0.b(16711935);
            al.field_a = al.field_a + (var2_int >> 1);
            kka.field_g = var2_int << 16 & 65536;
            kka.field_g = kka.field_g + param0.e((byte) 65);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ml.B(" + (param0 != null ? "{...}" : "null") + 44 + 2064384 + 41);
        }
    }

    public static void a(byte param0) {
        int var1 = 26;
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
          field_a = null;
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
